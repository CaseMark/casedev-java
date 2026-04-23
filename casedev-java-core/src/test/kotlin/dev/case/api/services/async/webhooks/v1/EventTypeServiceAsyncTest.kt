// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.webhooks.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventTypeServiceAsyncTest {

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventTypeServiceAsync = client.webhooks().v1().eventTypes()

        val future = eventTypeServiceAsync.list()

        val response = future.get()
    }
}
