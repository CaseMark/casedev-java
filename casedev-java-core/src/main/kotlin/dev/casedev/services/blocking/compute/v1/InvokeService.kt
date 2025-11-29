// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.compute.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.compute.v1.invoke.InvokeRunParams
import dev.casedev.models.compute.v1.invoke.InvokeRunResponse
import java.util.function.Consumer

interface InvokeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvokeService

    /**
     * Execute a deployed compute function with custom input data. Supports both synchronous and
     * asynchronous execution modes. Functions can be invoked by ID or name and can process various
     * types of input data for legal document analysis, data processing, or other computational
     * tasks.
     */
    fun run(functionId: String, params: InvokeRunParams): InvokeRunResponse =
        run(functionId, params, RequestOptions.none())

    /** @see run */
    fun run(
        functionId: String,
        params: InvokeRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvokeRunResponse = run(params.toBuilder().functionId(functionId).build(), requestOptions)

    /** @see run */
    fun run(params: InvokeRunParams): InvokeRunResponse = run(params, RequestOptions.none())

    /** @see run */
    fun run(
        params: InvokeRunParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvokeRunResponse

    /** A view of [InvokeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvokeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /compute/v1/invoke/{functionId}`, but is otherwise
         * the same as [InvokeService.run].
         */
        @MustBeClosed
        fun run(functionId: String, params: InvokeRunParams): HttpResponseFor<InvokeRunResponse> =
            run(functionId, params, RequestOptions.none())

        /** @see run */
        @MustBeClosed
        fun run(
            functionId: String,
            params: InvokeRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvokeRunResponse> =
            run(params.toBuilder().functionId(functionId).build(), requestOptions)

        /** @see run */
        @MustBeClosed
        fun run(params: InvokeRunParams): HttpResponseFor<InvokeRunResponse> =
            run(params, RequestOptions.none())

        /** @see run */
        @MustBeClosed
        fun run(
            params: InvokeRunParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvokeRunResponse>
    }
}
