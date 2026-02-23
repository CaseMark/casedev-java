// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.applications.v1.projects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectCreateDomainParamsTest {

    @Test
    fun create() {
        ProjectCreateDomainParams.builder().id("id").domain("domain").gitBranch("gitBranch").build()
    }

    @Test
    fun pathParams() {
        val params = ProjectCreateDomainParams.builder().id("id").domain("domain").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ProjectCreateDomainParams.builder()
                .id("id")
                .domain("domain")
                .gitBranch("gitBranch")
                .build()

        val body = params._body()

        assertThat(body.domain()).isEqualTo("domain")
        assertThat(body.gitBranch()).contains("gitBranch")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ProjectCreateDomainParams.builder().id("id").domain("domain").build()

        val body = params._body()

        assertThat(body.domain()).isEqualTo("domain")
    }
}
