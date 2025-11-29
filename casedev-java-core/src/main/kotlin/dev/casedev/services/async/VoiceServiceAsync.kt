// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async

import dev.casedev.core.ClientOptions
import dev.casedev.services.async.voice.StreamingServiceAsync
import dev.casedev.services.async.voice.TranscriptionServiceAsync
import dev.casedev.services.async.voice.V1ServiceAsync
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

    fun streaming(): StreamingServiceAsync

    fun transcription(): TranscriptionServiceAsync

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

        fun streaming(): StreamingServiceAsync.WithRawResponse

        fun transcription(): TranscriptionServiceAsync.WithRawResponse

        fun v1(): V1ServiceAsync.WithRawResponse
    }
}
