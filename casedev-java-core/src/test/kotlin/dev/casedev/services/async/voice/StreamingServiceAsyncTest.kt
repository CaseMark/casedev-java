// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.voice

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StreamingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getUrl() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val streamingServiceAsync = client.voice().streaming()

        val future = streamingServiceAsync.getUrl()

        val response = future.get()
    }
}
