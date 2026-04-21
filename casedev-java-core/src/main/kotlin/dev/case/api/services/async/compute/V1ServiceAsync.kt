// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.compute

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.compute.v1.V1GetUsageParams
import dev.case.api.models.compute.v1.V1GetUsageResponse
import dev.case.api.services.async.compute.v1.EnvironmentServiceAsync
import dev.case.api.services.async.compute.v1.SecretServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Serverless GPU and CPU infrastructure */
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

    /** Serverless GPU and CPU infrastructure */
    fun environments(): EnvironmentServiceAsync

    /** Serverless GPU and CPU infrastructure */
    fun secrets(): SecretServiceAsync

    /**
     * Returns detailed compute usage statistics and billing information for your organization.
     * Includes GPU and CPU hours, total runs, costs, and breakdowns by environment. Use optional
     * query parameters to filter by specific year and month.
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

        /** Serverless GPU and CPU infrastructure */
        fun environments(): EnvironmentServiceAsync.WithRawResponse

        /** Serverless GPU and CPU infrastructure */
        fun secrets(): SecretServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /compute/v1/usage`, but is otherwise the same as
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
