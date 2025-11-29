// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.convert.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.convert.v1.jobs.JobDeleteParams
import dev.casedev.models.convert.v1.jobs.JobRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync

    /**
     * Retrieve the status of a file conversion job. Returns detailed information about the
     * conversion progress, completion status, and any errors that occurred during processing.
     */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, JobRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: JobRetrieveParams = JobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: JobRetrieveParams = JobRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: JobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: JobRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, JobRetrieveParams.none(), requestOptions)

    /**
     * Delete a converted file from Modal storage by its job ID. This permanently removes the file
     * and its associated metadata from the system.
     */
    fun delete(id: String): CompletableFuture<Void?> = delete(id, JobDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: JobDeleteParams = JobDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: JobDeleteParams = JobDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: JobDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: JobDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, JobDeleteParams.none(), requestOptions)

    /** A view of [JobServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /convert/v1/jobs/{id}`, but is otherwise the same as
         * [JobServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, JobRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: JobRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, JobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /convert/v1/jobs/{id}`, but is otherwise the same
         * as [JobServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> = delete(id, JobDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: JobDeleteParams = JobDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: JobDeleteParams = JobDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: JobDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: JobDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, JobDeleteParams.none(), requestOptions)
    }
}
