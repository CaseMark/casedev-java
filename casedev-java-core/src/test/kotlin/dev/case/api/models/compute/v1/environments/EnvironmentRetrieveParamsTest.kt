// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.compute.v1.environments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EnvironmentRetrieveParamsTest {

    @Test
    fun create() {
        EnvironmentRetrieveParams.builder().name("name").build()
    }

    @Test
    fun pathParams() {
        val params = EnvironmentRetrieveParams.builder().name("name").build()

        assertThat(params._pathParam(0)).isEqualTo("name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
