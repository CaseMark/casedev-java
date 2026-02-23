// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.compute.v1

import com.google.errorprone.annotations.MustBeClosed
import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponseFor
import com.router.api.models.compute.v1.instancetypes.InstanceTypeListParams
import com.router.api.models.compute.v1.instancetypes.InstanceTypeListResponse
import java.util.function.Consumer

interface InstanceTypeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstanceTypeService

    /**
     * Retrieves all available GPU instance types with pricing, specifications, and regional
     * availability. Includes T4, A10, A100, H100, and H200 GPUs powered by Lambda Labs. Perfect for
     * AI model training, inference workloads, and legal document OCR processing at scale.
     */
    fun list(): InstanceTypeListResponse = list(InstanceTypeListParams.none())

    /** @see list */
    fun list(
        params: InstanceTypeListParams = InstanceTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstanceTypeListResponse

    /** @see list */
    fun list(
        params: InstanceTypeListParams = InstanceTypeListParams.none()
    ): InstanceTypeListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InstanceTypeListResponse =
        list(InstanceTypeListParams.none(), requestOptions)

    /**
     * A view of [InstanceTypeService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstanceTypeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /compute/v1/instance-types`, but is otherwise the
         * same as [InstanceTypeService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<InstanceTypeListResponse> = list(InstanceTypeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InstanceTypeListParams = InstanceTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstanceTypeListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InstanceTypeListParams = InstanceTypeListParams.none()
        ): HttpResponseFor<InstanceTypeListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InstanceTypeListResponse> =
            list(InstanceTypeListParams.none(), requestOptions)
    }
}
