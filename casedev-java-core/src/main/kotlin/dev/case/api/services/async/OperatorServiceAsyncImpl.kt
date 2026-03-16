// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.operator.V1ServiceAsync
import dev.case.api.services.async.operator.V1ServiceAsyncImpl
import java.util.function.Consumer

class OperatorServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OperatorServiceAsync {

    private val withRawResponse: OperatorServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OperatorServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OperatorServiceAsync =
        OperatorServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OperatorServiceAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OperatorServiceAsync.WithRawResponse =
            OperatorServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
