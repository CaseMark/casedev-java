// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.database

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
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
        val v1Service = client.database().v1()

        val response = v1Service.getUsage()

        response.validate()
    }
}
