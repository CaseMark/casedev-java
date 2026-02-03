// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.payments.v1.holds.HoldApproveParams
import dev.casedev.models.payments.v1.holds.HoldCancelParams
import dev.casedev.models.payments.v1.holds.HoldCreateParams
import dev.casedev.models.payments.v1.holds.HoldListParams
import dev.casedev.models.payments.v1.holds.HoldReleaseParams
import dev.casedev.models.payments.v1.holds.HoldRetrieveParams
import java.util.function.Consumer

interface HoldService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HoldService

    /** Create a hold on funds in an account with release conditions */
    fun create(params: HoldCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: HoldCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get hold details by ID */
    fun retrieve(id: String) = retrieve(id, HoldRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: HoldRetrieveParams = HoldRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: HoldRetrieveParams = HoldRetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: HoldRetrieveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see retrieve */
    fun retrieve(params: HoldRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, HoldRetrieveParams.none(), requestOptions)

    /** List holds with optional filters */
    fun list() = list(HoldListParams.none())

    /** @see list */
    fun list(
        params: HoldListParams = HoldListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: HoldListParams = HoldListParams.none()) = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(HoldListParams.none(), requestOptions)

    /** Record an approval for a hold release condition */
    fun approve(id: String) = approve(id, HoldApproveParams.none())

    /** @see approve */
    fun approve(
        id: String,
        params: HoldApproveParams = HoldApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = approve(params.toBuilder().id(id).build(), requestOptions)

    /** @see approve */
    fun approve(id: String, params: HoldApproveParams = HoldApproveParams.none()) =
        approve(id, params, RequestOptions.none())

    /** @see approve */
    fun approve(params: HoldApproveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see approve */
    fun approve(params: HoldApproveParams) = approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(id: String, requestOptions: RequestOptions) =
        approve(id, HoldApproveParams.none(), requestOptions)

    /** Cancel an active hold */
    fun cancel(id: String) = cancel(id, HoldCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: HoldCancelParams = HoldCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(id: String, params: HoldCancelParams = HoldCancelParams.none()) =
        cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(params: HoldCancelParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see cancel */
    fun cancel(params: HoldCancelParams) = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions) =
        cancel(id, HoldCancelParams.none(), requestOptions)

    /** Manually release a hold */
    fun release(id: String) = release(id, HoldReleaseParams.none())

    /** @see release */
    fun release(
        id: String,
        params: HoldReleaseParams = HoldReleaseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = release(params.toBuilder().id(id).build(), requestOptions)

    /** @see release */
    fun release(id: String, params: HoldReleaseParams = HoldReleaseParams.none()) =
        release(id, params, RequestOptions.none())

    /** @see release */
    fun release(params: HoldReleaseParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see release */
    fun release(params: HoldReleaseParams) = release(params, RequestOptions.none())

    /** @see release */
    fun release(id: String, requestOptions: RequestOptions) =
        release(id, HoldReleaseParams.none(), requestOptions)

    /** A view of [HoldService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HoldService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /payments/v1/holds`, but is otherwise the same as
         * [HoldService.create].
         */
        @MustBeClosed
        fun create(params: HoldCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: HoldCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /payments/v1/holds/{id}`, but is otherwise the same
         * as [HoldService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse = retrieve(id, HoldRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: HoldRetrieveParams = HoldRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: HoldRetrieveParams = HoldRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: HoldRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: HoldRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, HoldRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/holds`, but is otherwise the same as
         * [HoldService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(HoldListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: HoldListParams = HoldListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: HoldListParams = HoldListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(HoldListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/holds/{id}/approve`, but is otherwise
         * the same as [HoldService.approve].
         */
        @MustBeClosed fun approve(id: String): HttpResponse = approve(id, HoldApproveParams.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            id: String,
            params: HoldApproveParams = HoldApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = approve(params.toBuilder().id(id).build(), requestOptions)

        /** @see approve */
        @MustBeClosed
        fun approve(
            id: String,
            params: HoldApproveParams = HoldApproveParams.none(),
        ): HttpResponse = approve(id, params, RequestOptions.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            params: HoldApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see approve */
        @MustBeClosed
        fun approve(params: HoldApproveParams): HttpResponse =
            approve(params, RequestOptions.none())

        /** @see approve */
        @MustBeClosed
        fun approve(id: String, requestOptions: RequestOptions): HttpResponse =
            approve(id, HoldApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/holds/{id}/cancel`, but is otherwise
         * the same as [HoldService.cancel].
         */
        @MustBeClosed fun cancel(id: String): HttpResponse = cancel(id, HoldCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: HoldCancelParams = HoldCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(id: String, params: HoldCancelParams = HoldCancelParams.none()): HttpResponse =
            cancel(id, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: HoldCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: HoldCancelParams): HttpResponse = cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(id: String, requestOptions: RequestOptions): HttpResponse =
            cancel(id, HoldCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/holds/{id}/release`, but is otherwise
         * the same as [HoldService.release].
         */
        @MustBeClosed fun release(id: String): HttpResponse = release(id, HoldReleaseParams.none())

        /** @see release */
        @MustBeClosed
        fun release(
            id: String,
            params: HoldReleaseParams = HoldReleaseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = release(params.toBuilder().id(id).build(), requestOptions)

        /** @see release */
        @MustBeClosed
        fun release(
            id: String,
            params: HoldReleaseParams = HoldReleaseParams.none(),
        ): HttpResponse = release(id, params, RequestOptions.none())

        /** @see release */
        @MustBeClosed
        fun release(
            params: HoldReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see release */
        @MustBeClosed
        fun release(params: HoldReleaseParams): HttpResponse =
            release(params, RequestOptions.none())

        /** @see release */
        @MustBeClosed
        fun release(id: String, requestOptions: RequestOptions): HttpResponse =
            release(id, HoldReleaseParams.none(), requestOptions)
    }
}
