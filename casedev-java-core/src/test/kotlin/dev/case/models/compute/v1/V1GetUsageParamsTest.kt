// File generated from our OpenAPI spec by Stainless.

package dev.case.models.compute.v1

import dev.case.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1GetUsageParamsTest {

    @Test
    fun create() {
        V1GetUsageParams.builder().month(3L).year(2024L).build()
    }

    @Test
    fun queryParams() {
        val params = V1GetUsageParams.builder().month(3L).year(2024L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("month", "3").put("year", "2024").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V1GetUsageParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
