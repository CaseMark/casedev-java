// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking

import dev.case.api.core.ClientOptions
import dev.case.api.services.blocking.agent.V1Service
import dev.case.api.services.blocking.agent.V1ServiceImpl
import dev.case.api.services.blocking.agent.V2Service
import dev.case.api.services.blocking.agent.V2ServiceImpl
import java.util.function.Consumer

class AgentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentService {

    private val withRawResponse: AgentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    private val v2: V2Service by lazy { V2ServiceImpl(clientOptions) }

    override fun withRawResponse(): AgentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentService =
        AgentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1Service = v1

    override fun v2(): V2Service = v2

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val v2: V2Service.WithRawResponse by lazy {
            V2ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentService.WithRawResponse =
            AgentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1Service.WithRawResponse = v1

        override fun v2(): V2Service.WithRawResponse = v2
    }
}
