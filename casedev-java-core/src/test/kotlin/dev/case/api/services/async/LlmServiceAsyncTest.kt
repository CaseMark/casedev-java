// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LlmServiceAsyncTest {

    @Test
    fun getConfig() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val llmServiceAsync = client.llm()

        val responseFuture = llmServiceAsync.getConfig()

        val response = responseFuture.get()
        response.validate()
    }
}
