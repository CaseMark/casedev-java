// File generated from our OpenAPI spec by Stainless.

package dev.case.models.database.v1.projects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectCreateBranchResponseTest {

    @Test
    fun create() {
        val projectCreateBranchResponse =
            ProjectCreateBranchResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isDefault(true)
                .name("name")
                .parentBranchId("parentBranchId")
                .status("status")
                .build()

        assertThat(projectCreateBranchResponse.id()).isEqualTo("id")
        assertThat(projectCreateBranchResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(projectCreateBranchResponse.isDefault()).isEqualTo(true)
        assertThat(projectCreateBranchResponse.name()).isEqualTo("name")
        assertThat(projectCreateBranchResponse.parentBranchId()).contains("parentBranchId")
        assertThat(projectCreateBranchResponse.status()).isEqualTo("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val projectCreateBranchResponse =
            ProjectCreateBranchResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isDefault(true)
                .name("name")
                .parentBranchId("parentBranchId")
                .status("status")
                .build()

        val roundtrippedProjectCreateBranchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(projectCreateBranchResponse),
                jacksonTypeRef<ProjectCreateBranchResponse>(),
            )

        assertThat(roundtrippedProjectCreateBranchResponse).isEqualTo(projectCreateBranchResponse)
    }
}
