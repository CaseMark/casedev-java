// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking

import dev.case.api.core.ClientOptions
import dev.case.api.services.blocking.voice.StreamingService
import dev.case.api.services.blocking.voice.TranscriptionService
import dev.case.api.services.blocking.voice.V1Service
import java.util.function.Consumer

interface VoiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceService

    /** Audio transcription and text-to-speech */
    fun streaming(): StreamingService

    /** Audio transcription and text-to-speech */
    fun transcription(): TranscriptionService

    /** Audio transcription and text-to-speech */
    fun v1(): V1Service

    /** A view of [VoiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceService.WithRawResponse

        /** Audio transcription and text-to-speech */
        fun streaming(): StreamingService.WithRawResponse

        /** Audio transcription and text-to-speech */
        fun transcription(): TranscriptionService.WithRawResponse

        /** Audio transcription and text-to-speech */
        fun v1(): V1Service.WithRawResponse
    }
}
