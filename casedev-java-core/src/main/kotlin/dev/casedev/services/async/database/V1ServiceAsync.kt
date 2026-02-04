// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.database

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.database.v1.V1GetUsageParams
import dev.casedev.models.database.v1.V1GetUsageResponse
import dev.casedev.services.async.database.v1.ProjectServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

    fun projects(): ProjectServiceAsync

    /**
     * Returns detailed database usage statistics and billing information for the current billing
     * period. Includes compute hours, storage, data transfer, and branch counts with associated
     * costs broken down by project.
     */
    fun getUsage(): CompletableFuture<V1GetUsageResponse> = getUsage(V1GetUsageParams.none())

    /** @see getUsage */
    fun getUsage(
        params: V1GetUsageParams = V1GetUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1GetUsageResponse>

    /** @see getUsage */
    fun getUsage(
        params: V1GetUsageParams = V1GetUsageParams.none()
    ): CompletableFuture<V1GetUsageResponse> = getUsage(params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(requestOptions: RequestOptions): CompletableFuture<V1GetUsageResponse> =
        getUsage(V1GetUsageParams.none(), requestOptions)

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        fun projects(): ProjectServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /database/v1/usage`, but is otherwise the same as
         * [V1ServiceAsync.getUsage].
         */
        fun getUsage(): CompletableFuture<HttpResponseFor<V1GetUsageResponse>> =
            getUsage(V1GetUsageParams.none())

        /** @see getUsage */
        fun getUsage(
            params: V1GetUsageParams = V1GetUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1GetUsageResponse>>

        /** @see getUsage */
        fun getUsage(
            params: V1GetUsageParams = V1GetUsageParams.none()
        ): CompletableFuture<HttpResponseFor<V1GetUsageResponse>> =
            getUsage(params, RequestOptions.none())

        /** @see getUsage */
        fun getUsage(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<V1GetUsageResponse>> =
            getUsage(V1GetUsageParams.none(), requestOptions)
    }
}
