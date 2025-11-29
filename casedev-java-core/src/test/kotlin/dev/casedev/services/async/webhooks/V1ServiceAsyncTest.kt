// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.webhooks

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.models.webhooks.v1.V1CreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.webhooks().v1()

        val v1Future =
            v1ServiceAsync.create(
                V1CreateParams.builder()
                    .addEvent("document.processed")
                    .addEvent("vault.updated")
                    .url("https://api.lawfirm.com/webhooks/case-dev")
                    .description("Document processing notifications for client portal")
                    .build()
            )

        val v1 = v1Future.get()
        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.webhooks().v1()

        val future = v1ServiceAsync.retrieve("id")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.webhooks().v1()

        val future = v1ServiceAsync.list()

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.webhooks().v1()

        val future = v1ServiceAsync.delete("wh_abc123xyz789")

        val response = future.get()
    }
}
