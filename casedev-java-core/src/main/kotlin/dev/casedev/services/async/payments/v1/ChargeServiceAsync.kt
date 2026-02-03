// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.payments.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.payments.v1.charges.ChargeCancelParams
import dev.casedev.models.payments.v1.charges.ChargeCreateParams
import dev.casedev.models.payments.v1.charges.ChargeListParams
import dev.casedev.models.payments.v1.charges.ChargeRefundParams
import dev.casedev.models.payments.v1.charges.ChargeRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChargeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChargeServiceAsync

    /** Create a charge (payment request) to collect money from a party */
    fun create(params: ChargeCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ChargeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get charge details by ID */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, ChargeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ChargeRetrieveParams = ChargeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ChargeRetrieveParams = ChargeRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ChargeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: ChargeRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, ChargeRetrieveParams.none(), requestOptions)

    /** List charges with optional filters */
    fun list(): CompletableFuture<Void?> = list(ChargeListParams.none())

    /** @see list */
    fun list(
        params: ChargeListParams = ChargeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: ChargeListParams = ChargeListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(ChargeListParams.none(), requestOptions)

    /** Cancel a pending charge before payment is collected */
    fun cancel(id: String): CompletableFuture<Void?> = cancel(id, ChargeCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: ChargeCancelParams = ChargeCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        id: String,
        params: ChargeCancelParams = ChargeCancelParams.none(),
    ): CompletableFuture<Void?> = cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(
        params: ChargeCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see cancel */
    fun cancel(params: ChargeCancelParams): CompletableFuture<Void?> =
        cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        cancel(id, ChargeCancelParams.none(), requestOptions)

    /** Refund a succeeded charge (full or partial) */
    fun refund(id: String): CompletableFuture<Void?> = refund(id, ChargeRefundParams.none())

    /** @see refund */
    fun refund(
        id: String,
        params: ChargeRefundParams = ChargeRefundParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = refund(params.toBuilder().id(id).build(), requestOptions)

    /** @see refund */
    fun refund(
        id: String,
        params: ChargeRefundParams = ChargeRefundParams.none(),
    ): CompletableFuture<Void?> = refund(id, params, RequestOptions.none())

    /** @see refund */
    fun refund(
        params: ChargeRefundParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see refund */
    fun refund(params: ChargeRefundParams): CompletableFuture<Void?> =
        refund(params, RequestOptions.none())

    /** @see refund */
    fun refund(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        refund(id, ChargeRefundParams.none(), requestOptions)

    /**
     * A view of [ChargeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChargeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /payments/v1/charges`, but is otherwise the same as
         * [ChargeServiceAsync.create].
         */
        fun create(params: ChargeCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ChargeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /payments/v1/charges/{id}`, but is otherwise the
         * same as [ChargeServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, ChargeRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ChargeRetrieveParams = ChargeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ChargeRetrieveParams = ChargeRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ChargeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: ChargeRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, ChargeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/charges`, but is otherwise the same as
         * [ChargeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(ChargeListParams.none())

        /** @see list */
        fun list(
            params: ChargeListParams = ChargeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: ChargeListParams = ChargeListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(ChargeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/charges/{id}/cancel`, but is otherwise
         * the same as [ChargeServiceAsync.cancel].
         */
        fun cancel(id: String): CompletableFuture<HttpResponse> =
            cancel(id, ChargeCancelParams.none())

        /** @see cancel */
        fun cancel(
            id: String,
            params: ChargeCancelParams = ChargeCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        fun cancel(
            id: String,
            params: ChargeCancelParams = ChargeCancelParams.none(),
        ): CompletableFuture<HttpResponse> = cancel(id, params, RequestOptions.none())

        /** @see cancel */
        fun cancel(
            params: ChargeCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see cancel */
        fun cancel(params: ChargeCancelParams): CompletableFuture<HttpResponse> =
            cancel(params, RequestOptions.none())

        /** @see cancel */
        fun cancel(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            cancel(id, ChargeCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/charges/{id}/refund`, but is otherwise
         * the same as [ChargeServiceAsync.refund].
         */
        fun refund(id: String): CompletableFuture<HttpResponse> =
            refund(id, ChargeRefundParams.none())

        /** @see refund */
        fun refund(
            id: String,
            params: ChargeRefundParams = ChargeRefundParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            refund(params.toBuilder().id(id).build(), requestOptions)

        /** @see refund */
        fun refund(
            id: String,
            params: ChargeRefundParams = ChargeRefundParams.none(),
        ): CompletableFuture<HttpResponse> = refund(id, params, RequestOptions.none())

        /** @see refund */
        fun refund(
            params: ChargeRefundParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see refund */
        fun refund(params: ChargeRefundParams): CompletableFuture<HttpResponse> =
            refund(params, RequestOptions.none())

        /** @see refund */
        fun refund(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            refund(id, ChargeRefundParams.none(), requestOptions)
    }
}
