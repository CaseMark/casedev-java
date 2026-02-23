// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.compute.v1

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponseFor
import com.router.api.models.compute.v1.instancetypes.InstanceTypeListParams
import com.router.api.models.compute.v1.instancetypes.InstanceTypeListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InstanceTypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstanceTypeServiceAsync

    /**
     * Retrieves all available GPU instance types with pricing, specifications, and regional
     * availability. Includes T4, A10, A100, H100, and H200 GPUs powered by Lambda Labs. Perfect for
     * AI model training, inference workloads, and legal document OCR processing at scale.
     */
    fun list(): CompletableFuture<InstanceTypeListResponse> = list(InstanceTypeListParams.none())

    /** @see list */
    fun list(
        params: InstanceTypeListParams = InstanceTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstanceTypeListResponse>

    /** @see list */
    fun list(
        params: InstanceTypeListParams = InstanceTypeListParams.none()
    ): CompletableFuture<InstanceTypeListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InstanceTypeListResponse> =
        list(InstanceTypeListParams.none(), requestOptions)

    /**
     * A view of [InstanceTypeServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstanceTypeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /compute/v1/instance-types`, but is otherwise the
         * same as [InstanceTypeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InstanceTypeListResponse>> =
            list(InstanceTypeListParams.none())

        /** @see list */
        fun list(
            params: InstanceTypeListParams = InstanceTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstanceTypeListResponse>>

        /** @see list */
        fun list(
            params: InstanceTypeListParams = InstanceTypeListParams.none()
        ): CompletableFuture<HttpResponseFor<InstanceTypeListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InstanceTypeListResponse>> =
            list(InstanceTypeListParams.none(), requestOptions)
    }
}
