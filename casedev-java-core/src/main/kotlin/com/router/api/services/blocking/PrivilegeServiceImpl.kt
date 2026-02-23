// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking

import com.router.api.core.ClientOptions
import com.router.api.services.blocking.privilege.V1Service
import com.router.api.services.blocking.privilege.V1ServiceImpl
import java.util.function.Consumer

class PrivilegeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PrivilegeService {

    private val withRawResponse: PrivilegeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): PrivilegeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PrivilegeService =
        PrivilegeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PrivilegeService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PrivilegeService.WithRawResponse =
            PrivilegeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1Service.WithRawResponse = v1
    }
}
