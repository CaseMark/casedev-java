// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.shares

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShareDeleteParamsTest {

    @Test
    fun create() {
        ShareDeleteParams.builder().id("id").shareId("shareId").build()
    }

    @Test
    fun pathParams() {
        val params = ShareDeleteParams.builder().id("id").shareId("shareId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("shareId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
