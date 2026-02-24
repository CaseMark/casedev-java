// File generated from our OpenAPI spec by Stainless.

package dev.case.models.applications.v1.projects

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectCreateParamsTest {

    @Test
    fun create() {
        ProjectCreateParams.builder()
            .gitRepo("gitRepo")
            .name("name")
            .buildCommand("buildCommand")
            .addEnvironmentVariable(
                ProjectCreateParams.EnvironmentVariable.builder()
                    .key("key")
                    .addTarget(ProjectCreateParams.EnvironmentVariable.Target.PRODUCTION)
                    .value("value")
                    .type(ProjectCreateParams.EnvironmentVariable.Type.PLAIN)
                    .build()
            )
            .framework("framework")
            .gitBranch("gitBranch")
            .installCommand("installCommand")
            .outputDirectory("outputDirectory")
            .rootDirectory("rootDirectory")
            .build()
    }

    @Test
    fun body() {
        val params =
            ProjectCreateParams.builder()
                .gitRepo("gitRepo")
                .name("name")
                .buildCommand("buildCommand")
                .addEnvironmentVariable(
                    ProjectCreateParams.EnvironmentVariable.builder()
                        .key("key")
                        .addTarget(ProjectCreateParams.EnvironmentVariable.Target.PRODUCTION)
                        .value("value")
                        .type(ProjectCreateParams.EnvironmentVariable.Type.PLAIN)
                        .build()
                )
                .framework("framework")
                .gitBranch("gitBranch")
                .installCommand("installCommand")
                .outputDirectory("outputDirectory")
                .rootDirectory("rootDirectory")
                .build()

        val body = params._body()

        assertThat(body.gitRepo()).isEqualTo("gitRepo")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.buildCommand()).contains("buildCommand")
        assertThat(body.environmentVariables().getOrNull())
            .containsExactly(
                ProjectCreateParams.EnvironmentVariable.builder()
                    .key("key")
                    .addTarget(ProjectCreateParams.EnvironmentVariable.Target.PRODUCTION)
                    .value("value")
                    .type(ProjectCreateParams.EnvironmentVariable.Type.PLAIN)
                    .build()
            )
        assertThat(body.framework()).contains("framework")
        assertThat(body.gitBranch()).contains("gitBranch")
        assertThat(body.installCommand()).contains("installCommand")
        assertThat(body.outputDirectory()).contains("outputDirectory")
        assertThat(body.rootDirectory()).contains("rootDirectory")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProjectCreateParams.builder().gitRepo("gitRepo").name("name").build()

        val body = params._body()

        assertThat(body.gitRepo()).isEqualTo("gitRepo")
        assertThat(body.name()).isEqualTo("name")
    }
}
