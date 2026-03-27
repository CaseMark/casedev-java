// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.agent.v2.ChatServiceAsync
import dev.case.api.services.async.agent.v2.ExecuteServiceAsync
import dev.case.api.services.async.agent.v2.RunServiceAsync
import java.util.function.Consumer

interface V2ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ServiceAsync

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    fun run(): RunServiceAsync

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    fun execute(): ExecuteServiceAsync

    /**
     * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
     * workflows
     */
    fun chat(): ChatServiceAsync

    /** A view of [V2ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ServiceAsync.WithRawResponse

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        fun run(): RunServiceAsync.WithRawResponse

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        fun execute(): ExecuteServiceAsync.WithRawResponse

        /**
         * Create, manage, and execute AI agents with tool access, sandbox environments, and async
         * run workflows
         */
        fun chat(): ChatServiceAsync.WithRawResponse
    }
}
