// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.compute.v1.functions.FunctionGetLogsParams
import dev.casedev.models.compute.v1.functions.FunctionListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FunctionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionServiceAsync

    /**
     * Retrieves all serverless functions deployed in a specified compute environment. Functions can
     * be used for custom document processing, AI model inference, or other computational tasks in
     * legal workflows.
     */
    fun list(): CompletableFuture<Void?> = list(FunctionListParams.none())

    /** @see list */
    fun list(
        params: FunctionListParams = FunctionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: FunctionListParams = FunctionListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(FunctionListParams.none(), requestOptions)

    /**
     * Retrieve execution logs from a deployed serverless function. Logs include function output,
     * errors, and runtime information. Useful for debugging and monitoring function performance in
     * production.
     */
    fun getLogs(id: String): CompletableFuture<Void?> = getLogs(id, FunctionGetLogsParams.none())

    /** @see getLogs */
    fun getLogs(
        id: String,
        params: FunctionGetLogsParams = FunctionGetLogsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = getLogs(params.toBuilder().id(id).build(), requestOptions)

    /** @see getLogs */
    fun getLogs(
        id: String,
        params: FunctionGetLogsParams = FunctionGetLogsParams.none(),
    ): CompletableFuture<Void?> = getLogs(id, params, RequestOptions.none())

    /** @see getLogs */
    fun getLogs(
        params: FunctionGetLogsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see getLogs */
    fun getLogs(params: FunctionGetLogsParams): CompletableFuture<Void?> =
        getLogs(params, RequestOptions.none())

    /** @see getLogs */
    fun getLogs(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        getLogs(id, FunctionGetLogsParams.none(), requestOptions)

    /**
     * A view of [FunctionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FunctionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /compute/v1/functions`, but is otherwise the same as
         * [FunctionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(FunctionListParams.none())

        /** @see list */
        fun list(
            params: FunctionListParams = FunctionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: FunctionListParams = FunctionListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(FunctionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /compute/v1/functions/{id}/logs`, but is otherwise
         * the same as [FunctionServiceAsync.getLogs].
         */
        fun getLogs(id: String): CompletableFuture<HttpResponse> =
            getLogs(id, FunctionGetLogsParams.none())

        /** @see getLogs */
        fun getLogs(
            id: String,
            params: FunctionGetLogsParams = FunctionGetLogsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getLogs(params.toBuilder().id(id).build(), requestOptions)

        /** @see getLogs */
        fun getLogs(
            id: String,
            params: FunctionGetLogsParams = FunctionGetLogsParams.none(),
        ): CompletableFuture<HttpResponse> = getLogs(id, params, RequestOptions.none())

        /** @see getLogs */
        fun getLogs(
            params: FunctionGetLogsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getLogs */
        fun getLogs(params: FunctionGetLogsParams): CompletableFuture<HttpResponse> =
            getLogs(params, RequestOptions.none())

        /** @see getLogs */
        fun getLogs(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getLogs(id, FunctionGetLogsParams.none(), requestOptions)
    }
}
