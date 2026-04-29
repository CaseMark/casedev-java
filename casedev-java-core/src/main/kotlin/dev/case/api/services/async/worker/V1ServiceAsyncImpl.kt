// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.worker

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.checkRequired
import dev.case.api.core.handlers.emptyHandler
import dev.case.api.core.handlers.errorBodyHandler
import dev.case.api.core.handlers.errorHandler
import dev.case.api.core.http.HttpMethod
import dev.case.api.core.http.HttpRequest
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler
import dev.case.api.core.http.json
import dev.case.api.core.http.parseable
import dev.case.api.core.prepareAsync
import dev.case.api.models.worker.v1.V1BootParams
import dev.case.api.models.worker.v1.V1CreateParams
import dev.case.api.models.worker.v1.V1DeleteParams
import dev.case.api.models.worker.v1.V1ProxyDeleteParams
import dev.case.api.models.worker.v1.V1ProxyGetParams
import dev.case.api.models.worker.v1.V1ProxyPatchParams
import dev.case.api.models.worker.v1.V1ProxyPostParams
import dev.case.api.models.worker.v1.V1ProxyPutParams
import dev.case.api.models.worker.v1.V1RetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: V1CreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /worker/v1
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun retrieve(
        params: V1RetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /worker/v1/{id}
        withRawResponse().retrieve(params, requestOptions).thenAccept {}

    override fun delete(
        params: V1DeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /worker/v1/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun boot(
        params: V1BootParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /worker/v1/{id}/boot
        withRawResponse().boot(params, requestOptions).thenAccept {}

    override fun proxyDelete(
        params: V1ProxyDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /worker/v1/{id}/{workerPath}
        withRawResponse().proxyDelete(params, requestOptions).thenAccept {}

    override fun proxyGet(
        params: V1ProxyGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /worker/v1/{id}/{workerPath}
        withRawResponse().proxyGet(params, requestOptions).thenAccept {}

    override fun proxyPatch(
        params: V1ProxyPatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // patch /worker/v1/{id}/{workerPath}
        withRawResponse().proxyPatch(params, requestOptions).thenAccept {}

    override fun proxyPost(
        params: V1ProxyPostParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /worker/v1/{id}/{workerPath}
        withRawResponse().proxyPost(params, requestOptions).thenAccept {}

    override fun proxyPut(
        params: V1ProxyPutParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /worker/v1/{id}/{workerPath}
        withRawResponse().proxyPut(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: V1CreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("worker", "v1")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
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
            params: V1RetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("worker", "v1", params._pathParam(0))
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: V1DeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("worker", "v1", params._pathParam(0))
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

        private val bootHandler: Handler<Void?> = emptyHandler()

        override fun boot(
            params: V1BootParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("worker", "v1", params._pathParam(0), "boot")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { bootHandler.handle(it) }
                    }
                }
        }

        private val proxyDeleteHandler: Handler<Void?> = emptyHandler()

        override fun proxyDelete(
            params: V1ProxyDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workerPath", params.workerPath().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("worker", "v1", params._pathParam(0), params._pathParam(1))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { proxyDeleteHandler.handle(it) }
                    }
                }
        }

        private val proxyGetHandler: Handler<Void?> = emptyHandler()

        override fun proxyGet(
            params: V1ProxyGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workerPath", params.workerPath().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("worker", "v1", params._pathParam(0), params._pathParam(1))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { proxyGetHandler.handle(it) }
                    }
                }
        }

        private val proxyPatchHandler: Handler<Void?> = emptyHandler()

        override fun proxyPatch(
            params: V1ProxyPatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workerPath", params.workerPath().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("worker", "v1", params._pathParam(0), params._pathParam(1))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { proxyPatchHandler.handle(it) }
                    }
                }
        }

        private val proxyPostHandler: Handler<Void?> = emptyHandler()

        override fun proxyPost(
            params: V1ProxyPostParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workerPath", params.workerPath().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("worker", "v1", params._pathParam(0), params._pathParam(1))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { proxyPostHandler.handle(it) }
                    }
                }
        }

        private val proxyPutHandler: Handler<Void?> = emptyHandler()

        override fun proxyPut(
            params: V1ProxyPutParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workerPath", params.workerPath().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("worker", "v1", params._pathParam(0), params._pathParam(1))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { proxyPutHandler.handle(it) }
                    }
                }
        }
    }
}
