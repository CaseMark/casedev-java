// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.agent.skills.NamespaceServiceAsync
import dev.case.api.services.async.agent.skills.NamespaceServiceAsyncImpl
import java.util.function.Consumer

class SkillServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SkillServiceAsync {

    private val withRawResponse: SkillServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val namespaces: NamespaceServiceAsync by lazy {
        NamespaceServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): SkillServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkillServiceAsync =
        SkillServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    override fun namespaces(): NamespaceServiceAsync = namespaces

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SkillServiceAsync.WithRawResponse {

        private val namespaces: NamespaceServiceAsync.WithRawResponse by lazy {
            NamespaceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SkillServiceAsync.WithRawResponse =
            SkillServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        override fun namespaces(): NamespaceServiceAsync.WithRawResponse = namespaces
    }
}
