// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent

import dev.case.api.core.ClientOptions
import dev.case.api.services.blocking.agent.v1.AgentService
import dev.case.api.services.blocking.agent.v1.ExecuteService
import dev.case.api.services.blocking.agent.v1.RunService
import java.util.function.Consumer

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    fun agents(): AgentService

    fun run(): RunService

    fun execute(): ExecuteService

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        fun agents(): AgentService.WithRawResponse

        fun run(): RunService.WithRawResponse

        fun execute(): ExecuteService.WithRawResponse
    }
}
