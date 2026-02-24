// File generated from our OpenAPI spec by Stainless.

package dev.case.models.database.v1.projects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectCreateBranchParamsTest {

    @Test
    fun create() {
        ProjectCreateBranchParams.builder()
            .id("id")
            .name("staging")
            .parentBranchId("branch_main_123")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ProjectCreateBranchParams.builder().id("id").name("staging").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProjectCreateBranchParams.builder()
                .id("id")
                .name("staging")
                .parentBranchId("branch_main_123")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("staging")
        assertThat(body.parentBranchId()).contains("branch_main_123")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProjectCreateBranchParams.builder().id("id").name("staging").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("staging")
    }
}
