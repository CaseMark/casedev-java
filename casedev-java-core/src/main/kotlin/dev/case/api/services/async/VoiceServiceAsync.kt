// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.voice.BoostListServiceAsync
import dev.case.api.services.async.voice.StreamingServiceAsync
import dev.case.api.services.async.voice.TranscriptionServiceAsync
import dev.case.api.services.async.voice.V1ServiceAsync
import java.util.function.Consumer

interface VoiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceServiceAsync

    /** Audio transcription and text-to-speech */
    fun streaming(): StreamingServiceAsync

    /** Audio transcription and text-to-speech */
    fun boostList(): BoostListServiceAsync

    /** Audio transcription and text-to-speech */
    fun transcription(): TranscriptionServiceAsync

    /** Audio transcription and text-to-speech */
    fun v1(): V1ServiceAsync

    /** A view of [VoiceServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoiceServiceAsync.WithRawResponse

        /** Audio transcription and text-to-speech */
        fun streaming(): StreamingServiceAsync.WithRawResponse

        /** Audio transcription and text-to-speech */
        fun boostList(): BoostListServiceAsync.WithRawResponse

        /** Audio transcription and text-to-speech */
        fun transcription(): TranscriptionServiceAsync.WithRawResponse

        /** Audio transcription and text-to-speech */
        fun v1(): V1ServiceAsync.WithRawResponse
    }
}
