// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.v2

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.AsyncStreamResponse
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.StreamResponse
import dev.case.api.models.agent.v2.chat.ChatCancelParams
import dev.case.api.models.agent.v2.chat.ChatCancelResponse
import dev.case.api.models.agent.v2.chat.ChatCreateParams
import dev.case.api.models.agent.v2.chat.ChatCreateResponse
import dev.case.api.models.agent.v2.chat.ChatDeleteParams
import dev.case.api.models.agent.v2.chat.ChatDeleteResponse
import dev.case.api.models.agent.v2.chat.ChatReplyToQuestionParams
import dev.case.api.models.agent.v2.chat.ChatRespondParams
import dev.case.api.models.agent.v2.chat.ChatSendMessageParams
import dev.case.api.models.agent.v2.chat.ChatStreamParams
import dev.case.api.services.async.agent.v2.chat.FileServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
interface ChatServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatServiceAsync

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    fun files(): FileServiceAsync

    /**
     * Creates a persistent OpenCode chat session backed by a Daytona runtime. Session state is
     * retained and can be resumed or recovered across requests.
     */
    fun create(): CompletableFuture<ChatCreateResponse> = create(ChatCreateParams.none())

    /** @see create */
    fun create(
        params: ChatCreateParams = ChatCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatCreateResponse>

    /** @see create */
    fun create(
        params: ChatCreateParams = ChatCreateParams.none()
    ): CompletableFuture<ChatCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<ChatCreateResponse> =
        create(ChatCreateParams.none(), requestOptions)

    /** Terminates the active Daytona runtime (if any), then marks the chat as ended. */
    fun delete(id: String): CompletableFuture<ChatDeleteResponse> =
        delete(id, ChatDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ChatDeleteParams = ChatDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ChatDeleteParams = ChatDeleteParams.none(),
    ): CompletableFuture<ChatDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ChatDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatDeleteResponse>

    /** @see delete */
    fun delete(params: ChatDeleteParams): CompletableFuture<ChatDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<ChatDeleteResponse> =
        delete(id, ChatDeleteParams.none(), requestOptions)

    /** Aborts the active OpenCode generation for this Daytona-backed chat session. */
    fun cancel(id: String): CompletableFuture<ChatCancelResponse> =
        cancel(id, ChatCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: ChatCancelParams = ChatCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatCancelResponse> =
        cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        id: String,
        params: ChatCancelParams = ChatCancelParams.none(),
    ): CompletableFuture<ChatCancelResponse> = cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: ChatCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatCancelResponse>

    /** @see cancel */
    fun cancel(params: ChatCancelParams): CompletableFuture<ChatCancelResponse> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions): CompletableFuture<ChatCancelResponse> =
        cancel(id, ChatCancelParams.none(), requestOptions)

    /**
     * Answers a pending OpenCode question for the Daytona-backed chat session and resumes or
     * recovers the runtime if needed.
     */
    fun replyToQuestion(
        requestId: String,
        params: ChatReplyToQuestionParams,
    ): CompletableFuture<Void?> = replyToQuestion(requestId, params, RequestOptions.none())

    /** @see replyToQuestion */
    fun replyToQuestion(
        requestId: String,
        params: ChatReplyToQuestionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        replyToQuestion(params.toBuilder().requestId(requestId).build(), requestOptions)

    /** @see replyToQuestion */
    fun replyToQuestion(params: ChatReplyToQuestionParams): CompletableFuture<Void?> =
        replyToQuestion(params, RequestOptions.none())

    /** @see replyToQuestion */
    fun replyToQuestion(
        params: ChatReplyToQuestionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Streams a single assistant turn from a Daytona-backed chat runtime as normalized SSE events
     * with stable turn, message, and part IDs. Emits events: `turn.started`, `turn.status`,
     * `message.created`, `message.part.updated`, `message.completed`, `session.usage`,
     * `turn.completed`.
     *
     * **When to use this endpoint:** Recommended for building custom chat UIs that need real-time
     * streaming progress. This is the primary streaming endpoint for new integrations.
     *
     * **Alternatives:**
     * - `POST /chat/:id/message` — synchronous, returns complete response as JSON (best for
     *   server-to-server)
     */
    fun respondStreaming(id: String): AsyncStreamResponse<String> =
        respondStreaming(id, ChatRespondParams.none())

    /** @see respondStreaming */
    fun respondStreaming(
        id: String,
        params: ChatRespondParams = ChatRespondParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<String> =
        respondStreaming(params.toBuilder().id(id).build(), requestOptions)

    /** @see respondStreaming */
    fun respondStreaming(
        id: String,
        params: ChatRespondParams = ChatRespondParams.none(),
    ): AsyncStreamResponse<String> = respondStreaming(id, params, RequestOptions.none())

    /** @see respondStreaming */
    fun respondStreaming(
        params: ChatRespondParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<String>

    /** @see respondStreaming */
    fun respondStreaming(params: ChatRespondParams): AsyncStreamResponse<String> =
        respondStreaming(params, RequestOptions.none())

    /** @see respondStreaming */
    fun respondStreaming(id: String, requestOptions: RequestOptions): AsyncStreamResponse<String> =
        respondStreaming(id, ChatRespondParams.none(), requestOptions)

    /**
     * Sends a message to a Daytona-backed chat runtime and returns the complete response as a
     * single JSON body. Blocks until the assistant turn completes.
     *
     * **When to use this endpoint:** Best for server-to-server integrations, background processing,
     * or any context where you want the full response in one call without managing an SSE stream.
     *
     * **Alternatives:**
     * - `POST /chat/:id/respond` — streaming SSE with normalized events (recommended for custom
     *   chat UIs)
     */
    fun sendMessage(id: String): CompletableFuture<Void?> =
        sendMessage(id, ChatSendMessageParams.none())

    /** @see sendMessage */
    fun sendMessage(
        id: String,
        params: ChatSendMessageParams = ChatSendMessageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = sendMessage(params.toBuilder().id(id).build(), requestOptions)

    /** @see sendMessage */
    fun sendMessage(
        id: String,
        params: ChatSendMessageParams = ChatSendMessageParams.none(),
    ): CompletableFuture<Void?> = sendMessage(id, params, RequestOptions.none())

    /** @see sendMessage */
    fun sendMessage(
        params: ChatSendMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see sendMessage */
    fun sendMessage(params: ChatSendMessageParams): CompletableFuture<Void?> =
        sendMessage(params, RequestOptions.none())

    /** @see sendMessage */
    fun sendMessage(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        sendMessage(id, ChatSendMessageParams.none(), requestOptions)

    /**
     * Relays OpenCode SSE events for this Daytona-backed chat runtime. Supports replay from
     * buffered events using Last-Event-ID and transparently reconnects stopped or archived
     * runtimes.
     */
    fun streamStreaming(id: String): AsyncStreamResponse<String> =
        streamStreaming(id, ChatStreamParams.none())

    /** @see streamStreaming */
    fun streamStreaming(
        id: String,
        params: ChatStreamParams = ChatStreamParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<String> =
        streamStreaming(params.toBuilder().id(id).build(), requestOptions)

    /** @see streamStreaming */
    fun streamStreaming(
        id: String,
        params: ChatStreamParams = ChatStreamParams.none(),
    ): AsyncStreamResponse<String> = streamStreaming(id, params, RequestOptions.none())

    /** @see streamStreaming */
    fun streamStreaming(
        params: ChatStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<String>

    /** @see streamStreaming */
    fun streamStreaming(params: ChatStreamParams): AsyncStreamResponse<String> =
        streamStreaming(params, RequestOptions.none())

    /** @see streamStreaming */
    fun streamStreaming(id: String, requestOptions: RequestOptions): AsyncStreamResponse<String> =
        streamStreaming(id, ChatStreamParams.none(), requestOptions)

    /** A view of [ChatServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatServiceAsync.WithRawResponse

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        fun files(): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent/v2/chat`, but is otherwise the same as
         * [ChatServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<ChatCreateResponse>> =
            create(ChatCreateParams.none())

        /** @see create */
        fun create(
            params: ChatCreateParams = ChatCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatCreateResponse>>

        /** @see create */
        fun create(
            params: ChatCreateParams = ChatCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ChatCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ChatCreateResponse>> =
            create(ChatCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agent/v2/chat/{id}`, but is otherwise the same
         * as [ChatServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<ChatDeleteResponse>> =
            delete(id, ChatDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: ChatDeleteParams = ChatDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: ChatDeleteParams = ChatDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ChatDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ChatDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatDeleteResponse>>

        /** @see delete */
        fun delete(
            params: ChatDeleteParams
        ): CompletableFuture<HttpResponseFor<ChatDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatDeleteResponse>> =
            delete(id, ChatDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agent/v2/chat/{id}/cancel`, but is otherwise the
         * same as [ChatServiceAsync.cancel].
         */
        fun cancel(id: String): CompletableFuture<HttpResponseFor<ChatCancelResponse>> =
            cancel(id, ChatCancelParams.none())

        /** @see cancel */
        fun cancel(
            id: String,
            params: ChatCancelParams = ChatCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatCancelResponse>> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            id: String,
            params: ChatCancelParams = ChatCancelParams.none(),
        ): CompletableFuture<HttpResponseFor<ChatCancelResponse>> =
            cancel(id, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: ChatCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatCancelResponse>>

        /** @see cancel */
        fun cancel(
            params: ChatCancelParams
        ): CompletableFuture<HttpResponseFor<ChatCancelResponse>> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChatCancelResponse>> =
            cancel(id, ChatCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agent/v2/chat/{id}/question/{requestID}/reply`,
         * but is otherwise the same as [ChatServiceAsync.replyToQuestion].
         */
        fun replyToQuestion(
            requestId: String,
            params: ChatReplyToQuestionParams,
        ): CompletableFuture<HttpResponse> =
            replyToQuestion(requestId, params, RequestOptions.none())

        /** @see replyToQuestion */
        fun replyToQuestion(
            requestId: String,
            params: ChatReplyToQuestionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            replyToQuestion(params.toBuilder().requestId(requestId).build(), requestOptions)

        /** @see replyToQuestion */
        fun replyToQuestion(params: ChatReplyToQuestionParams): CompletableFuture<HttpResponse> =
            replyToQuestion(params, RequestOptions.none())

        /** @see replyToQuestion */
        fun replyToQuestion(
            params: ChatReplyToQuestionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /agent/v2/chat/{id}/respond`, but is otherwise the
         * same as [ChatServiceAsync.respondStreaming].
         */
        @MustBeClosed
        fun respondStreaming(
            id: String
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            respondStreaming(id, ChatRespondParams.none())

        /** @see respondStreaming */
        @MustBeClosed
        fun respondStreaming(
            id: String,
            params: ChatRespondParams = ChatRespondParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            respondStreaming(params.toBuilder().id(id).build(), requestOptions)

        /** @see respondStreaming */
        @MustBeClosed
        fun respondStreaming(
            id: String,
            params: ChatRespondParams = ChatRespondParams.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            respondStreaming(id, params, RequestOptions.none())

        /** @see respondStreaming */
        @MustBeClosed
        fun respondStreaming(
            params: ChatRespondParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>>

        /** @see respondStreaming */
        @MustBeClosed
        fun respondStreaming(
            params: ChatRespondParams
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            respondStreaming(params, RequestOptions.none())

        /** @see respondStreaming */
        @MustBeClosed
        fun respondStreaming(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            respondStreaming(id, ChatRespondParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agent/v2/chat/{id}/message`, but is otherwise the
         * same as [ChatServiceAsync.sendMessage].
         */
        fun sendMessage(id: String): CompletableFuture<HttpResponse> =
            sendMessage(id, ChatSendMessageParams.none())

        /** @see sendMessage */
        fun sendMessage(
            id: String,
            params: ChatSendMessageParams = ChatSendMessageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            sendMessage(params.toBuilder().id(id).build(), requestOptions)

        /** @see sendMessage */
        fun sendMessage(
            id: String,
            params: ChatSendMessageParams = ChatSendMessageParams.none(),
        ): CompletableFuture<HttpResponse> = sendMessage(id, params, RequestOptions.none())

        /** @see sendMessage */
        fun sendMessage(
            params: ChatSendMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see sendMessage */
        fun sendMessage(params: ChatSendMessageParams): CompletableFuture<HttpResponse> =
            sendMessage(params, RequestOptions.none())

        /** @see sendMessage */
        fun sendMessage(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            sendMessage(id, ChatSendMessageParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent/v2/chat/{id}/stream`, but is otherwise the
         * same as [ChatServiceAsync.streamStreaming].
         */
        @MustBeClosed
        fun streamStreaming(
            id: String
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            streamStreaming(id, ChatStreamParams.none())

        /** @see streamStreaming */
        @MustBeClosed
        fun streamStreaming(
            id: String,
            params: ChatStreamParams = ChatStreamParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            streamStreaming(params.toBuilder().id(id).build(), requestOptions)

        /** @see streamStreaming */
        @MustBeClosed
        fun streamStreaming(
            id: String,
            params: ChatStreamParams = ChatStreamParams.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            streamStreaming(id, params, RequestOptions.none())

        /** @see streamStreaming */
        @MustBeClosed
        fun streamStreaming(
            params: ChatStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>>

        /** @see streamStreaming */
        @MustBeClosed
        fun streamStreaming(
            params: ChatStreamParams
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            streamStreaming(params, RequestOptions.none())

        /** @see streamStreaming */
        @MustBeClosed
        fun streamStreaming(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            streamStreaming(id, ChatStreamParams.none(), requestOptions)
    }
}
