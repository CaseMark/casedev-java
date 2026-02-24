// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.applications

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.applications.v1.DeploymentServiceAsync
import dev.case.api.services.async.applications.v1.DeploymentServiceAsyncImpl
import dev.case.api.services.async.applications.v1.ProjectServiceAsync
import dev.case.api.services.async.applications.v1.ProjectServiceAsyncImpl
import dev.case.api.services.async.applications.v1.WorkflowServiceAsync
import dev.case.api.services.async.applications.v1.WorkflowServiceAsyncImpl
import java.util.function.Consumer

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val deployments: DeploymentServiceAsync by lazy {
        DeploymentServiceAsyncImpl(clientOptions)
    }

    private val projects: ProjectServiceAsync by lazy { ProjectServiceAsyncImpl(clientOptions) }

    private val workflows: WorkflowServiceAsync by lazy { WorkflowServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun deployments(): DeploymentServiceAsync = deployments

    override fun projects(): ProjectServiceAsync = projects

    override fun workflows(): WorkflowServiceAsync = workflows

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val deployments: DeploymentServiceAsync.WithRawResponse by lazy {
            DeploymentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val projects: ProjectServiceAsync.WithRawResponse by lazy {
            ProjectServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val workflows: WorkflowServiceAsync.WithRawResponse by lazy {
            WorkflowServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun deployments(): DeploymentServiceAsync.WithRawResponse = deployments

        override fun projects(): ProjectServiceAsync.WithRawResponse = projects

        override fun workflows(): WorkflowServiceAsync.WithRawResponse = workflows
    }
}
