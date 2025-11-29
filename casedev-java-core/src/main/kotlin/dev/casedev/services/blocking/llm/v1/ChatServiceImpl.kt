// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.llm.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.handlers.jsonHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.core.http.json
import dev.casedev.core.http.parseable
import dev.casedev.core.prepare
import dev.casedev.models.llm.v1.chat.ChatCreateCompletionParams
import dev.casedev.models.llm.v1.chat.ChatCreateCompletionResponse
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
