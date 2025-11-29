// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.voice

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.voice.v1.V1ListVoicesParams
import dev.casedev.services.async.voice.v1.SpeakServiceAsync
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
    fun listVoices(): CompletableFuture<Void?> = listVoices(V1ListVoicesParams.none())

    /** @see listVoices */
    fun listVoices(
        params: V1ListVoicesParams = V1ListVoicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see listVoices */
    fun listVoices(
        params: V1ListVoicesParams = V1ListVoicesParams.none()
    ): CompletableFuture<Void?> = listVoices(params, RequestOptions.none())

    /** @see listVoices */
    fun listVoices(requestOptions: RequestOptions): CompletableFuture<Void?> =
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
        fun listVoices(): CompletableFuture<HttpResponse> = listVoices(V1ListVoicesParams.none())

        /** @see listVoices */
        fun listVoices(
            params: V1ListVoicesParams = V1ListVoicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listVoices */
        fun listVoices(
            params: V1ListVoicesParams = V1ListVoicesParams.none()
        ): CompletableFuture<HttpResponse> = listVoices(params, RequestOptions.none())

        /** @see listVoices */
        fun listVoices(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            listVoices(V1ListVoicesParams.none(), requestOptions)
    }
}
