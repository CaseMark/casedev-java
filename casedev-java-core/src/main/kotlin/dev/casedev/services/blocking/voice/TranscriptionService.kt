// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.voice

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.voice.transcription.TranscriptionCreateParams
import dev.casedev.models.voice.transcription.TranscriptionRetrieveParams
import dev.casedev.models.voice.transcription.TranscriptionRetrieveResponse
import java.util.function.Consumer

interface TranscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TranscriptionService

    /**
     * Creates an asynchronous transcription job for audio files. Supports two modes:
     *
     * **Vault-based (recommended)**: Pass `vault_id` and `object_id` to transcribe audio from your
     * vault. The transcript will automatically be saved back to the vault when complete.
     *
     * **Direct URL (legacy)**: Pass `audio_url` for direct transcription without automatic storage.
     */
    fun create() = create(TranscriptionCreateParams.none())

    /** @see create */
    fun create(
        params: TranscriptionCreateParams = TranscriptionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see create */
    fun create(params: TranscriptionCreateParams = TranscriptionCreateParams.none()) =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions) =
        create(TranscriptionCreateParams.none(), requestOptions)

    /**
     * Retrieve the status and result of an audio transcription job. For vault-based jobs, returns
     * status and result_object_id when complete. For legacy direct URL jobs, returns the full
     * transcription data.
     */
    fun retrieve(id: String): TranscriptionRetrieveResponse =
        retrieve(id, TranscriptionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TranscriptionRetrieveParams = TranscriptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TranscriptionRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TranscriptionRetrieveParams = TranscriptionRetrieveParams.none(),
    ): TranscriptionRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TranscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TranscriptionRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: TranscriptionRetrieveParams): TranscriptionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): TranscriptionRetrieveResponse =
        retrieve(id, TranscriptionRetrieveParams.none(), requestOptions)

    /**
     * A view of [TranscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TranscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /voice/transcription`, but is otherwise the same as
         * [TranscriptionService.create].
         */
        @MustBeClosed fun create(): HttpResponse = create(TranscriptionCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TranscriptionCreateParams = TranscriptionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(
            params: TranscriptionCreateParams = TranscriptionCreateParams.none()
        ): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponse =
            create(TranscriptionCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /voice/transcription/{id}`, but is otherwise the
         * same as [TranscriptionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<TranscriptionRetrieveResponse> =
            retrieve(id, TranscriptionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TranscriptionRetrieveParams = TranscriptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TranscriptionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TranscriptionRetrieveParams = TranscriptionRetrieveParams.none(),
        ): HttpResponseFor<TranscriptionRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TranscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TranscriptionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TranscriptionRetrieveParams
        ): HttpResponseFor<TranscriptionRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TranscriptionRetrieveResponse> =
            retrieve(id, TranscriptionRetrieveParams.none(), requestOptions)
    }
}
