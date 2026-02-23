// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.vault.events

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponse
import com.router.api.models.vault.events.subscriptions.SubscriptionCreateParams
import com.router.api.models.vault.events.subscriptions.SubscriptionDeleteParams
import com.router.api.models.vault.events.subscriptions.SubscriptionListParams
import com.router.api.models.vault.events.subscriptions.SubscriptionTestParams
import com.router.api.models.vault.events.subscriptions.SubscriptionUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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

    /**
     * Creates a webhook subscription for vault lifecycle events. Optional object filters can limit
     * notifications to specific vault objects.
     */
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

    /**
     * Updates callback URL, filters, active state, or signing secret for a vault webhook
     * subscription.
     */
    fun update(subscriptionId: String, params: SubscriptionUpdateParams): CompletableFuture<Void?> =
        update(subscriptionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        subscriptionId: String,
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see update */
    fun update(params: SubscriptionUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Lists webhook subscriptions configured for a vault. */
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

    /** Deactivates a vault webhook subscription. */
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
     * Delivers a test event to a single vault webhook subscription. Uses the same payload shape,
     * signature, and retry behavior as production event delivery.
     */
    fun test(subscriptionId: String, params: SubscriptionTestParams): CompletableFuture<Void?> =
        test(subscriptionId, params, RequestOptions.none())

    /** @see test */
    fun test(
        subscriptionId: String,
        params: SubscriptionTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        test(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see test */
    fun test(params: SubscriptionTestParams): CompletableFuture<Void?> =
        test(params, RequestOptions.none())

    /** @see test */
    fun test(
        params: SubscriptionTestParams,
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
         * Returns a raw HTTP response for `post /vault/{id}/events/subscriptions`, but is otherwise
         * the same as [SubscriptionServiceAsync.create].
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
         * Returns a raw HTTP response for `patch
         * /vault/{id}/events/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionServiceAsync.update].
         */
        fun update(
            subscriptionId: String,
            params: SubscriptionUpdateParams,
        ): CompletableFuture<HttpResponse> = update(subscriptionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            subscriptionId: String,
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see update */
        fun update(params: SubscriptionUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /vault/{id}/events/subscriptions`, but is otherwise
         * the same as [SubscriptionServiceAsync.list].
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
         * /vault/{id}/events/subscriptions/{subscriptionId}`, but is otherwise the same as
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

        /**
         * Returns a raw HTTP response for `post
         * /vault/{id}/events/subscriptions/{subscriptionId}/test`, but is otherwise the same as
         * [SubscriptionServiceAsync.test].
         */
        fun test(
            subscriptionId: String,
            params: SubscriptionTestParams,
        ): CompletableFuture<HttpResponse> = test(subscriptionId, params, RequestOptions.none())

        /** @see test */
        fun test(
            subscriptionId: String,
            params: SubscriptionTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            test(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see test */
        fun test(params: SubscriptionTestParams): CompletableFuture<HttpResponse> =
            test(params, RequestOptions.none())

        /** @see test */
        fun test(
            params: SubscriptionTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
