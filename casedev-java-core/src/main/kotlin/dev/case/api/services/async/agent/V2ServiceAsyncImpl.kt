// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.agent.v2.ChatServiceAsync
import dev.case.api.services.async.agent.v2.ChatServiceAsyncImpl
import dev.case.api.services.async.agent.v2.ExecuteServiceAsync
import dev.case.api.services.async.agent.v2.ExecuteServiceAsyncImpl
import dev.case.api.services.async.agent.v2.RunServiceAsync
import dev.case.api.services.async.agent.v2.RunServiceAsyncImpl
import java.util.function.Consumer

class V2ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V2ServiceAsync {

    private val withRawResponse: V2ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val run: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    private val execute: ExecuteServiceAsync by lazy { ExecuteServiceAsyncImpl(clientOptions) }

    private val chat: ChatServiceAsync by lazy { ChatServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V2ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ServiceAsync =
        V2ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    override fun run(): RunServiceAsync = run

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    override fun execute(): ExecuteServiceAsync = execute

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    override fun chat(): ChatServiceAsync = chat

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2ServiceAsync.WithRawResponse {

        private val run: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val execute: ExecuteServiceAsync.WithRawResponse by lazy {
            ExecuteServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val chat: ChatServiceAsync.WithRawResponse by lazy {
            ChatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V2ServiceAsync.WithRawResponse =
            V2ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        override fun run(): RunServiceAsync.WithRawResponse = run

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        override fun execute(): ExecuteServiceAsync.WithRawResponse = execute

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        override fun chat(): ChatServiceAsync.WithRawResponse = chat
    }
}
