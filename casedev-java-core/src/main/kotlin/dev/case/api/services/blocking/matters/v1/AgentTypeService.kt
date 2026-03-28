// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.agenttypes.AgentTypeCreateParams
import dev.case.api.models.matters.v1.agenttypes.AgentTypeListParams
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
interface AgentTypeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentTypeService

    /** Create a reusable agent role for legal matter orchestration. */
    fun create(params: AgentTypeCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AgentTypeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List reusable agent roles for the authenticated organization. */
    fun list() = list(AgentTypeListParams.none())

    /** @see list */
    fun list(
        params: AgentTypeListParams = AgentTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: AgentTypeListParams = AgentTypeListParams.none()) =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(AgentTypeListParams.none(), requestOptions)

    /** A view of [AgentTypeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentTypeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1/agent-types`, but is otherwise the same
         * as [AgentTypeService.create].
         */
        @MustBeClosed
        fun create(params: AgentTypeCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AgentTypeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /matters/v1/agent-types`, but is otherwise the same
         * as [AgentTypeService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(AgentTypeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AgentTypeListParams = AgentTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: AgentTypeListParams = AgentTypeListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(AgentTypeListParams.none(), requestOptions)
    }
}
