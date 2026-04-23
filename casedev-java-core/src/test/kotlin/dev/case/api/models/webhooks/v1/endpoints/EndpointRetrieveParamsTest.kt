// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.webhooks.v1.endpoints

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EndpointRetrieveParamsTest {

    @Test
    fun create() {
        EndpointRetrieveParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = EndpointRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
