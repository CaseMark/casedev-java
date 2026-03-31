// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1.events

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.matters.v1.events.subscriptions.SubscriptionCreateParams
import dev.case.api.models.matters.v1.events.subscriptions.SubscriptionDeleteParams
import dev.case.api.models.matters.v1.events.subscriptions.SubscriptionListParams
import java.util.function.Consumer

/** Matter-native legal workspaces and orchestration primitives */
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

    /** Creates a webhook subscription for matter and work-item events. */
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

    /** Lists webhook subscriptions configured for a matter. */
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

    /** Deactivates a matter webhook subscription. */
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
         * Returns a raw HTTP response for `post /matters/v1/{id}/events/subscriptions`, but is
         * otherwise the same as [SubscriptionService.create].
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
         * Returns a raw HTTP response for `get /matters/v1/{id}/events/subscriptions`, but is
         * otherwise the same as [SubscriptionService.list].
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
         * /matters/v1/{id}/events/subscriptions/{subscriptionId}`, but is otherwise the same as
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
    }
}
