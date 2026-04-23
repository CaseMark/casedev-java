// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.webhooks

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.webhooks.v1.DeliveryServiceAsync
import dev.case.api.services.async.webhooks.v1.DeliveryServiceAsyncImpl
import dev.case.api.services.async.webhooks.v1.EndpointServiceAsync
import dev.case.api.services.async.webhooks.v1.EndpointServiceAsyncImpl
import dev.case.api.services.async.webhooks.v1.EventTypeServiceAsync
import dev.case.api.services.async.webhooks.v1.EventTypeServiceAsyncImpl
import java.util.function.Consumer

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val endpoints: EndpointServiceAsync by lazy { EndpointServiceAsyncImpl(clientOptions) }

    private val deliveries: DeliveryServiceAsync by lazy { DeliveryServiceAsyncImpl(clientOptions) }

    private val eventTypes: EventTypeServiceAsync by lazy {
        EventTypeServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Webhook endpoint management */
    override fun endpoints(): EndpointServiceAsync = endpoints

    /** Webhook endpoint management */
    override fun deliveries(): DeliveryServiceAsync = deliveries

    /** Webhook endpoint management */
    override fun eventTypes(): EventTypeServiceAsync = eventTypes

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val endpoints: EndpointServiceAsync.WithRawResponse by lazy {
            EndpointServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val deliveries: DeliveryServiceAsync.WithRawResponse by lazy {
            DeliveryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val eventTypes: EventTypeServiceAsync.WithRawResponse by lazy {
            EventTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Webhook endpoint management */
        override fun endpoints(): EndpointServiceAsync.WithRawResponse = endpoints

        /** Webhook endpoint management */
        override fun deliveries(): DeliveryServiceAsync.WithRawResponse = deliveries

        /** Webhook endpoint management */
        override fun eventTypes(): EventTypeServiceAsync.WithRawResponse = eventTypes
    }
}
