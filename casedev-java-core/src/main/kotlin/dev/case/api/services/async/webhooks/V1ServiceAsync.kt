// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.webhooks

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.webhooks.v1.DeliveryServiceAsync
import dev.case.api.services.async.webhooks.v1.EndpointServiceAsync
import dev.case.api.services.async.webhooks.v1.EventTypeServiceAsync
import java.util.function.Consumer

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

    /** Webhook endpoint management */
    fun endpoints(): EndpointServiceAsync

    /** Webhook endpoint management */
    fun deliveries(): DeliveryServiceAsync

    /** Webhook endpoint management */
    fun eventTypes(): EventTypeServiceAsync

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /** Webhook endpoint management */
        fun endpoints(): EndpointServiceAsync.WithRawResponse

        /** Webhook endpoint management */
        fun deliveries(): DeliveryServiceAsync.WithRawResponse

        /** Webhook endpoint management */
        fun eventTypes(): EventTypeServiceAsync.WithRawResponse
    }
}
