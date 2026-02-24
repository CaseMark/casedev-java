// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.voice

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.voice.v1.V1ListVoicesParams
import dev.case.api.models.voice.v1.V1ListVoicesResponse
import dev.case.api.services.async.voice.v1.SpeakServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

    fun speak(): SpeakServiceAsync

    /**
     * Retrieve a list of available voices for text-to-speech synthesis. This endpoint provides
     * access to a comprehensive catalog of voices with various characteristics, languages, and
     * styles suitable for legal document narration, client presentations, and accessibility
     * purposes.
     */
    fun listVoices(): CompletableFuture<V1ListVoicesResponse> =
        listVoices(V1ListVoicesParams.none())

    /** @see listVoices */
    fun listVoices(
        params: V1ListVoicesParams = V1ListVoicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ListVoicesResponse>

    /** @see listVoices */
    fun listVoices(
        params: V1ListVoicesParams = V1ListVoicesParams.none()
    ): CompletableFuture<V1ListVoicesResponse> = listVoices(params, RequestOptions.none())

    /** @see listVoices */
    fun listVoices(requestOptions: RequestOptions): CompletableFuture<V1ListVoicesResponse> =
        listVoices(V1ListVoicesParams.none(), requestOptions)

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        fun speak(): SpeakServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /voice/v1/voices`, but is otherwise the same as
         * [V1ServiceAsync.listVoices].
         */
        fun listVoices(): CompletableFuture<HttpResponseFor<V1ListVoicesResponse>> =
            listVoices(V1ListVoicesParams.none())

        /** @see listVoices */
        fun listVoices(
            params: V1ListVoicesParams = V1ListVoicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1ListVoicesResponse>>

        /** @see listVoices */
        fun listVoices(
            params: V1ListVoicesParams = V1ListVoicesParams.none()
        ): CompletableFuture<HttpResponseFor<V1ListVoicesResponse>> =
            listVoices(params, RequestOptions.none())

        /** @see listVoices */
        fun listVoices(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<V1ListVoicesResponse>> =
            listVoices(V1ListVoicesParams.none(), requestOptions)
    }
}
