// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.workitems.WorkItemCreateParams
import dev.case.api.models.matters.v1.workitems.WorkItemDecideParams
import dev.case.api.models.matters.v1.workitems.WorkItemListExecutionsParams
import dev.case.api.models.matters.v1.workitems.WorkItemListParams
import dev.case.api.models.matters.v1.workitems.WorkItemRetrieveParams
import dev.case.api.models.matters.v1.workitems.WorkItemUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
interface WorkItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkItemServiceAsync

    /** Create an active work item on a matter. */
    fun create(id: String, params: WorkItemCreateParams): CompletableFuture<Void?> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: WorkItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: WorkItemCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WorkItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get a single work item for a matter. */
    fun retrieve(workItemId: String, params: WorkItemRetrieveParams): CompletableFuture<Void?> =
        retrieve(workItemId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        workItemId: String,
        params: WorkItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        retrieve(params.toBuilder().workItemId(workItemId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: WorkItemRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WorkItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Update a matter work item. */
    fun update(workItemId: String, params: WorkItemUpdateParams): CompletableFuture<Void?> =
        update(workItemId, params, RequestOptions.none())

    /** @see update */
    fun update(
        workItemId: String,
        params: WorkItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().workItemId(workItemId).build(), requestOptions)

    /** @see update */
    fun update(params: WorkItemUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WorkItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** List active work items for a matter. */
    fun list(id: String): CompletableFuture<Void?> = list(id, WorkItemListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: WorkItemListParams = WorkItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: WorkItemListParams = WorkItemListParams.none(),
    ): CompletableFuture<Void?> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: WorkItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: WorkItemListParams): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(id, WorkItemListParams.none(), requestOptions)

    /** Allow a human to act as the orchestrator for a work item. */
    fun decide(workItemId: String, params: WorkItemDecideParams): CompletableFuture<Void?> =
        decide(workItemId, params, RequestOptions.none())

    /** @see decide */
    fun decide(
        workItemId: String,
        params: WorkItemDecideParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        decide(params.toBuilder().workItemId(workItemId).build(), requestOptions)

    /** @see decide */
    fun decide(params: WorkItemDecideParams): CompletableFuture<Void?> =
        decide(params, RequestOptions.none())

    /** @see decide */
    fun decide(
        params: WorkItemDecideParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** List execution attempts for a work item, including agent and run linkage. */
    fun listExecutions(
        workItemId: String,
        params: WorkItemListExecutionsParams,
    ): CompletableFuture<Void?> = listExecutions(workItemId, params, RequestOptions.none())

    /** @see listExecutions */
    fun listExecutions(
        workItemId: String,
        params: WorkItemListExecutionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        listExecutions(params.toBuilder().workItemId(workItemId).build(), requestOptions)

    /** @see listExecutions */
    fun listExecutions(params: WorkItemListExecutionsParams): CompletableFuture<Void?> =
        listExecutions(params, RequestOptions.none())

    /** @see listExecutions */
    fun listExecutions(
        params: WorkItemListExecutionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [WorkItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1/{id}/work-items`, but is otherwise the
         * same as [WorkItemServiceAsync.create].
         */
        fun create(id: String, params: WorkItemCreateParams): CompletableFuture<HttpResponse> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: WorkItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(params: WorkItemCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WorkItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /matters/v1/{id}/work-items/{workItemId}`, but is
         * otherwise the same as [WorkItemServiceAsync.retrieve].
         */
        fun retrieve(
            workItemId: String,
            params: WorkItemRetrieveParams,
        ): CompletableFuture<HttpResponse> = retrieve(workItemId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            workItemId: String,
            params: WorkItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().workItemId(workItemId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(params: WorkItemRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: WorkItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `patch /matters/v1/{id}/work-items/{workItemId}`, but is
         * otherwise the same as [WorkItemServiceAsync.update].
         */
        fun update(
            workItemId: String,
            params: WorkItemUpdateParams,
        ): CompletableFuture<HttpResponse> = update(workItemId, params, RequestOptions.none())

        /** @see update */
        fun update(
            workItemId: String,
            params: WorkItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().workItemId(workItemId).build(), requestOptions)

        /** @see update */
        fun update(params: WorkItemUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WorkItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /matters/v1/{id}/work-items`, but is otherwise the
         * same as [WorkItemServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponse> = list(id, WorkItemListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: WorkItemListParams = WorkItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> = list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: WorkItemListParams = WorkItemListParams.none(),
        ): CompletableFuture<HttpResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: WorkItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(params: WorkItemListParams): CompletableFuture<HttpResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(id, WorkItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /matters/v1/{id}/work-items/{workItemId}/decision`,
         * but is otherwise the same as [WorkItemServiceAsync.decide].
         */
        fun decide(
            workItemId: String,
            params: WorkItemDecideParams,
        ): CompletableFuture<HttpResponse> = decide(workItemId, params, RequestOptions.none())

        /** @see decide */
        fun decide(
            workItemId: String,
            params: WorkItemDecideParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            decide(params.toBuilder().workItemId(workItemId).build(), requestOptions)

        /** @see decide */
        fun decide(params: WorkItemDecideParams): CompletableFuture<HttpResponse> =
            decide(params, RequestOptions.none())

        /** @see decide */
        fun decide(
            params: WorkItemDecideParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /matters/v1/{id}/work-items/{workItemId}/executions`, but is otherwise the same as
         * [WorkItemServiceAsync.listExecutions].
         */
        fun listExecutions(
            workItemId: String,
            params: WorkItemListExecutionsParams,
        ): CompletableFuture<HttpResponse> =
            listExecutions(workItemId, params, RequestOptions.none())

        /** @see listExecutions */
        fun listExecutions(
            workItemId: String,
            params: WorkItemListExecutionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            listExecutions(params.toBuilder().workItemId(workItemId).build(), requestOptions)

        /** @see listExecutions */
        fun listExecutions(params: WorkItemListExecutionsParams): CompletableFuture<HttpResponse> =
            listExecutions(params, RequestOptions.none())

        /** @see listExecutions */
        fun listExecutions(
            params: WorkItemListExecutionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
