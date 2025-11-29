// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.voice.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.voice.v1.speak.SpeakCreateParams
import dev.casedev.models.voice.v1.speak.SpeakStreamParams
import java.util.function.Consumer

interface SpeakService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpeakService

    /**
     * Convert text to natural-sounding audio using ElevenLabs voices. Ideal for creating audio
     * summaries of legal documents, client presentations, or accessibility features. Supports
     * multiple languages and voice customization.
     */
    @MustBeClosed
    fun create(params: SpeakCreateParams): HttpResponse = create(params, RequestOptions.none())

    /** @see create */
    @MustBeClosed
    fun create(
        params: SpeakCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * Convert text to speech using ElevenLabs AI voices with streaming for real-time playback.
     * Returns audio data as an MP3 stream for immediate playback with minimal latency. Perfect for
     * legal document narration, client presentations, or accessibility features.
     */
    @MustBeClosed
    fun stream(params: SpeakStreamParams): HttpResponse = stream(params, RequestOptions.none())

    /** @see stream */
    @MustBeClosed
    fun stream(
        params: SpeakStreamParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** A view of [SpeakService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpeakService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /voice/v1/speak`, but is otherwise the same as
         * [SpeakService.create].
         */
        @MustBeClosed
        fun create(params: SpeakCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SpeakCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /voice/v1/speak/stream`, but is otherwise the same
         * as [SpeakService.stream].
         */
        @MustBeClosed
        fun stream(params: SpeakStreamParams): HttpResponse = stream(params, RequestOptions.none())

        /** @see stream */
        @MustBeClosed
        fun stream(
            params: SpeakStreamParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
