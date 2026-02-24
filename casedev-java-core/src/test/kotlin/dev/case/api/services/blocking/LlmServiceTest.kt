// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LlmServiceTest {

    @Test
    fun getConfig() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val llmService = client.llm()

        val response = llmService.getConfig()

        response.validate()
    }
}
