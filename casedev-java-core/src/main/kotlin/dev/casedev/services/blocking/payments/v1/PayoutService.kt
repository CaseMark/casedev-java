// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.payments.v1.payouts.PayoutCancelParams
import dev.casedev.models.payments.v1.payouts.PayoutCreateParams
import dev.casedev.models.payments.v1.payouts.PayoutListParams
import dev.casedev.models.payments.v1.payouts.PayoutRetrieveParams
import java.util.function.Consumer

interface PayoutService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PayoutService

    /** Create a payout to send money to an external bank account */
    fun create(params: PayoutCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: PayoutCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get payout details by ID */
    fun retrieve(id: String) = retrieve(id, PayoutRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PayoutRetrieveParams = PayoutRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: PayoutRetrieveParams = PayoutRetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PayoutRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: PayoutRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, PayoutRetrieveParams.none(), requestOptions)

    /** List payouts with optional filters */
    fun list() = list(PayoutListParams.none())

    /** @see list */
    fun list(
        params: PayoutListParams = PayoutListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: PayoutListParams = PayoutListParams.none()) =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(PayoutListParams.none(), requestOptions)

    /** Cancel a pending payout before it is processed */
    fun cancel(id: String) = cancel(id, PayoutCancelParams.none())

    /** @see cancel */
    fun cancel(
        id: String,
        params: PayoutCancelParams = PayoutCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = cancel(params.toBuilder().id(id).build(), requestOptions)

    /** @see cancel */
    fun cancel(id: String, params: PayoutCancelParams = PayoutCancelParams.none()) =
        cancel(id, params, RequestOptions.none())

    /** @see cancel */
    fun cancel(params: PayoutCancelParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see cancel */
    fun cancel(params: PayoutCancelParams) = cancel(params, RequestOptions.none())

    /** @see cancel */
    fun cancel(id: String, requestOptions: RequestOptions) =
        cancel(id, PayoutCancelParams.none(), requestOptions)

    /** A view of [PayoutService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PayoutService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /payments/v1/payouts`, but is otherwise the same as
         * [PayoutService.create].
         */
        @MustBeClosed
        fun create(params: PayoutCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PayoutCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /payments/v1/payouts/{id}`, but is otherwise the
         * same as [PayoutService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse = retrieve(id, PayoutRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PayoutRetrieveParams = PayoutRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PayoutRetrieveParams = PayoutRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PayoutRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PayoutRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, PayoutRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/payouts`, but is otherwise the same as
         * [PayoutService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(PayoutListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PayoutListParams = PayoutListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: PayoutListParams = PayoutListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(PayoutListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/v1/payouts/{id}/cancel`, but is otherwise
         * the same as [PayoutService.cancel].
         */
        @MustBeClosed fun cancel(id: String): HttpResponse = cancel(id, PayoutCancelParams.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: PayoutCancelParams = PayoutCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = cancel(params.toBuilder().id(id).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            id: String,
            params: PayoutCancelParams = PayoutCancelParams.none(),
        ): HttpResponse = cancel(id, params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: PayoutCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see cancel */
        @MustBeClosed
        fun cancel(params: PayoutCancelParams): HttpResponse = cancel(params, RequestOptions.none())

        /** @see cancel */
        @MustBeClosed
        fun cancel(id: String, requestOptions: RequestOptions): HttpResponse =
            cancel(id, PayoutCancelParams.none(), requestOptions)
    }
}
