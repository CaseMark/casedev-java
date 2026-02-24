// File generated from our OpenAPI spec by Stainless.

package dev.case.models.database.v1.projects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectListResponseTest {

    @Test
    fun create() {
        val projectListResponse =
            ProjectListResponse.builder()
                .addProject(
                    ProjectListResponse.Project.builder()
                        .id("id")
                        .computeTimeSeconds(0.0)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .addLinkedDeployment(
                            ProjectListResponse.Project.LinkedDeployment.builder()
                                .id("id")
                                .name("name")
                                .type(ProjectListResponse.Project.LinkedDeployment.Type.THURGOOD)
                                .url("url")
                                .build()
                        )
                        .name("name")
                        .pgVersion(0L)
                        .region("region")
                        .status(ProjectListResponse.Project.Status.ACTIVE)
                        .storageSizeBytes(0.0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(projectListResponse.projects())
            .containsExactly(
                ProjectListResponse.Project.builder()
                    .id("id")
                    .computeTimeSeconds(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .addLinkedDeployment(
                        ProjectListResponse.Project.LinkedDeployment.builder()
                            .id("id")
                            .name("name")
                            .type(ProjectListResponse.Project.LinkedDeployment.Type.THURGOOD)
                            .url("url")
                            .build()
                    )
                    .name("name")
                    .pgVersion(0L)
                    .region("region")
                    .status(ProjectListResponse.Project.Status.ACTIVE)
                    .storageSizeBytes(0.0)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val projectListResponse =
            ProjectListResponse.builder()
                .addProject(
                    ProjectListResponse.Project.builder()
                        .id("id")
                        .computeTimeSeconds(0.0)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .addLinkedDeployment(
                            ProjectListResponse.Project.LinkedDeployment.builder()
                                .id("id")
                                .name("name")
                                .type(ProjectListResponse.Project.LinkedDeployment.Type.THURGOOD)
                                .url("url")
                                .build()
                        )
                        .name("name")
                        .pgVersion(0L)
                        .region("region")
                        .status(ProjectListResponse.Project.Status.ACTIVE)
                        .storageSizeBytes(0.0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedProjectListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(projectListResponse),
                jacksonTypeRef<ProjectListResponse>(),
            )

        assertThat(roundtrippedProjectListResponse).isEqualTo(projectListResponse)
    }
}
