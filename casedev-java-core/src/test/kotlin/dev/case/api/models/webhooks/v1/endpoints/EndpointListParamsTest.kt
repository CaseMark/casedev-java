// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.webhooks.v1.endpoints

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EndpointListParamsTest {

    @Test
    fun create() {
        EndpointListParams.builder().limit(1L).status(EndpointListParams.Status.ACTIVE).build()
    }

    @Test
    fun queryParams() {
        val params =
            EndpointListParams.builder().limit(1L).status(EndpointListParams.Status.ACTIVE).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "1").put("status", "active").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EndpointListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
