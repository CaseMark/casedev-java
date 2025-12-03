// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListExecutionsParamsTest {

    @Test
    fun create() {
        V1ListExecutionsParams.builder()
            .id("id")
            .limit(100L)
            .status(V1ListExecutionsParams.Status.PENDING)
            .build()
    }

    @Test
    fun pathParams() {
        val params = V1ListExecutionsParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            V1ListExecutionsParams.builder()
                .id("id")
                .limit(100L)
                .status(V1ListExecutionsParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "100").put("status", "pending").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V1ListExecutionsParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
