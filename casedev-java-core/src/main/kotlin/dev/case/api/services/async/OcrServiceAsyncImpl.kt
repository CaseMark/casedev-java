// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.ocr.V1ServiceAsync
import dev.case.api.services.async.ocr.V1ServiceAsyncImpl
import java.util.function.Consumer

class OcrServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OcrServiceAsync {

    private val withRawResponse: OcrServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OcrServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OcrServiceAsync =
        OcrServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Extract text from PDFs, images, and scanned documents */
    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OcrServiceAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OcrServiceAsync.WithRawResponse =
            OcrServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Extract text from PDFs, images, and scanned documents */
        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
