// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent

import dev.case.api.core.ClientOptions
import dev.case.api.services.blocking.agent.v1.AgentService
import dev.case.api.services.blocking.agent.v1.AgentServiceImpl
import dev.case.api.services.blocking.agent.v1.ExecuteService
import dev.case.api.services.blocking.agent.v1.ExecuteServiceImpl
import dev.case.api.services.blocking.agent.v1.RunService
import dev.case.api.services.blocking.agent.v1.RunServiceImpl
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val agents: AgentService by lazy { AgentServiceImpl(clientOptions) }

    private val run: RunService by lazy { RunServiceImpl(clientOptions) }

    private val execute: ExecuteService by lazy { ExecuteServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun agents(): AgentService = agents

    override fun run(): RunService = run

    override fun execute(): ExecuteService = execute

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val agents: AgentService.WithRawResponse by lazy {
            AgentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val run: RunService.WithRawResponse by lazy {
            RunServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val execute: ExecuteService.WithRawResponse by lazy {
            ExecuteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun agents(): AgentService.WithRawResponse = agents

        override fun run(): RunService.WithRawResponse = run

        override fun execute(): ExecuteService.WithRawResponse = execute
    }
}
