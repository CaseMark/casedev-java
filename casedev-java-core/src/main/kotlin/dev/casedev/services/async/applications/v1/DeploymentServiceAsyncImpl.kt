// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.applications.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.checkRequired
import dev.casedev.core.handlers.emptyHandler
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.json
import dev.casedev.core.http.parseable
import dev.casedev.core.prepareAsync
import dev.casedev.models.applications.v1.deployments.DeploymentCancelParams
import dev.casedev.models.applications.v1.deployments.DeploymentCreateFromFilesParams
import dev.casedev.models.applications.v1.deployments.DeploymentCreateParams
import dev.casedev.models.applications.v1.deployments.DeploymentGetLogsParams
import dev.casedev.models.applications.v1.deployments.DeploymentGetStatusParams
import dev.casedev.models.applications.v1.deployments.DeploymentListParams
import dev.casedev.models.applications.v1.deployments.DeploymentRetrieveParams
import dev.casedev.models.applications.v1.deployments.DeploymentStreamParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DeploymentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DeploymentServiceAsync {

    private val withRawResponse: DeploymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DeploymentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeploymentServiceAsync =
        DeploymentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DeploymentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /applications/v1/deployments
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(
        params: DeploymentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /applications/v1/deployments/{id}
        withRawResponse().retrieve(params, requestOptions).thenAccept {}

    override fun list(
        params: DeploymentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /applications/v1/deployments
        withRawResponse().list(params, requestOptions).thenAccept {}

    override fun cancel(
        params: DeploymentCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /applications/v1/deployments/{id}/cancel
        withRawResponse().cancel(params, requestOptions).thenAccept {}

    override fun createFromFiles(
        params: DeploymentCreateFromFilesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /applications/v1/deployments/from-files
        withRawResponse().createFromFiles(params, requestOptions).thenAccept {}

    override fun getLogs(
        params: DeploymentGetLogsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /applications/v1/deployments/{id}/logs
        withRawResponse().getLogs(params, requestOptions).thenAccept {}

    override fun getStatus(
        params: DeploymentGetStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /applications/v1/deployments/{id}/status
        withRawResponse().getStatus(params, requestOptions).thenAccept {}

    override fun stream(
        params: DeploymentStreamParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /applications/v1/deployments/{id}/stream
        withRawResponse().stream(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeploymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DeploymentServiceAsync.WithRawResponse =
            DeploymentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: DeploymentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "deployments")
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
            params: DeploymentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "deployments", params._pathParam(0))
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

        private val listHandler: Handler<Void?> = emptyHandler()

        override fun list(
            params: DeploymentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "deployments")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { listHandler.handle(it) }
                    }
                }
        }

        private val cancelHandler: Handler<Void?> = emptyHandler()

        override fun cancel(
            params: DeploymentCancelParams,
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
                        "deployments",
                        params._pathParam(0),
                        "cancel",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { cancelHandler.handle(it) }
                    }
                }
        }

        private val createFromFilesHandler: Handler<Void?> = emptyHandler()

        override fun createFromFiles(
            params: DeploymentCreateFromFilesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "deployments", "from-files")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createFromFilesHandler.handle(it) }
                    }
                }
        }

        private val getLogsHandler: Handler<Void?> = emptyHandler()

        override fun getLogs(
            params: DeploymentGetLogsParams,
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
                        "deployments",
                        params._pathParam(0),
                        "logs",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { getLogsHandler.handle(it) }
                    }
                }
        }

        private val getStatusHandler: Handler<Void?> = emptyHandler()

        override fun getStatus(
            params: DeploymentGetStatusParams,
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
                        "deployments",
                        params._pathParam(0),
                        "status",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { getStatusHandler.handle(it) }
                    }
                }
        }

        private val streamHandler: Handler<Void?> = emptyHandler()

        override fun stream(
            params: DeploymentStreamParams,
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
                        "deployments",
                        params._pathParam(0),
                        "stream",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { streamHandler.handle(it) }
                    }
                }
        }
    }
}
