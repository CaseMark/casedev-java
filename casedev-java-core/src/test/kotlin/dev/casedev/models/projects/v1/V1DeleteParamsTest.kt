// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.projects.v1

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DeleteParamsTest {

    @Test
    fun create() {
        V1DeleteParams.builder().id("id").deleteDeployments(true).build()
    }

    @Test
    fun pathParams() {
        val params = V1DeleteParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = V1DeleteParams.builder().id("id").deleteDeployments(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("deleteDeployments", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V1DeleteParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
