// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking

import com.router.api.core.ClientOptions
import com.router.api.services.blocking.database.V1Service
import com.router.api.services.blocking.database.V1ServiceImpl
import java.util.function.Consumer

class DatabaseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DatabaseService {

    private val withRawResponse: DatabaseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): DatabaseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DatabaseService =
        DatabaseServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DatabaseService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DatabaseService.WithRawResponse =
            DatabaseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1Service.WithRawResponse = v1
    }
}
