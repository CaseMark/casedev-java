// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.operator

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
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
import dev.case.api.models.operator.v1.V1CreateChatCompletionParams
import dev.case.api.models.operator.v1.V1CreateParams
import dev.case.api.models.operator.v1.V1CreateResponseParams
import dev.case.api.models.operator.v1.V1GetStatusParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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
        // post /operator/v1/create
        withRawResponse().create(params, requestOptions).thenAccept {}

    override fun createChatCompletion(
        params: V1CreateChatCompletionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /operator/v1/chat/completions
        withRawResponse().createChatCompletion(params, requestOptions).thenAccept {}

    override fun createResponse(
        params: V1CreateResponseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /operator/v1/responses
        withRawResponse().createResponse(params, requestOptions).thenAccept {}

    override fun getStatus(
        params: V1GetStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /operator/v1/status
        withRawResponse().getStatus(params, requestOptions).thenAccept {}

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
                    .addPathSegments("operator", "v1", "create")
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

        private val createChatCompletionHandler: Handler<Void?> = emptyHandler()

        override fun createChatCompletion(
            params: V1CreateChatCompletionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("operator", "v1", "chat", "completions")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createChatCompletionHandler.handle(it) }
                    }
                }
        }

        private val createResponseHandler: Handler<Void?> = emptyHandler()

        override fun createResponse(
            params: V1CreateResponseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("operator", "v1", "responses")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { createResponseHandler.handle(it) }
                    }
                }
        }

        private val getStatusHandler: Handler<Void?> = emptyHandler()

        override fun getStatus(
            params: V1GetStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("operator", "v1", "status")
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
    }
}
