// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.compute.v1.V1GetPricingParams
import dev.casedev.models.compute.v1.V1GetUsageParams
import dev.casedev.models.compute.v1.V1GetUsageResponse
import dev.casedev.services.async.compute.v1.EnvironmentServiceAsync
import dev.casedev.services.async.compute.v1.InstanceServiceAsync
import dev.casedev.services.async.compute.v1.InstanceTypeServiceAsync
import dev.casedev.services.async.compute.v1.SecretServiceAsync
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

    fun environments(): EnvironmentServiceAsync

    fun instanceTypes(): InstanceTypeServiceAsync

    fun instances(): InstanceServiceAsync

    fun secrets(): SecretServiceAsync

    /**
     * Returns current pricing for GPU instances. Prices are fetched in real-time and include a 20%
     * platform fee. For detailed instance types and availability, use GET
     * /compute/v1/instance-types.
     */
    fun getPricing(): CompletableFuture<Void?> = getPricing(V1GetPricingParams.none())

    /** @see getPricing */
    fun getPricing(
        params: V1GetPricingParams = V1GetPricingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see getPricing */
    fun getPricing(
        params: V1GetPricingParams = V1GetPricingParams.none()
    ): CompletableFuture<Void?> = getPricing(params, RequestOptions.none())

    /** @see getPricing */
    fun getPricing(requestOptions: RequestOptions): CompletableFuture<Void?> =
        getPricing(V1GetPricingParams.none(), requestOptions)

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

        fun environments(): EnvironmentServiceAsync.WithRawResponse

        fun instanceTypes(): InstanceTypeServiceAsync.WithRawResponse

        fun instances(): InstanceServiceAsync.WithRawResponse

        fun secrets(): SecretServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /compute/v1/pricing`, but is otherwise the same as
         * [V1ServiceAsync.getPricing].
         */
        fun getPricing(): CompletableFuture<HttpResponse> = getPricing(V1GetPricingParams.none())

        /** @see getPricing */
        fun getPricing(
            params: V1GetPricingParams = V1GetPricingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getPricing */
        fun getPricing(
            params: V1GetPricingParams = V1GetPricingParams.none()
        ): CompletableFuture<HttpResponse> = getPricing(params, RequestOptions.none())

        /** @see getPricing */
        fun getPricing(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getPricing(V1GetPricingParams.none(), requestOptions)

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
