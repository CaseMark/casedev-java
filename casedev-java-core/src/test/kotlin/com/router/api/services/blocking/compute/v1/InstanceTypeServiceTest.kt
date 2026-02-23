// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.compute.v1

import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InstanceTypeServiceTest {

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val instanceTypeService = client.compute().v1().instanceTypes()

        val instanceTypes = instanceTypeService.list()

        instanceTypes.validate()
    }
}
