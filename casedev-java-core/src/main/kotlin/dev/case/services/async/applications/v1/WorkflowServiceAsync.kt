// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async.applications.v1

import dev.case.core.ClientOptions
import dev.case.core.RequestOptions
import dev.case.core.http.HttpResponse
import dev.case.models.applications.v1.workflows.WorkflowGetStatusParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WorkflowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkflowServiceAsync

    /** Get current deployment workflow status and accumulated events */
    fun getStatus(id: String, params: WorkflowGetStatusParams): CompletableFuture<Void?> =
        getStatus(id, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        id: String,
        params: WorkflowGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = getStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(params: WorkflowGetStatusParams): CompletableFuture<Void?> =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: WorkflowGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [WorkflowServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkflowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /applications/v1/workflows/{id}/status`, but is
         * otherwise the same as [WorkflowServiceAsync.getStatus].
         */
        fun getStatus(
            id: String,
            params: WorkflowGetStatusParams,
        ): CompletableFuture<HttpResponse> = getStatus(id, params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            id: String,
            params: WorkflowGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see getStatus */
        fun getStatus(params: WorkflowGetStatusParams): CompletableFuture<HttpResponse> =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(
            params: WorkflowGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
