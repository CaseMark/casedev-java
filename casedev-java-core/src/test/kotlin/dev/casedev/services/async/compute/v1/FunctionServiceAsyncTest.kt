// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.models.compute.v1.functions.FunctionGetLogsParams
import dev.casedev.models.compute.v1.functions.FunctionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FunctionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val functionServiceAsync = client.compute().v1().functions()

        val future = functionServiceAsync.list(FunctionListParams.builder().env("env").build())

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getLogs() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val functionServiceAsync = client.compute().v1().functions()

        val future =
            functionServiceAsync.getLogs(FunctionGetLogsParams.builder().id("id").tail(1L).build())

        val response = future.get()
    }
}
