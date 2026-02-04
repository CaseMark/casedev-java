// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.database

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.database.v1.V1GetUsageParams
import dev.casedev.models.database.v1.V1GetUsageResponse
import dev.casedev.services.blocking.database.v1.ProjectService
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

    fun projects(): ProjectService

    /**
     * Returns detailed database usage statistics and billing information for the current billing
     * period. Includes compute hours, storage, data transfer, and branch counts with associated
     * costs broken down by project.
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

        fun projects(): ProjectService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /database/v1/usage`, but is otherwise the same as
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
