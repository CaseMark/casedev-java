// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.llm

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.models.llm.v1.V1CreateEmbeddingParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createEmbedding() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.llm().v1()

        val response =
            v1Service.createEmbedding(
                V1CreateEmbeddingParams.builder()
                    .input("string")
                    .model("model")
                    .dimensions(0L)
                    .encodingFormat(V1CreateEmbeddingParams.EncodingFormat.FLOAT)
                    .user("user")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listModels() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.llm().v1()

        val response = v1Service.listModels()

        response.validate()
    }
}
