// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.vault

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
import dev.case.models.vault.graphrag.GraphragProcessObjectParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GraphragServiceTest {

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
