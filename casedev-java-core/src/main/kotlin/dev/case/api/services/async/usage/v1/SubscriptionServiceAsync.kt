// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.usage.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.usage.v1.subscriptions.SubscriptionCreateParams
import dev.case.api.models.usage.v1.subscriptions.SubscriptionDeleteParams
import dev.case.api.models.usage.v1.subscriptions.SubscriptionListParams
import dev.case.api.models.usage.v1.subscriptions.SubscriptionTestParams
import dev.case.api.models.usage.v1.subscriptions.SubscriptionUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Usage reporting and webhook subscriptions */
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

    /** Creates a webhook subscription for usage, balance, and billing events. */
    fun create(params: SubscriptionCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Updates callback URL, event filters, active state, or signing secret. */
    fun update(subscriptionId: String): CompletableFuture<Void?> =
        update(subscriptionId, SubscriptionUpdateParams.none())

    /** @see update */
    fun update(
        subscriptionId: String,
        params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see update */
    fun update(
        subscriptionId: String,
        params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
    ): CompletableFuture<Void?> = update(subscriptionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see update */
    fun update(params: SubscriptionUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(subscriptionId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(subscriptionId, SubscriptionUpdateParams.none(), requestOptions)

    /** Lists webhook subscriptions configured for usage and billing events. */
    fun list(): CompletableFuture<Void?> = list(SubscriptionListParams.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none()
    ): CompletableFuture<Void?> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<Void?> =
        list(SubscriptionListParams.none(), requestOptions)

    /** Deactivates a usage webhook subscription. */
    fun delete(subscriptionId: String): CompletableFuture<Void?> =
        delete(subscriptionId, SubscriptionDeleteParams.none())

    /** @see delete */
    fun delete(
        subscriptionId: String,
        params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        subscriptionId: String,
        params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(subscriptionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SubscriptionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(subscriptionId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(subscriptionId, SubscriptionDeleteParams.none(), requestOptions)

    /**
     * Delivers a test event to a single usage webhook subscription using the same payload shape and
     * signing behavior as production delivery.
     */
    fun test(subscriptionId: String): CompletableFuture<Void?> =
        test(subscriptionId, SubscriptionTestParams.none())

    /** @see test */
    fun test(
        subscriptionId: String,
        params: SubscriptionTestParams = SubscriptionTestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        test(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see test */
    fun test(
        subscriptionId: String,
        params: SubscriptionTestParams = SubscriptionTestParams.none(),
    ): CompletableFuture<Void?> = test(subscriptionId, params, RequestOptions.none())

    /** @see test */
    fun test(
        params: SubscriptionTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see test */
    fun test(params: SubscriptionTestParams): CompletableFuture<Void?> =
        test(params, RequestOptions.none())

    /** @see test */
    fun test(subscriptionId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        test(subscriptionId, SubscriptionTestParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /usage/v1/subscriptions`, but is otherwise the same
         * as [SubscriptionServiceAsync.create].
         */
        fun create(params: SubscriptionCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `patch /usage/v1/subscriptions/{subscriptionId}`, but is
         * otherwise the same as [SubscriptionServiceAsync.update].
         */
        fun update(subscriptionId: String): CompletableFuture<HttpResponse> =
            update(subscriptionId, SubscriptionUpdateParams.none())

        /** @see update */
        fun update(
            subscriptionId: String,
            params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see update */
        fun update(
            subscriptionId: String,
            params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
        ): CompletableFuture<HttpResponse> = update(subscriptionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see update */
        fun update(params: SubscriptionUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            subscriptionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            update(subscriptionId, SubscriptionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /usage/v1/subscriptions`, but is otherwise the same
         * as [SubscriptionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(SubscriptionListParams.none())

        /** @see list */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /usage/v1/subscriptions/{subscriptionId}`, but is
         * otherwise the same as [SubscriptionServiceAsync.delete].
         */
        fun delete(subscriptionId: String): CompletableFuture<HttpResponse> =
            delete(subscriptionId, SubscriptionDeleteParams.none())

        /** @see delete */
        fun delete(
            subscriptionId: String,
            params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see delete */
        fun delete(
            subscriptionId: String,
            params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(subscriptionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SubscriptionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            subscriptionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(subscriptionId, SubscriptionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /usage/v1/subscriptions/{subscriptionId}/test`, but
         * is otherwise the same as [SubscriptionServiceAsync.test].
         */
        fun test(subscriptionId: String): CompletableFuture<HttpResponse> =
            test(subscriptionId, SubscriptionTestParams.none())

        /** @see test */
        fun test(
            subscriptionId: String,
            params: SubscriptionTestParams = SubscriptionTestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            test(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see test */
        fun test(
            subscriptionId: String,
            params: SubscriptionTestParams = SubscriptionTestParams.none(),
        ): CompletableFuture<HttpResponse> = test(subscriptionId, params, RequestOptions.none())

        /** @see test */
        fun test(
            params: SubscriptionTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see test */
        fun test(params: SubscriptionTestParams): CompletableFuture<HttpResponse> =
            test(params, RequestOptions.none())

        /** @see test */
        fun test(
            subscriptionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            test(subscriptionId, SubscriptionTestParams.none(), requestOptions)
    }
}
