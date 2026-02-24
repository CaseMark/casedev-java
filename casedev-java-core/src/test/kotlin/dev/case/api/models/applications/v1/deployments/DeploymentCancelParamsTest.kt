// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.applications.v1.deployments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeploymentCancelParamsTest {

    @Test
    fun create() {
        DeploymentCancelParams.builder().id("id").projectId("projectId").build()
    }

    @Test
    fun pathParams() {
        val params = DeploymentCancelParams.builder().id("id").projectId("projectId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = DeploymentCancelParams.builder().id("id").projectId("projectId").build()

        val body = params._body()

        assertThat(body.projectId()).isEqualTo("projectId")
    }
}
