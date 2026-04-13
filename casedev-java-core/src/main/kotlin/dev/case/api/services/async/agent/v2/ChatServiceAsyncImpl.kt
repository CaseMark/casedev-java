// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.v2

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.checkRequired
import dev.case.api.core.handlers.emptyHandler
import dev.case.api.core.handlers.errorBodyHandler
import dev.case.api.core.handlers.errorHandler
import dev.case.api.core.handlers.jsonHandler
import dev.case.api.core.handlers.mapJson
import dev.case.api.core.handlers.sseHandler
import dev.case.api.core.http.AsyncStreamResponse
import dev.case.api.core.http.HttpMethod
import dev.case.api.core.http.HttpRequest
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.StreamResponse
import dev.case.api.core.http.json
import dev.case.api.core.http.parseable
import dev.case.api.core.http.toAsync
import dev.case.api.core.prepareAsync
import dev.case.api.models.agent.v2.chat.ChatCancelParams
import dev.case.api.models.agent.v2.chat.ChatCancelResponse
import dev.case.api.models.agent.v2.chat.ChatCreateParams
import dev.case.api.models.agent.v2.chat.ChatCreateResponse
import dev.case.api.models.agent.v2.chat.ChatCreateStreamTokenParams
import dev.case.api.models.agent.v2.chat.ChatCreateStreamTokenResponse
import dev.case.api.models.agent.v2.chat.ChatDeleteParams
import dev.case.api.models.agent.v2.chat.ChatDeleteResponse
import dev.case.api.models.agent.v2.chat.ChatReplyToQuestionParams
import dev.case.api.models.agent.v2.chat.ChatRespondParams
import dev.case.api.models.agent.v2.chat.ChatSendMessageParams
import dev.case.api.models.agent.v2.chat.ChatStreamParams
import dev.case.api.services.async.agent.v2.chat.FileServiceAsync
import dev.case.api.services.async.agent.v2.chat.FileServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
class ChatServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ChatServiceAsync {

    private val withRawResponse: ChatServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ChatServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatServiceAsync =
        ChatServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    override fun files(): FileServiceAsync = files

    override fun create(
        params: ChatCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatCreateResponse> =
        // post /agent/v2/chat
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ChatDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatDeleteResponse> =
        // delete /agent/v2/chat/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: ChatCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatCancelResponse> =
        // post /agent/v2/chat/{id}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun createStreamToken(
        params: ChatCreateStreamTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChatCreateStreamTokenResponse> =
        // post /agent/v2/chat/{id}/stream-token
        withRawResponse().createStreamToken(params, requestOptions).thenApply { it.parse() }

    override fun replyToQuestion(
        params: ChatReplyToQuestionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /agent/v2/chat/{id}/question/{requestID}/reply
        withRawResponse().replyToQuestion(params, requestOptions).thenAccept {}

    override fun respondStreaming(
        params: ChatRespondParams,
        requestOptions: RequestOptions,
    ): AsyncStreamResponse<String> =
        // post /agent/v2/chat/{id}/respond
        withRawResponse()
            .respondStreaming(params, requestOptions)
            .thenApply { it.parse() }
            .toAsync(clientOptions.streamHandlerExecutor)

    override fun sendMessage(
        params: ChatSendMessageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /agent/v2/chat/{id}/message
        withRawResponse().sendMessage(params, requestOptions).thenAccept {}

    override fun streamStreaming(
        params: ChatStreamParams,
        requestOptions: RequestOptions,
    ): AsyncStreamResponse<String> =
        // get /agent/v2/chat/{id}/stream
        withRawResponse()
            .streamStreaming(params, requestOptions)
            .thenApply { it.parse() }
            .toAsync(clientOptions.streamHandlerExecutor)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChatServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val files: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChatServiceAsync.WithRawResponse =
            ChatServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        override fun files(): FileServiceAsync.WithRawResponse = files

        private val createHandler: Handler<ChatCreateResponse> =
            jsonHandler<ChatCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ChatCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v2", "chat")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<ChatDeleteResponse> =
            jsonHandler<ChatDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ChatDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v2", "chat", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val cancelHandler: Handler<ChatCancelResponse> =
            jsonHandler<ChatCancelResponse>(clientOptions.jsonMapper)

        override fun cancel(
            params: ChatCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatCancelResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v2", "chat", params._pathParam(0), "cancel")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { cancelHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createStreamTokenHandler: Handler<ChatCreateStreamTokenResponse> =
            jsonHandler<ChatCreateStreamTokenResponse>(clientOptions.jsonMapper)

        override fun createStreamToken(
            params: ChatCreateStreamTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatCreateStreamTokenResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v2", "chat", params._pathParam(0), "stream-token")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createStreamTokenHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val replyToQuestionHandler: Handler<Void?> = emptyHandler()

        override fun replyToQuestion(
            params: ChatReplyToQuestionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("requestId", params.requestId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "agent",
                        "v2",
                        "chat",
                        params._pathParam(0),
                        "question",
                        params._pathParam(1),
                        "reply",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { replyToQuestionHandler.handle(it) }
                    }
                }
        }

        private val respondStreamingHandler: Handler<StreamResponse<String>> =
            sseHandler(clientOptions.jsonMapper).mapJson<String>()

        override fun respondStreaming(
            params: ChatRespondParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v2", "chat", params._pathParam(0), "respond")
                    .putHeader("Accept", "text/event-stream")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.let { respondStreamingHandler.handle(it) }
                    }
                }
        }

        private val sendMessageHandler: Handler<Void?> = emptyHandler()

        override fun sendMessage(
            params: ChatSendMessageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v2", "chat", params._pathParam(0), "message")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { sendMessageHandler.handle(it) }
                    }
                }
        }

        private val streamStreamingHandler: Handler<StreamResponse<String>> =
            sseHandler(clientOptions.jsonMapper).mapJson<String>()

        override fun streamStreaming(
            params: ChatStreamParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v2", "chat", params._pathParam(0), "stream")
                    .putHeader("Accept", "text/event-stream")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.let { streamStreamingHandler.handle(it) }
                    }
                }
        }
    }
}
