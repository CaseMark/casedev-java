// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1.environments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnvironmentSetDefaultParamsTest {

    @Test
    fun create() {
        EnvironmentSetDefaultParams.builder().name("prod-legal-docs").build()
    }

    @Test
    fun pathParams() {
        val params = EnvironmentSetDefaultParams.builder().name("prod-legal-docs").build()

        assertThat(params._pathParam(0)).isEqualTo("prod-legal-docs")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
