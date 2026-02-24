// File generated from our OpenAPI spec by Stainless.

package dev.case.models.applications.v1.projects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
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
                        .createdAt("createdAt")
                        .addDomain(
                            ProjectListResponse.Project.Domain.builder()
                                .id("id")
                                .domain("domain")
                                .isPrimary(true)
                                .isVerified(true)
                                .build()
                        )
                        .framework("framework")
                        .gitBranch("gitBranch")
                        .gitRepo("gitRepo")
                        .name("name")
                        .status("status")
                        .updatedAt("updatedAt")
                        .vercelProjectId("vercelProjectId")
                        .build()
                )
                .build()

        assertThat(projectListResponse.projects().getOrNull())
            .containsExactly(
                ProjectListResponse.Project.builder()
                    .id("id")
                    .createdAt("createdAt")
                    .addDomain(
                        ProjectListResponse.Project.Domain.builder()
                            .id("id")
                            .domain("domain")
                            .isPrimary(true)
                            .isVerified(true)
                            .build()
                    )
                    .framework("framework")
                    .gitBranch("gitBranch")
                    .gitRepo("gitRepo")
                    .name("name")
                    .status("status")
                    .updatedAt("updatedAt")
                    .vercelProjectId("vercelProjectId")
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
                        .createdAt("createdAt")
                        .addDomain(
                            ProjectListResponse.Project.Domain.builder()
                                .id("id")
                                .domain("domain")
                                .isPrimary(true)
                                .isVerified(true)
                                .build()
                        )
                        .framework("framework")
                        .gitBranch("gitBranch")
                        .gitRepo("gitRepo")
                        .name("name")
                        .status("status")
                        .updatedAt("updatedAt")
                        .vercelProjectId("vercelProjectId")
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
