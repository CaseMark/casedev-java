// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.payments.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.payments.v1.payouts.PayoutCancelParams
import dev.casedev.models.payments.v1.payouts.PayoutCreateParams
import dev.casedev.models.payments.v1.payouts.PayoutListParams
import dev.casedev.models.payments.v1.payouts.PayoutRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PayoutServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PayoutServiceAsync

    /** Create a payout to send money to an external bank account */
    fun create(params: PayoutCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PayoutCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get payout details by ID */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, PayoutRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PayoutRetrieveParams = PayoutRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PayoutRetrieveParams = PayoutRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PayoutRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: PayoutRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, PayoutRetrieveParams.none(), requestOptions)

    /** List payouts with optional filters */
    fun list(): CompletableFuture<Void?> = list(PayoutListParams.none())

    /** @see list */
    fun list(
        params: PayoutListParams = PayoutListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: PayoutListParams = PayoutListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(PayoutListParams.none(), requestOptions)

    /** Cancel a pending payout before it is processed */
    fun cancel(id: String): CompletableFuture<Void?> = cancel(id, PayoutCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: PayoutCancelParams = PayoutCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        id: String,
        params: PayoutCancelParams = PayoutCancelParams.none(),
    ): CompletableFuture<Void?> = cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: PayoutCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see cancel */
    fun cancel(params: PayoutCancelParams): CompletableFuture<Void?> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        cancel(id, PayoutCancelParams.none(), requestOptions)

    /**
     * A view of [PayoutServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PayoutServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /payments/v1/payouts`, but is otherwise the same as
         * [PayoutServiceAsync.create].
         */
        fun create(params: PayoutCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PayoutCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /payments/v1/payouts/{id}`, but is otherwise the
         * same as [PayoutServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, PayoutRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PayoutRetrieveParams = PayoutRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PayoutRetrieveParams = PayoutRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PayoutRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: PayoutRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, PayoutRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/payouts`, but is otherwise the same as
         * [PayoutServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(PayoutListParams.none())

        /** @see list */
        fun list(
            params: PayoutListParams = PayoutListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: PayoutListParams = PayoutListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(PayoutListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/payouts/{id}/cancel`, but is otherwise
         * the same as [PayoutServiceAsync.cancel].
         */
        fun cancel(id: String): CompletableFuture<HttpResponse> =
            cancel(id, PayoutCancelParams.none())

        /** @see cancel */
        fun cancel(
            id: String,
            params: PayoutCancelParams = PayoutCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            id: String,
            params: PayoutCancelParams = PayoutCancelParams.none(),
        ): CompletableFuture<HttpResponse> = cancel(id, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: PayoutCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see cancel */
        fun cancel(params: PayoutCancelParams): CompletableFuture<HttpResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            cancel(id, PayoutCancelParams.none(), requestOptions)
    }
}
