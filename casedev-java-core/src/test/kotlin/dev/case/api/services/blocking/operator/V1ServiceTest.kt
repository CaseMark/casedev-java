// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.operator

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.operator.v1.V1CreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.operator().v1()

        v1Service.create(
            V1CreateParams.builder()
                .name("name")
                .model("model")
                .size(V1CreateParams.Size.SMALL)
                .build()
        )
    }

    @Test
    fun createChatCompletion() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.operator().v1()

        v1Service.createChatCompletion()
    }

    @Test
    fun createResponse() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.operator().v1()

        v1Service.createResponse()
    }

    @Test
    fun getStatus() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.operator().v1()

        v1Service.getStatus()
    }
}
