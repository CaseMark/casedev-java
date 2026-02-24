// File generated from our OpenAPI spec by Stainless.

package dev.case.models.applications.v1.deployments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DeploymentCreateParamsTest {

    @Test
    fun create() {
        DeploymentCreateParams.builder()
            .projectId("projectId")
            .ref("ref")
            .target(DeploymentCreateParams.Target.PRODUCTION)
            .build()
    }

    @Test
    fun body() {
        val params =
            DeploymentCreateParams.builder()
                .projectId("projectId")
                .ref("ref")
                .target(DeploymentCreateParams.Target.PRODUCTION)
                .build()

        val body = params._body()

        assertThat(body.projectId()).isEqualTo("projectId")
        assertThat(body.ref()).contains("ref")
        assertThat(body.target()).contains(DeploymentCreateParams.Target.PRODUCTION)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DeploymentCreateParams.builder().projectId("projectId").build()

        val body = params._body()

        assertThat(body.projectId()).isEqualTo("projectId")
    }
}
