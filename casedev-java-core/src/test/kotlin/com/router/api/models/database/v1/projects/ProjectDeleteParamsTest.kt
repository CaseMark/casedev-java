// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.database.v1.projects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProjectDeleteParamsTest {

    @Test
    fun create() {
        ProjectDeleteParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = ProjectDeleteParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
