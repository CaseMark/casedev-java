// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.types

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TypeListParamsTest {

    @Test
    fun create() {
        TypeListParams.builder().active(true).build()
    }

    @Test
    fun queryParams() {
        val params = TypeListParams.builder().active(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("active", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TypeListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
