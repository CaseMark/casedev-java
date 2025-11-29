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
     * Creates an asynchronous transcription job for audio files. Supports various audio formats and
     * advanced features like speaker identification, content moderation, and automatic highlights.
     * Returns a job ID for checking transcription status and retrieving results.
     */
    fun create(params: TranscriptionCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TranscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Retrieve the status and result of an audio transcription job. Returns the transcription text
     * when complete, or status information for pending jobs.
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
        @MustBeClosed
        fun create(params: TranscriptionCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TranscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

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
