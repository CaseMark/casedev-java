// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.compute.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.compute.v1.functions.FunctionGetLogsParams
import dev.casedev.models.compute.v1.functions.FunctionListParams
import java.util.function.Consumer

interface FunctionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionService

    /**
     * Retrieves all serverless functions deployed in a specified compute environment. Functions can
     * be used for custom document processing, AI model inference, or other computational tasks in
     * legal workflows.
     */
    fun list() = list(FunctionListParams.none())

    /** @see list */
    fun list(
        params: FunctionListParams = FunctionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: FunctionListParams = FunctionListParams.none()) =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(FunctionListParams.none(), requestOptions)

    /**
     * Retrieve execution logs from a deployed serverless function. Logs include function output,
     * errors, and runtime information. Useful for debugging and monitoring function performance in
     * production.
     */
    fun getLogs(id: String) = getLogs(id, FunctionGetLogsParams.none())

    /** @see getLogs */
    fun getLogs(
        id: String,
        params: FunctionGetLogsParams = FunctionGetLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = getLogs(params.toBuilder().id(id).build(), requestOptions)

    /** @see getLogs */
    fun getLogs(id: String, params: FunctionGetLogsParams = FunctionGetLogsParams.none()) =
        getLogs(id, params, RequestOptions.none())

    /** @see getLogs */
    fun getLogs(
        params: FunctionGetLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see getLogs */
    fun getLogs(params: FunctionGetLogsParams) = getLogs(params, RequestOptions.none())

    /** @see getLogs */
    fun getLogs(id: String, requestOptions: RequestOptions) =
        getLogs(id, FunctionGetLogsParams.none(), requestOptions)

    /** A view of [FunctionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /compute/v1/functions`, but is otherwise the same as
         * [FunctionService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(FunctionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FunctionListParams = FunctionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: FunctionListParams = FunctionListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(FunctionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /compute/v1/functions/{id}/logs`, but is otherwise
         * the same as [FunctionService.getLogs].
         */
        @MustBeClosed
        fun getLogs(id: String): HttpResponse = getLogs(id, FunctionGetLogsParams.none())

        /** @see getLogs */
        @MustBeClosed
        fun getLogs(
            id: String,
            params: FunctionGetLogsParams = FunctionGetLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = getLogs(params.toBuilder().id(id).build(), requestOptions)

        /** @see getLogs */
        @MustBeClosed
        fun getLogs(
            id: String,
            params: FunctionGetLogsParams = FunctionGetLogsParams.none(),
        ): HttpResponse = getLogs(id, params, RequestOptions.none())

        /** @see getLogs */
        @MustBeClosed
        fun getLogs(
            params: FunctionGetLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getLogs */
        @MustBeClosed
        fun getLogs(params: FunctionGetLogsParams): HttpResponse =
            getLogs(params, RequestOptions.none())

        /** @see getLogs */
        @MustBeClosed
        fun getLogs(id: String, requestOptions: RequestOptions): HttpResponse =
            getLogs(id, FunctionGetLogsParams.none(), requestOptions)
    }
}
