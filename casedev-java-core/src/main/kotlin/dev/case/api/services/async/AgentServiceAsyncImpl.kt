// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.agent.SkillServiceAsync
import dev.case.api.services.async.agent.SkillServiceAsyncImpl
import dev.case.api.services.async.agent.V1ServiceAsync
import dev.case.api.services.async.agent.V1ServiceAsyncImpl
import java.util.function.Consumer

class AgentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentServiceAsync {

    private val withRawResponse: AgentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val skills: SkillServiceAsync by lazy { SkillServiceAsyncImpl(clientOptions) }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AgentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentServiceAsync =
        AgentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun skills(): SkillServiceAsync = skills

    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentServiceAsync.WithRawResponse {

        private val skills: SkillServiceAsync.WithRawResponse by lazy {
            SkillServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentServiceAsync.WithRawResponse =
            AgentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun skills(): SkillServiceAsync.WithRawResponse = skills

        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
