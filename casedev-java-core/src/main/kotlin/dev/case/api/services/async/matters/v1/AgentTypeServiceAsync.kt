// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.agenttypes.AgentTypeCreateParams
import dev.case.api.models.matters.v1.agenttypes.AgentTypeListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
interface AgentTypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentTypeServiceAsync

    /** Create a reusable agent role for legal matter orchestration. */
    fun create(params: AgentTypeCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AgentTypeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** List reusable agent roles for the authenticated organization. */
    fun list(): CompletableFuture<Void?> = list(AgentTypeListParams.none())

    /** @see list */
    fun list(
        params: AgentTypeListParams = AgentTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: AgentTypeListParams = AgentTypeListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(AgentTypeListParams.none(), requestOptions)

    /**
     * A view of [AgentTypeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentTypeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1/agent-types`, but is otherwise the same
         * as [AgentTypeServiceAsync.create].
         */
        fun create(params: AgentTypeCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AgentTypeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /matters/v1/agent-types`, but is otherwise the same
         * as [AgentTypeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(AgentTypeListParams.none())

        /** @see list */
        fun list(
            params: AgentTypeListParams = AgentTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: AgentTypeListParams = AgentTypeListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(AgentTypeListParams.none(), requestOptions)
    }
}
