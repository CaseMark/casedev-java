// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.convert.v1.jobs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobDeleteParamsTest {

    @Test
    fun create() {
        JobDeleteParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = JobDeleteParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
