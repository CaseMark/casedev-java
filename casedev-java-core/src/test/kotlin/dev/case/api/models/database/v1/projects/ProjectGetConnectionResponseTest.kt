// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.database.v1.projects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectGetConnectionResponseTest {

    @Test
    fun create() {
        val projectGetConnectionResponse =
            ProjectGetConnectionResponse.builder()
                .branch("branch")
                .connectionUri("https://example.com")
                .pooled(true)
                .build()

        assertThat(projectGetConnectionResponse.branch()).isEqualTo("branch")
        assertThat(projectGetConnectionResponse.connectionUri()).isEqualTo("https://example.com")
        assertThat(projectGetConnectionResponse.pooled()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val projectGetConnectionResponse =
            ProjectGetConnectionResponse.builder()
                .branch("branch")
                .connectionUri("https://example.com")
                .pooled(true)
                .build()

        val roundtrippedProjectGetConnectionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(projectGetConnectionResponse),
                jacksonTypeRef<ProjectGetConnectionResponse>(),
            )

        assertThat(roundtrippedProjectGetConnectionResponse).isEqualTo(projectGetConnectionResponse)
    }
}
