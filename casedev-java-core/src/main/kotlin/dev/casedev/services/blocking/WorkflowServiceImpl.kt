// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking

import dev.casedev.core.ClientOptions
import dev.casedev.services.blocking.workflows.V1Service
import dev.casedev.services.blocking.workflows.V1ServiceImpl
import java.util.function.Consumer

class WorkflowServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkflowService {

    private val withRawResponse: WorkflowService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): WorkflowService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkflowService =
        WorkflowServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkflowService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkflowService.WithRawResponse =
            WorkflowServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1Service.WithRawResponse = v1
    }
}
