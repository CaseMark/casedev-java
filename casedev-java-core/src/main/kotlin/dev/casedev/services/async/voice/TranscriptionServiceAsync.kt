// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.voice

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.voice.transcription.TranscriptionCreateParams
import dev.casedev.models.voice.transcription.TranscriptionCreateResponse
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
     * Creates an asynchronous transcription job for audio files. Supports two modes:
     *
     * **Vault-based (recommended)**: Pass `vault_id` and `object_id` to transcribe audio from your
     * vault. The transcript will automatically be saved back to the vault when complete.
     *
     * **Direct URL (legacy)**: Pass `audio_url` for direct transcription without automatic storage.
     */
    fun create(): CompletableFuture<TranscriptionCreateResponse> =
        create(TranscriptionCreateParams.none())

    /** @see create */
    fun create(
        params: TranscriptionCreateParams = TranscriptionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TranscriptionCreateResponse>

    /** @see create */
    fun create(
        params: TranscriptionCreateParams = TranscriptionCreateParams.none()
    ): CompletableFuture<TranscriptionCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<TranscriptionCreateResponse> =
        create(TranscriptionCreateParams.none(), requestOptions)

    /**
     * Retrieve the status and result of an audio transcription job. For vault-based jobs, returns
     * status and result_object_id when complete. For legacy direct URL jobs, returns the full
     * transcription data.
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
        fun create(): CompletableFuture<HttpResponseFor<TranscriptionCreateResponse>> =
            create(TranscriptionCreateParams.none())

        /** @see create */
        fun create(
            params: TranscriptionCreateParams = TranscriptionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TranscriptionCreateResponse>>

        /** @see create */
        fun create(
            params: TranscriptionCreateParams = TranscriptionCreateParams.none()
        ): CompletableFuture<HttpResponseFor<TranscriptionCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TranscriptionCreateResponse>> =
            create(TranscriptionCreateParams.none(), requestOptions)

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
