// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.payments.v1.transfers.TransferApproveParams
import dev.casedev.models.payments.v1.transfers.TransferCancelParams
import dev.casedev.models.payments.v1.transfers.TransferCreateParams
import dev.casedev.models.payments.v1.transfers.TransferListParams
import dev.casedev.models.payments.v1.transfers.TransferRetrieveParams
import java.util.function.Consumer

interface TransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransferService

    /** Create a transfer between payment accounts */
    fun create(params: TransferCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: TransferCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get transfer details by ID */
    fun retrieve(id: String) = retrieve(id, TransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransferRetrieveParams = TransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: TransferRetrieveParams = TransferRetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: TransferRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, TransferRetrieveParams.none(), requestOptions)

    /** List transfers with optional filters */
    fun list() = list(TransferListParams.none())

    /** @see list */
    fun list(
        params: TransferListParams = TransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: TransferListParams = TransferListParams.none()) =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(TransferListParams.none(), requestOptions)

    /** Approve and execute a pending transfer */
    fun approve(id: String) = approve(id, TransferApproveParams.none())

    /** @see approve */
    fun approve(
        id: String,
        params: TransferApproveParams = TransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = approve(params.toBuilder().id(id).build(), requestOptions)

    /** @see approve */
    fun approve(id: String, params: TransferApproveParams = TransferApproveParams.none()) =
        approve(id, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: TransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see approve */
    fun approve(params: TransferApproveParams) = approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(id: String, requestOptions: RequestOptions) =
        approve(id, TransferApproveParams.none(), requestOptions)

    /** Cancel a pending transfer */
    fun cancel(id: String) = cancel(id, TransferCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: TransferCancelParams = TransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(id: String, params: TransferCancelParams = TransferCancelParams.none()) =
        cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(params: TransferCancelParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see cancel */
    fun cancel(params: TransferCancelParams) = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions) =
        cancel(id, TransferCancelParams.none(), requestOptions)

    /** A view of [TransferService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /payments/v1/transfers`, but is otherwise the same
         * as [TransferService.create].
         */
        @MustBeClosed
        fun create(params: TransferCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /payments/v1/transfers/{id}`, but is otherwise the
         * same as [TransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse = retrieve(id, TransferRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransferRetrieveParams = TransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransferRetrieveParams = TransferRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TransferRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, TransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/transfers`, but is otherwise the same
         * as [TransferService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(TransferListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransferListParams = TransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: TransferListParams = TransferListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(TransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/transfers/{id}/approve`, but is
         * otherwise the same as [TransferService.approve].
         */
        @MustBeClosed
        fun approve(id: String): HttpResponse = approve(id, TransferApproveParams.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            id: String,
            params: TransferApproveParams = TransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = approve(params.toBuilder().id(id).build(), requestOptions)

        /** @see approve */
        @MustBeClosed
        fun approve(
            id: String,
            params: TransferApproveParams = TransferApproveParams.none(),
        ): HttpResponse = approve(id, params, RequestOptions.none())

        /** @see approve */
        @MustBeClosed
        fun approve(
            params: TransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see approve */
        @MustBeClosed
        fun approve(params: TransferApproveParams): HttpResponse =
            approve(params, RequestOptions.none())

        /** @see approve */
        @MustBeClosed
        fun approve(id: String, requestOptions: RequestOptions): HttpResponse =
            approve(id, TransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/transfers/{id}/cancel`, but is
         * otherwise the same as [TransferService.cancel].
         */
        @MustBeClosed fun cancel(id: String): HttpResponse = cancel(id, TransferCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: TransferCancelParams = TransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: TransferCancelParams = TransferCancelParams.none(),
        ): HttpResponse = cancel(id, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: TransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: TransferCancelParams): HttpResponse =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(id: String, requestOptions: RequestOptions): HttpResponse =
            cancel(id, TransferCancelParams.none(), requestOptions)
    }
}
