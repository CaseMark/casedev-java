// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.applications.v1.projects

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectListParamsTest {

    @Test
    fun create() {
        ProjectListParams.builder().enrich(true).limit(0.0).build()
    }

    @Test
    fun queryParams() {
        val params = ProjectListParams.builder().enrich(true).limit(0.0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("enrich", "true").put("limit", "0.0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProjectListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
