// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.applications.v1.projects

import com.router.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectGetRuntimeLogsParamsTest {

    @Test
    fun create() {
        ProjectGetRuntimeLogsParams.builder().id("id").limit(0.0).build()
    }

    @Test
    fun pathParams() {
        val params = ProjectGetRuntimeLogsParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = ProjectGetRuntimeLogsParams.builder().id("id").limit(0.0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("limit", "0.0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProjectGetRuntimeLogsParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
