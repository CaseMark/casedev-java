// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.webhooks

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.models.webhooks.v1.V1CreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.webhooks().v1()

        val v1 =
            v1Service.create(
                V1CreateParams.builder()
                    .addEvent("document.processed")
                    .addEvent("vault.updated")
                    .url("https://api.lawfirm.com/webhooks/case-dev")
                    .description("Document processing notifications for client portal")
                    .build()
            )

        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.webhooks().v1()

        v1Service.retrieve("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.webhooks().v1()

        v1Service.list()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.webhooks().v1()

        v1Service.delete("wh_abc123xyz789")
    }
}
