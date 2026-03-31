// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.V1CreateParams
import dev.case.api.models.matters.v1.V1ListParams
import dev.case.api.models.matters.v1.V1RetrieveParams
import dev.case.api.models.matters.v1.V1UpdateParams
import dev.case.api.services.blocking.matters.v1.AgentTypeService
import dev.case.api.services.blocking.matters.v1.EventService
import dev.case.api.services.blocking.matters.v1.LogService
import dev.case.api.services.blocking.matters.v1.MatterPartyService
import dev.case.api.services.blocking.matters.v1.PartyService
import dev.case.api.services.blocking.matters.v1.ShareService
import dev.case.api.services.blocking.matters.v1.TypeService
import dev.case.api.services.blocking.matters.v1.WorkItemService
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    /** Matter-native legal workspaces and orchestration primitives */
    fun agentTypes(): AgentTypeService

    /** Matter-native legal workspaces and orchestration primitives */
    fun parties(): PartyService

    /** Matter-native legal workspaces and orchestration primitives */
    fun types(): TypeService

    fun events(): EventService

    /** Matter-native legal workspaces and orchestration primitives */
    fun log(): LogService

    /** Matter-native legal workspaces and orchestration primitives */
    fun matterParties(): MatterPartyService

    /** Matter-native legal workspaces and orchestration primitives */
    fun shares(): ShareService

    /** Matter-native legal workspaces and orchestration primitives */
    fun workItems(): WorkItemService

    /** Create a new legal matter and optionally link an existing primary vault. */
    fun create(params: V1CreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: V1CreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get a single matter by ID. */
    fun retrieve(id: String) = retrieve(id, V1RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: V1RetrieveParams = V1RetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, V1RetrieveParams.none(), requestOptions)

    /** Update mutable matter fields. */
    fun update(id: String) = update(id, V1UpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: V1UpdateParams = V1UpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: V1UpdateParams = V1UpdateParams.none()) =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(params: V1UpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see update */
    fun update(params: V1UpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions) =
        update(id, V1UpdateParams.none(), requestOptions)

    /** List matters for the authenticated organization. */
    fun list() = list(V1ListParams.none())

    /** @see list */
    fun list(
        params: V1ListParams = V1ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: V1ListParams = V1ListParams.none()) = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(V1ListParams.none(), requestOptions)

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun agentTypes(): AgentTypeService.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun parties(): PartyService.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun types(): TypeService.WithRawResponse

        fun events(): EventService.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun log(): LogService.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun matterParties(): MatterPartyService.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun shares(): ShareService.WithRawResponse

        /** Matter-native legal workspaces and orchestration primitives */
        fun workItems(): WorkItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1`, but is otherwise the same as
         * [V1Service.create].
         */
        @MustBeClosed
        fun create(params: V1CreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: V1CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /matters/v1/{id}`, but is otherwise the same as
         * [V1Service.retrieve].
         */
        @MustBeClosed fun retrieve(id: String): HttpResponse = retrieve(id, V1RetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, params: V1RetrieveParams = V1RetrieveParams.none()): HttpResponse =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: V1RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: V1RetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, V1RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /matters/v1/{id}`, but is otherwise the same as
         * [V1Service.update].
         */
        @MustBeClosed fun update(id: String): HttpResponse = update(id, V1UpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: V1UpdateParams = V1UpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(id: String, params: V1UpdateParams = V1UpdateParams.none()): HttpResponse =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: V1UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(params: V1UpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponse =
            update(id, V1UpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /matters/v1`, but is otherwise the same as
         * [V1Service.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(V1ListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: V1ListParams = V1ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: V1ListParams = V1ListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(V1ListParams.none(), requestOptions)
    }
}
