// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.parties.PartyCreateParams
import dev.case.api.models.matters.v1.parties.PartyListParams
import dev.case.api.models.matters.v1.parties.PartyRetrieveParams
import dev.case.api.models.matters.v1.parties.PartyUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
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

    /** Create a reusable legal party for the authenticated organization. */
    fun create(params: PartyCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PartyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get a reusable legal party by ID. */
    fun retrieve(partyId: String): CompletableFuture<Void?> =
        retrieve(partyId, PartyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        partyId: String,
        params: PartyRetrieveParams = PartyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        retrieve(params.toBuilder().partyId(partyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        partyId: String,
        params: PartyRetrieveParams = PartyRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(partyId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PartyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: PartyRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(partyId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(partyId, PartyRetrieveParams.none(), requestOptions)

    /** Update a reusable legal party. */
    fun update(partyId: String): CompletableFuture<Void?> =
        update(partyId, PartyUpdateParams.none())

    /** @see update */
    fun update(
        partyId: String,
        params: PartyUpdateParams = PartyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().partyId(partyId).build(), requestOptions)

    /** @see update */
    fun update(
        partyId: String,
        params: PartyUpdateParams = PartyUpdateParams.none(),
    ): CompletableFuture<Void?> = update(partyId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PartyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see update */
    fun update(params: PartyUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(partyId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(partyId, PartyUpdateParams.none(), requestOptions)

    /** List reusable legal parties for the authenticated organization. */
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
         * Returns a raw HTTP response for `post /matters/v1/parties`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /matters/v1/parties/{partyId}`, but is otherwise the
         * same as [PartyServiceAsync.retrieve].
         */
        fun retrieve(partyId: String): CompletableFuture<HttpResponse> =
            retrieve(partyId, PartyRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            partyId: String,
            params: PartyRetrieveParams = PartyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().partyId(partyId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            partyId: String,
            params: PartyRetrieveParams = PartyRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(partyId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PartyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: PartyRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            partyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            retrieve(partyId, PartyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /matters/v1/parties/{partyId}`, but is otherwise
         * the same as [PartyServiceAsync.update].
         */
        fun update(partyId: String): CompletableFuture<HttpResponse> =
            update(partyId, PartyUpdateParams.none())

        /** @see update */
        fun update(
            partyId: String,
            params: PartyUpdateParams = PartyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().partyId(partyId).build(), requestOptions)

        /** @see update */
        fun update(
            partyId: String,
            params: PartyUpdateParams = PartyUpdateParams.none(),
        ): CompletableFuture<HttpResponse> = update(partyId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PartyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see update */
        fun update(params: PartyUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            partyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            update(partyId, PartyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /matters/v1/parties`, but is otherwise the same as
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
    }
}
