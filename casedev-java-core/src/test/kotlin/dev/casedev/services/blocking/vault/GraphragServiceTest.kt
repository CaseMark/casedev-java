// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.vault

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.models.vault.graphrag.GraphragProcessObjectParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GraphragServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getStats() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val graphragService = client.vault().graphrag()

        val response = graphragService.getStats("id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun init() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val graphragService = client.vault().graphrag()

        val response = graphragService.init("id")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun processObject() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val graphragService = client.vault().graphrag()

        val response =
            graphragService.processObject(
                GraphragProcessObjectParams.builder().id("id").objectId("objectId").build()
            )

        response.validate()
    }
}
