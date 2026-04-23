// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.webhooks.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.webhooks.v1.deliveries.DeliveryListParams
import dev.case.api.models.webhooks.v1.deliveries.DeliveryReplayParams
import dev.case.api.models.webhooks.v1.deliveries.DeliveryRetrieveParams
import java.util.function.Consumer

/** Webhook endpoint management */
interface DeliveryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeliveryService

    /** Get webhook delivery */
    fun retrieve(id: String) = retrieve(id, DeliveryRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DeliveryRetrieveParams = DeliveryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: DeliveryRetrieveParams = DeliveryRetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DeliveryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: DeliveryRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, DeliveryRetrieveParams.none(), requestOptions)

    /**
     * Returns delivery attempts for the organization, newest first. Filter by endpoint_id or status
     * to narrow results.
     */
    fun list() = list(DeliveryListParams.none())

    /** @see list */
    fun list(
        params: DeliveryListParams = DeliveryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: DeliveryListParams = DeliveryListParams.none()) =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(DeliveryListParams.none(), requestOptions)

    /**
     * Re-sends the original event to its endpoint. The payload is reconstructed from the delivery
     * record (same eventId, eventType, and occurred_at). The signature header includes
     * `svix-delivery-attempt: replay` so receivers can distinguish replays from first-time
     * deliveries. Uses the endpoint's current signing secret — not the one in force at the original
     * delivery time.
     */
    fun replay(id: String) = replay(id, DeliveryReplayParams.none())

    /** @see replay */
    fun replay(
        id: String,
        params: DeliveryReplayParams = DeliveryReplayParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = replay(params.toBuilder().id(id).build(), requestOptions)

    /** @see replay */
    fun replay(id: String, params: DeliveryReplayParams = DeliveryReplayParams.none()) =
        replay(id, params, RequestOptions.none())

    /** @see replay */
    fun replay(params: DeliveryReplayParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see replay */
    fun replay(params: DeliveryReplayParams) = replay(params, RequestOptions.none())

    /** @see replay */
    fun replay(id: String, requestOptions: RequestOptions) =
        replay(id, DeliveryReplayParams.none(), requestOptions)

    /** A view of [DeliveryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeliveryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhooks/v1/deliveries/{id}`, but is otherwise the
         * same as [DeliveryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponse = retrieve(id, DeliveryRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DeliveryRetrieveParams = DeliveryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DeliveryRetrieveParams = DeliveryRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DeliveryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DeliveryRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, DeliveryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks/v1/deliveries`, but is otherwise the same
         * as [DeliveryService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(DeliveryListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DeliveryListParams = DeliveryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: DeliveryListParams = DeliveryListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(DeliveryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /webhooks/v1/deliveries/{id}/replay`, but is
         * otherwise the same as [DeliveryService.replay].
         */
        @MustBeClosed fun replay(id: String): HttpResponse = replay(id, DeliveryReplayParams.none())

        /** @see replay */
        @MustBeClosed
        fun replay(
            id: String,
            params: DeliveryReplayParams = DeliveryReplayParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = replay(params.toBuilder().id(id).build(), requestOptions)

        /** @see replay */
        @MustBeClosed
        fun replay(
            id: String,
            params: DeliveryReplayParams = DeliveryReplayParams.none(),
        ): HttpResponse = replay(id, params, RequestOptions.none())

        /** @see replay */
        @MustBeClosed
        fun replay(
            params: DeliveryReplayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see replay */
        @MustBeClosed
        fun replay(params: DeliveryReplayParams): HttpResponse =
            replay(params, RequestOptions.none())

        /** @see replay */
        @MustBeClosed
        fun replay(id: String, requestOptions: RequestOptions): HttpResponse =
            replay(id, DeliveryReplayParams.none(), requestOptions)
    }
}
