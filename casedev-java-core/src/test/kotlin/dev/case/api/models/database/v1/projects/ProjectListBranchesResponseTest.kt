// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.database.v1.projects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectListBranchesResponseTest {

    @Test
    fun create() {
        val projectListBranchesResponse =
            ProjectListBranchesResponse.builder()
                .addBranch(
                    ProjectListBranchesResponse.Branch.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isDefault(true)
                        .name("name")
                        .parentBranchId("parentBranchId")
                        .status("status")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(projectListBranchesResponse.branches())
            .containsExactly(
                ProjectListBranchesResponse.Branch.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isDefault(true)
                    .name("name")
                    .parentBranchId("parentBranchId")
                    .status("status")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val projectListBranchesResponse =
            ProjectListBranchesResponse.builder()
                .addBranch(
                    ProjectListBranchesResponse.Branch.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isDefault(true)
                        .name("name")
                        .parentBranchId("parentBranchId")
                        .status("status")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedProjectListBranchesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(projectListBranchesResponse),
                jacksonTypeRef<ProjectListBranchesResponse>(),
            )

        assertThat(roundtrippedProjectListBranchesResponse).isEqualTo(projectListBranchesResponse)
    }
}
