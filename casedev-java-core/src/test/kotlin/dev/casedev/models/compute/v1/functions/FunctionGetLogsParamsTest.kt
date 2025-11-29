// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1.functions

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FunctionGetLogsParamsTest {

    @Test
    fun create() {
        FunctionGetLogsParams.builder().id("id").tail(1L).build()
    }

    @Test
    fun pathParams() {
        val params = FunctionGetLogsParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = FunctionGetLogsParams.builder().id("id").tail(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("tail", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FunctionGetLogsParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
