// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.applications.v1.projects

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectCreateDeploymentParamsTest {

    @Test
    fun create() {
        ProjectCreateDeploymentParams.builder()
            .id("id")
            .addEnvironmentVariable(
                ProjectCreateDeploymentParams.EnvironmentVariable.builder()
                    .key("key")
                    .addTarget(ProjectCreateDeploymentParams.EnvironmentVariable.Target.PRODUCTION)
                    .value("value")
                    .type(ProjectCreateDeploymentParams.EnvironmentVariable.Type.PLAIN)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = ProjectCreateDeploymentParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProjectCreateDeploymentParams.builder()
                .id("id")
                .addEnvironmentVariable(
                    ProjectCreateDeploymentParams.EnvironmentVariable.builder()
                        .key("key")
                        .addTarget(
                            ProjectCreateDeploymentParams.EnvironmentVariable.Target.PRODUCTION
                        )
                        .value("value")
                        .type(ProjectCreateDeploymentParams.EnvironmentVariable.Type.PLAIN)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.environmentVariables().getOrNull())
            .containsExactly(
                ProjectCreateDeploymentParams.EnvironmentVariable.builder()
                    .key("key")
                    .addTarget(ProjectCreateDeploymentParams.EnvironmentVariable.Target.PRODUCTION)
                    .value("value")
                    .type(ProjectCreateDeploymentParams.EnvironmentVariable.Type.PLAIN)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProjectCreateDeploymentParams.builder().id("id").build()

        val body = params._body()
    }
}
