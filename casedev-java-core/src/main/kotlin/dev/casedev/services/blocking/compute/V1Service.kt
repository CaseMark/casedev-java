// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.compute

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.compute.v1.V1GetPricingParams
import dev.casedev.models.compute.v1.V1GetUsageParams
import dev.casedev.models.compute.v1.V1GetUsageResponse
import dev.casedev.services.blocking.compute.v1.EnvironmentService
import dev.casedev.services.blocking.compute.v1.FunctionService
import dev.casedev.services.blocking.compute.v1.InvokeService
import dev.casedev.services.blocking.compute.v1.RunService
import dev.casedev.services.blocking.compute.v1.SecretService
import java.util.function.Consumer

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

    fun environments(): EnvironmentService

    fun functions(): FunctionService

    fun invoke(): InvokeService

    fun runs(): RunService

    fun secrets(): SecretService

    /**
     * Returns current pricing for GPU instances. Prices are fetched in real-time and include a 20%
     * platform fee. For detailed instance types and availability, use GET
     * /compute/v1/instance-types.
     */
    fun getPricing() = getPricing(V1GetPricingParams.none())

    /** @see getPricing */
    fun getPricing(
        params: V1GetPricingParams = V1GetPricingParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see getPricing */
    fun getPricing(params: V1GetPricingParams = V1GetPricingParams.none()) =
        getPricing(params, RequestOptions.none())

    /** @see getPricing */
    fun getPricing(requestOptions: RequestOptions) =
        getPricing(V1GetPricingParams.none(), requestOptions)

    /**
     * Returns detailed compute usage statistics and billing information for your organization.
     * Includes GPU and CPU hours, total runs, costs, and breakdowns by environment. Use optional
     * query parameters to filter by specific year and month.
     */
    fun getUsage(): V1GetUsageResponse = getUsage(V1GetUsageParams.none())

    /** @see getUsage */
    fun getUsage(
        params: V1GetUsageParams = V1GetUsageParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1GetUsageResponse

    /** @see getUsage */
    fun getUsage(params: V1GetUsageParams = V1GetUsageParams.none()): V1GetUsageResponse =
        getUsage(params, RequestOptions.none())

    /** @see getUsage */
    fun getUsage(requestOptions: RequestOptions): V1GetUsageResponse =
        getUsage(V1GetUsageParams.none(), requestOptions)

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        fun environments(): EnvironmentService.WithRawResponse

        fun functions(): FunctionService.WithRawResponse

        fun invoke(): InvokeService.WithRawResponse

        fun runs(): RunService.WithRawResponse

        fun secrets(): SecretService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /compute/v1/pricing`, but is otherwise the same as
         * [V1Service.getPricing].
         */
        @MustBeClosed fun getPricing(): HttpResponse = getPricing(V1GetPricingParams.none())

        /** @see getPricing */
        @MustBeClosed
        fun getPricing(
            params: V1GetPricingParams = V1GetPricingParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getPricing */
        @MustBeClosed
        fun getPricing(params: V1GetPricingParams = V1GetPricingParams.none()): HttpResponse =
            getPricing(params, RequestOptions.none())

        /** @see getPricing */
        @MustBeClosed
        fun getPricing(requestOptions: RequestOptions): HttpResponse =
            getPricing(V1GetPricingParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /compute/v1/usage`, but is otherwise the same as
         * [V1Service.getUsage].
         */
        @MustBeClosed
        fun getUsage(): HttpResponseFor<V1GetUsageResponse> = getUsage(V1GetUsageParams.none())

        /** @see getUsage */
        @MustBeClosed
        fun getUsage(
            params: V1GetUsageParams = V1GetUsageParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1GetUsageResponse>

        /** @see getUsage */
        @MustBeClosed
        fun getUsage(
            params: V1GetUsageParams = V1GetUsageParams.none()
        ): HttpResponseFor<V1GetUsageResponse> = getUsage(params, RequestOptions.none())

        /** @see getUsage */
        @MustBeClosed
        fun getUsage(requestOptions: RequestOptions): HttpResponseFor<V1GetUsageResponse> =
            getUsage(V1GetUsageParams.none(), requestOptions)
    }
}
