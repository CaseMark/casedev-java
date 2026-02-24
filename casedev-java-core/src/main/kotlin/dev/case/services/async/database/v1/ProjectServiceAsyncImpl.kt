// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async.database.v1

import dev.case.core.ClientOptions
import dev.case.core.RequestOptions
import dev.case.core.checkRequired
import dev.case.core.handlers.errorBodyHandler
import dev.case.core.handlers.errorHandler
import dev.case.core.handlers.jsonHandler
import dev.case.core.http.HttpMethod
import dev.case.core.http.HttpRequest
import dev.case.core.http.HttpResponse
import dev.case.core.http.HttpResponse.Handler
import dev.case.core.http.HttpResponseFor
import dev.case.core.http.json
import dev.case.core.http.parseable
import dev.case.core.prepareAsync
import dev.case.models.database.v1.projects.ProjectCreateBranchParams
import dev.case.models.database.v1.projects.ProjectCreateBranchResponse
import dev.case.models.database.v1.projects.ProjectCreateParams
import dev.case.models.database.v1.projects.ProjectCreateResponse
import dev.case.models.database.v1.projects.ProjectDeleteParams
import dev.case.models.database.v1.projects.ProjectDeleteResponse
import dev.case.models.database.v1.projects.ProjectGetConnectionParams
import dev.case.models.database.v1.projects.ProjectGetConnectionResponse
import dev.case.models.database.v1.projects.ProjectListBranchesParams
import dev.case.models.database.v1.projects.ProjectListBranchesResponse
import dev.case.models.database.v1.projects.ProjectListParams
import dev.case.models.database.v1.projects.ProjectListResponse
import dev.case.models.database.v1.projects.ProjectRetrieveParams
import dev.case.models.database.v1.projects.ProjectRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ProjectServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProjectServiceAsync {

    private val withRawResponse: ProjectServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProjectServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectServiceAsync =
        ProjectServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ProjectCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectCreateResponse> =
        // post /database/v1/projects
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ProjectRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectRetrieveResponse> =
        // get /database/v1/projects/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ProjectListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectListResponse> =
        // get /database/v1/projects
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ProjectDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectDeleteResponse> =
        // delete /database/v1/projects/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun createBranch(
        params: ProjectCreateBranchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectCreateBranchResponse> =
        // post /database/v1/projects/{id}/branches
        withRawResponse().createBranch(params, requestOptions).thenApply { it.parse() }

    override fun getConnection(
        params: ProjectGetConnectionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectGetConnectionResponse> =
        // get /database/v1/projects/{id}/connection
        withRawResponse().getConnection(params, requestOptions).thenApply { it.parse() }

    override fun listBranches(
        params: ProjectListBranchesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectListBranchesResponse> =
        // get /database/v1/projects/{id}/branches
        withRawResponse().listBranches(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProjectServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProjectServiceAsync.WithRawResponse =
            ProjectServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ProjectCreateResponse> =
            jsonHandler<ProjectCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("database", "v1", "projects")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<ProjectRetrieveResponse> =
            jsonHandler<ProjectRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ProjectRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("database", "v1", "projects", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<ProjectListResponse> =
            jsonHandler<ProjectListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ProjectListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("database", "v1", "projects")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<ProjectDeleteResponse> =
            jsonHandler<ProjectDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectDeleteResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createBranchHandler: Handler<ProjectCreateBranchResponse> =
            jsonHandler<ProjectCreateBranchResponse>(clientOptions.jsonMapper)

        override fun createBranch(
            params: ProjectCreateBranchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectCreateBranchResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createBranchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getConnectionHandler: Handler<ProjectGetConnectionResponse> =
            jsonHandler<ProjectGetConnectionResponse>(clientOptions.jsonMapper)

        override fun getConnection(
            params: ProjectGetConnectionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectGetConnectionResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getConnectionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listBranchesHandler: Handler<ProjectListBranchesResponse> =
            jsonHandler<ProjectListBranchesResponse>(clientOptions.jsonMapper)

        override fun listBranches(
            params: ProjectListBranchesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProjectListBranchesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("database", "v1", "projects", params._pathParam(0), "branches")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
