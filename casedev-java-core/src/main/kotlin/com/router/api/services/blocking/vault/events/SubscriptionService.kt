// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.vault.events

import com.google.errorprone.annotations.MustBeClosed
import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponse
import com.router.api.models.vault.events.subscriptions.SubscriptionCreateParams
import com.router.api.models.vault.events.subscriptions.SubscriptionDeleteParams
import com.router.api.models.vault.events.subscriptions.SubscriptionListParams
import com.router.api.models.vault.events.subscriptions.SubscriptionTestParams
import com.router.api.models.vault.events.subscriptions.SubscriptionUpdateParams
import java.util.function.Consumer

interface SubscriptionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SubscriptionService

    /**
     * Creates a webhook subscription for vault lifecycle events. Optional object filters can limit
     * notifications to specific vault objects.
     */
    fun create(id: String, params: SubscriptionCreateParams) =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: SubscriptionCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Updates callback URL, filters, active state, or signing secret for a vault webhook
     * subscription.
     */
    fun update(subscriptionId: String, params: SubscriptionUpdateParams) =
        update(subscriptionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        subscriptionId: String,
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see update */
    fun update(params: SubscriptionUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Lists webhook subscriptions configured for a vault. */
    fun list(id: String) = list(id, SubscriptionListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: SubscriptionListParams = SubscriptionListParams.none()) =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(params: SubscriptionListParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see list */
    fun list(params: SubscriptionListParams) = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions) =
        list(id, SubscriptionListParams.none(), requestOptions)

    /** Deactivates a vault webhook subscription. */
    fun delete(subscriptionId: String, params: SubscriptionDeleteParams) =
        delete(subscriptionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        subscriptionId: String,
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see delete */
    fun delete(params: SubscriptionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Delivers a test event to a single vault webhook subscription. Uses the same payload shape,
     * signature, and retry behavior as production event delivery.
     */
    fun test(subscriptionId: String, params: SubscriptionTestParams) =
        test(subscriptionId, params, RequestOptions.none())

    /** @see test */
    fun test(
        subscriptionId: String,
        params: SubscriptionTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = test(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see test */
    fun test(params: SubscriptionTestParams) = test(params, RequestOptions.none())

    /** @see test */
    fun test(params: SubscriptionTestParams, requestOptions: RequestOptions = RequestOptions.none())

    /**
     * A view of [SubscriptionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SubscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /vault/{id}/events/subscriptions`, but is otherwise
         * the same as [SubscriptionService.create].
         */
        @MustBeClosed
        fun create(id: String, params: SubscriptionCreateParams): HttpResponse =
            create(id, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            id: String,
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: SubscriptionCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `patch
         * /vault/{id}/events/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionService.update].
         */
        @MustBeClosed
        fun update(subscriptionId: String, params: SubscriptionUpdateParams): HttpResponse =
            update(subscriptionId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            subscriptionId: String,
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SubscriptionUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /vault/{id}/events/subscriptions`, but is otherwise
         * the same as [SubscriptionService.list].
         */
        @MustBeClosed fun list(id: String): HttpResponse = list(id, SubscriptionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: SubscriptionListParams = SubscriptionListParams.none(),
        ): HttpResponse = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: SubscriptionListParams): HttpResponse = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponse =
            list(id, SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /vault/{id}/events/subscriptions/{subscriptionId}`, but is otherwise the same as
         * [SubscriptionService.delete].
         */
        @MustBeClosed
        fun delete(subscriptionId: String, params: SubscriptionDeleteParams): HttpResponse =
            delete(subscriptionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            subscriptionId: String,
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: SubscriptionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /vault/{id}/events/subscriptions/{subscriptionId}/test`, but is otherwise the same as
         * [SubscriptionService.test].
         */
        @MustBeClosed
        fun test(subscriptionId: String, params: SubscriptionTestParams): HttpResponse =
            test(subscriptionId, params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(
            subscriptionId: String,
            params: SubscriptionTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            test(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see test */
        @MustBeClosed
        fun test(params: SubscriptionTestParams): HttpResponse = test(params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(
            params: SubscriptionTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
