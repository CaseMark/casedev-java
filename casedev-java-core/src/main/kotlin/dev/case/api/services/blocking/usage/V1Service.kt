// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.usage

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.usage.v1.V1RetrieveParams
import dev.case.api.services.blocking.usage.v1.SubscriptionService
import java.util.function.Consumer

/** Usage reporting and webhook subscriptions */
interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    /** Usage reporting and webhook subscriptions */
    fun subscriptions(): SubscriptionService

    /**
     * Returns customer-facing usage metrics and costs for the requested period. Supports summary
     * totals and daily buckets for timestamped usage sources. Vault storage is intentionally
     * omitted from totals because it is not yet periodized for arbitrary windows.
     */
    fun retrieve() = retrieve(V1RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: V1RetrieveParams = V1RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams = V1RetrieveParams.none()) =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions) = retrieve(V1RetrieveParams.none(), requestOptions)

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /** Usage reporting and webhook subscriptions */
        fun subscriptions(): SubscriptionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /usage/v1`, but is otherwise the same as
         * [V1Service.retrieve].
         */
        @MustBeClosed fun retrieve(): HttpResponse = retrieve(V1RetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: V1RetrieveParams = V1RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: V1RetrieveParams = V1RetrieveParams.none()): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponse =
            retrieve(V1RetrieveParams.none(), requestOptions)
    }
}
