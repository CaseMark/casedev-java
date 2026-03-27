// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.agent.V1ServiceAsync
import dev.case.api.services.async.agent.V1ServiceAsyncImpl
import dev.case.api.services.async.agent.V2ServiceAsync
import dev.case.api.services.async.agent.V2ServiceAsyncImpl
import java.util.function.Consumer

class AgentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentServiceAsync {

    private val withRawResponse: AgentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    private val v2: V2ServiceAsync by lazy { V2ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AgentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentServiceAsync =
        AgentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1ServiceAsync = v1

    override fun v2(): V2ServiceAsync = v2

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentServiceAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val v2: V2ServiceAsync.WithRawResponse by lazy {
            V2ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentServiceAsync.WithRawResponse =
            AgentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1ServiceAsync.WithRawResponse = v1

        override fun v2(): V2ServiceAsync.WithRawResponse = v2
    }
}
