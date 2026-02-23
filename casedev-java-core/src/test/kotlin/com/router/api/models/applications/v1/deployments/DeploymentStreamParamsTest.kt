// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.applications.v1.deployments

import com.router.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeploymentStreamParamsTest {

    @Test
    fun create() {
        DeploymentStreamParams.builder().id("id").projectId("projectId").startIndex(0.0).build()
    }

    @Test
    fun pathParams() {
        val params = DeploymentStreamParams.builder().id("id").projectId("projectId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DeploymentStreamParams.builder().id("id").projectId("projectId").startIndex(0.0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("projectId", "projectId").put("startIndex", "0.0").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DeploymentStreamParams.builder().id("id").projectId("projectId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("projectId", "projectId").build())
    }
}
