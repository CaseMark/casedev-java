// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.voice

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StreamingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getUrl() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val streamingService = client.voice().streaming()

        streamingService.getUrl()
    }
}
