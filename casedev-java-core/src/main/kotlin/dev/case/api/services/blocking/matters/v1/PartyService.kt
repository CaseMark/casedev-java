// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.parties.PartyCreateParams
import dev.case.api.models.matters.v1.parties.PartyListParams
import dev.case.api.models.matters.v1.parties.PartyRetrieveParams
import dev.case.api.models.matters.v1.parties.PartyUpdateParams
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
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

    /** Create a reusable legal party for the authenticated organization. */
    fun create(params: PartyCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: PartyCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Get a reusable legal party by ID. */
    fun retrieve(partyId: String) = retrieve(partyId, PartyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        partyId: String,
        params: PartyRetrieveParams = PartyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().partyId(partyId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(partyId: String, params: PartyRetrieveParams = PartyRetrieveParams.none()) =
        retrieve(partyId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PartyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: PartyRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(partyId: String, requestOptions: RequestOptions) =
        retrieve(partyId, PartyRetrieveParams.none(), requestOptions)

    /** Update a reusable legal party. */
    fun update(partyId: String) = update(partyId, PartyUpdateParams.none())

    /** @see update */
    fun update(
        partyId: String,
        params: PartyUpdateParams = PartyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().partyId(partyId).build(), requestOptions)

    /** @see update */
    fun update(partyId: String, params: PartyUpdateParams = PartyUpdateParams.none()) =
        update(partyId, params, RequestOptions.none())

    /** @see update */
    fun update(params: PartyUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see update */
    fun update(params: PartyUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(partyId: String, requestOptions: RequestOptions) =
        update(partyId, PartyUpdateParams.none(), requestOptions)

    /** List reusable legal parties for the authenticated organization. */
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

    /** A view of [PartyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PartyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1/parties`, but is otherwise the same as
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
         * Returns a raw HTTP response for `get /matters/v1/parties/{partyId}`, but is otherwise the
         * same as [PartyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(partyId: String): HttpResponse = retrieve(partyId, PartyRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            partyId: String,
            params: PartyRetrieveParams = PartyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().partyId(partyId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            partyId: String,
            params: PartyRetrieveParams = PartyRetrieveParams.none(),
        ): HttpResponse = retrieve(partyId, params, RequestOptions.none())

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
        fun retrieve(partyId: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(partyId, PartyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /matters/v1/parties/{partyId}`, but is otherwise
         * the same as [PartyService.update].
         */
        @MustBeClosed
        fun update(partyId: String): HttpResponse = update(partyId, PartyUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            partyId: String,
            params: PartyUpdateParams = PartyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().partyId(partyId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            partyId: String,
            params: PartyUpdateParams = PartyUpdateParams.none(),
        ): HttpResponse = update(partyId, params, RequestOptions.none())

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
        fun update(partyId: String, requestOptions: RequestOptions): HttpResponse =
            update(partyId, PartyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /matters/v1/parties`, but is otherwise the same as
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
    }
}
