// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.voice.v1

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponse
import com.router.api.models.voice.v1.speak.SpeakCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SpeakServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpeakServiceAsync

    /**
     * Convert text to natural-sounding audio using ElevenLabs voices. Ideal for creating audio
     * summaries of legal documents, client presentations, or accessibility features. Supports
     * multiple languages and voice customization.
     */
    fun create(params: SpeakCreateParams): CompletableFuture<HttpResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SpeakCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** A view of [SpeakServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpeakServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /voice/v1/speak`, but is otherwise the same as
         * [SpeakServiceAsync.create].
         */
        fun create(params: SpeakCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SpeakCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
