// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.convert.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.convert.v1.jobs.JobDeleteParams
import dev.casedev.models.convert.v1.jobs.JobRetrieveParams
import java.util.function.Consumer

interface JobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobService

    /**
     * Retrieve the status of a file conversion job. Returns detailed information about the
     * conversion progress, completion status, and any errors that occurred during processing.
     */
    fun retrieve(id: String) = retrieve(id, JobRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: JobRetrieveParams = JobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: JobRetrieveParams = JobRetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: JobRetrieveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: JobRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, JobRetrieveParams.none(), requestOptions)

    /**
     * Delete a converted file from Modal storage by its job ID. This permanently removes the file
     * and its associated metadata from the system.
     */
    fun delete(id: String) = delete(id, JobDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: JobDeleteParams = JobDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: JobDeleteParams = JobDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: JobDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: JobDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, JobDeleteParams.none(), requestOptions)

    /** A view of [JobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /convert/v1/jobs/{id}`, but is otherwise the same as
         * [JobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse = retrieve(id, JobRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: JobRetrieveParams = JobRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: JobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: JobRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, JobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /convert/v1/jobs/{id}`, but is otherwise the same
         * as [JobService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, JobDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: JobDeleteParams = JobDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, params: JobDeleteParams = JobDeleteParams.none()): HttpResponse =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: JobDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: JobDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, JobDeleteParams.none(), requestOptions)
    }
}
