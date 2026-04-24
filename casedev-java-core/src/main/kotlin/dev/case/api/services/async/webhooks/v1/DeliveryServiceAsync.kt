// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.webhooks.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.webhooks.v1.deliveries.DeliveryListParams
import dev.case.api.models.webhooks.v1.deliveries.DeliveryReplayParams
import dev.case.api.models.webhooks.v1.deliveries.DeliveryRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Webhook endpoint management */
interface DeliveryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeliveryServiceAsync

    /** Get webhook delivery */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, DeliveryRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DeliveryRetrieveParams = DeliveryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DeliveryRetrieveParams = DeliveryRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DeliveryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: DeliveryRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, DeliveryRetrieveParams.none(), requestOptions)

    /**
     * Returns delivery attempts for the organization, newest first. Filter by endpoint_id or status
     * to narrow results.
     */
    fun list(): CompletableFuture<Void?> = list(DeliveryListParams.none())

    /** @see list */
    fun list(
        params: DeliveryListParams = DeliveryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: DeliveryListParams = DeliveryListParams.none()): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(DeliveryListParams.none(), requestOptions)

    /**
     * Re-sends the original event to its endpoint. The payload is reconstructed from the delivery
     * record (same eventId, eventType, and occurred_at). Replay deliveries include a Case.dev
     * replay marker header so receivers can distinguish replays from first-time deliveries. Uses
     * the endpoint's current signing secret — not the one in force at the original delivery time.
     */
    fun replay(id: String): CompletableFuture<Void?> = replay(id, DeliveryReplayParams.none())

    /** @see replay */
    fun replay(
        id: String,
        params: DeliveryReplayParams = DeliveryReplayParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = replay(params.toBuilder().id(id).build(), requestOptions)

    /** @see replay */
    fun replay(
        id: String,
        params: DeliveryReplayParams = DeliveryReplayParams.none(),
    ): CompletableFuture<Void?> = replay(id, params, RequestOptions.none())

    /** @see replay */
    fun replay(
        params: DeliveryReplayParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see replay */
    fun replay(params: DeliveryReplayParams): CompletableFuture<Void?> =
        replay(params, RequestOptions.none())

    /** @see replay */
    fun replay(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        replay(id, DeliveryReplayParams.none(), requestOptions)

    /**
     * A view of [DeliveryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DeliveryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhooks/v1/deliveries/{id}`, but is otherwise the
         * same as [DeliveryServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, DeliveryRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DeliveryRetrieveParams = DeliveryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DeliveryRetrieveParams = DeliveryRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DeliveryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: DeliveryRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, DeliveryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks/v1/deliveries`, but is otherwise the same
         * as [DeliveryServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(DeliveryListParams.none())

        /** @see list */
        fun list(
            params: DeliveryListParams = DeliveryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: DeliveryListParams = DeliveryListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(DeliveryListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /webhooks/v1/deliveries/{id}/replay`, but is
         * otherwise the same as [DeliveryServiceAsync.replay].
         */
        fun replay(id: String): CompletableFuture<HttpResponse> =
            replay(id, DeliveryReplayParams.none())

        /** @see replay */
        fun replay(
            id: String,
            params: DeliveryReplayParams = DeliveryReplayParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            replay(params.toBuilder().id(id).build(), requestOptions)

        /** @see replay */
        fun replay(
            id: String,
            params: DeliveryReplayParams = DeliveryReplayParams.none(),
        ): CompletableFuture<HttpResponse> = replay(id, params, RequestOptions.none())

        /** @see replay */
        fun replay(
            params: DeliveryReplayParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see replay */
        fun replay(params: DeliveryReplayParams): CompletableFuture<HttpResponse> =
            replay(params, RequestOptions.none())

        /** @see replay */
        fun replay(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            replay(id, DeliveryReplayParams.none(), requestOptions)
    }
}
