// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.StreamResponse
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
import java.util.function.Consumer

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
interface ChatService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatService

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    fun files(): FileService

    /**
     * Creates a persistent OpenCode chat session backed by a Daytona or Vercel runtime. Session
     * state is retained and can be resumed or recovered across requests.
     */
    fun create(): ChatCreateResponse = create(ChatCreateParams.none())

    /** @see create */
    fun create(
        params: ChatCreateParams = ChatCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCreateResponse

    /** @see create */
    fun create(params: ChatCreateParams = ChatCreateParams.none()): ChatCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): ChatCreateResponse =
        create(ChatCreateParams.none(), requestOptions)

    /** Snapshots and terminates the active sandbox (if any), then marks the chat as ended. */
    fun delete(id: String): ChatDeleteResponse = delete(id, ChatDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ChatDeleteParams = ChatDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: ChatDeleteParams = ChatDeleteParams.none()): ChatDeleteResponse =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ChatDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatDeleteResponse

    /** @see delete */
    fun delete(params: ChatDeleteParams): ChatDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): ChatDeleteResponse =
        delete(id, ChatDeleteParams.none(), requestOptions)

    /** Aborts the active OpenCode generation for this chat session. */
    fun cancel(id: String): ChatCancelResponse = cancel(id, ChatCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: ChatCancelParams = ChatCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCancelResponse = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(id: String, params: ChatCancelParams = ChatCancelParams.none()): ChatCancelResponse =
        cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: ChatCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCancelResponse

    /** @see cancel */
    fun cancel(params: ChatCancelParams): ChatCancelResponse = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions): ChatCancelResponse =
        cancel(id, ChatCancelParams.none(), requestOptions)

    /** Answers a pending OpenCode question for the chat session bound to this agent chat. */
    fun replyToQuestion(requestId: String, params: ChatReplyToQuestionParams) =
        replyToQuestion(requestId, params, RequestOptions.none())

    /** @see replyToQuestion */
    fun replyToQuestion(
        requestId: String,
        params: ChatReplyToQuestionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = replyToQuestion(params.toBuilder().requestId(requestId).build(), requestOptions)

    /** @see replyToQuestion */
    fun replyToQuestion(params: ChatReplyToQuestionParams) =
        replyToQuestion(params, RequestOptions.none())

    /** @see replyToQuestion */
    fun replyToQuestion(
        params: ChatReplyToQuestionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Streams a single assistant turn as normalized SSE events with stable turn, message, and part
     * IDs. Emits events: `turn.started`, `turn.status`, `message.created`, `message.part.updated`,
     * `message.completed`, `session.usage`, `turn.completed`.
     *
     * **When to use this endpoint:** Recommended for building custom chat UIs that need real-time
     * streaming progress. This is the primary streaming endpoint for new integrations.
     *
     * **Alternatives:**
     * - `POST /chat/:id/message` — synchronous, returns complete response as JSON (best for
     *   server-to-server)
     */
    @MustBeClosed
    fun respondStreaming(id: String): StreamResponse<String> =
        respondStreaming(id, ChatRespondParams.none())

    /** @see respondStreaming */
    @MustBeClosed
    fun respondStreaming(
        id: String,
        params: ChatRespondParams = ChatRespondParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<String> = respondStreaming(params.toBuilder().id(id).build(), requestOptions)

    /** @see respondStreaming */
    @MustBeClosed
    fun respondStreaming(
        id: String,
        params: ChatRespondParams = ChatRespondParams.none(),
    ): StreamResponse<String> = respondStreaming(id, params, RequestOptions.none())

    /** @see respondStreaming */
    @MustBeClosed
    fun respondStreaming(
        params: ChatRespondParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<String>

    /** @see respondStreaming */
    @MustBeClosed
    fun respondStreaming(params: ChatRespondParams): StreamResponse<String> =
        respondStreaming(params, RequestOptions.none())

    /** @see respondStreaming */
    @MustBeClosed
    fun respondStreaming(id: String, requestOptions: RequestOptions): StreamResponse<String> =
        respondStreaming(id, ChatRespondParams.none(), requestOptions)

    /**
     * Sends a message and returns the complete response as a single JSON body. Blocks until the
     * agent turn completes.
     *
     * **When to use this endpoint:** Best for server-to-server integrations, background processing,
     * or any context where you want the full response in one call without managing an SSE stream.
     *
     * **Alternatives:**
     * - `POST /chat/:id/respond` — streaming SSE with normalized events (recommended for custom
     *   chat UIs)
     */
    fun sendMessage(id: String) = sendMessage(id, ChatSendMessageParams.none())

    /** @see sendMessage */
    fun sendMessage(
        id: String,
        params: ChatSendMessageParams = ChatSendMessageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = sendMessage(params.toBuilder().id(id).build(), requestOptions)

    /** @see sendMessage */
    fun sendMessage(id: String, params: ChatSendMessageParams = ChatSendMessageParams.none()) =
        sendMessage(id, params, RequestOptions.none())

    /** @see sendMessage */
    fun sendMessage(
        params: ChatSendMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see sendMessage */
    fun sendMessage(params: ChatSendMessageParams) = sendMessage(params, RequestOptions.none())

    /** @see sendMessage */
    fun sendMessage(id: String, requestOptions: RequestOptions) =
        sendMessage(id, ChatSendMessageParams.none(), requestOptions)

    /**
     * Relays OpenCode SSE events for this chat. Supports replay from buffered events using
     * Last-Event-ID.
     */
    @MustBeClosed
    fun streamStreaming(id: String): StreamResponse<String> =
        streamStreaming(id, ChatStreamParams.none())

    /** @see streamStreaming */
    @MustBeClosed
    fun streamStreaming(
        id: String,
        params: ChatStreamParams = ChatStreamParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<String> = streamStreaming(params.toBuilder().id(id).build(), requestOptions)

    /** @see streamStreaming */
    @MustBeClosed
    fun streamStreaming(
        id: String,
        params: ChatStreamParams = ChatStreamParams.none(),
    ): StreamResponse<String> = streamStreaming(id, params, RequestOptions.none())

    /** @see streamStreaming */
    @MustBeClosed
    fun streamStreaming(
        params: ChatStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StreamResponse<String>

    /** @see streamStreaming */
    @MustBeClosed
    fun streamStreaming(params: ChatStreamParams): StreamResponse<String> =
        streamStreaming(params, RequestOptions.none())

    /** @see streamStreaming */
    @MustBeClosed
    fun streamStreaming(id: String, requestOptions: RequestOptions): StreamResponse<String> =
        streamStreaming(id, ChatStreamParams.none(), requestOptions)

    /** A view of [ChatService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatService.WithRawResponse

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        fun files(): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent/v1/chat`, but is otherwise the same as
         * [ChatService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<ChatCreateResponse> = create(ChatCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ChatCreateParams = ChatCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            params: ChatCreateParams = ChatCreateParams.none()
        ): HttpResponseFor<ChatCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<ChatCreateResponse> =
            create(ChatCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agent/v1/chat/{id}`, but is otherwise the same
         * as [ChatService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<ChatDeleteResponse> =
            delete(id, ChatDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ChatDeleteParams = ChatDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ChatDeleteParams = ChatDeleteParams.none(),
        ): HttpResponseFor<ChatDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ChatDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: ChatDeleteParams): HttpResponseFor<ChatDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatDeleteResponse> = delete(id, ChatDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agent/v1/chat/{id}/cancel`, but is otherwise the
         * same as [ChatService.cancel].
         */
        @MustBeClosed
        fun cancel(id: String): HttpResponseFor<ChatCancelResponse> =
            cancel(id, ChatCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: ChatCancelParams = ChatCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCancelResponse> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: ChatCancelParams = ChatCancelParams.none(),
        ): HttpResponseFor<ChatCancelResponse> = cancel(id, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: ChatCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCancelResponse>

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: ChatCancelParams): HttpResponseFor<ChatCancelResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChatCancelResponse> = cancel(id, ChatCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agent/v1/chat/{id}/question/{requestID}/reply`,
         * but is otherwise the same as [ChatService.replyToQuestion].
         */
        @MustBeClosed
        fun replyToQuestion(requestId: String, params: ChatReplyToQuestionParams): HttpResponse =
            replyToQuestion(requestId, params, RequestOptions.none())

        /** @see replyToQuestion */
        @MustBeClosed
        fun replyToQuestion(
            requestId: String,
            params: ChatReplyToQuestionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            replyToQuestion(params.toBuilder().requestId(requestId).build(), requestOptions)

        /** @see replyToQuestion */
        @MustBeClosed
        fun replyToQuestion(params: ChatReplyToQuestionParams): HttpResponse =
            replyToQuestion(params, RequestOptions.none())

        /** @see replyToQuestion */
        @MustBeClosed
        fun replyToQuestion(
            params: ChatReplyToQuestionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /agent/v1/chat/{id}/respond`, but is otherwise the
         * same as [ChatService.respondStreaming].
         */
        @MustBeClosed
        fun respondStreaming(id: String): HttpResponseFor<StreamResponse<String>> =
            respondStreaming(id, ChatRespondParams.none())

        /** @see respondStreaming */
        @MustBeClosed
        fun respondStreaming(
            id: String,
            params: ChatRespondParams = ChatRespondParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<String>> =
            respondStreaming(params.toBuilder().id(id).build(), requestOptions)

        /** @see respondStreaming */
        @MustBeClosed
        fun respondStreaming(
            id: String,
            params: ChatRespondParams = ChatRespondParams.none(),
        ): HttpResponseFor<StreamResponse<String>> =
            respondStreaming(id, params, RequestOptions.none())

        /** @see respondStreaming */
        @MustBeClosed
        fun respondStreaming(
            params: ChatRespondParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<String>>

        /** @see respondStreaming */
        @MustBeClosed
        fun respondStreaming(params: ChatRespondParams): HttpResponseFor<StreamResponse<String>> =
            respondStreaming(params, RequestOptions.none())

        /** @see respondStreaming */
        @MustBeClosed
        fun respondStreaming(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<String>> =
            respondStreaming(id, ChatRespondParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agent/v1/chat/{id}/message`, but is otherwise the
         * same as [ChatService.sendMessage].
         */
        @MustBeClosed
        fun sendMessage(id: String): HttpResponse = sendMessage(id, ChatSendMessageParams.none())

        /** @see sendMessage */
        @MustBeClosed
        fun sendMessage(
            id: String,
            params: ChatSendMessageParams = ChatSendMessageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = sendMessage(params.toBuilder().id(id).build(), requestOptions)

        /** @see sendMessage */
        @MustBeClosed
        fun sendMessage(
            id: String,
            params: ChatSendMessageParams = ChatSendMessageParams.none(),
        ): HttpResponse = sendMessage(id, params, RequestOptions.none())

        /** @see sendMessage */
        @MustBeClosed
        fun sendMessage(
            params: ChatSendMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see sendMessage */
        @MustBeClosed
        fun sendMessage(params: ChatSendMessageParams): HttpResponse =
            sendMessage(params, RequestOptions.none())

        /** @see sendMessage */
        @MustBeClosed
        fun sendMessage(id: String, requestOptions: RequestOptions): HttpResponse =
            sendMessage(id, ChatSendMessageParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent/v1/chat/{id}/stream`, but is otherwise the
         * same as [ChatService.streamStreaming].
         */
        @MustBeClosed
        fun streamStreaming(id: String): HttpResponseFor<StreamResponse<String>> =
            streamStreaming(id, ChatStreamParams.none())

        /** @see streamStreaming */
        @MustBeClosed
        fun streamStreaming(
            id: String,
            params: ChatStreamParams = ChatStreamParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<String>> =
            streamStreaming(params.toBuilder().id(id).build(), requestOptions)

        /** @see streamStreaming */
        @MustBeClosed
        fun streamStreaming(
            id: String,
            params: ChatStreamParams = ChatStreamParams.none(),
        ): HttpResponseFor<StreamResponse<String>> =
            streamStreaming(id, params, RequestOptions.none())

        /** @see streamStreaming */
        @MustBeClosed
        fun streamStreaming(
            params: ChatStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StreamResponse<String>>

        /** @see streamStreaming */
        @MustBeClosed
        fun streamStreaming(params: ChatStreamParams): HttpResponseFor<StreamResponse<String>> =
            streamStreaming(params, RequestOptions.none())

        /** @see streamStreaming */
        @MustBeClosed
        fun streamStreaming(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<String>> =
            streamStreaming(id, ChatStreamParams.none(), requestOptions)
    }
}
