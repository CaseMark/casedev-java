// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute.v1

import dev.casedev.core.ClientOptions
import java.util.function.Consumer

class RunServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RunServiceAsync {

    private val withRawResponse: RunServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RunServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync =
        RunServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunServiceAsync.WithRawResponse =
            RunServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
