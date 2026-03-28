// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters.v1.events

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.events.subscriptions.SubscriptionCreateParams
import dev.case.api.models.matters.v1.events.subscriptions.SubscriptionDeleteParams
import dev.case.api.models.matters.v1.events.subscriptions.SubscriptionListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
interface SubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionServiceAsync

    /** Creates a webhook subscription for matter and work-item events. */
    fun create(id: String, params: SubscriptionCreateParams): CompletableFuture<Void?> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: SubscriptionCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Lists webhook subscriptions configured for a matter. */
    fun list(id: String): CompletableFuture<Void?> = list(id, SubscriptionListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: SubscriptionListParams = SubscriptionListParams.none(),
    ): CompletableFuture<Void?> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(params: SubscriptionListParams): CompletableFuture<Void?> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(id, SubscriptionListParams.none(), requestOptions)

    /** Deactivates a matter webhook subscription. */
    fun delete(subscriptionId: String, params: SubscriptionDeleteParams): CompletableFuture<Void?> =
        delete(subscriptionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        subscriptionId: String,
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: SubscriptionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [SubscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /matters/v1/{id}/events/subscriptions`, but is
         * otherwise the same as [SubscriptionServiceAsync.create].
         */
        fun create(id: String, params: SubscriptionCreateParams): CompletableFuture<HttpResponse> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(params: SubscriptionCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /matters/v1/{id}/events/subscriptions`, but is
         * otherwise the same as [SubscriptionServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponse> =
            list(id, SubscriptionListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> = list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: SubscriptionListParams = SubscriptionListParams.none(),
        ): CompletableFuture<HttpResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(params: SubscriptionListParams): CompletableFuture<HttpResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(id, SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /matters/v1/{id}/events/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionServiceAsync.delete].
         */
        fun delete(
            subscriptionId: String,
            params: SubscriptionDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(subscriptionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            subscriptionId: String,
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see delete */
        fun delete(params: SubscriptionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
