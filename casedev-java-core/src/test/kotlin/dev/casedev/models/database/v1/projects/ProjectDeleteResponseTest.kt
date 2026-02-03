// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.database.v1.projects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectDeleteResponseTest {

    @Test
    fun create() {
        val projectDeleteResponse =
            ProjectDeleteResponse.builder().message("message").success(true).build()

        assertThat(projectDeleteResponse.message()).isEqualTo("message")
        assertThat(projectDeleteResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val projectDeleteResponse =
            ProjectDeleteResponse.builder().message("message").success(true).build()

        val roundtrippedProjectDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(projectDeleteResponse),
                jacksonTypeRef<ProjectDeleteResponse>(),
            )

        assertThat(roundtrippedProjectDeleteResponse).isEqualTo(projectDeleteResponse)
    }
}
