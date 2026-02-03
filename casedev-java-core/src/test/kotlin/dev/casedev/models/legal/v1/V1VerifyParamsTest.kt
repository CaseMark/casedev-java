// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.legal.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1VerifyParamsTest {

    @Test
    fun create() {
        V1VerifyParams.builder().text("text").build()
    }

    @Test
    fun body() {
        val params = V1VerifyParams.builder().text("text").build()

        val body = params._body()

        assertThat(body.text()).isEqualTo("text")
    }
}
