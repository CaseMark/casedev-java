// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking

import dev.case.core.ClientOptions
import dev.case.services.blocking.compute.V1Service
import dev.case.services.blocking.compute.V1ServiceImpl
import java.util.function.Consumer

class ComputeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ComputeService {

    private val withRawResponse: ComputeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): ComputeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ComputeService =
        ComputeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ComputeService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ComputeService.WithRawResponse =
            ComputeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1Service.WithRawResponse = v1
    }
}
