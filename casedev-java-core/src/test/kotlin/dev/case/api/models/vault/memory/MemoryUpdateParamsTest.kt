// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.memory

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemoryUpdateParamsTest {

    @Test
    fun create() {
        MemoryUpdateParams.builder()
            .id("id")
            .entryId("entryId")
            .content("content")
            .source("source")
            .addTag("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = MemoryUpdateParams.builder().id("id").entryId("entryId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("entryId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MemoryUpdateParams.builder()
                .id("id")
                .entryId("entryId")
                .content("content")
                .source("source")
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body.content()).contains("content")
        assertThat(body.source()).contains("source")
        assertThat(body.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MemoryUpdateParams.builder().id("id").entryId("entryId").build()

        val body = params._body()
    }
}
