// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.shares

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShareListParamsTest {

    @Test
    fun create() {
        ShareListParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = ShareListParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
