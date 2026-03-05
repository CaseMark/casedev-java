// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.legal.V1ServiceAsync
import dev.case.api.services.async.legal.V1ServiceAsyncImpl
import java.util.function.Consumer

class LegalServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LegalServiceAsync {

    private val withRawResponse: LegalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): LegalServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LegalServiceAsync =
        LegalServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Legal research tools including citation verification */
    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LegalServiceAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LegalServiceAsync.WithRawResponse =
            LegalServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Legal research tools including citation verification */
        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
