// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.vault

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GraphragServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getStats() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val graphragServiceAsync = client.vault().graphrag()

        val future = graphragServiceAsync.getStats("id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun init() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val graphragServiceAsync = client.vault().graphrag()

        val future = graphragServiceAsync.init("id")

        val response = future.get()
    }
}
