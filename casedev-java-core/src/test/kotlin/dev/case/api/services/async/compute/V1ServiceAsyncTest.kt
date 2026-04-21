// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.compute

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.compute.v1.V1GetUsageParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Test
    fun getUsage() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.compute().v1()

        val responseFuture =
            v1ServiceAsync.getUsage(V1GetUsageParams.builder().month(3L).year(2024L).build())

        val response = responseFuture.get()
        response.validate()
    }
}
