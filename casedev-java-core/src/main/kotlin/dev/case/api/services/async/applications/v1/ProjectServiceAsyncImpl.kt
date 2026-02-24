// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.applications.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.checkRequired
import dev.case.api.core.handlers.emptyHandler
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
import dev.case.api.core.prepareAsync
import dev.case.api.models.applications.v1.projects.ProjectCreateDeploymentParams
import dev.case.api.models.applications.v1.projects.ProjectCreateDomainParams
import dev.case.api.models.applications.v1.projects.ProjectCreateEnvParams
import dev.case.api.models.applications.v1.projects.ProjectCreateParams
import dev.case.api.models.applications.v1.projects.ProjectDeleteDomainParams
import dev.case.api.models.applications.v1.projects.ProjectDeleteEnvParams
import dev.case.api.models.applications.v1.projects.ProjectDeleteParams
import dev.case.api.models.applications.v1.projects.ProjectGetRuntimeLogsParams
import dev.case.api.models.applications.v1.projects.ProjectListDeploymentsParams
import dev.case.api.models.applications.v1.projects.ProjectListDomainsParams
import dev.case.api.models.applications.v1.projects.ProjectListEnvParams
import dev.case.api.models.applications.v1.projects.ProjectListParams
import dev.case.api.models.applications.v1.projects.ProjectListResponse
import dev.case.api.models.applications.v1.projects.ProjectRetrieveParams
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
    ): CompletableFuture<Void?> =
        // post /applications/v1/projects
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(
        params: ProjectRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /applications/v1/projects/{id}
        withRawResponse().retrieve(params, requestOptions).thenAccept {}

    override fun list(
        params: ProjectListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProjectListResponse> =
        // get /applications/v1/projects
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ProjectDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /applications/v1/projects/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun createDeployment(
        params: ProjectCreateDeploymentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /applications/v1/projects/{id}/deployments
        withRawResponse().createDeployment(params, requestOptions).thenAccept {}

    override fun createDomain(
        params: ProjectCreateDomainParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /applications/v1/projects/{id}/domains
        withRawResponse().createDomain(params, requestOptions).thenAccept {}

    override fun createEnv(
        params: ProjectCreateEnvParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /applications/v1/projects/{id}/env
        withRawResponse().createEnv(params, requestOptions).thenAccept {}

    override fun deleteDomain(
        params: ProjectDeleteDomainParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /applications/v1/projects/{id}/domains/{domain}
        withRawResponse().deleteDomain(params, requestOptions).thenAccept {}

    override fun deleteEnv(
        params: ProjectDeleteEnvParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /applications/v1/projects/{id}/env/{envId}
        withRawResponse().deleteEnv(params, requestOptions).thenAccept {}

    override fun getRuntimeLogs(
        params: ProjectGetRuntimeLogsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /applications/v1/projects/{id}/runtime-logs
        withRawResponse().getRuntimeLogs(params, requestOptions).thenAccept {}

    override fun listDeployments(
        params: ProjectListDeploymentsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /applications/v1/projects/{id}/deployments
        withRawResponse().listDeployments(params, requestOptions).thenAccept {}

    override fun listDomains(
        params: ProjectListDomainsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /applications/v1/projects/{id}/domains
        withRawResponse().listDomains(params, requestOptions).thenAccept {}

    override fun listEnv(
        params: ProjectListEnvParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /applications/v1/projects/{id}/env
        withRawResponse().listEnv(params, requestOptions).thenAccept {}

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

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: ProjectCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "projects")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createHandler.handle(it) }
                    }
                }
        }

        private val retrieveHandler: Handler<Void?> = emptyHandler()

        override fun retrieve(
            params: ProjectRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "projects", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { retrieveHandler.handle(it) }
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
                    .addPathSegments("applications", "v1", "projects")
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: ProjectDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val createDeploymentHandler: Handler<Void?> = emptyHandler()

        override fun createDeployment(
            params: ProjectCreateDeploymentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createDeploymentHandler.handle(it) }
                    }
                }
        }

        private val createDomainHandler: Handler<Void?> = emptyHandler()

        override fun createDomain(
            params: ProjectCreateDomainParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createDomainHandler.handle(it) }
                    }
                }
        }

        private val createEnvHandler: Handler<Void?> = emptyHandler()

        override fun createEnv(
            params: ProjectCreateEnvParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createEnvHandler.handle(it) }
                    }
                }
        }

        private val deleteDomainHandler: Handler<Void?> = emptyHandler()

        override fun deleteDomain(
            params: ProjectDeleteDomainParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteDomainHandler.handle(it) }
                    }
                }
        }

        private val deleteEnvHandler: Handler<Void?> = emptyHandler()

        override fun deleteEnv(
            params: ProjectDeleteEnvParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteEnvHandler.handle(it) }
                    }
                }
        }

        private val getRuntimeLogsHandler: Handler<Void?> = emptyHandler()

        override fun getRuntimeLogs(
            params: ProjectGetRuntimeLogsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { getRuntimeLogsHandler.handle(it) }
                    }
                }
        }

        private val listDeploymentsHandler: Handler<Void?> = emptyHandler()

        override fun listDeployments(
            params: ProjectListDeploymentsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { listDeploymentsHandler.handle(it) }
                    }
                }
        }

        private val listDomainsHandler: Handler<Void?> = emptyHandler()

        override fun listDomains(
            params: ProjectListDomainsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { listDomainsHandler.handle(it) }
                    }
                }
        }

        private val listEnvHandler: Handler<Void?> = emptyHandler()

        override fun listEnv(
            params: ProjectListEnvParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "projects", params._pathParam(0), "env")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { listEnvHandler.handle(it) }
                    }
                }
        }
    }
}
