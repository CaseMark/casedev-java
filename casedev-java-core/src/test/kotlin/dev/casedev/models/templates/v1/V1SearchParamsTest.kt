// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.templates.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1SearchParamsTest {

    @Test
    fun create() {
        V1SearchParams.builder().query("query").category("category").limit(1L).build()
    }

    @Test
    fun body() {
        val params = V1SearchParams.builder().query("query").category("category").limit(1L).build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("query")
        assertThat(body.category()).contains("category")
        assertThat(body.limit()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1SearchParams.builder().query("query").build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("query")
    }
}
