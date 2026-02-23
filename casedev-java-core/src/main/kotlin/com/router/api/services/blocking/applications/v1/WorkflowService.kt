// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.applications.v1

import com.google.errorprone.annotations.MustBeClosed
import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponse
import com.router.api.models.applications.v1.workflows.WorkflowGetStatusParams
import java.util.function.Consumer

interface WorkflowService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkflowService

    /** Get current deployment workflow status and accumulated events */
    fun getStatus(id: String, params: WorkflowGetStatusParams) =
        getStatus(id, params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        id: String,
        params: WorkflowGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = getStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see getStatus */
    fun getStatus(params: WorkflowGetStatusParams) = getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(
        params: WorkflowGetStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [WorkflowService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkflowService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /applications/v1/workflows/{id}/status`, but is
         * otherwise the same as [WorkflowService.getStatus].
         */
        @MustBeClosed
        fun getStatus(id: String, params: WorkflowGetStatusParams): HttpResponse =
            getStatus(id, params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            id: String,
            params: WorkflowGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = getStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(params: WorkflowGetStatusParams): HttpResponse =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: WorkflowGetStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
