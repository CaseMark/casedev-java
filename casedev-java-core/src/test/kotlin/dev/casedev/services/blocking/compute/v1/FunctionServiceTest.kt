// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.compute.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.models.compute.v1.functions.FunctionGetLogsParams
import dev.casedev.models.compute.v1.functions.FunctionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FunctionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val functionService = client.compute().v1().functions()

        functionService.list(FunctionListParams.builder().env("env").build())
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getLogs() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val functionService = client.compute().v1().functions()

        functionService.getLogs(FunctionGetLogsParams.builder().id("id").tail(1L).build())
    }
}
