// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DeployParamsTest {

    @Test
    fun create() {
        V1DeployParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = V1DeployParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
