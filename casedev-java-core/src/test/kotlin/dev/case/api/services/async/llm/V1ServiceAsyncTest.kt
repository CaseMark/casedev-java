// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.llm

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.llm.v1.V1CreateEmbeddingParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

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
