// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.compute.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.compute.v1.runs.RunListParams
import dev.casedev.models.compute.v1.runs.RunRetrieveParams
import java.util.function.Consumer

interface RunService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService

    /**
     * Retrieve detailed information about a specific compute function run, including execution
     * status, input/output data, resource usage metrics, and cost information.
     */
    fun retrieve(id: String) = retrieve(id, RunRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RunRetrieveParams = RunRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: RunRetrieveParams = RunRetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, RunRetrieveParams.none(), requestOptions)

    /**
     * Retrieve a list of recent compute runs for your organization. Filter by environment or
     * function, and limit the number of results returned. Useful for monitoring serverless function
     * executions and tracking performance metrics.
     */
    fun list() = list(RunListParams.none())

    /** @see list */
    fun list(
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: RunListParams = RunListParams.none()) = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(RunListParams.none(), requestOptions)

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /compute/v1/runs/{id}`, but is otherwise the same as
         * [RunService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse = retrieve(id, RunRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RunRetrieveParams = RunRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RunRetrieveParams = RunRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RunRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, RunRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /compute/v1/runs`, but is otherwise the same as
         * [RunService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(RunListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: RunListParams = RunListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(RunListParams.none(), requestOptions)
    }
}
