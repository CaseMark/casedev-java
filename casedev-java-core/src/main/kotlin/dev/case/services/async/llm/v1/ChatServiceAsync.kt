// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async.llm.v1

import dev.case.core.ClientOptions
import dev.case.core.RequestOptions
import dev.case.core.http.HttpResponseFor
import dev.case.models.llm.v1.chat.ChatCreateCompletionParams
import dev.case.models.llm.v1.chat.ChatCreateCompletionResponse
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
     * Create a completion for the provided prompt and parameters. Compatible with OpenAI's chat
     * completions API. Supports 40+ models including GPT-4, Claude, Gemini, and CaseMark legal AI
     * models. Includes streaming support, token counting, and usage tracking.
     */
    fun createCompletion(
        params: ChatCreateCompletionParams
    ): CompletableFuture<ChatCreateCompletionResponse> =
        createCompletion(params, RequestOptions.none())

    /** @see createCompletion */
    fun createCompletion(
        params: ChatCreateCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChatCreateCompletionResponse>

    /** A view of [ChatServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /llm/v1/chat/completions`, but is otherwise the
         * same as [ChatServiceAsync.createCompletion].
         */
        fun createCompletion(
            params: ChatCreateCompletionParams
        ): CompletableFuture<HttpResponseFor<ChatCreateCompletionResponse>> =
            createCompletion(params, RequestOptions.none())

        /** @see createCompletion */
        fun createCompletion(
            params: ChatCreateCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChatCreateCompletionResponse>>
    }
}
