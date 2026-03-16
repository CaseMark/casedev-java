// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking

import dev.case.api.core.ClientOptions
import dev.case.api.services.blocking.mail.V1Service
import dev.case.api.services.blocking.mail.V1ServiceImpl
import java.util.function.Consumer

class MailServiceImpl internal constructor(private val clientOptions: ClientOptions) : MailService {

    private val withRawResponse: MailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): MailService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MailService =
        MailServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MailService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MailService.WithRawResponse =
            MailServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1Service.WithRawResponse = v1
    }
}
