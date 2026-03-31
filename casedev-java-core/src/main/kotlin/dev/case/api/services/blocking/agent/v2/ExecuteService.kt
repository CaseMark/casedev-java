// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.v2

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.agent.v2.execute.ExecuteCreateParams
import dev.case.api.models.agent.v2.execute.ExecuteCreateResponse
import java.util.function.Consumer

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
interface ExecuteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExecuteService

    /**
     * Creates an ephemeral agent and executes it immediately. By default this uses the lightweight
     * synchronous linc runtime on Vercel Sandbox. Set `agentRuntime: true` to opt into the legacy
     * Daytona-backed agent runtime.
     */
    fun create(params: ExecuteCreateParams): ExecuteCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExecuteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExecuteCreateResponse

    /** A view of [ExecuteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExecuteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent/v2/execute`, but is otherwise the same as
         * [ExecuteService.create].
         */
        @MustBeClosed
        fun create(params: ExecuteCreateParams): HttpResponseFor<ExecuteCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ExecuteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExecuteCreateResponse>
    }
}
