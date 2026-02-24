// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking

import dev.case.core.ClientOptions
import dev.case.services.blocking.search.V1Service
import dev.case.services.blocking.search.V1ServiceImpl
import java.util.function.Consumer

class SearchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SearchService {

    private val withRawResponse: SearchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): SearchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SearchService =
        SearchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SearchService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SearchService.WithRawResponse =
            SearchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1Service.WithRawResponse = v1
    }
}
