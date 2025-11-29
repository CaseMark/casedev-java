// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.convert.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JobServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobService = client.convert().v1().jobs()

        jobService.retrieve("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val jobService = client.convert().v1().jobs()

        jobService.delete("id")
    }
}
