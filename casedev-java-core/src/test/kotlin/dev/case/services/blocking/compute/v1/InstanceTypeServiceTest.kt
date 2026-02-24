// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.compute.v1

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
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
