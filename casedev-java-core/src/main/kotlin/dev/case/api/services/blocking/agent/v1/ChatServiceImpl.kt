// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.checkRequired
import dev.case.api.core.handlers.emptyHandler
import dev.case.api.core.handlers.errorBodyHandler
import dev.case.api.core.handlers.errorHandler
import dev.case.api.core.handlers.jsonHandler
import dev.case.api.core.handlers.mapJson
import dev.case.api.core.handlers.sseHandler
import dev.case.api.core.http.HttpMethod
import dev.case.api.core.http.HttpRequest
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.StreamResponse
import dev.case.api.core.http.json
import dev.case.api.core.http.parseable
import dev.case.api.core.prepare
import dev.case.api.models.agent.v1.chat.ChatCancelParams
import dev.case.api.models.agent.v1.chat.ChatCancelResponse
import dev.case.api.models.agent.v1.chat.ChatCreateParams
import dev.case.api.models.agent.v1.chat.ChatCreateResponse
import dev.case.api.models.agent.v1.chat.ChatDeleteParams
import dev.case.api.models.agent.v1.chat.ChatDeleteResponse
import dev.case.api.models.agent.v1.chat.ChatReplyToQuestionParams
import dev.case.api.models.agent.v1.chat.ChatRespondParams
import dev.case.api.models.agent.v1.chat.ChatSendMessageParams
import dev.case.api.models.agent.v1.chat.ChatStreamParams
import dev.case.api.services.blocking.agent.v1.chat.FileService
import dev.case.api.services.blocking.agent.v1.chat.FileServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
class ChatServiceImpl internal constructor(private val clientOptions: ClientOptions) : ChatService {

    private val withRawResponse: ChatService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val files: FileService by lazy { FileServiceImpl(clientOptions) }

    override fun withRawResponse(): ChatService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatService =
        ChatServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    override fun files(): FileService = files

    override fun create(
        params: ChatCreateParams,
        requestOptions: RequestOptions,
    ): ChatCreateResponse =
        // post /agent/v1/chat
        withRawResponse().create(params, requestOptions).parse()

    override fun delete(
        params: ChatDeleteParams,
        requestOptions: RequestOptions,
    ): ChatDeleteResponse =
        // delete /agent/v1/chat/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun cancel(
        params: ChatCancelParams,
        requestOptions: RequestOptions,
    ): ChatCancelResponse =
        // post /agent/v1/chat/{id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun replyToQuestion(
        params: ChatReplyToQuestionParams,
        requestOptions: RequestOptions,
    ) {
        // post /agent/v1/chat/{id}/question/{requestID}/reply
        withRawResponse().replyToQuestion(params, requestOptions)
    }

    override fun respondStreaming(
        params: ChatRespondParams,
        requestOptions: RequestOptions,
    ): StreamResponse<String> =
        // post /agent/v1/chat/{id}/respond
        withRawResponse().respondStreaming(params, requestOptions).parse()

    override fun sendMessage(params: ChatSendMessageParams, requestOptions: RequestOptions) {
        // post /agent/v1/chat/{id}/message
        withRawResponse().sendMessage(params, requestOptions)
    }

    override fun streamStreaming(
        params: ChatStreamParams,
        requestOptions: RequestOptions,
    ): StreamResponse<String> =
        // get /agent/v1/chat/{id}/stream
        withRawResponse().streamStreaming(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChatService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val files: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChatService.WithRawResponse =
            ChatServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        override fun files(): FileService.WithRawResponse = files

        private val createHandler: Handler<ChatCreateResponse> =
            jsonHandler<ChatCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ChatCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v1", "chat")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<ChatDeleteResponse> =
            jsonHandler<ChatDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ChatDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v1", "chat", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cancelHandler: Handler<ChatCancelResponse> =
            jsonHandler<ChatCancelResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: ChatCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatCancelResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v1", "chat", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val replyToQuestionHandler: Handler<Void?> = emptyHandler()

        override fun replyToQuestion(
            params: ChatReplyToQuestionParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("requestId", params.requestId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent",
                        "v1",
                        "chat",
                        params._pathParam(0),
                        "question",
                        params._pathParam(1),
                        "reply",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { replyToQuestionHandler.handle(it) }
            }
        }

        private val respondStreamingHandler: Handler<StreamResponse<String>> =
            sseHandler(clientOptions.jsonMapper).mapJson<String>()

        override fun respondStreaming(
            params: ChatRespondParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<String>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v1", "chat", params._pathParam(0), "respond")
                    .putHeader("Accept", "text/event-stream")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.let { respondStreamingHandler.handle(it) }
            }
        }

        private val sendMessageHandler: Handler<Void?> = emptyHandler()

        override fun sendMessage(
            params: ChatSendMessageParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v1", "chat", params._pathParam(0), "message")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { sendMessageHandler.handle(it) }
            }
        }

        private val streamStreamingHandler: Handler<StreamResponse<String>> =
            sseHandler(clientOptions.jsonMapper).mapJson<String>()

        override fun streamStreaming(
            params: ChatStreamParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<String>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v1", "chat", params._pathParam(0), "stream")
                    .putHeader("Accept", "text/event-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.let { streamStreamingHandler.handle(it) }
            }
        }
    }
}
