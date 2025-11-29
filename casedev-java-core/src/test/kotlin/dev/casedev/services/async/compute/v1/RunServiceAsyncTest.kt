// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.models.compute.v1.runs.RunListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RunServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runServiceAsync = client.compute().v1().runs()

        val future = runServiceAsync.retrieve("id")

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
        val runServiceAsync = client.compute().v1().runs()

        val future =
            runServiceAsync.list(
                RunListParams.builder().env("env").function("function").limit(1L).build()
            )

        val response = future.get()
    }
}
