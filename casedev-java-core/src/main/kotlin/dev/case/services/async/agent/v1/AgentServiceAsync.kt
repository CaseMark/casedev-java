// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async.agent.v1

import dev.case.core.ClientOptions
import dev.case.core.RequestOptions
import dev.case.core.http.HttpResponseFor
import dev.case.models.agent.v1.agents.AgentCreateParams
import dev.case.models.agent.v1.agents.AgentCreateResponse
import dev.case.models.agent.v1.agents.AgentDeleteParams
import dev.case.models.agent.v1.agents.AgentDeleteResponse
import dev.case.models.agent.v1.agents.AgentListParams
import dev.case.models.agent.v1.agents.AgentListResponse
import dev.case.models.agent.v1.agents.AgentRetrieveParams
import dev.case.models.agent.v1.agents.AgentRetrieveResponse
import dev.case.models.agent.v1.agents.AgentUpdateParams
import dev.case.models.agent.v1.agents.AgentUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AgentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentServiceAsync

    /**
     * Creates a new agent definition with a scoped API key. The agent can then be used to create
     * and execute runs.
     */
    fun create(params: AgentCreateParams): CompletableFuture<AgentCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentCreateResponse>

    /** Retrieves a single agent definition by ID. */
    fun retrieve(id: String): CompletableFuture<AgentRetrieveResponse> =
        retrieve(id, AgentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
    ): CompletableFuture<AgentRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: AgentRetrieveParams): CompletableFuture<AgentRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentRetrieveResponse> =
        retrieve(id, AgentRetrieveParams.none(), requestOptions)

    /** Updates an agent definition. Only provided fields are changed. */
    fun update(id: String): CompletableFuture<AgentUpdateResponse> =
        update(id, AgentUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
    ): CompletableFuture<AgentUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentUpdateResponse>

    /** @see update */
    fun update(params: AgentUpdateParams): CompletableFuture<AgentUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<AgentUpdateResponse> =
        update(id, AgentUpdateParams.none(), requestOptions)

    /** Lists all active agents for the authenticated organization. */
    fun list(): CompletableFuture<AgentListResponse> = list(AgentListParams.none())

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentListResponse>

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none()
    ): CompletableFuture<AgentListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AgentListResponse> =
        list(AgentListParams.none(), requestOptions)

    /** Soft-deletes an agent and revokes its scoped API key. */
    fun delete(id: String): CompletableFuture<AgentDeleteResponse> =
        delete(id, AgentDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
    ): CompletableFuture<AgentDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AgentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AgentDeleteResponse>

    /** @see delete */
    fun delete(params: AgentDeleteParams): CompletableFuture<AgentDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<AgentDeleteResponse> =
        delete(id, AgentDeleteParams.none(), requestOptions)

    /** A view of [AgentServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent/v1/agents`, but is otherwise the same as
         * [AgentServiceAsync.create].
         */
        fun create(
            params: AgentCreateParams
        ): CompletableFuture<HttpResponseFor<AgentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /agent/v1/agents/{id}`, but is otherwise the same as
         * [AgentServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AgentRetrieveResponse>> =
            retrieve(id, AgentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AgentRetrieveParams
        ): CompletableFuture<HttpResponseFor<AgentRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentRetrieveResponse>> =
            retrieve(id, AgentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /agent/v1/agents/{id}`, but is otherwise the same
         * as [AgentServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<AgentUpdateResponse>> =
            update(id, AgentUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentUpdateResponse>>

        /** @see update */
        fun update(
            params: AgentUpdateParams
        ): CompletableFuture<HttpResponseFor<AgentUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentUpdateResponse>> =
            update(id, AgentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent/v1/agents`, but is otherwise the same as
         * [AgentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AgentListResponse>> =
            list(AgentListParams.none())

        /** @see list */
        fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentListResponse>>

        /** @see list */
        fun list(
            params: AgentListParams = AgentListParams.none()
        ): CompletableFuture<HttpResponseFor<AgentListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AgentListResponse>> =
            list(AgentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agent/v1/agents/{id}`, but is otherwise the same
         * as [AgentServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<AgentDeleteResponse>> =
            delete(id, AgentDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AgentDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AgentDeleteResponse>>

        /** @see delete */
        fun delete(
            params: AgentDeleteParams
        ): CompletableFuture<HttpResponseFor<AgentDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentDeleteResponse>> =
            delete(id, AgentDeleteParams.none(), requestOptions)
    }
}
