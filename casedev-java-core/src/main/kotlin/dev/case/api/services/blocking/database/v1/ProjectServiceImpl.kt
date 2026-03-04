// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.database.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.checkRequired
import dev.case.api.core.handlers.errorBodyHandler
import dev.case.api.core.handlers.errorHandler
import dev.case.api.core.handlers.jsonHandler
import dev.case.api.core.http.HttpMethod
import dev.case.api.core.http.HttpRequest
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.json
import dev.case.api.core.http.parseable
import dev.case.api.core.prepare
import dev.case.api.models.database.v1.projects.ProjectCreateBranchParams
import dev.case.api.models.database.v1.projects.ProjectCreateBranchResponse
import dev.case.api.models.database.v1.projects.ProjectCreateParams
import dev.case.api.models.database.v1.projects.ProjectCreateResponse
import dev.case.api.models.database.v1.projects.ProjectDeleteParams
import dev.case.api.models.database.v1.projects.ProjectDeleteResponse
import dev.case.api.models.database.v1.projects.ProjectGetConnectionParams
import dev.case.api.models.database.v1.projects.ProjectGetConnectionResponse
import dev.case.api.models.database.v1.projects.ProjectListBranchesParams
import dev.case.api.models.database.v1.projects.ProjectListBranchesResponse
import dev.case.api.models.database.v1.projects.ProjectListParams
import dev.case.api.models.database.v1.projects.ProjectListResponse
import dev.case.api.models.database.v1.projects.ProjectRetrieveParams
import dev.case.api.models.database.v1.projects.ProjectRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Serverless PostgreSQL databases with instant branching */
class ProjectServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProjectService {

    private val withRawResponse: ProjectService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProjectService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService =
        ProjectServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions,
    ): ProjectCreateResponse =
        // post /database/v1/projects
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ProjectRetrieveParams,
        requestOptions: RequestOptions,
    ): ProjectRetrieveResponse =
        // get /database/v1/projects/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ProjectListParams,
        requestOptions: RequestOptions,
    ): ProjectListResponse =
        // get /database/v1/projects
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ProjectDeleteParams,
        requestOptions: RequestOptions,
    ): ProjectDeleteResponse =
        // delete /database/v1/projects/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun createBranch(
        params: ProjectCreateBranchParams,
        requestOptions: RequestOptions,
    ): ProjectCreateBranchResponse =
        // post /database/v1/projects/{id}/branches
        withRawResponse().createBranch(params, requestOptions).parse()

    override fun getConnection(
        params: ProjectGetConnectionParams,
        requestOptions: RequestOptions,
    ): ProjectGetConnectionResponse =
        // get /database/v1/projects/{id}/connection
        withRawResponse().getConnection(params, requestOptions).parse()

    override fun listBranches(
        params: ProjectListBranchesParams,
        requestOptions: RequestOptions,
    ): ProjectListBranchesResponse =
        // get /database/v1/projects/{id}/branches
        withRawResponse().listBranches(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProjectService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProjectService.WithRawResponse =
            ProjectServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ProjectCreateResponse> =
            jsonHandler<ProjectCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("database", "v1", "projects")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ProjectRetrieveResponse> =
            jsonHandler<ProjectRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ProjectRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("database", "v1", "projects", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ProjectListResponse> =
            jsonHandler<ProjectListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ProjectListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("database", "v1", "projects")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<ProjectDeleteResponse> =
            jsonHandler<ProjectDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("database", "v1", "projects", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createBranchHandler: Handler<ProjectCreateBranchResponse> =
            jsonHandler<ProjectCreateBranchResponse>(clientOptions.jsonMapper)

        override fun createBranch(
            params: ProjectCreateBranchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectCreateBranchResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("database", "v1", "projects", params._pathParam(0), "branches")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createBranchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getConnectionHandler: Handler<ProjectGetConnectionResponse> =
            jsonHandler<ProjectGetConnectionResponse>(clientOptions.jsonMapper)

        override fun getConnection(
            params: ProjectGetConnectionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectGetConnectionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "database",
                        "v1",
                        "projects",
                        params._pathParam(0),
                        "connection",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getConnectionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listBranchesHandler: Handler<ProjectListBranchesResponse> =
            jsonHandler<ProjectListBranchesResponse>(clientOptions.jsonMapper)

        override fun listBranches(
            params: ProjectListBranchesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProjectListBranchesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("database", "v1", "projects", params._pathParam(0), "branches")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listBranchesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
