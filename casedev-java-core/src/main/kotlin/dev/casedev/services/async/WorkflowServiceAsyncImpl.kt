// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async

import dev.casedev.core.ClientOptions
import dev.casedev.services.async.workflows.V1ServiceAsync
import dev.casedev.services.async.workflows.V1ServiceAsyncImpl
import java.util.function.Consumer

class WorkflowServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkflowServiceAsync {

    private val withRawResponse: WorkflowServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): WorkflowServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkflowServiceAsync =
        WorkflowServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkflowServiceAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkflowServiceAsync.WithRawResponse =
            WorkflowServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
