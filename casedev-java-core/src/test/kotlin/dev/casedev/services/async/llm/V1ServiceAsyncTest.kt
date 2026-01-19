// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.llm

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.models.llm.v1.V1CreateEmbeddingParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createEmbedding() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.llm().v1()

        val responseFuture =
            v1ServiceAsync.createEmbedding(
                V1CreateEmbeddingParams.builder()
                    .input("string")
                    .model("model")
                    .dimensions(0L)
                    .encodingFormat(V1CreateEmbeddingParams.EncodingFormat.FLOAT)
                    .user("user")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listModels() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.llm().v1()

        val responseFuture = v1ServiceAsync.listModels()

        val response = responseFuture.get()
        response.validate()
    }
}
