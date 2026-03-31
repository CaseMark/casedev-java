// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.workitems.WorkItemCreateParams
import dev.case.api.models.matters.v1.workitems.WorkItemDecideParams
import dev.case.api.models.matters.v1.workitems.WorkItemListExecutionsParams
import dev.case.api.models.matters.v1.workitems.WorkItemListParams
import dev.case.api.models.matters.v1.workitems.WorkItemRetrieveParams
import dev.case.api.models.matters.v1.workitems.WorkItemUpdateParams
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
interface WorkItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkItemService

    /** Create an active work item on a matter. */
    fun create(id: String, params: WorkItemCreateParams) = create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: WorkItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: WorkItemCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: WorkItemCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get a single work item for a matter. */
    fun retrieve(workItemId: String, params: WorkItemRetrieveParams) =
        retrieve(workItemId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        workItemId: String,
        params: WorkItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().workItemId(workItemId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: WorkItemRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WorkItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Update a matter work item. */
    fun update(workItemId: String, params: WorkItemUpdateParams) =
        update(workItemId, params, RequestOptions.none())

    /** @see update */
    fun update(
        workItemId: String,
        params: WorkItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().workItemId(workItemId).build(), requestOptions)

    /** @see update */
    fun update(params: WorkItemUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: WorkItemUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** List active work items for a matter. */
    fun list(id: String) = list(id, WorkItemListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: WorkItemListParams = WorkItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: WorkItemListParams = WorkItemListParams.none()) =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(params: WorkItemListParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see list */
    fun list(params: WorkItemListParams) = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions) =
        list(id, WorkItemListParams.none(), requestOptions)

    /** Allow a human to act as the orchestrator for a work item. */
    fun decide(workItemId: String, params: WorkItemDecideParams) =
        decide(workItemId, params, RequestOptions.none())

    /** @see decide */
    fun decide(
        workItemId: String,
        params: WorkItemDecideParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = decide(params.toBuilder().workItemId(workItemId).build(), requestOptions)

    /** @see decide */
    fun decide(params: WorkItemDecideParams) = decide(params, RequestOptions.none())

    /** @see decide */
    fun decide(params: WorkItemDecideParams, requestOptions: RequestOptions = RequestOptions.none())

    /** List execution attempts for a work item, including agent and run linkage. */
    fun listExecutions(workItemId: String, params: WorkItemListExecutionsParams) =
        listExecutions(workItemId, params, RequestOptions.none())

    /** @see listExecutions */
    fun listExecutions(
        workItemId: String,
        params: WorkItemListExecutionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = listExecutions(params.toBuilder().workItemId(workItemId).build(), requestOptions)

    /** @see listExecutions */
    fun listExecutions(params: WorkItemListExecutionsParams) =
        listExecutions(params, RequestOptions.none())

    /** @see listExecutions */
    fun listExecutions(
        params: WorkItemListExecutionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [WorkItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1/{id}/work-items`, but is otherwise the
         * same as [WorkItemService.create].
         */
        @MustBeClosed
        fun create(id: String, params: WorkItemCreateParams): HttpResponse =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: WorkItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: WorkItemCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: WorkItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /matters/v1/{id}/work-items/{workItemId}`, but is
         * otherwise the same as [WorkItemService.retrieve].
         */
        @MustBeClosed
        fun retrieve(workItemId: String, params: WorkItemRetrieveParams): HttpResponse =
            retrieve(workItemId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            workItemId: String,
            params: WorkItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            retrieve(params.toBuilder().workItemId(workItemId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: WorkItemRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: WorkItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `patch /matters/v1/{id}/work-items/{workItemId}`, but is
         * otherwise the same as [WorkItemService.update].
         */
        @MustBeClosed
        fun update(workItemId: String, params: WorkItemUpdateParams): HttpResponse =
            update(workItemId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            workItemId: String,
            params: WorkItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().workItemId(workItemId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: WorkItemUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: WorkItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /matters/v1/{id}/work-items`, but is otherwise the
         * same as [WorkItemService.list].
         */
        @MustBeClosed fun list(id: String): HttpResponse = list(id, WorkItemListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: WorkItemListParams = WorkItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(id: String, params: WorkItemListParams = WorkItemListParams.none()): HttpResponse =
            list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WorkItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: WorkItemListParams): HttpResponse = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponse =
            list(id, WorkItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /matters/v1/{id}/work-items/{workItemId}/decision`,
         * but is otherwise the same as [WorkItemService.decide].
         */
        @MustBeClosed
        fun decide(workItemId: String, params: WorkItemDecideParams): HttpResponse =
            decide(workItemId, params, RequestOptions.none())

        /** @see decide */
        @MustBeClosed
        fun decide(
            workItemId: String,
            params: WorkItemDecideParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = decide(params.toBuilder().workItemId(workItemId).build(), requestOptions)

        /** @see decide */
        @MustBeClosed
        fun decide(params: WorkItemDecideParams): HttpResponse =
            decide(params, RequestOptions.none())

        /** @see decide */
        @MustBeClosed
        fun decide(
            params: WorkItemDecideParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /matters/v1/{id}/work-items/{workItemId}/executions`, but is otherwise the same as
         * [WorkItemService.listExecutions].
         */
        @MustBeClosed
        fun listExecutions(workItemId: String, params: WorkItemListExecutionsParams): HttpResponse =
            listExecutions(workItemId, params, RequestOptions.none())

        /** @see listExecutions */
        @MustBeClosed
        fun listExecutions(
            workItemId: String,
            params: WorkItemListExecutionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            listExecutions(params.toBuilder().workItemId(workItemId).build(), requestOptions)

        /** @see listExecutions */
        @MustBeClosed
        fun listExecutions(params: WorkItemListExecutionsParams): HttpResponse =
            listExecutions(params, RequestOptions.none())

        /** @see listExecutions */
        @MustBeClosed
        fun listExecutions(
            params: WorkItemListExecutionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
