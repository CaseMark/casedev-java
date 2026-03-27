// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent

import dev.case.api.core.ClientOptions
import dev.case.api.services.blocking.agent.v2.ChatService
import dev.case.api.services.blocking.agent.v2.ChatServiceImpl
import dev.case.api.services.blocking.agent.v2.ExecuteService
import dev.case.api.services.blocking.agent.v2.ExecuteServiceImpl
import dev.case.api.services.blocking.agent.v2.RunService
import dev.case.api.services.blocking.agent.v2.RunServiceImpl
import java.util.function.Consumer

class V2ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V2Service {

    private val withRawResponse: V2Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val run: RunService by lazy { RunServiceImpl(clientOptions) }

    private val execute: ExecuteService by lazy { ExecuteServiceImpl(clientOptions) }

    private val chat: ChatService by lazy { ChatServiceImpl(clientOptions) }

    override fun withRawResponse(): V2Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2Service =
        V2ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    override fun run(): RunService = run

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    override fun execute(): ExecuteService = execute

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    override fun chat(): ChatService = chat

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2Service.WithRawResponse {

        private val run: RunService.WithRawResponse by lazy {
            RunServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val execute: ExecuteService.WithRawResponse by lazy {
            ExecuteServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val chat: ChatService.WithRawResponse by lazy {
            ChatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V2Service.WithRawResponse =
            V2ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        override fun run(): RunService.WithRawResponse = run

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        override fun execute(): ExecuteService.WithRawResponse = execute

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        override fun chat(): ChatService.WithRawResponse = chat
    }
}
