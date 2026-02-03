// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.charges

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargeRefundParamsTest {

    @Test
    fun create() {
        ChargeRefundParams.builder().id("id").amount(0L).reason("reason").build()
    }

    @Test
    fun pathParams() {
        val params = ChargeRefundParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = ChargeRefundParams.builder().id("id").amount(0L).reason("reason").build()

        val body = params._body()

        assertThat(body.amount()).contains(0L)
        assertThat(body.reason()).contains("reason")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ChargeRefundParams.builder().id("id").build()

        val body = params._body()
    }
}
