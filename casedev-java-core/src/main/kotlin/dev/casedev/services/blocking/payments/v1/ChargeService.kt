// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.payments.v1.charges.ChargeCancelParams
import dev.casedev.models.payments.v1.charges.ChargeCreateParams
import dev.casedev.models.payments.v1.charges.ChargeListParams
import dev.casedev.models.payments.v1.charges.ChargeRefundParams
import dev.casedev.models.payments.v1.charges.ChargeRetrieveParams
import java.util.function.Consumer

interface ChargeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChargeService

    /** Create a charge (payment request) to collect money from a party */
    fun create(params: ChargeCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: ChargeCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get charge details by ID */
    fun retrieve(id: String) = retrieve(id, ChargeRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ChargeRetrieveParams = ChargeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: ChargeRetrieveParams = ChargeRetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ChargeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: ChargeRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, ChargeRetrieveParams.none(), requestOptions)

    /** List charges with optional filters */
    fun list() = list(ChargeListParams.none())

    /** @see list */
    fun list(
        params: ChargeListParams = ChargeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: ChargeListParams = ChargeListParams.none()) =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(ChargeListParams.none(), requestOptions)

    /** Cancel a pending charge before payment is collected */
    fun cancel(id: String) = cancel(id, ChargeCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: ChargeCancelParams = ChargeCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(id: String, params: ChargeCancelParams = ChargeCancelParams.none()) =
        cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(params: ChargeCancelParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see cancel */
    fun cancel(params: ChargeCancelParams) = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions) =
        cancel(id, ChargeCancelParams.none(), requestOptions)

    /** Refund a succeeded charge (full or partial) */
    fun refund(id: String) = refund(id, ChargeRefundParams.none())

    /** @see refund */
    fun refund(
        id: String,
        params: ChargeRefundParams = ChargeRefundParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = refund(params.toBuilder().id(id).build(), requestOptions)

    /** @see refund */
    fun refund(id: String, params: ChargeRefundParams = ChargeRefundParams.none()) =
        refund(id, params, RequestOptions.none())

    /** @see refund */
    fun refund(params: ChargeRefundParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see refund */
    fun refund(params: ChargeRefundParams) = refund(params, RequestOptions.none())

    /** @see refund */
    fun refund(id: String, requestOptions: RequestOptions) =
        refund(id, ChargeRefundParams.none(), requestOptions)

    /** A view of [ChargeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChargeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /payments/v1/charges`, but is otherwise the same as
         * [ChargeService.create].
         */
        @MustBeClosed
        fun create(params: ChargeCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ChargeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /payments/v1/charges/{id}`, but is otherwise the
         * same as [ChargeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse = retrieve(id, ChargeRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ChargeRetrieveParams = ChargeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ChargeRetrieveParams = ChargeRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ChargeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ChargeRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, ChargeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/charges`, but is otherwise the same as
         * [ChargeService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(ChargeListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ChargeListParams = ChargeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: ChargeListParams = ChargeListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(ChargeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/charges/{id}/cancel`, but is otherwise
         * the same as [ChargeService.cancel].
         */
        @MustBeClosed fun cancel(id: String): HttpResponse = cancel(id, ChargeCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: ChargeCancelParams = ChargeCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: ChargeCancelParams = ChargeCancelParams.none(),
        ): HttpResponse = cancel(id, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: ChargeCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: ChargeCancelParams): HttpResponse = cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(id: String, requestOptions: RequestOptions): HttpResponse =
            cancel(id, ChargeCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/charges/{id}/refund`, but is otherwise
         * the same as [ChargeService.refund].
         */
        @MustBeClosed fun refund(id: String): HttpResponse = refund(id, ChargeRefundParams.none())

        /** @see refund */
        @MustBeClosed
        fun refund(
            id: String,
            params: ChargeRefundParams = ChargeRefundParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = refund(params.toBuilder().id(id).build(), requestOptions)

        /** @see refund */
        @MustBeClosed
        fun refund(
            id: String,
            params: ChargeRefundParams = ChargeRefundParams.none(),
        ): HttpResponse = refund(id, params, RequestOptions.none())

        /** @see refund */
        @MustBeClosed
        fun refund(
            params: ChargeRefundParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see refund */
        @MustBeClosed
        fun refund(params: ChargeRefundParams): HttpResponse = refund(params, RequestOptions.none())

        /** @see refund */
        @MustBeClosed
        fun refund(id: String, requestOptions: RequestOptions): HttpResponse =
            refund(id, ChargeRefundParams.none(), requestOptions)
    }
}
