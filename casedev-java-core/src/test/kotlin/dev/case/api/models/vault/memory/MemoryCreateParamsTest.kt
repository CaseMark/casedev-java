// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.memory

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemoryCreateParamsTest {

    @Test
    fun create() {
        MemoryCreateParams.builder()
            .id("id")
            .content("content")
            .type(MemoryCreateParams.Type.FACT)
            .source("source")
            .addTag("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MemoryCreateParams.builder()
                .id("id")
                .content("content")
                .type(MemoryCreateParams.Type.FACT)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MemoryCreateParams.builder()
                .id("id")
                .content("content")
                .type(MemoryCreateParams.Type.FACT)
                .source("source")
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body.content()).isEqualTo("content")
        assertThat(body.type()).isEqualTo(MemoryCreateParams.Type.FACT)
        assertThat(body.source()).contains("source")
        assertThat(body.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MemoryCreateParams.builder()
                .id("id")
                .content("content")
                .type(MemoryCreateParams.Type.FACT)
                .build()

        val body = params._body()

        assertThat(body.content()).isEqualTo("content")
        assertThat(body.type()).isEqualTo(MemoryCreateParams.Type.FACT)
    }
}
