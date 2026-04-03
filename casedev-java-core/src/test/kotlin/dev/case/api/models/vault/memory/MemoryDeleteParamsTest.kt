// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.memory

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemoryDeleteParamsTest {

    @Test
    fun create() {
        MemoryDeleteParams.builder().id("id").entryId("entryId").build()
    }

    @Test
    fun pathParams() {
        val params = MemoryDeleteParams.builder().id("id").entryId("entryId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("entryId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
