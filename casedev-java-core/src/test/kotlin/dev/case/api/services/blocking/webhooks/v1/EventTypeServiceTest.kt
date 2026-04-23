// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.webhooks.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventTypeServiceTest {

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventTypeService = client.webhooks().v1().eventTypes()

        eventTypeService.list()
    }
}
