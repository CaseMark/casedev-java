// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.voice

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.voice.streaming.StreamingGetUrlParams
import java.util.function.Consumer

interface StreamingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamingService

    /**
     * Returns the WebSocket URL and connection details for real-time audio transcription. The
     * returned URL can be used to establish a WebSocket connection for streaming audio data and
     * receiving transcribed text in real-time.
     *
     * **Audio Requirements:**
     * - Sample Rate: 16kHz
     * - Encoding: PCM 16-bit little-endian
     * - Channels: Mono (1 channel)
     *
     * **Pricing:** $0.30 per minute ($18.00 per hour)
     */
    fun getUrl() = getUrl(StreamingGetUrlParams.none())

    /** @see getUrl */
    fun getUrl(
        params: StreamingGetUrlParams = StreamingGetUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see getUrl */
    fun getUrl(params: StreamingGetUrlParams = StreamingGetUrlParams.none()) =
        getUrl(params, RequestOptions.none())

    /** @see getUrl */
    fun getUrl(requestOptions: RequestOptions) =
        getUrl(StreamingGetUrlParams.none(), requestOptions)

    /** A view of [StreamingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /voice/streaming/url`, but is otherwise the same as
         * [StreamingService.getUrl].
         */
        @MustBeClosed fun getUrl(): HttpResponse = getUrl(StreamingGetUrlParams.none())

        /** @see getUrl */
        @MustBeClosed
        fun getUrl(
            params: StreamingGetUrlParams = StreamingGetUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getUrl */
        @MustBeClosed
        fun getUrl(params: StreamingGetUrlParams = StreamingGetUrlParams.none()): HttpResponse =
            getUrl(params, RequestOptions.none())

        /** @see getUrl */
        @MustBeClosed
        fun getUrl(requestOptions: RequestOptions): HttpResponse =
            getUrl(StreamingGetUrlParams.none(), requestOptions)
    }
}
