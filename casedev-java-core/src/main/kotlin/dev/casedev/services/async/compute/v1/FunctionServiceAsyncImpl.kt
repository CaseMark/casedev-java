// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute.v1

import dev.casedev.core.ClientOptions
import java.util.function.Consumer

class FunctionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FunctionServiceAsync {

    private val withRawResponse: FunctionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FunctionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionServiceAsync =
        FunctionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FunctionServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FunctionServiceAsync.WithRawResponse =
            FunctionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
