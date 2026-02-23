// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.llm.v1

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
import com.router.api.models.llm.v1.chat.ChatCreateCompletionParams
import com.router.api.models.llm.v1.chat.ChatCreateCompletionResponse
import java.util.function.Consumer

class ChatServiceImpl internal constructor(private val clientOptions: ClientOptions) : ChatService {

    private val withRawResponse: ChatService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChatService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatService =
        ChatServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createCompletion(
        params: ChatCreateCompletionParams,
        requestOptions: RequestOptions,
    ): ChatCreateCompletionResponse =
        // post /llm/v1/chat/completions
        withRawResponse().createCompletion(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChatService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChatService.WithRawResponse =
            ChatServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createCompletionHandler: Handler<ChatCreateCompletionResponse> =
            jsonHandler<ChatCreateCompletionResponse>(clientOptions.jsonMapper)

        override fun createCompletion(
            params: ChatCreateCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatCreateCompletionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("llm", "v1", "chat", "completions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createCompletionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
