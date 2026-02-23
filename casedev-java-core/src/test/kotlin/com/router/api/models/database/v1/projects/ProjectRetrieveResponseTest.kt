// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.database.v1.projects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectRetrieveResponseTest {

    @Test
    fun create() {
        val projectRetrieveResponse =
            ProjectRetrieveResponse.builder()
                .id("id")
                .addBranch(
                    ProjectRetrieveResponse.Branch.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isDefault(true)
                        .name("name")
                        .status("status")
                        .build()
                )
                .computeTimeSeconds(0.0)
                .connectionHost("connectionHost")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addDatabase(
                    ProjectRetrieveResponse.Database.builder()
                        .id("id")
                        .name("name")
                        .ownerName("ownerName")
                        .build()
                )
                .addLinkedDeployment(
                    ProjectRetrieveResponse.LinkedDeployment.builder()
                        .id("id")
                        .envVarName("envVarName")
                        .name("name")
                        .type(ProjectRetrieveResponse.LinkedDeployment.Type.THURGOOD)
                        .url("url")
                        .build()
                )
                .name("name")
                .pgVersion(0L)
                .region("region")
                .status(ProjectRetrieveResponse.Status.ACTIVE)
                .storageSizeBytes(0.0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .build()

        assertThat(projectRetrieveResponse.id()).isEqualTo("id")
        assertThat(projectRetrieveResponse.branches())
            .containsExactly(
                ProjectRetrieveResponse.Branch.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isDefault(true)
                    .name("name")
                    .status("status")
                    .build()
            )
        assertThat(projectRetrieveResponse.computeTimeSeconds()).isEqualTo(0.0)
        assertThat(projectRetrieveResponse.connectionHost()).isEqualTo("connectionHost")
        assertThat(projectRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(projectRetrieveResponse.databases())
            .containsExactly(
                ProjectRetrieveResponse.Database.builder()
                    .id("id")
                    .name("name")
                    .ownerName("ownerName")
                    .build()
            )
        assertThat(projectRetrieveResponse.linkedDeployments())
            .containsExactly(
                ProjectRetrieveResponse.LinkedDeployment.builder()
                    .id("id")
                    .envVarName("envVarName")
                    .name("name")
                    .type(ProjectRetrieveResponse.LinkedDeployment.Type.THURGOOD)
                    .url("url")
                    .build()
            )
        assertThat(projectRetrieveResponse.name()).isEqualTo("name")
        assertThat(projectRetrieveResponse.pgVersion()).isEqualTo(0L)
        assertThat(projectRetrieveResponse.region()).isEqualTo("region")
        assertThat(projectRetrieveResponse.status())
            .isEqualTo(ProjectRetrieveResponse.Status.ACTIVE)
        assertThat(projectRetrieveResponse.storageSizeBytes()).isEqualTo(0.0)
        assertThat(projectRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(projectRetrieveResponse.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val projectRetrieveResponse =
            ProjectRetrieveResponse.builder()
                .id("id")
                .addBranch(
                    ProjectRetrieveResponse.Branch.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isDefault(true)
                        .name("name")
                        .status("status")
                        .build()
                )
                .computeTimeSeconds(0.0)
                .connectionHost("connectionHost")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addDatabase(
                    ProjectRetrieveResponse.Database.builder()
                        .id("id")
                        .name("name")
                        .ownerName("ownerName")
                        .build()
                )
                .addLinkedDeployment(
                    ProjectRetrieveResponse.LinkedDeployment.builder()
                        .id("id")
                        .envVarName("envVarName")
                        .name("name")
                        .type(ProjectRetrieveResponse.LinkedDeployment.Type.THURGOOD)
                        .url("url")
                        .build()
                )
                .name("name")
                .pgVersion(0L)
                .region("region")
                .status(ProjectRetrieveResponse.Status.ACTIVE)
                .storageSizeBytes(0.0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .build()

        val roundtrippedProjectRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(projectRetrieveResponse),
                jacksonTypeRef<ProjectRetrieveResponse>(),
            )

        assertThat(roundtrippedProjectRetrieveResponse).isEqualTo(projectRetrieveResponse)
    }
}
