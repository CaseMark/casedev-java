// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.worker.V1ServiceAsync
import dev.case.api.services.async.worker.V1ServiceAsyncImpl
import java.util.function.Consumer

class WorkerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkerServiceAsync {

    private val withRawResponse: WorkerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): WorkerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkerServiceAsync =
        WorkerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkerServiceAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkerServiceAsync.WithRawResponse =
            WorkerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
