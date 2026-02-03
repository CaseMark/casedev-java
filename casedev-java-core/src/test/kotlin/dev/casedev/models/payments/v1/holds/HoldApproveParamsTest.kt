// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.holds

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HoldApproveParamsTest {

    @Test
    fun create() {
        HoldApproveParams.builder().id("id").approverId("approver_id").build()
    }

    @Test
    fun pathParams() {
        val params = HoldApproveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = HoldApproveParams.builder().id("id").approverId("approver_id").build()

        val body = params._body()

        assertThat(body.approverId()).contains("approver_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = HoldApproveParams.builder().id("id").build()

        val body = params._body()
    }
}
