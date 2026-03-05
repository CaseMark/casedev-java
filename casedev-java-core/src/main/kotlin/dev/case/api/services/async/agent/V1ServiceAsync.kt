// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.agent.v1.AgentServiceAsync
import dev.case.api.services.async.agent.v1.ChatServiceAsync
import dev.case.api.services.async.agent.v1.ExecuteServiceAsync
import dev.case.api.services.async.agent.v1.RunServiceAsync
import java.util.function.Consumer

interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

    fun agents(): AgentServiceAsync

    fun run(): RunServiceAsync

    fun execute(): ExecuteServiceAsync

    fun chat(): ChatServiceAsync

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        fun agents(): AgentServiceAsync.WithRawResponse

        fun run(): RunServiceAsync.WithRawResponse

        fun execute(): ExecuteServiceAsync.WithRawResponse

        fun chat(): ChatServiceAsync.WithRawResponse
    }
}
