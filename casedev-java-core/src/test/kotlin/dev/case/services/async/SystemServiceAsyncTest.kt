// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SystemServiceAsyncTest {

    @Test
    fun listServices() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val systemServiceAsync = client.system()

        val responseFuture = systemServiceAsync.listServices()

        val response = responseFuture.get()
        response.validate()
    }
}
