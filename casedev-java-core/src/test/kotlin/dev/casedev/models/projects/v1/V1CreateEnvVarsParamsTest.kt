// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.projects.v1

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateEnvVarsParamsTest {

    @Test
    fun create() {
        V1CreateEnvVarsParams.builder()
            .id("id")
            .addEnvVar(
                V1CreateEnvVarsParams.EnvVar.builder()
                    .environment(V1CreateEnvVarsParams.EnvVar.Environment.PRODUCTION)
                    .key("key")
                    .value("value")
                    .description("description")
                    .isSecret(true)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = V1CreateEnvVarsParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            V1CreateEnvVarsParams.builder()
                .id("id")
                .addEnvVar(
                    V1CreateEnvVarsParams.EnvVar.builder()
                        .environment(V1CreateEnvVarsParams.EnvVar.Environment.PRODUCTION)
                        .key("key")
                        .value("value")
                        .description("description")
                        .isSecret(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.envVars().getOrNull())
            .containsExactly(
                V1CreateEnvVarsParams.EnvVar.builder()
                    .environment(V1CreateEnvVarsParams.EnvVar.Environment.PRODUCTION)
                    .key("key")
                    .value("value")
                    .description("description")
                    .isSecret(true)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1CreateEnvVarsParams.builder().id("id").build()

        val body = params._body()
    }
}
