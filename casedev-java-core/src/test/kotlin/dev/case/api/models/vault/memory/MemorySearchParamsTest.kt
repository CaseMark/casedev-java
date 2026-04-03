// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.memory

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemorySearchParamsTest {

    @Test
    fun create() {
        MemorySearchParams.builder()
            .id("id")
            .query("query")
            .limit(1L)
            .addTag("string")
            .addType("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = MemorySearchParams.builder().id("id").query("query").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MemorySearchParams.builder()
                .id("id")
                .query("query")
                .limit(1L)
                .addTag("string")
                .addType("string")
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("query")
        assertThat(body.limit()).contains(1L)
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.types().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MemorySearchParams.builder().id("id").query("query").build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("query")
    }
}
