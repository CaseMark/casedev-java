// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.projects.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateParamsTest {

    @Test
    fun create() {
        V1CreateParams.builder()
            .name("name")
            .sourceType(V1CreateParams.SourceType.GITHUB)
            .buildCommand("buildCommand")
            .defaultMemory("defaultMemory")
            .defaultVcpu("defaultVcpu")
            .description("description")
            .framework("framework")
            .githubBranch("githubBranch")
            .githubRepo("githubRepo")
            .installCommand("installCommand")
            .rootDirectory("rootDirectory")
            .s3SourceBucket("s3SourceBucket")
            .s3SourcePrefix("s3SourcePrefix")
            .startCommand("startCommand")
            .thurgoodSessionId("thurgoodSessionId")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CreateParams.builder()
                .name("name")
                .sourceType(V1CreateParams.SourceType.GITHUB)
                .buildCommand("buildCommand")
                .defaultMemory("defaultMemory")
                .defaultVcpu("defaultVcpu")
                .description("description")
                .framework("framework")
                .githubBranch("githubBranch")
                .githubRepo("githubRepo")
                .installCommand("installCommand")
                .rootDirectory("rootDirectory")
                .s3SourceBucket("s3SourceBucket")
                .s3SourcePrefix("s3SourcePrefix")
                .startCommand("startCommand")
                .thurgoodSessionId("thurgoodSessionId")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.sourceType()).isEqualTo(V1CreateParams.SourceType.GITHUB)
        assertThat(body.buildCommand()).contains("buildCommand")
        assertThat(body.defaultMemory()).contains("defaultMemory")
        assertThat(body.defaultVcpu()).contains("defaultVcpu")
        assertThat(body.description()).contains("description")
        assertThat(body.framework()).contains("framework")
        assertThat(body.githubBranch()).contains("githubBranch")
        assertThat(body.githubRepo()).contains("githubRepo")
        assertThat(body.installCommand()).contains("installCommand")
        assertThat(body.rootDirectory()).contains("rootDirectory")
        assertThat(body.s3SourceBucket()).contains("s3SourceBucket")
        assertThat(body.s3SourcePrefix()).contains("s3SourcePrefix")
        assertThat(body.startCommand()).contains("startCommand")
        assertThat(body.thurgoodSessionId()).contains("thurgoodSessionId")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1CreateParams.builder()
                .name("name")
                .sourceType(V1CreateParams.SourceType.GITHUB)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.sourceType()).isEqualTo(V1CreateParams.SourceType.GITHUB)
    }
}
