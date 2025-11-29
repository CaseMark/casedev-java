// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking

import dev.casedev.core.ClientOptions
import dev.casedev.services.blocking.voice.StreamingService
import dev.casedev.services.blocking.voice.TranscriptionService
import dev.casedev.services.blocking.voice.V1Service
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

    fun streaming(): StreamingService

    fun transcription(): TranscriptionService

    fun v1(): V1Service

    /** A view of [VoiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceService.WithRawResponse

        fun streaming(): StreamingService.WithRawResponse

        fun transcription(): TranscriptionService.WithRawResponse

        fun v1(): V1Service.WithRawResponse
    }
}
