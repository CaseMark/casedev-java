// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.agent.v1.execute.ExecuteCreateParams
import dev.case.api.models.agent.v1.execute.ExecuteCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExecuteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExecuteServiceAsync

    /**
     * Creates an ephemeral agent and immediately executes a run. Returns the run ID for polling
     * status and results. This is the fastest way to run an agent without managing agent lifecycle.
     */
    fun create(params: ExecuteCreateParams): CompletableFuture<ExecuteCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExecuteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExecuteCreateResponse>

    /**
     * A view of [ExecuteServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExecuteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent/v1/execute`, but is otherwise the same as
         * [ExecuteServiceAsync.create].
         */
        fun create(
            params: ExecuteCreateParams
        ): CompletableFuture<HttpResponseFor<ExecuteCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ExecuteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExecuteCreateResponse>>
    }
}
