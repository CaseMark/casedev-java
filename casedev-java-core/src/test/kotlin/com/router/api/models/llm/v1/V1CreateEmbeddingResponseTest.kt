// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.llm.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateEmbeddingResponseTest {

    @Test
    fun create() {
        val v1CreateEmbeddingResponse =
            V1CreateEmbeddingResponse.builder()
                .addData(
                    V1CreateEmbeddingResponse.Data.builder()
                        .addEmbedding(0.0)
                        .index(0L)
                        .object_("embedding")
                        .build()
                )
                .model("model")
                .object_("list")
                .usage(
                    V1CreateEmbeddingResponse.Usage.builder()
                        .promptTokens(0L)
                        .totalTokens(0L)
                        .build()
                )
                .build()

        assertThat(v1CreateEmbeddingResponse.data().getOrNull())
            .containsExactly(
                V1CreateEmbeddingResponse.Data.builder()
                    .addEmbedding(0.0)
                    .index(0L)
                    .object_("embedding")
                    .build()
            )
        assertThat(v1CreateEmbeddingResponse.model()).contains("model")
        assertThat(v1CreateEmbeddingResponse.object_()).contains("list")
        assertThat(v1CreateEmbeddingResponse.usage())
            .contains(
                V1CreateEmbeddingResponse.Usage.builder().promptTokens(0L).totalTokens(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1CreateEmbeddingResponse =
            V1CreateEmbeddingResponse.builder()
                .addData(
                    V1CreateEmbeddingResponse.Data.builder()
                        .addEmbedding(0.0)
                        .index(0L)
                        .object_("embedding")
                        .build()
                )
                .model("model")
                .object_("list")
                .usage(
                    V1CreateEmbeddingResponse.Usage.builder()
                        .promptTokens(0L)
                        .totalTokens(0L)
                        .build()
                )
                .build()

        val roundtrippedV1CreateEmbeddingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1CreateEmbeddingResponse),
                jacksonTypeRef<V1CreateEmbeddingResponse>(),
            )

        assertThat(roundtrippedV1CreateEmbeddingResponse).isEqualTo(v1CreateEmbeddingResponse)
    }
}
