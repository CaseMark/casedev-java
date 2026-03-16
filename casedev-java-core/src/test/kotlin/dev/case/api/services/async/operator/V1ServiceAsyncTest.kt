// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.operator

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.operator.v1.V1CreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.operator().v1()

        val future =
            v1ServiceAsync.create(
                V1CreateParams.builder()
                    .name("name")
                    .model("model")
                    .size(V1CreateParams.Size.SMALL)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun createChatCompletion() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.operator().v1()

        val future = v1ServiceAsync.createChatCompletion()

        val response = future.get()
    }

    @Test
    fun createResponse() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.operator().v1()

        val future = v1ServiceAsync.createResponse()

        val response = future.get()
    }

    @Test
    fun getStatus() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.operator().v1()

        val future = v1ServiceAsync.getStatus()

        val response = future.get()
    }
}
