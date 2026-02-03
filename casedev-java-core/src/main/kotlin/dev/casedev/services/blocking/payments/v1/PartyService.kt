// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.payments.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.payments.v1.parties.PartyCreateParams
import dev.casedev.models.payments.v1.parties.PartyListParams
import dev.casedev.models.payments.v1.parties.PartyListPaymentMethodsParams
import dev.casedev.models.payments.v1.parties.PartyRetrieveParams
import dev.casedev.models.payments.v1.parties.PartyUpdateParams
import java.util.function.Consumer

interface PartyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PartyService

    /** Create a new payment party (client, vendor, counsel, etc.) */
    fun create(params: PartyCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: PartyCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get party details by ID */
    fun retrieve(id: String) = retrieve(id, PartyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PartyRetrieveParams = PartyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: PartyRetrieveParams = PartyRetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PartyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: PartyRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, PartyRetrieveParams.none(), requestOptions)

    /** Update party details */
    fun update(id: String) = update(id, PartyUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: PartyUpdateParams = PartyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: PartyUpdateParams = PartyUpdateParams.none()) =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(params: PartyUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see update */
    fun update(params: PartyUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions) =
        update(id, PartyUpdateParams.none(), requestOptions)

    /** List payment parties with optional filters */
    fun list() = list(PartyListParams.none())

    /** @see list */
    fun list(
        params: PartyListParams = PartyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: PartyListParams = PartyListParams.none()) = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(PartyListParams.none(), requestOptions)

    /** List saved payment methods for a party (from Stripe) */
    fun listPaymentMethods(id: String) =
        listPaymentMethods(id, PartyListPaymentMethodsParams.none())

    /** @see listPaymentMethods */
    fun listPaymentMethods(
        id: String,
        params: PartyListPaymentMethodsParams = PartyListPaymentMethodsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = listPaymentMethods(params.toBuilder().id(id).build(), requestOptions)

    /** @see listPaymentMethods */
    fun listPaymentMethods(
        id: String,
        params: PartyListPaymentMethodsParams = PartyListPaymentMethodsParams.none(),
    ) = listPaymentMethods(id, params, RequestOptions.none())

    /** @see listPaymentMethods */
    fun listPaymentMethods(
        params: PartyListPaymentMethodsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see listPaymentMethods */
    fun listPaymentMethods(params: PartyListPaymentMethodsParams) =
        listPaymentMethods(params, RequestOptions.none())

    /** @see listPaymentMethods */
    fun listPaymentMethods(id: String, requestOptions: RequestOptions) =
        listPaymentMethods(id, PartyListPaymentMethodsParams.none(), requestOptions)

    /** A view of [PartyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PartyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /payments/v1/parties`, but is otherwise the same as
         * [PartyService.create].
         */
        @MustBeClosed
        fun create(params: PartyCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PartyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /payments/v1/parties/{id}`, but is otherwise the
         * same as [PartyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse = retrieve(id, PartyRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PartyRetrieveParams = PartyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PartyRetrieveParams = PartyRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PartyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PartyRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, PartyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /payments/v1/parties/{id}`, but is otherwise the
         * same as [PartyService.update].
         */
        @MustBeClosed fun update(id: String): HttpResponse = update(id, PartyUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: PartyUpdateParams = PartyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(id: String, params: PartyUpdateParams = PartyUpdateParams.none()): HttpResponse =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PartyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(params: PartyUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponse =
            update(id, PartyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/parties`, but is otherwise the same as
         * [PartyService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(PartyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PartyListParams = PartyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: PartyListParams = PartyListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(PartyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/parties/{id}/payment-methods`, but is
         * otherwise the same as [PartyService.listPaymentMethods].
         */
        @MustBeClosed
        fun listPaymentMethods(id: String): HttpResponse =
            listPaymentMethods(id, PartyListPaymentMethodsParams.none())

        /** @see listPaymentMethods */
        @MustBeClosed
        fun listPaymentMethods(
            id: String,
            params: PartyListPaymentMethodsParams = PartyListPaymentMethodsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = listPaymentMethods(params.toBuilder().id(id).build(), requestOptions)

        /** @see listPaymentMethods */
        @MustBeClosed
        fun listPaymentMethods(
            id: String,
            params: PartyListPaymentMethodsParams = PartyListPaymentMethodsParams.none(),
        ): HttpResponse = listPaymentMethods(id, params, RequestOptions.none())

        /** @see listPaymentMethods */
        @MustBeClosed
        fun listPaymentMethods(
            params: PartyListPaymentMethodsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listPaymentMethods */
        @MustBeClosed
        fun listPaymentMethods(params: PartyListPaymentMethodsParams): HttpResponse =
            listPaymentMethods(params, RequestOptions.none())

        /** @see listPaymentMethods */
        @MustBeClosed
        fun listPaymentMethods(id: String, requestOptions: RequestOptions): HttpResponse =
            listPaymentMethods(id, PartyListPaymentMethodsParams.none(), requestOptions)
    }
}
