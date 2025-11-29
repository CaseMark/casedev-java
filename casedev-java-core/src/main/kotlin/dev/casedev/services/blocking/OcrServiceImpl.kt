// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking

import dev.casedev.core.ClientOptions
import dev.casedev.services.blocking.ocr.V1Service
import dev.casedev.services.blocking.ocr.V1ServiceImpl
import java.util.function.Consumer

class OcrServiceImpl internal constructor(private val clientOptions: ClientOptions) : OcrService {

    private val withRawResponse: OcrService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): OcrService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OcrService =
        OcrServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OcrService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OcrService.WithRawResponse =
            OcrServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1Service.WithRawResponse = v1
    }
}
