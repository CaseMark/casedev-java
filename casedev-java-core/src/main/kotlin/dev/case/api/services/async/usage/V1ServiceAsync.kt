// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.usage

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.usage.v1.V1RetrieveParams
import dev.case.api.services.async.usage.v1.SubscriptionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Usage reporting and webhook subscriptions */
interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

    /** Usage reporting and webhook subscriptions */
    fun subscriptions(): SubscriptionServiceAsync

    /**
     * Returns customer-facing usage metrics and costs for the requested period. Supports summary
     * totals and daily buckets for timestamped usage sources. Vault storage is intentionally
     * omitted from totals because it is not yet periodized for arbitrary windows.
     */
    fun retrieve(): CompletableFuture<Void?> = retrieve(V1RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        params: V1RetrieveParams = V1RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams = V1RetrieveParams.none()): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(V1RetrieveParams.none(), requestOptions)

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /** Usage reporting and webhook subscriptions */
        fun subscriptions(): SubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /usage/v1`, but is otherwise the same as
         * [V1ServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponse> = retrieve(V1RetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            params: V1RetrieveParams = V1RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(
            params: V1RetrieveParams = V1RetrieveParams.none()
        ): CompletableFuture<HttpResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(V1RetrieveParams.none(), requestOptions)
    }
}
