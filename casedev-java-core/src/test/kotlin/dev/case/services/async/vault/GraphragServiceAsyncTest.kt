// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async.vault

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClientAsync
import dev.case.models.vault.graphrag.GraphragProcessObjectParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GraphragServiceAsyncTest {

    @Test
    fun getStats() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val graphragServiceAsync = client.vault().graphrag()

        val responseFuture = graphragServiceAsync.getStats("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun init() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val graphragServiceAsync = client.vault().graphrag()

        val responseFuture = graphragServiceAsync.init("id")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun processObject() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val graphragServiceAsync = client.vault().graphrag()

        val responseFuture =
            graphragServiceAsync.processObject(
                GraphragProcessObjectParams.builder().id("id").objectId("objectId").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
