// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.voice

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
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
