// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.llm

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.handlers.emptyHandler
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.json
import dev.casedev.core.http.parseable
import dev.casedev.core.prepare
import dev.casedev.models.llm.v1.V1CreateEmbeddingParams
import dev.casedev.models.llm.v1.V1ListModelsParams
import dev.casedev.services.blocking.llm.v1.ChatService
import dev.casedev.services.blocking.llm.v1.ChatServiceImpl
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

    override fun createEmbedding(params: V1CreateEmbeddingParams, requestOptions: RequestOptions) {
        // post /llm/v1/embeddings
        withRawResponse().createEmbedding(params, requestOptions)
    }

    override fun listModels(params: V1ListModelsParams, requestOptions: RequestOptions) {
        // get /llm/v1/models
        withRawResponse().listModels(params, requestOptions)
    }

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

        private val createEmbeddingHandler: Handler<Void?> = emptyHandler()

        override fun createEmbedding(
            params: V1CreateEmbeddingParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                response.use { createEmbeddingHandler.handle(it) }
            }
        }

        private val listModelsHandler: Handler<Void?> = emptyHandler()

        override fun listModels(
            params: V1ListModelsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                response.use { listModelsHandler.handle(it) }
            }
        }
    }
}
