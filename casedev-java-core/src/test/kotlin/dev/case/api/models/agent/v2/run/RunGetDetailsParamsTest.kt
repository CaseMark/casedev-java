// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.run

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunGetDetailsParamsTest {

    @Test
    fun create() {
        RunGetDetailsParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = RunGetDetailsParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
