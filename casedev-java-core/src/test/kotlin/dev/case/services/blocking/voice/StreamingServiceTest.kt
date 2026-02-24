// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.voice

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StreamingServiceTest {

    @Test
    fun getUrl() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val streamingService = client.voice().streaming()

        val response = streamingService.getUrl()

        response.validate()
    }
}
