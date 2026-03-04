// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.vault

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.vault.events.SubscriptionServiceAsync
import dev.case.api.services.async.vault.events.SubscriptionServiceAsyncImpl
import java.util.function.Consumer

class EventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EventServiceAsync {

    private val withRawResponse: EventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val subscriptions: SubscriptionServiceAsync by lazy {
        SubscriptionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): EventServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EventServiceAsync =
        EventServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Secure document storage with semantic search and GraphRAG */
    override fun subscriptions(): SubscriptionServiceAsync = subscriptions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventServiceAsync.WithRawResponse {

        private val subscriptions: SubscriptionServiceAsync.WithRawResponse by lazy {
            SubscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EventServiceAsync.WithRawResponse =
            EventServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Secure document storage with semantic search and GraphRAG */
        override fun subscriptions(): SubscriptionServiceAsync.WithRawResponse = subscriptions
    }
}
