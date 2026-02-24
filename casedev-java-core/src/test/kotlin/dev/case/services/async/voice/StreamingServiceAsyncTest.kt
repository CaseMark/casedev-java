// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async.voice

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StreamingServiceAsyncTest {

    @Test
    fun getUrl() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val streamingServiceAsync = client.voice().streaming()

        val responseFuture = streamingServiceAsync.getUrl()

        val response = responseFuture.get()
        response.validate()
    }
}
