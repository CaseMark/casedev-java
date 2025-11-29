// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1.functions

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionListParamsTest {

    @Test
    fun create() {
        FunctionListParams.builder().env("env").build()
    }

    @Test
    fun queryParams() {
        val params = FunctionListParams.builder().env("env").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("env", "env").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FunctionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
