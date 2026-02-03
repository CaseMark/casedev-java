// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.payments.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.payments.v1.transfers.TransferApproveParams
import dev.casedev.models.payments.v1.transfers.TransferCancelParams
import dev.casedev.models.payments.v1.transfers.TransferCreateParams
import dev.casedev.models.payments.v1.transfers.TransferListParams
import dev.casedev.models.payments.v1.transfers.TransferRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransferServiceAsync

    /** Create a transfer between payment accounts */
    fun create(params: TransferCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get transfer details by ID */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, TransferRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransferRetrieveParams = TransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: TransferRetrieveParams = TransferRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: TransferRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, TransferRetrieveParams.none(), requestOptions)

    /** List transfers with optional filters */
    fun list(): CompletableFuture<Void?> = list(TransferListParams.none())

    /** @see list */
    fun list(
        params: TransferListParams = TransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: TransferListParams = TransferListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(TransferListParams.none(), requestOptions)

    /** Approve and execute a pending transfer */
    fun approve(id: String): CompletableFuture<Void?> = approve(id, TransferApproveParams.none())

    /** @see approve */
    fun approve(
        id: String,
        params: TransferApproveParams = TransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = approve(params.toBuilder().id(id).build(), requestOptions)

    /** @see approve */
    fun approve(
        id: String,
        params: TransferApproveParams = TransferApproveParams.none(),
    ): CompletableFuture<Void?> = approve(id, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: TransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see approve */
    fun approve(params: TransferApproveParams): CompletableFuture<Void?> =
        approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        approve(id, TransferApproveParams.none(), requestOptions)

    /** Cancel a pending transfer */
    fun cancel(id: String): CompletableFuture<Void?> = cancel(id, TransferCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: TransferCancelParams = TransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        id: String,
        params: TransferCancelParams = TransferCancelParams.none(),
    ): CompletableFuture<Void?> = cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: TransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see cancel */
    fun cancel(params: TransferCancelParams): CompletableFuture<Void?> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        cancel(id, TransferCancelParams.none(), requestOptions)

    /**
     * A view of [TransferServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /payments/v1/transfers`, but is otherwise the same
         * as [TransferServiceAsync.create].
         */
        fun create(params: TransferCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /payments/v1/transfers/{id}`, but is otherwise the
         * same as [TransferServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, TransferRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TransferRetrieveParams = TransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: TransferRetrieveParams = TransferRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: TransferRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, TransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/transfers`, but is otherwise the same
         * as [TransferServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(TransferListParams.none())

        /** @see list */
        fun list(
            params: TransferListParams = TransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: TransferListParams = TransferListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(TransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/transfers/{id}/approve`, but is
         * otherwise the same as [TransferServiceAsync.approve].
         */
        fun approve(id: String): CompletableFuture<HttpResponse> =
            approve(id, TransferApproveParams.none())

        /** @see approve */
        fun approve(
            id: String,
            params: TransferApproveParams = TransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            approve(params.toBuilder().id(id).build(), requestOptions)

        /** @see approve */
        fun approve(
            id: String,
            params: TransferApproveParams = TransferApproveParams.none(),
        ): CompletableFuture<HttpResponse> = approve(id, params, RequestOptions.none())

        /** @see approve */
        fun approve(
            params: TransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see approve */
        fun approve(params: TransferApproveParams): CompletableFuture<HttpResponse> =
            approve(params, RequestOptions.none())

        /** @see approve */
        fun approve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            approve(id, TransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/transfers/{id}/cancel`, but is
         * otherwise the same as [TransferServiceAsync.cancel].
         */
        fun cancel(id: String): CompletableFuture<HttpResponse> =
            cancel(id, TransferCancelParams.none())

        /** @see cancel */
        fun cancel(
            id: String,
            params: TransferCancelParams = TransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            id: String,
            params: TransferCancelParams = TransferCancelParams.none(),
        ): CompletableFuture<HttpResponse> = cancel(id, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: TransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see cancel */
        fun cancel(params: TransferCancelParams): CompletableFuture<HttpResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            cancel(id, TransferCancelParams.none(), requestOptions)
    }
}
