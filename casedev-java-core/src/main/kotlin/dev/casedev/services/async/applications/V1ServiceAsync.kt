// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.applications

import dev.casedev.core.ClientOptions
import dev.casedev.services.async.applications.v1.DeploymentServiceAsync
import dev.casedev.services.async.applications.v1.ProjectServiceAsync
import dev.casedev.services.async.applications.v1.WorkflowServiceAsync
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

    fun deployments(): DeploymentServiceAsync

    fun projects(): ProjectServiceAsync

    fun workflows(): WorkflowServiceAsync

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        fun deployments(): DeploymentServiceAsync.WithRawResponse

        fun projects(): ProjectServiceAsync.WithRawResponse

        fun workflows(): WorkflowServiceAsync.WithRawResponse
    }
}
