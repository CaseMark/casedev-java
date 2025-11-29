// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1RetrieveExecutionParamsTest {

    @Test
    fun create() {
        V1RetrieveExecutionParams.builder().id("exec_abc123def456").build()
    }

    @Test
    fun pathParams() {
        val params = V1RetrieveExecutionParams.builder().id("exec_abc123def456").build()

        assertThat(params._pathParam(0)).isEqualTo("exec_abc123def456")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
