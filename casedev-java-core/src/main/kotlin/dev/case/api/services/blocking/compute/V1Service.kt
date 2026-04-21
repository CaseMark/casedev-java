// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.compute

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.compute.v1.V1GetUsageParams
import dev.case.api.models.compute.v1.V1GetUsageResponse
import dev.case.api.services.blocking.compute.v1.EnvironmentService
import dev.case.api.services.blocking.compute.v1.SecretService
import java.util.function.Consumer

/** Serverless GPU and CPU infrastructure */
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

    /** Serverless GPU and CPU infrastructure */
    fun environments(): EnvironmentService

    /** Serverless GPU and CPU infrastructure */
    fun secrets(): SecretService

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

        /** Serverless GPU and CPU infrastructure */
        fun environments(): EnvironmentService.WithRawResponse

        /** Serverless GPU and CPU infrastructure */
        fun secrets(): SecretService.WithRawResponse

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
