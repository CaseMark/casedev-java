// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.memory.V1ServiceAsync
import dev.case.api.services.async.memory.V1ServiceAsyncImpl
import java.util.function.Consumer

class MemoryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MemoryServiceAsync {

    private val withRawResponse: MemoryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MemoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MemoryServiceAsync =
        MemoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Persistent memory for AI agents with semantic search and 12 generic indexed tag fields */
    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MemoryServiceAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MemoryServiceAsync.WithRawResponse =
            MemoryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Persistent memory for AI agents with semantic search and 12 generic indexed tag fields
         */
        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
