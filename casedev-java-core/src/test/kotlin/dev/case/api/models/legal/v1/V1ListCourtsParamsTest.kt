// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListCourtsParamsTest {

    @Test
    fun create() {
        V1ListCourtsParams.builder()
            .inUseOnly(true)
            .jurisdiction("jurisdiction")
            .limit(1L)
            .offset(0L)
            .query("xx")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1ListCourtsParams.builder()
                .inUseOnly(true)
                .jurisdiction("jurisdiction")
                .limit(1L)
                .offset(0L)
                .query("xx")
                .build()

        val body = params._body()

        assertThat(body.inUseOnly()).contains(true)
        assertThat(body.jurisdiction()).contains("jurisdiction")
        assertThat(body.limit()).contains(1L)
        assertThat(body.offset()).contains(0L)
        assertThat(body.query()).contains("xx")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1ListCourtsParams.builder().build()

        val body = params._body()
    }
}
