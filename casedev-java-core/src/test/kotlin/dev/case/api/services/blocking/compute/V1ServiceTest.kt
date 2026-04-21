// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.compute

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.compute.v1.V1GetUsageParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Test
    fun getUsage() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.compute().v1()

        val response = v1Service.getUsage(V1GetUsageParams.builder().month(3L).year(2024L).build())

        response.validate()
    }
}
