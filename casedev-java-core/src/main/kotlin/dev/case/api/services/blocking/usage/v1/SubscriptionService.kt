// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.usage.v1

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.usage.v1.subscriptions.SubscriptionCreateParams
import dev.case.api.models.usage.v1.subscriptions.SubscriptionDeleteParams
import dev.case.api.models.usage.v1.subscriptions.SubscriptionListParams
import dev.case.api.models.usage.v1.subscriptions.SubscriptionTestParams
import dev.case.api.models.usage.v1.subscriptions.SubscriptionUpdateParams
import java.util.function.Consumer

/** Usage reporting and webhook subscriptions */
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

    /** Creates a webhook subscription for usage, balance, and billing events. */
    fun create(params: SubscriptionCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Updates callback URL, event filters, active state, or signing secret. */
    fun update(subscriptionId: String) = update(subscriptionId, SubscriptionUpdateParams.none())

    /** @see update */
    fun update(
        subscriptionId: String,
        params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see update */
    fun update(
        subscriptionId: String,
        params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
    ) = update(subscriptionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see update */
    fun update(params: SubscriptionUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(subscriptionId: String, requestOptions: RequestOptions) =
        update(subscriptionId, SubscriptionUpdateParams.none(), requestOptions)

    /** Lists webhook subscriptions configured for usage and billing events. */
    fun list() = list(SubscriptionListParams.none())

    /** @see list */
    fun list(
        params: SubscriptionListParams = SubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(params: SubscriptionListParams = SubscriptionListParams.none()) =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(SubscriptionListParams.none(), requestOptions)

    /** Deactivates a usage webhook subscription. */
    fun delete(subscriptionId: String) = delete(subscriptionId, SubscriptionDeleteParams.none())

    /** @see delete */
    fun delete(
        subscriptionId: String,
        params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        subscriptionId: String,
        params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
    ) = delete(subscriptionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SubscriptionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: SubscriptionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(subscriptionId: String, requestOptions: RequestOptions) =
        delete(subscriptionId, SubscriptionDeleteParams.none(), requestOptions)

    /**
     * Delivers a test event to a single usage webhook subscription using the same payload shape and
     * signing behavior as production delivery.
     */
    fun test(subscriptionId: String) = test(subscriptionId, SubscriptionTestParams.none())

    /** @see test */
    fun test(
        subscriptionId: String,
        params: SubscriptionTestParams = SubscriptionTestParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = test(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see test */
    fun test(
        subscriptionId: String,
        params: SubscriptionTestParams = SubscriptionTestParams.none(),
    ) = test(subscriptionId, params, RequestOptions.none())

    /** @see test */
    fun test(params: SubscriptionTestParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see test */
    fun test(params: SubscriptionTestParams) = test(params, RequestOptions.none())

    /** @see test */
    fun test(subscriptionId: String, requestOptions: RequestOptions) =
        test(subscriptionId, SubscriptionTestParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /usage/v1/subscriptions`, but is otherwise the same
         * as [SubscriptionService.create].
         */
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
         * Returns a raw HTTP response for `patch /usage/v1/subscriptions/{subscriptionId}`, but is
         * otherwise the same as [SubscriptionService.update].
         */
        @MustBeClosed
        fun update(subscriptionId: String): HttpResponse =
            update(subscriptionId, SubscriptionUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            subscriptionId: String,
            params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            update(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            subscriptionId: String,
            params: SubscriptionUpdateParams = SubscriptionUpdateParams.none(),
        ): HttpResponse = update(subscriptionId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(params: SubscriptionUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(subscriptionId: String, requestOptions: RequestOptions): HttpResponse =
            update(subscriptionId, SubscriptionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /usage/v1/subscriptions`, but is otherwise the same
         * as [SubscriptionService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(SubscriptionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SubscriptionListParams = SubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: SubscriptionListParams = SubscriptionListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(SubscriptionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /usage/v1/subscriptions/{subscriptionId}`, but is
         * otherwise the same as [SubscriptionService.delete].
         */
        @MustBeClosed
        fun delete(subscriptionId: String): HttpResponse =
            delete(subscriptionId, SubscriptionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            subscriptionId: String,
            params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            subscriptionId: String,
            params: SubscriptionDeleteParams = SubscriptionDeleteParams.none(),
        ): HttpResponse = delete(subscriptionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SubscriptionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SubscriptionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(subscriptionId: String, requestOptions: RequestOptions): HttpResponse =
            delete(subscriptionId, SubscriptionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /usage/v1/subscriptions/{subscriptionId}/test`, but
         * is otherwise the same as [SubscriptionService.test].
         */
        @MustBeClosed
        fun test(subscriptionId: String): HttpResponse =
            test(subscriptionId, SubscriptionTestParams.none())

        /** @see test */
        @MustBeClosed
        fun test(
            subscriptionId: String,
            params: SubscriptionTestParams = SubscriptionTestParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            test(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

        /** @see test */
        @MustBeClosed
        fun test(
            subscriptionId: String,
            params: SubscriptionTestParams = SubscriptionTestParams.none(),
        ): HttpResponse = test(subscriptionId, params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(
            params: SubscriptionTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see test */
        @MustBeClosed
        fun test(params: SubscriptionTestParams): HttpResponse = test(params, RequestOptions.none())

        /** @see test */
        @MustBeClosed
        fun test(subscriptionId: String, requestOptions: RequestOptions): HttpResponse =
            test(subscriptionId, SubscriptionTestParams.none(), requestOptions)
    }
}
