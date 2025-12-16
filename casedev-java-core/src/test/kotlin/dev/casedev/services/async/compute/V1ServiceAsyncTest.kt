// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.models.compute.v1.V1GetUsageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getPricing() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.compute().v1()

        val future = v1ServiceAsync.getPricing()

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getUsage() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.compute().v1()

        val future =
            v1ServiceAsync.getUsage(V1GetUsageParams.builder().month(3L).year(2024L).build())

        val response = future.get()
    }
}
