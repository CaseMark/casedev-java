// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking

import dev.case.api.core.ClientOptions
import dev.case.api.services.blocking.superdoc.V1Service
import dev.case.api.services.blocking.superdoc.V1ServiceImpl
import java.util.function.Consumer

class SuperdocServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SuperdocService {

    private val withRawResponse: SuperdocService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): SuperdocService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SuperdocService =
        SuperdocServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Document conversion and template automation */
    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SuperdocService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SuperdocService.WithRawResponse =
            SuperdocServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Document conversion and template automation */
        override fun v1(): V1Service.WithRawResponse = v1
    }
}
