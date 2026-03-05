// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.voice

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.voice.streaming.StreamingGetUrlParams
import dev.case.api.models.voice.streaming.StreamingGetUrlResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Audio transcription and text-to-speech */
interface StreamingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamingServiceAsync

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
     * **Pricing:** $0.01 per minute ($0.60 per hour)
     */
    fun getUrl(): CompletableFuture<StreamingGetUrlResponse> = getUrl(StreamingGetUrlParams.none())

    /** @see getUrl */
    fun getUrl(
        params: StreamingGetUrlParams = StreamingGetUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<StreamingGetUrlResponse>

    /** @see getUrl */
    fun getUrl(
        params: StreamingGetUrlParams = StreamingGetUrlParams.none()
    ): CompletableFuture<StreamingGetUrlResponse> = getUrl(params, RequestOptions.none())

    /** @see getUrl */
    fun getUrl(requestOptions: RequestOptions): CompletableFuture<StreamingGetUrlResponse> =
        getUrl(StreamingGetUrlParams.none(), requestOptions)

    /**
     * A view of [StreamingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StreamingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /voice/streaming/url`, but is otherwise the same as
         * [StreamingServiceAsync.getUrl].
         */
        fun getUrl(): CompletableFuture<HttpResponseFor<StreamingGetUrlResponse>> =
            getUrl(StreamingGetUrlParams.none())

        /** @see getUrl */
        fun getUrl(
            params: StreamingGetUrlParams = StreamingGetUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<StreamingGetUrlResponse>>

        /** @see getUrl */
        fun getUrl(
            params: StreamingGetUrlParams = StreamingGetUrlParams.none()
        ): CompletableFuture<HttpResponseFor<StreamingGetUrlResponse>> =
            getUrl(params, RequestOptions.none())

        /** @see getUrl */
        fun getUrl(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<StreamingGetUrlResponse>> =
            getUrl(StreamingGetUrlParams.none(), requestOptions)
    }
}
