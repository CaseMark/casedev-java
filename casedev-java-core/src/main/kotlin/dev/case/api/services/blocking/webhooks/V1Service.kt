// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.webhooks

import dev.case.api.core.ClientOptions
import dev.case.api.services.blocking.webhooks.v1.DeliveryService
import dev.case.api.services.blocking.webhooks.v1.EndpointService
import dev.case.api.services.blocking.webhooks.v1.EventTypeService
import java.util.function.Consumer

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

    /** Webhook endpoint management */
    fun endpoints(): EndpointService

    /** Webhook endpoint management */
    fun deliveries(): DeliveryService

    /** Webhook endpoint management */
    fun eventTypes(): EventTypeService

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /** Webhook endpoint management */
        fun endpoints(): EndpointService.WithRawResponse

        /** Webhook endpoint management */
        fun deliveries(): DeliveryService.WithRawResponse

        /** Webhook endpoint management */
        fun eventTypes(): EventTypeService.WithRawResponse
    }
}
