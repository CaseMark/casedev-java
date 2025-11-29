// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.compute.v1.invoke.InvokeRunParams
import dev.casedev.models.compute.v1.invoke.InvokeRunResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InvokeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvokeServiceAsync

    /**
     * Execute a deployed compute function with custom input data. Supports both synchronous and
     * asynchronous execution modes. Functions can be invoked by ID or name and can process various
     * types of input data for legal document analysis, data processing, or other computational
     * tasks.
     */
    fun run(functionId: String, params: InvokeRunParams): CompletableFuture<InvokeRunResponse> =
        run(functionId, params, RequestOptions.none())

    /** @see run */
    fun run(
        functionId: String,
        params: InvokeRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvokeRunResponse> =
        run(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see run */
    fun run(params: InvokeRunParams): CompletableFuture<InvokeRunResponse> =
        run(params, RequestOptions.none())

    /** @see run */
    fun run(
        params: InvokeRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvokeRunResponse>

    /**
     * A view of [InvokeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvokeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /compute/v1/invoke/{functionId}`, but is otherwise
         * the same as [InvokeServiceAsync.run].
         */
        fun run(
            functionId: String,
            params: InvokeRunParams,
        ): CompletableFuture<HttpResponseFor<InvokeRunResponse>> =
            run(functionId, params, RequestOptions.none())

        /** @see run */
        fun run(
            functionId: String,
            params: InvokeRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvokeRunResponse>> =
            run(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see run */
        fun run(params: InvokeRunParams): CompletableFuture<HttpResponseFor<InvokeRunResponse>> =
            run(params, RequestOptions.none())

        /** @see run */
        fun run(
            params: InvokeRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvokeRunResponse>>
    }
}
