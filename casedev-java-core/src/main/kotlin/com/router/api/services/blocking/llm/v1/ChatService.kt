// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.llm.v1

import com.google.errorprone.annotations.MustBeClosed
import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponseFor
import com.router.api.models.llm.v1.chat.ChatCreateCompletionParams
import com.router.api.models.llm.v1.chat.ChatCreateCompletionResponse
import java.util.function.Consumer

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
     * Create a completion for the provided prompt and parameters. Compatible with OpenAI's chat
     * completions API. Supports 40+ models including GPT-4, Claude, Gemini, and CaseMark legal AI
     * models. Includes streaming support, token counting, and usage tracking.
     */
    fun createCompletion(params: ChatCreateCompletionParams): ChatCreateCompletionResponse =
        createCompletion(params, RequestOptions.none())

    /** @see createCompletion */
    fun createCompletion(
        params: ChatCreateCompletionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChatCreateCompletionResponse

    /** A view of [ChatService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /llm/v1/chat/completions`, but is otherwise the
         * same as [ChatService.createCompletion].
         */
        @MustBeClosed
        fun createCompletion(
            params: ChatCreateCompletionParams
        ): HttpResponseFor<ChatCreateCompletionResponse> =
            createCompletion(params, RequestOptions.none())

        /** @see createCompletion */
        @MustBeClosed
        fun createCompletion(
            params: ChatCreateCompletionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChatCreateCompletionResponse>
    }
}
