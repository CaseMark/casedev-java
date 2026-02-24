// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.agent.v1.AgentServiceAsync
import dev.case.api.services.async.agent.v1.AgentServiceAsyncImpl
import dev.case.api.services.async.agent.v1.RunServiceAsync
import dev.case.api.services.async.agent.v1.RunServiceAsyncImpl
import java.util.function.Consumer

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val agents: AgentServiceAsync by lazy { AgentServiceAsyncImpl(clientOptions) }

    private val run: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun agents(): AgentServiceAsync = agents

    override fun run(): RunServiceAsync = run

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val agents: AgentServiceAsync.WithRawResponse by lazy {
            AgentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val run: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun agents(): AgentServiceAsync.WithRawResponse = agents

        override fun run(): RunServiceAsync.WithRawResponse = run
    }
}
