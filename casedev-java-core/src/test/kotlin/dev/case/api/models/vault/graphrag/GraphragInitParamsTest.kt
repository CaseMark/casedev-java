// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.graphrag

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GraphragInitParamsTest {

    @Test
    fun create() {
        GraphragInitParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = GraphragInitParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
