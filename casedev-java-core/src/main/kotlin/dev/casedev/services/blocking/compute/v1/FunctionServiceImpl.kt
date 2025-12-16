// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.compute.v1

import dev.casedev.core.ClientOptions
import java.util.function.Consumer

class FunctionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FunctionService {

    private val withRawResponse: FunctionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FunctionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionService =
        FunctionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FunctionService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FunctionService.WithRawResponse =
            FunctionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
