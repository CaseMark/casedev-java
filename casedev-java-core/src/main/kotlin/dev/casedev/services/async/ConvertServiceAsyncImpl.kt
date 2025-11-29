// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async

import dev.casedev.core.ClientOptions
import dev.casedev.services.async.convert.V1ServiceAsync
import dev.casedev.services.async.convert.V1ServiceAsyncImpl
import java.util.function.Consumer

class ConvertServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConvertServiceAsync {

    private val withRawResponse: ConvertServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ConvertServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConvertServiceAsync =
        ConvertServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConvertServiceAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConvertServiceAsync.WithRawResponse =
            ConvertServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
