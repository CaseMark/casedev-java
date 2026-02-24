// File generated from our OpenAPI spec by Stainless.

package dev.case.models.compute.v1.instances

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstanceRetrieveParamsTest {

    @Test
    fun create() {
        InstanceRetrieveParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = InstanceRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
