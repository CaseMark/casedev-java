// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.transfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferCancelParamsTest {

    @Test
    fun create() {
        TransferCancelParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = TransferCancelParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
