// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.voice

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.voice.transcription.TranscriptionCreateParams
import dev.casedev.models.voice.transcription.TranscriptionRetrieveParams
import dev.casedev.models.voice.transcription.TranscriptionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TranscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TranscriptionServiceAsync

    /**
     * Creates an asynchronous transcription job for audio files. Supports various audio formats and
     * advanced features like speaker identification, content moderation, and automatic highlights.
     * Returns a job ID for checking transcription status and retrieving results.
     */
    fun create(params: TranscriptionCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TranscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Retrieve the status and result of an audio transcription job. Returns the transcription text
     * when complete, or status information for pending jobs.
     */
    fun retrieve(id: String): CompletableFuture<TranscriptionRetrieveResponse> =
        retrieve(id, TranscriptionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TranscriptionRetrieveParams = TranscriptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TranscriptionRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TranscriptionRetrieveParams = TranscriptionRetrieveParams.none(),
    ): CompletableFuture<TranscriptionRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TranscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TranscriptionRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: TranscriptionRetrieveParams
    ): CompletableFuture<TranscriptionRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TranscriptionRetrieveResponse> =
        retrieve(id, TranscriptionRetrieveParams.none(), requestOptions)

    /**
     * A view of [TranscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TranscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /voice/transcription`, but is otherwise the same as
         * [TranscriptionServiceAsync.create].
         */
        fun create(params: TranscriptionCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TranscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /voice/transcription/{id}`, but is otherwise the
         * same as [TranscriptionServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<TranscriptionRetrieveResponse>> =
            retrieve(id, TranscriptionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TranscriptionRetrieveParams = TranscriptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TranscriptionRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TranscriptionRetrieveParams = TranscriptionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TranscriptionRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TranscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TranscriptionRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: TranscriptionRetrieveParams
        ): CompletableFuture<HttpResponseFor<TranscriptionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TranscriptionRetrieveResponse>> =
            retrieve(id, TranscriptionRetrieveParams.none(), requestOptions)
    }
}
