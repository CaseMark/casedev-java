// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking

import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClient
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
