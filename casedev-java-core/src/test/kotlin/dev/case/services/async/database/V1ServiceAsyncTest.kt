// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async.database

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClientAsync
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
        val v1ServiceAsync = client.database().v1()

        val responseFuture = v1ServiceAsync.getUsage()

        val response = responseFuture.get()
        response.validate()
    }
}
