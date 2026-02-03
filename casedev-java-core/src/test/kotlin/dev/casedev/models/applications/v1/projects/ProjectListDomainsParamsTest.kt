// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.applications.v1.projects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectListDomainsParamsTest {

    @Test
    fun create() {
        ProjectListDomainsParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = ProjectListDomainsParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
