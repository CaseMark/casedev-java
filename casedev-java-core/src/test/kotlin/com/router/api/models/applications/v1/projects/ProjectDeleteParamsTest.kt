// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.applications.v1.projects

import com.router.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectDeleteParamsTest {

    @Test
    fun create() {
        ProjectDeleteParams.builder().id("id").deleteFromHosting(true).build()
    }

    @Test
    fun pathParams() {
        val params = ProjectDeleteParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = ProjectDeleteParams.builder().id("id").deleteFromHosting(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("deleteFromHosting", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProjectDeleteParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
