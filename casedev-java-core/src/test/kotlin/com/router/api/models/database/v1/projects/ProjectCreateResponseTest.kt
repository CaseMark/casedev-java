// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.database.v1.projects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectCreateResponseTest {

    @Test
    fun create() {
        val projectCreateResponse =
            ProjectCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultBranch(
                    ProjectCreateResponse.DefaultBranch.builder().id("id").name("name").build()
                )
                .name("name")
                .pgVersion(0L)
                .region("region")
                .status(ProjectCreateResponse.Status.ACTIVE)
                .description("description")
                .build()

        assertThat(projectCreateResponse.id()).isEqualTo("id")
        assertThat(projectCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(projectCreateResponse.defaultBranch())
            .isEqualTo(ProjectCreateResponse.DefaultBranch.builder().id("id").name("name").build())
        assertThat(projectCreateResponse.name()).isEqualTo("name")
        assertThat(projectCreateResponse.pgVersion()).isEqualTo(0L)
        assertThat(projectCreateResponse.region()).isEqualTo("region")
        assertThat(projectCreateResponse.status()).isEqualTo(ProjectCreateResponse.Status.ACTIVE)
        assertThat(projectCreateResponse.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val projectCreateResponse =
            ProjectCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultBranch(
                    ProjectCreateResponse.DefaultBranch.builder().id("id").name("name").build()
                )
                .name("name")
                .pgVersion(0L)
                .region("region")
                .status(ProjectCreateResponse.Status.ACTIVE)
                .description("description")
                .build()

        val roundtrippedProjectCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(projectCreateResponse),
                jacksonTypeRef<ProjectCreateResponse>(),
            )

        assertThat(roundtrippedProjectCreateResponse).isEqualTo(projectCreateResponse)
    }
}
