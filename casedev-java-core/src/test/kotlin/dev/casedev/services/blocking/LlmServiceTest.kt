// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LlmServiceTest {

    @Disabled("Prism tests are disabled")
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
