// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async

import com.router.api.core.ClientOptions
import com.router.api.services.async.applications.V1ServiceAsync
import com.router.api.services.async.applications.V1ServiceAsyncImpl
import java.util.function.Consumer

class ApplicationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ApplicationServiceAsync {

    private val withRawResponse: ApplicationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ApplicationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ApplicationServiceAsync =
        ApplicationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ApplicationServiceAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ApplicationServiceAsync.WithRawResponse =
            ApplicationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
