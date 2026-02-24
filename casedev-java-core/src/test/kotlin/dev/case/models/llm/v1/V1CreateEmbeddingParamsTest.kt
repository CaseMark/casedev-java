// File generated from our OpenAPI spec by Stainless.

package dev.case.models.llm.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateEmbeddingParamsTest {

    @Test
    fun create() {
        V1CreateEmbeddingParams.builder()
            .input("string")
            .model("model")
            .dimensions(0L)
            .encodingFormat(V1CreateEmbeddingParams.EncodingFormat.FLOAT)
            .user("user")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CreateEmbeddingParams.builder()
                .input("string")
                .model("model")
                .dimensions(0L)
                .encodingFormat(V1CreateEmbeddingParams.EncodingFormat.FLOAT)
                .user("user")
                .build()

        val body = params._body()

        assertThat(body.input()).isEqualTo(V1CreateEmbeddingParams.Input.ofString("string"))
        assertThat(body.model()).isEqualTo("model")
        assertThat(body.dimensions()).contains(0L)
        assertThat(body.encodingFormat()).contains(V1CreateEmbeddingParams.EncodingFormat.FLOAT)
        assertThat(body.user()).contains("user")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1CreateEmbeddingParams.builder().input("string").model("model").build()

        val body = params._body()

        assertThat(body.input()).isEqualTo(V1CreateEmbeddingParams.Input.ofString("string"))
        assertThat(body.model()).isEqualTo("model")
    }
}
