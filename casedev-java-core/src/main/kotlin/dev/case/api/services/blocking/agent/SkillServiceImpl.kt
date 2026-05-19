// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent

import dev.case.api.core.ClientOptions
import dev.case.api.services.blocking.agent.skills.NamespaceService
import dev.case.api.services.blocking.agent.skills.NamespaceServiceImpl
import java.util.function.Consumer

class SkillServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SkillService {

    private val withRawResponse: SkillService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val namespaces: NamespaceService by lazy { NamespaceServiceImpl(clientOptions) }

    override fun withRawResponse(): SkillService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkillService =
        SkillServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    override fun namespaces(): NamespaceService = namespaces

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SkillService.WithRawResponse {

        private val namespaces: NamespaceService.WithRawResponse by lazy {
            NamespaceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SkillService.WithRawResponse =
            SkillServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        override fun namespaces(): NamespaceService.WithRawResponse = namespaces
    }
}
