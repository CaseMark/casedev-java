// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.skills

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.skills.custom.CustomListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CustomServiceTest {

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val customService = client.skills().custom()

        val customs =
            customService.list(
                CustomListParams.builder().cursor("cursor").limit(1L).tag("tag").build()
            )

        customs.validate()
    }
}
