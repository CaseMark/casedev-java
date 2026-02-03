// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.payments.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.payments.v1.parties.PartyCreateParams
import dev.casedev.models.payments.v1.parties.PartyListParams
import dev.casedev.models.payments.v1.parties.PartyListPaymentMethodsParams
import dev.casedev.models.payments.v1.parties.PartyRetrieveParams
import dev.casedev.models.payments.v1.parties.PartyUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PartyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PartyServiceAsync

    /** Create a new payment party (client, vendor, counsel, etc.) */
    fun create(params: PartyCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PartyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get party details by ID */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, PartyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PartyRetrieveParams = PartyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: PartyRetrieveParams = PartyRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PartyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: PartyRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, PartyRetrieveParams.none(), requestOptions)

    /** Update party details */
    fun update(id: String): CompletableFuture<Void?> = update(id, PartyUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: PartyUpdateParams = PartyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: PartyUpdateParams = PartyUpdateParams.none(),
    ): CompletableFuture<Void?> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PartyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see update */
    fun update(params: PartyUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(id, PartyUpdateParams.none(), requestOptions)

    /** List payment parties with optional filters */
    fun list(): CompletableFuture<Void?> = list(PartyListParams.none())

    /** @see list */
    fun list(
        params: PartyListParams = PartyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: PartyListParams = PartyListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(PartyListParams.none(), requestOptions)

    /** List saved payment methods for a party (from Stripe) */
    fun listPaymentMethods(id: String): CompletableFuture<Void?> =
        listPaymentMethods(id, PartyListPaymentMethodsParams.none())

    /** @see listPaymentMethods */
    fun listPaymentMethods(
        id: String,
        params: PartyListPaymentMethodsParams = PartyListPaymentMethodsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        listPaymentMethods(params.toBuilder().id(id).build(), requestOptions)

    /** @see listPaymentMethods */
    fun listPaymentMethods(
        id: String,
        params: PartyListPaymentMethodsParams = PartyListPaymentMethodsParams.none(),
    ): CompletableFuture<Void?> = listPaymentMethods(id, params, RequestOptions.none())

    /** @see listPaymentMethods */
    fun listPaymentMethods(
        params: PartyListPaymentMethodsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see listPaymentMethods */
    fun listPaymentMethods(params: PartyListPaymentMethodsParams): CompletableFuture<Void?> =
        listPaymentMethods(params, RequestOptions.none())

    /** @see listPaymentMethods */
    fun listPaymentMethods(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        listPaymentMethods(id, PartyListPaymentMethodsParams.none(), requestOptions)

    /** A view of [PartyServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PartyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /payments/v1/parties`, but is otherwise the same as
         * [PartyServiceAsync.create].
         */
        fun create(params: PartyCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PartyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /payments/v1/parties/{id}`, but is otherwise the
         * same as [PartyServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, PartyRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PartyRetrieveParams = PartyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: PartyRetrieveParams = PartyRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PartyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: PartyRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, PartyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /payments/v1/parties/{id}`, but is otherwise the
         * same as [PartyServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponse> =
            update(id, PartyUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: PartyUpdateParams = PartyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: PartyUpdateParams = PartyUpdateParams.none(),
        ): CompletableFuture<HttpResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PartyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see update */
        fun update(params: PartyUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            update(id, PartyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/parties`, but is otherwise the same as
         * [PartyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(PartyListParams.none())

        /** @see list */
        fun list(
            params: PartyListParams = PartyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: PartyListParams = PartyListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(PartyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/v1/parties/{id}/payment-methods`, but is
         * otherwise the same as [PartyServiceAsync.listPaymentMethods].
         */
        fun listPaymentMethods(id: String): CompletableFuture<HttpResponse> =
            listPaymentMethods(id, PartyListPaymentMethodsParams.none())

        /** @see listPaymentMethods */
        fun listPaymentMethods(
            id: String,
            params: PartyListPaymentMethodsParams = PartyListPaymentMethodsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            listPaymentMethods(params.toBuilder().id(id).build(), requestOptions)

        /** @see listPaymentMethods */
        fun listPaymentMethods(
            id: String,
            params: PartyListPaymentMethodsParams = PartyListPaymentMethodsParams.none(),
        ): CompletableFuture<HttpResponse> = listPaymentMethods(id, params, RequestOptions.none())

        /** @see listPaymentMethods */
        fun listPaymentMethods(
            params: PartyListPaymentMethodsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listPaymentMethods */
        fun listPaymentMethods(
            params: PartyListPaymentMethodsParams
        ): CompletableFuture<HttpResponse> = listPaymentMethods(params, RequestOptions.none())

        /** @see listPaymentMethods */
        fun listPaymentMethods(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            listPaymentMethods(id, PartyListPaymentMethodsParams.none(), requestOptions)
    }
}
