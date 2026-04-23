// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.webhooks

import dev.case.api.core.ClientOptions
import dev.case.api.services.blocking.webhooks.v1.DeliveryService
import dev.case.api.services.blocking.webhooks.v1.DeliveryServiceImpl
import dev.case.api.services.blocking.webhooks.v1.EndpointService
import dev.case.api.services.blocking.webhooks.v1.EndpointServiceImpl
import dev.case.api.services.blocking.webhooks.v1.EventTypeService
import dev.case.api.services.blocking.webhooks.v1.EventTypeServiceImpl
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val endpoints: EndpointService by lazy { EndpointServiceImpl(clientOptions) }

    private val deliveries: DeliveryService by lazy { DeliveryServiceImpl(clientOptions) }

    private val eventTypes: EventTypeService by lazy { EventTypeServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Webhook endpoint management */
    override fun endpoints(): EndpointService = endpoints

    /** Webhook endpoint management */
    override fun deliveries(): DeliveryService = deliveries

    /** Webhook endpoint management */
    override fun eventTypes(): EventTypeService = eventTypes

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val endpoints: EndpointService.WithRawResponse by lazy {
            EndpointServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val deliveries: DeliveryService.WithRawResponse by lazy {
            DeliveryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val eventTypes: EventTypeService.WithRawResponse by lazy {
            EventTypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Webhook endpoint management */
        override fun endpoints(): EndpointService.WithRawResponse = endpoints

        /** Webhook endpoint management */
        override fun deliveries(): DeliveryService.WithRawResponse = deliveries

        /** Webhook endpoint management */
        override fun eventTypes(): EventTypeService.WithRawResponse = eventTypes
    }
}
