// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking

import dev.case.api.core.ClientOptions
import dev.case.api.services.blocking.matters.V1Service
import dev.case.api.services.blocking.matters.V1ServiceImpl
import java.util.function.Consumer

class MatterServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MatterService {

    private val withRawResponse: MatterService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): MatterService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MatterService =
        MatterServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Matter-native legal workspaces and orchestration primitives */
    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MatterService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MatterService.WithRawResponse =
            MatterServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Matter-native legal workspaces and orchestration primitives */
        override fun v1(): V1Service.WithRawResponse = v1
    }
}
