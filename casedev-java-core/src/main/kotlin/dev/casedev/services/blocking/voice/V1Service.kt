// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.voice

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.voice.v1.V1ListVoicesParams
import dev.casedev.models.voice.v1.V1ListVoicesResponse
import dev.casedev.services.blocking.voice.v1.SpeakService
import java.util.function.Consumer

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    fun speak(): SpeakService

    /**
     * Retrieve a list of available voices for text-to-speech synthesis. This endpoint provides
     * access to a comprehensive catalog of voices with various characteristics, languages, and
     * styles suitable for legal document narration, client presentations, and accessibility
     * purposes.
     */
    fun listVoices(): V1ListVoicesResponse = listVoices(V1ListVoicesParams.none())

    /** @see listVoices */
    fun listVoices(
        params: V1ListVoicesParams = V1ListVoicesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ListVoicesResponse

    /** @see listVoices */
    fun listVoices(params: V1ListVoicesParams = V1ListVoicesParams.none()): V1ListVoicesResponse =
        listVoices(params, RequestOptions.none())

    /** @see listVoices */
    fun listVoices(requestOptions: RequestOptions): V1ListVoicesResponse =
        listVoices(V1ListVoicesParams.none(), requestOptions)

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        fun speak(): SpeakService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /voice/v1/voices`, but is otherwise the same as
         * [V1Service.listVoices].
         */
        @MustBeClosed
        fun listVoices(): HttpResponseFor<V1ListVoicesResponse> =
            listVoices(V1ListVoicesParams.none())

        /** @see listVoices */
        @MustBeClosed
        fun listVoices(
            params: V1ListVoicesParams = V1ListVoicesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ListVoicesResponse>

        /** @see listVoices */
        @MustBeClosed
        fun listVoices(
            params: V1ListVoicesParams = V1ListVoicesParams.none()
        ): HttpResponseFor<V1ListVoicesResponse> = listVoices(params, RequestOptions.none())

        /** @see listVoices */
        @MustBeClosed
        fun listVoices(requestOptions: RequestOptions): HttpResponseFor<V1ListVoicesResponse> =
            listVoices(V1ListVoicesParams.none(), requestOptions)
    }
}
