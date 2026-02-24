// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.applications.v1.projects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectCreateEnvParamsTest {

    @Test
    fun create() {
        ProjectCreateEnvParams.builder()
            .id("id")
            .key("key")
            .addTarget(ProjectCreateEnvParams.Target.PRODUCTION)
            .value("value")
            .gitBranch("gitBranch")
            .type(ProjectCreateEnvParams.Type.PLAIN)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ProjectCreateEnvParams.builder()
                .id("id")
                .key("key")
                .addTarget(ProjectCreateEnvParams.Target.PRODUCTION)
                .value("value")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProjectCreateEnvParams.builder()
                .id("id")
                .key("key")
                .addTarget(ProjectCreateEnvParams.Target.PRODUCTION)
                .value("value")
                .gitBranch("gitBranch")
                .type(ProjectCreateEnvParams.Type.PLAIN)
                .build()

        val body = params._body()

        assertThat(body.key()).isEqualTo("key")
        assertThat(body.target()).containsExactly(ProjectCreateEnvParams.Target.PRODUCTION)
        assertThat(body.value()).isEqualTo("value")
        assertThat(body.gitBranch()).contains("gitBranch")
        assertThat(body.type()).contains(ProjectCreateEnvParams.Type.PLAIN)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProjectCreateEnvParams.builder()
                .id("id")
                .key("key")
                .addTarget(ProjectCreateEnvParams.Target.PRODUCTION)
                .value("value")
                .build()

        val body = params._body()

        assertThat(body.key()).isEqualTo("key")
        assertThat(body.target()).containsExactly(ProjectCreateEnvParams.Target.PRODUCTION)
        assertThat(body.value()).isEqualTo("value")
    }
}
