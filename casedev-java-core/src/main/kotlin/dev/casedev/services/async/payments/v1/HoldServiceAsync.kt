// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.payments.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.payments.v1.holds.HoldApproveParams
import dev.casedev.models.payments.v1.holds.HoldCancelParams
import dev.casedev.models.payments.v1.holds.HoldCreateParams
import dev.casedev.models.payments.v1.holds.HoldListParams
import dev.casedev.models.payments.v1.holds.HoldReleaseParams
import dev.casedev.models.payments.v1.holds.HoldRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface HoldServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HoldServiceAsync

    /** Create a hold on funds in an account with release conditions */
    fun create(params: HoldCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: HoldCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get hold details by ID */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, HoldRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: HoldRetrieveParams = HoldRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: HoldRetrieveParams = HoldRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: HoldRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: HoldRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, HoldRetrieveParams.none(), requestOptions)

    /** List holds with optional filters */
    fun list(): CompletableFuture<Void?> = list(HoldListParams.none())

    /** @see list */
    fun list(
        params: HoldListParams = HoldListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: HoldListParams = HoldListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(HoldListParams.none(), requestOptions)

    /** Record an approval for a hold release condition */
    fun approve(id: String): CompletableFuture<Void?> = approve(id, HoldApproveParams.none())

    /** @see approve */
    fun approve(
        id: String,
        params: HoldApproveParams = HoldApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = approve(params.toBuilder().id(id).build(), requestOptions)

    /** @see approve */
    fun approve(
        id: String,
        params: HoldApproveParams = HoldApproveParams.none(),
    ): CompletableFuture<Void?> = approve(id, params, RequestOptions.none())

    /** @see approve */
    fun approve(
        params: HoldApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see approve */
    fun approve(params: HoldApproveParams): CompletableFuture<Void?> =
        approve(params, RequestOptions.none())

    /** @see approve */
    fun approve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        approve(id, HoldApproveParams.none(), requestOptions)

    /** Cancel an active hold */
    fun cancel(id: String): CompletableFuture<Void?> = cancel(id, HoldCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: HoldCancelParams = HoldCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        id: String,
        params: HoldCancelParams = HoldCancelParams.none(),
    ): CompletableFuture<Void?> = cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: HoldCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see cancel */
    fun cancel(params: HoldCancelParams): CompletableFuture<Void?> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        cancel(id, HoldCancelParams.none(), requestOptions)

    /** Manually release a hold */
    fun release(id: String): CompletableFuture<Void?> = release(id, HoldReleaseParams.none())

    /** @see release */
    fun release(
        id: String,
        params: HoldReleaseParams = HoldReleaseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = release(params.toBuilder().id(id).build(), requestOptions)

    /** @see release */
    fun release(
        id: String,
        params: HoldReleaseParams = HoldReleaseParams.none(),
    ): CompletableFuture<Void?> = release(id, params, RequestOptions.none())

    /** @see release */
    fun release(
        params: HoldReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see release */
    fun release(params: HoldReleaseParams): CompletableFuture<Void?> =
        release(params, RequestOptions.none())

    /** @see release */
    fun release(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        release(id, HoldReleaseParams.none(), requestOptions)

    /** A view of [HoldServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HoldServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /payments/v1/holds`, but is otherwise the same as
         * [HoldServiceAsync.create].
         */
        fun create(params: HoldCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: HoldCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /payments/v1/holds/{id}`, but is otherwise the same
         * as [HoldServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, HoldRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: HoldRetrieveParams = HoldRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: HoldRetrieveParams = HoldRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: HoldRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: HoldRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, HoldRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/holds`, but is otherwise the same as
         * [HoldServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(HoldListParams.none())

        /** @see list */
        fun list(
            params: HoldListParams = HoldListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(params: HoldListParams = HoldListParams.none()): CompletableFuture<HttpResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(HoldListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/holds/{id}/approve`, but is otherwise
         * the same as [HoldServiceAsync.approve].
         */
        fun approve(id: String): CompletableFuture<HttpResponse> =
            approve(id, HoldApproveParams.none())

        /** @see approve */
        fun approve(
            id: String,
            params: HoldApproveParams = HoldApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            approve(params.toBuilder().id(id).build(), requestOptions)

        /** @see approve */
        fun approve(
            id: String,
            params: HoldApproveParams = HoldApproveParams.none(),
        ): CompletableFuture<HttpResponse> = approve(id, params, RequestOptions.none())

        /** @see approve */
        fun approve(
            params: HoldApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see approve */
        fun approve(params: HoldApproveParams): CompletableFuture<HttpResponse> =
            approve(params, RequestOptions.none())

        /** @see approve */
        fun approve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            approve(id, HoldApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/holds/{id}/cancel`, but is otherwise
         * the same as [HoldServiceAsync.cancel].
         */
        fun cancel(id: String): CompletableFuture<HttpResponse> =
            cancel(id, HoldCancelParams.none())

        /** @see cancel */
        fun cancel(
            id: String,
            params: HoldCancelParams = HoldCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            id: String,
            params: HoldCancelParams = HoldCancelParams.none(),
        ): CompletableFuture<HttpResponse> = cancel(id, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: HoldCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see cancel */
        fun cancel(params: HoldCancelParams): CompletableFuture<HttpResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            cancel(id, HoldCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/holds/{id}/release`, but is otherwise
         * the same as [HoldServiceAsync.release].
         */
        fun release(id: String): CompletableFuture<HttpResponse> =
            release(id, HoldReleaseParams.none())

        /** @see release */
        fun release(
            id: String,
            params: HoldReleaseParams = HoldReleaseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            release(params.toBuilder().id(id).build(), requestOptions)

        /** @see release */
        fun release(
            id: String,
            params: HoldReleaseParams = HoldReleaseParams.none(),
        ): CompletableFuture<HttpResponse> = release(id, params, RequestOptions.none())

        /** @see release */
        fun release(
            params: HoldReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see release */
        fun release(params: HoldReleaseParams): CompletableFuture<HttpResponse> =
            release(params, RequestOptions.none())

        /** @see release */
        fun release(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            release(id, HoldReleaseParams.none(), requestOptions)
    }
}
