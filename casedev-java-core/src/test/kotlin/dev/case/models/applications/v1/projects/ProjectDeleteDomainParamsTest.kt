// File generated from our OpenAPI spec by Stainless.

package dev.case.models.applications.v1.projects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectDeleteDomainParamsTest {

    @Test
    fun create() {
        ProjectDeleteDomainParams.builder().id("id").domain("domain").build()
    }

    @Test
    fun pathParams() {
        val params = ProjectDeleteDomainParams.builder().id("id").domain("domain").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("domain")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
