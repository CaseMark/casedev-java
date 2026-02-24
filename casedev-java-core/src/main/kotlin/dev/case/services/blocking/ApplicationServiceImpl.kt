// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking

import dev.case.core.ClientOptions
import dev.case.services.blocking.applications.V1Service
import dev.case.services.blocking.applications.V1ServiceImpl
import java.util.function.Consumer

class ApplicationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ApplicationService {

    private val withRawResponse: ApplicationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): ApplicationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApplicationService =
        ApplicationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApplicationService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApplicationService.WithRawResponse =
            ApplicationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1Service.WithRawResponse = v1
    }
}
