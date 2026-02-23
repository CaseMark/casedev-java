// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.voice

import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClientAsync
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
