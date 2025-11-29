// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1.environments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnvironmentDeleteParamsTest {

    @Test
    fun create() {
        EnvironmentDeleteParams.builder().name("litigation-processing").build()
    }

    @Test
    fun pathParams() {
        val params = EnvironmentDeleteParams.builder().name("litigation-processing").build()

        assertThat(params._pathParam(0)).isEqualTo("litigation-processing")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
