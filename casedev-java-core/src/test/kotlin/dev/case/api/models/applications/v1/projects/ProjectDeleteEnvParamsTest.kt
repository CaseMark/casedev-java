// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.applications.v1.projects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectDeleteEnvParamsTest {

    @Test
    fun create() {
        ProjectDeleteEnvParams.builder().id("id").envId("envId").build()
    }

    @Test
    fun pathParams() {
        val params = ProjectDeleteEnvParams.builder().id("id").envId("envId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("envId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
