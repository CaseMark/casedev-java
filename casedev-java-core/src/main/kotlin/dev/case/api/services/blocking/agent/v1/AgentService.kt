// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.agent.v1.agents.AgentCreateParams
import dev.case.api.models.agent.v1.agents.AgentCreateResponse
import dev.case.api.models.agent.v1.agents.AgentDeleteParams
import dev.case.api.models.agent.v1.agents.AgentDeleteResponse
import dev.case.api.models.agent.v1.agents.AgentListParams
import dev.case.api.models.agent.v1.agents.AgentListResponse
import dev.case.api.models.agent.v1.agents.AgentRetrieveParams
import dev.case.api.models.agent.v1.agents.AgentRetrieveResponse
import dev.case.api.models.agent.v1.agents.AgentUpdateParams
import dev.case.api.models.agent.v1.agents.AgentUpdateResponse
import java.util.function.Consumer

interface AgentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService

    /**
     * Creates a new agent definition with a scoped API key. The agent can then be used to create
     * and execute runs.
     */
    fun create(params: AgentCreateParams): AgentCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentCreateResponse

    /** Retrieves a single agent definition by ID. */
    fun retrieve(id: String): AgentRetrieveResponse = retrieve(id, AgentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
    ): AgentRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: AgentRetrieveParams): AgentRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AgentRetrieveResponse =
        retrieve(id, AgentRetrieveParams.none(), requestOptions)

    /** Updates an agent definition. Only provided fields are changed. */
    fun update(id: String): AgentUpdateResponse = update(id, AgentUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: AgentUpdateParams = AgentUpdateParams.none(),
    ): AgentUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentUpdateResponse

    /** @see update */
    fun update(params: AgentUpdateParams): AgentUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): AgentUpdateResponse =
        update(id, AgentUpdateParams.none(), requestOptions)

    /** Lists all active agents for the authenticated organization. */
    fun list(): AgentListResponse = list(AgentListParams.none())

    /** @see list */
    fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentListResponse

    /** @see list */
    fun list(params: AgentListParams = AgentListParams.none()): AgentListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AgentListResponse =
        list(AgentListParams.none(), requestOptions)

    /** Soft-deletes an agent and revokes its scoped API key. */
    fun delete(id: String): AgentDeleteResponse = delete(id, AgentDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
    ): AgentDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AgentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentDeleteResponse

    /** @see delete */
    fun delete(params: AgentDeleteParams): AgentDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): AgentDeleteResponse =
        delete(id, AgentDeleteParams.none(), requestOptions)

    /** A view of [AgentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agent/v1/agents`, but is otherwise the same as
         * [AgentService.create].
         */
        @MustBeClosed
        fun create(params: AgentCreateParams): HttpResponseFor<AgentCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentCreateResponse>

        /**
         * Returns a raw HTTP response for `get /agent/v1/agents/{id}`, but is otherwise the same as
         * [AgentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AgentRetrieveResponse> =
            retrieve(id, AgentRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
        ): HttpResponseFor<AgentRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AgentRetrieveParams): HttpResponseFor<AgentRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentRetrieveResponse> =
            retrieve(id, AgentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /agent/v1/agents/{id}`, but is otherwise the same
         * as [AgentService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<AgentUpdateResponse> =
            update(id, AgentUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AgentUpdateParams = AgentUpdateParams.none(),
        ): HttpResponseFor<AgentUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: AgentUpdateParams): HttpResponseFor<AgentUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentUpdateResponse> =
            update(id, AgentUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agent/v1/agents`, but is otherwise the same as
         * [AgentService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<AgentListResponse> = list(AgentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgentListParams = AgentListParams.none()
        ): HttpResponseFor<AgentListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AgentListResponse> =
            list(AgentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agent/v1/agents/{id}`, but is otherwise the same
         * as [AgentService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<AgentDeleteResponse> =
            delete(id, AgentDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
        ): HttpResponseFor<AgentDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: AgentDeleteParams): HttpResponseFor<AgentDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AgentDeleteResponse> =
            delete(id, AgentDeleteParams.none(), requestOptions)
    }
}
