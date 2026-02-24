// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.llm

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
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
import dev.case.api.models.llm.v1.V1CreateEmbeddingParams
import dev.case.api.models.llm.v1.V1CreateEmbeddingResponse
import dev.case.api.models.llm.v1.V1ListModelsParams
import dev.case.api.models.llm.v1.V1ListModelsResponse
import dev.case.api.services.async.llm.v1.ChatServiceAsync
import dev.case.api.services.async.llm.v1.ChatServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val chat: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun chat(): ChatServiceAsync = chat

    override fun createEmbedding(
        params: V1CreateEmbeddingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CreateEmbeddingResponse> =
        // post /llm/v1/embeddings
        withRawResponse().createEmbedding(params, requestOptions).thenApply { it.parse() }

    override fun listModels(
        params: V1ListModelsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1ListModelsResponse> =
        // get /llm/v1/models
        withRawResponse().listModels(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val chat: ChatServiceAsync.WithRawResponse by lazy {
            ChatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun chat(): ChatServiceAsync.WithRawResponse = chat

        private val createEmbeddingHandler: Handler<V1CreateEmbeddingResponse> =
            jsonHandler<V1CreateEmbeddingResponse>(clientOptions.jsonMapper)

        override fun createEmbedding(
            params: V1CreateEmbeddingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1CreateEmbeddingResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("llm", "v1", "embeddings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createEmbeddingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listModelsHandler: Handler<V1ListModelsResponse> =
            jsonHandler<V1ListModelsResponse>(clientOptions.jsonMapper)

        override fun listModels(
            params: V1ListModelsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1ListModelsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("llm", "v1", "models")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listModelsHandler.handle(it) }
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
