// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent

import dev.case.api.core.ClientOptions
import dev.case.api.services.blocking.agent.skills.NamespaceService
import java.util.function.Consumer

interface SkillService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkillService

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    fun namespaces(): NamespaceService

    /** A view of [SkillService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkillService.WithRawResponse

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        fun namespaces(): NamespaceService.WithRawResponse
    }
}
