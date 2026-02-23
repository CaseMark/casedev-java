// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.applications

import com.router.api.core.ClientOptions
import com.router.api.services.blocking.applications.v1.DeploymentService
import com.router.api.services.blocking.applications.v1.ProjectService
import com.router.api.services.blocking.applications.v1.WorkflowService
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

    fun deployments(): DeploymentService

    fun projects(): ProjectService

    fun workflows(): WorkflowService

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        fun deployments(): DeploymentService.WithRawResponse

        fun projects(): ProjectService.WithRawResponse

        fun workflows(): WorkflowService.WithRawResponse
    }
}
