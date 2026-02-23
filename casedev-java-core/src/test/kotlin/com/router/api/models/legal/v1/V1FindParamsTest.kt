// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.legal.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1FindParamsTest {

    @Test
    fun create() {
        V1FindParams.builder().query("xxx").jurisdiction("jurisdiction").numResults(1L).build()
    }

    @Test
    fun body() {
        val params =
            V1FindParams.builder().query("xxx").jurisdiction("jurisdiction").numResults(1L).build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("xxx")
        assertThat(body.jurisdiction()).contains("jurisdiction")
        assertThat(body.numResults()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1FindParams.builder().query("xxx").build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("xxx")
    }
}
