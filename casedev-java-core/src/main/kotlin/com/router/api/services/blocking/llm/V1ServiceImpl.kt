// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.llm

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
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
import com.router.api.models.llm.v1.V1CreateEmbeddingParams
import com.router.api.models.llm.v1.V1CreateEmbeddingResponse
import com.router.api.models.llm.v1.V1ListModelsParams
import com.router.api.models.llm.v1.V1ListModelsResponse
import com.router.api.services.blocking.llm.v1.ChatService
import com.router.api.services.blocking.llm.v1.ChatServiceImpl
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val chat: ChatService by lazy { ChatServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun chat(): ChatService = chat

    override fun createEmbedding(
        params: V1CreateEmbeddingParams,
        requestOptions: RequestOptions,
    ): V1CreateEmbeddingResponse =
        // post /llm/v1/embeddings
        withRawResponse().createEmbedding(params, requestOptions).parse()

    override fun listModels(
        params: V1ListModelsParams,
        requestOptions: RequestOptions,
    ): V1ListModelsResponse =
        // get /llm/v1/models
        withRawResponse().listModels(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val chat: ChatService.WithRawResponse by lazy {
            ChatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun chat(): ChatService.WithRawResponse = chat

        private val createEmbeddingHandler: Handler<V1CreateEmbeddingResponse> =
            jsonHandler<V1CreateEmbeddingResponse>(clientOptions.jsonMapper)

        override fun createEmbedding(
            params: V1CreateEmbeddingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1CreateEmbeddingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("llm", "v1", "embeddings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createEmbeddingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listModelsHandler: Handler<V1ListModelsResponse> =
            jsonHandler<V1ListModelsResponse>(clientOptions.jsonMapper)

        override fun listModels(
            params: V1ListModelsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1ListModelsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("llm", "v1", "models")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
