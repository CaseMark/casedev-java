// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.database.v1.projects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectCreateParamsTest {

    @Test
    fun create() {
        ProjectCreateParams.builder()
            .name("litigation-docs-db")
            .description("Production database for litigation document management")
            .region(ProjectCreateParams.Region.AWS_US_EAST_1)
            .build()
    }

    @Test
    fun body() {
        val params =
            ProjectCreateParams.builder()
                .name("litigation-docs-db")
                .description("Production database for litigation document management")
                .region(ProjectCreateParams.Region.AWS_US_EAST_1)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("litigation-docs-db")
        assertThat(body.description())
            .contains("Production database for litigation document management")
        assertThat(body.region()).contains(ProjectCreateParams.Region.AWS_US_EAST_1)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProjectCreateParams.builder().name("litigation-docs-db").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("litigation-docs-db")
    }
}
