// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SystemServiceTest {

    @Test
    fun listServices() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val systemService = client.system()

        val response = systemService.listServices()

        response.validate()
    }
}
