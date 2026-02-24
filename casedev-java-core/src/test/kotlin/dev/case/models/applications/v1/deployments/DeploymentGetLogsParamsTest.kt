// File generated from our OpenAPI spec by Stainless.

package dev.case.models.applications.v1.deployments

import dev.case.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeploymentGetLogsParamsTest {

    @Test
    fun create() {
        DeploymentGetLogsParams.builder().id("id").projectId("projectId").build()
    }

    @Test
    fun pathParams() {
        val params = DeploymentGetLogsParams.builder().id("id").projectId("projectId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = DeploymentGetLogsParams.builder().id("id").projectId("projectId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("projectId", "projectId").build())
    }
}
