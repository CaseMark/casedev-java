// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.compute.v1

import dev.casedev.core.ClientOptions
import java.util.function.Consumer

class InvokeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InvokeService {

    private val withRawResponse: InvokeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvokeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvokeService =
        InvokeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvokeService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InvokeService.WithRawResponse =
            InvokeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
