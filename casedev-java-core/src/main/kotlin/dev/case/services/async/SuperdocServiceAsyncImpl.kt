// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async

import dev.case.core.ClientOptions
import dev.case.services.async.superdoc.V1ServiceAsync
import dev.case.services.async.superdoc.V1ServiceAsyncImpl
import java.util.function.Consumer

class SuperdocServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SuperdocServiceAsync {

    private val withRawResponse: SuperdocServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): SuperdocServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SuperdocServiceAsync =
        SuperdocServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SuperdocServiceAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SuperdocServiceAsync.WithRawResponse =
            SuperdocServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
