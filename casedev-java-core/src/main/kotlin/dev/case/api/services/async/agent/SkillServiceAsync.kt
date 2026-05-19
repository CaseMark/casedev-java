// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.agent.skills.NamespaceServiceAsync
import java.util.function.Consumer

interface SkillServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SkillServiceAsync

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    fun namespaces(): NamespaceServiceAsync

    /** A view of [SkillServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SkillServiceAsync.WithRawResponse

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        fun namespaces(): NamespaceServiceAsync.WithRawResponse
    }
}
