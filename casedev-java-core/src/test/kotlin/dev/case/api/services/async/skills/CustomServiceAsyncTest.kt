// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.skills

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.skills.custom.CustomListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomServiceAsyncTest {

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customServiceAsync = client.skills().custom()

        val customsFuture =
            customServiceAsync.list(
                CustomListParams.builder().cursor("cursor").limit(1L).tag("tag").build()
            )

        val customs = customsFuture.get()
        customs.validate()
    }
}
