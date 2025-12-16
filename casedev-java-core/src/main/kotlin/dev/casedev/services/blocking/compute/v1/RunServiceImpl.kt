// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.compute.v1

import dev.casedev.core.ClientOptions
import java.util.function.Consumer

class RunServiceImpl internal constructor(private val clientOptions: ClientOptions) : RunService {

    private val withRawResponse: RunService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RunService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService =
        RunServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunService.WithRawResponse =
            RunServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
