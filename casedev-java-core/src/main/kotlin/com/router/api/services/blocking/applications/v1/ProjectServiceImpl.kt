// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.applications.v1

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.checkRequired
import com.router.api.core.handlers.emptyHandler
import com.router.api.core.handlers.errorBodyHandler
import com.router.api.core.handlers.errorHandler
import com.router.api.core.handlers.jsonHandler
import com.router.api.core.http.HttpMethod
import com.router.api.core.http.HttpRequest
import com.router.api.core.http.HttpResponse
import com.router.api.core.http.HttpResponse.Handler
import com.router.api.core.http.HttpResponseFor
import com.router.api.core.http.json
import com.router.api.core.http.parseable
import com.router.api.core.prepare
import com.router.api.models.applications.v1.projects.ProjectCreateDeploymentParams
import com.router.api.models.applications.v1.projects.ProjectCreateDomainParams
import com.router.api.models.applications.v1.projects.ProjectCreateEnvParams
import com.router.api.models.applications.v1.projects.ProjectCreateParams
import com.router.api.models.applications.v1.projects.ProjectDeleteDomainParams
import com.router.api.models.applications.v1.projects.ProjectDeleteEnvParams
import com.router.api.models.applications.v1.projects.ProjectDeleteParams
import com.router.api.models.applications.v1.projects.ProjectGetRuntimeLogsParams
import com.router.api.models.applications.v1.projects.ProjectListDeploymentsParams
import com.router.api.models.applications.v1.projects.ProjectListDomainsParams
import com.router.api.models.applications.v1.projects.ProjectListEnvParams
import com.router.api.models.applications.v1.projects.ProjectListParams
import com.router.api.models.applications.v1.projects.ProjectListResponse
import com.router.api.models.applications.v1.projects.ProjectRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ProjectServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProjectService {

    private val withRawResponse: ProjectService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProjectService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProjectService =
        ProjectServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: ProjectCreateParams, requestOptions: RequestOptions) {
        // post /applications/v1/projects
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: ProjectRetrieveParams, requestOptions: RequestOptions) {
        // get /applications/v1/projects/{id}
        withRawResponse().retrieve(params, requestOptions)
    }

    override fun list(
        params: ProjectListParams,
        requestOptions: RequestOptions,
    ): ProjectListResponse =
        // get /applications/v1/projects
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: ProjectDeleteParams, requestOptions: RequestOptions) {
        // delete /applications/v1/projects/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun createDeployment(
        params: ProjectCreateDeploymentParams,
        requestOptions: RequestOptions,
    ) {
        // post /applications/v1/projects/{id}/deployments
        withRawResponse().createDeployment(params, requestOptions)
    }

    override fun createDomain(params: ProjectCreateDomainParams, requestOptions: RequestOptions) {
        // post /applications/v1/projects/{id}/domains
        withRawResponse().createDomain(params, requestOptions)
    }

    override fun createEnv(params: ProjectCreateEnvParams, requestOptions: RequestOptions) {
        // post /applications/v1/projects/{id}/env
        withRawResponse().createEnv(params, requestOptions)
    }

    override fun deleteDomain(params: ProjectDeleteDomainParams, requestOptions: RequestOptions) {
        // delete /applications/v1/projects/{id}/domains/{domain}
        withRawResponse().deleteDomain(params, requestOptions)
    }

    override fun deleteEnv(params: ProjectDeleteEnvParams, requestOptions: RequestOptions) {
        // delete /applications/v1/projects/{id}/env/{envId}
        withRawResponse().deleteEnv(params, requestOptions)
    }

    override fun getRuntimeLogs(
        params: ProjectGetRuntimeLogsParams,
        requestOptions: RequestOptions,
    ) {
        // get /applications/v1/projects/{id}/runtime-logs
        withRawResponse().getRuntimeLogs(params, requestOptions)
    }

    override fun listDeployments(
        params: ProjectListDeploymentsParams,
        requestOptions: RequestOptions,
    ) {
        // get /applications/v1/projects/{id}/deployments
        withRawResponse().listDeployments(params, requestOptions)
    }

    override fun listDomains(params: ProjectListDomainsParams, requestOptions: RequestOptions) {
        // get /applications/v1/projects/{id}/domains
        withRawResponse().listDomains(params, requestOptions)
    }

    override fun listEnv(params: ProjectListEnvParams, requestOptions: RequestOptions) {
        // get /applications/v1/projects/{id}/env
        withRawResponse().listEnv(params, requestOptions)
    }

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

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "projects")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<Void?> = emptyHandler()

        override fun retrieve(
            params: ProjectRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "projects", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { retrieveHandler.handle(it) }
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
                    .addPathSegments("applications", "v1", "projects")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "projects", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val createDeploymentHandler: Handler<Void?> = emptyHandler()

        override fun createDeployment(
            params: ProjectCreateDeploymentParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "applications",
                        "v1",
                        "projects",
                        params._pathParam(0),
                        "deployments",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createDeploymentHandler.handle(it) }
            }
        }

        private val createDomainHandler: Handler<Void?> = emptyHandler()

        override fun createDomain(
            params: ProjectCreateDomainParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "applications",
                        "v1",
                        "projects",
                        params._pathParam(0),
                        "domains",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createDomainHandler.handle(it) }
            }
        }

        private val createEnvHandler: Handler<Void?> = emptyHandler()

        override fun createEnv(
            params: ProjectCreateEnvParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "projects", params._pathParam(0), "env")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createEnvHandler.handle(it) }
            }
        }

        private val deleteDomainHandler: Handler<Void?> = emptyHandler()

        override fun deleteDomain(
            params: ProjectDeleteDomainParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("domain", params.domain().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "applications",
                        "v1",
                        "projects",
                        params._pathParam(0),
                        "domains",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteDomainHandler.handle(it) }
            }
        }

        private val deleteEnvHandler: Handler<Void?> = emptyHandler()

        override fun deleteEnv(
            params: ProjectDeleteEnvParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("envId", params.envId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "applications",
                        "v1",
                        "projects",
                        params._pathParam(0),
                        "env",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteEnvHandler.handle(it) }
            }
        }

        private val getRuntimeLogsHandler: Handler<Void?> = emptyHandler()

        override fun getRuntimeLogs(
            params: ProjectGetRuntimeLogsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "applications",
                        "v1",
                        "projects",
                        params._pathParam(0),
                        "runtime-logs",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getRuntimeLogsHandler.handle(it) }
            }
        }

        private val listDeploymentsHandler: Handler<Void?> = emptyHandler()

        override fun listDeployments(
            params: ProjectListDeploymentsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "applications",
                        "v1",
                        "projects",
                        params._pathParam(0),
                        "deployments",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listDeploymentsHandler.handle(it) }
            }
        }

        private val listDomainsHandler: Handler<Void?> = emptyHandler()

        override fun listDomains(
            params: ProjectListDomainsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "applications",
                        "v1",
                        "projects",
                        params._pathParam(0),
                        "domains",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listDomainsHandler.handle(it) }
            }
        }

        private val listEnvHandler: Handler<Void?> = emptyHandler()

        override fun listEnv(
            params: ProjectListEnvParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "projects", params._pathParam(0), "env")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listEnvHandler.handle(it) }
            }
        }
    }
}
