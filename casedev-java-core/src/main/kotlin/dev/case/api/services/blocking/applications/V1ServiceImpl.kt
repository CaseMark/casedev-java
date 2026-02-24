// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.applications

import dev.case.api.core.ClientOptions
import dev.case.api.services.blocking.applications.v1.DeploymentService
import dev.case.api.services.blocking.applications.v1.DeploymentServiceImpl
import dev.case.api.services.blocking.applications.v1.ProjectService
import dev.case.api.services.blocking.applications.v1.ProjectServiceImpl
import dev.case.api.services.blocking.applications.v1.WorkflowService
import dev.case.api.services.blocking.applications.v1.WorkflowServiceImpl
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val deployments: DeploymentService by lazy { DeploymentServiceImpl(clientOptions) }

    private val projects: ProjectService by lazy { ProjectServiceImpl(clientOptions) }

    private val workflows: WorkflowService by lazy { WorkflowServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun deployments(): DeploymentService = deployments

    override fun projects(): ProjectService = projects

    override fun workflows(): WorkflowService = workflows

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val deployments: DeploymentService.WithRawResponse by lazy {
            DeploymentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val projects: ProjectService.WithRawResponse by lazy {
            ProjectServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val workflows: WorkflowService.WithRawResponse by lazy {
            WorkflowServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun deployments(): DeploymentService.WithRawResponse = deployments

        override fun projects(): ProjectService.WithRawResponse = projects

        override fun workflows(): WorkflowService.WithRawResponse = workflows
    }
}
