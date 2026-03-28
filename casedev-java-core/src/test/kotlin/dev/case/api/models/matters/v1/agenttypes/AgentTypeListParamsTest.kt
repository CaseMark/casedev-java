// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.agenttypes

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentTypeListParamsTest {

    @Test
    fun create() {
        AgentTypeListParams.builder().active(true).build()
    }

    @Test
    fun queryParams() {
        val params = AgentTypeListParams.builder().active(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("active", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AgentTypeListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
