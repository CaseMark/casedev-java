// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.AsyncStreamResponse
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.StreamResponse
import dev.case.api.models.agent.v1.chat.ChatCancelParams
import dev.case.api.models.agent.v1.chat.ChatCancelResponse
import dev.case.api.models.agent.v1.chat.ChatCreateParams
import dev.case.api.models.agent.v1.chat.ChatCreateResponse
import dev.case.api.models.agent.v1.chat.ChatDeleteParams
import dev.case.api.models.agent.v1.chat.ChatDeleteResponse
import dev.case.api.models.agent.v1.chat.ChatRespondParams
import dev.case.api.models.agent.v1.chat.ChatSendMessageParams
import dev.case.api.models.agent.v1.chat.ChatStreamParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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
     * Creates a persistent OpenCode chat session in a Modal sandbox. Session state is retained and
     * can be resumed across requests.
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

    /** Snapshots and terminates the active sandbox (if any), then marks the chat as ended. */
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

    /** Aborts the active OpenCode generation for this chat session. */
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
     * Streams a single assistant turn as normalized state events with stable turn, message, and
     * part ids.
     */
    fun respondStreaming(id: String, params: ChatRespondParams): AsyncStreamResponse<String> =
        respondStreaming(id, params, RequestOptions.none())

    /** @see respondStreaming */
    fun respondStreaming(
        id: String,
        params: ChatRespondParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<String> =
        respondStreaming(params.toBuilder().id(id).build(), requestOptions)

    /** @see respondStreaming */
    fun respondStreaming(params: ChatRespondParams): AsyncStreamResponse<String> =
        respondStreaming(params, RequestOptions.none())

    /** @see respondStreaming */
    fun respondStreaming(
        params: ChatRespondParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncStreamResponse<String>

    /** Proxies a message to the OpenCode session bound to this chat. */
    fun sendMessage(id: String, params: ChatSendMessageParams): CompletableFuture<Void?> =
        sendMessage(id, params, RequestOptions.none())

    /** @see sendMessage */
    fun sendMessage(
        id: String,
        params: ChatSendMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = sendMessage(params.toBuilder().id(id).build(), requestOptions)

    /** @see sendMessage */
    fun sendMessage(params: ChatSendMessageParams): CompletableFuture<Void?> =
        sendMessage(params, RequestOptions.none())

    /** @see sendMessage */
    fun sendMessage(
        params: ChatSendMessageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Relays OpenCode SSE events for this chat. Supports replay from buffered events using
     * Last-Event-ID.
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
         * Returns a raw HTTP response for `post /agent/v1/chat`, but is otherwise the same as
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
         * Returns a raw HTTP response for `delete /agent/v1/chat/{id}`, but is otherwise the same
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
         * Returns a raw HTTP response for `post /agent/v1/chat/{id}/cancel`, but is otherwise the
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
         * Returns a raw HTTP response for `post /agent/v1/chat/{id}/respond`, but is otherwise the
         * same as [ChatServiceAsync.respondStreaming].
         */
        @MustBeClosed
        fun respondStreaming(
            id: String,
            params: ChatRespondParams,
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            respondStreaming(id, params, RequestOptions.none())

        /** @see respondStreaming */
        @MustBeClosed
        fun respondStreaming(
            id: String,
            params: ChatRespondParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            respondStreaming(params.toBuilder().id(id).build(), requestOptions)

        /** @see respondStreaming */
        @MustBeClosed
        fun respondStreaming(
            params: ChatRespondParams
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> =
            respondStreaming(params, RequestOptions.none())

        /** @see respondStreaming */
        @MustBeClosed
        fun respondStreaming(
            params: ChatRespondParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>>

        /**
         * Returns a raw HTTP response for `post /agent/v1/chat/{id}/message`, but is otherwise the
         * same as [ChatServiceAsync.sendMessage].
         */
        fun sendMessage(
            id: String,
            params: ChatSendMessageParams,
        ): CompletableFuture<HttpResponse> = sendMessage(id, params, RequestOptions.none())

        /** @see sendMessage */
        fun sendMessage(
            id: String,
            params: ChatSendMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            sendMessage(params.toBuilder().id(id).build(), requestOptions)

        /** @see sendMessage */
        fun sendMessage(params: ChatSendMessageParams): CompletableFuture<HttpResponse> =
            sendMessage(params, RequestOptions.none())

        /** @see sendMessage */
        fun sendMessage(
            params: ChatSendMessageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /agent/v1/chat/{id}/stream`, but is otherwise the
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
