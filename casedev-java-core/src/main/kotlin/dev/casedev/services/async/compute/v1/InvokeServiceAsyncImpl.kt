// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute.v1

import dev.casedev.core.ClientOptions
import java.util.function.Consumer

class InvokeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InvokeServiceAsync {

    private val withRawResponse: InvokeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvokeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvokeServiceAsync =
        InvokeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvokeServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvokeServiceAsync.WithRawResponse =
            InvokeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
