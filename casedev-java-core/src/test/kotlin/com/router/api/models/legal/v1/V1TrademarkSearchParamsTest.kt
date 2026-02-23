// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.legal.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1TrademarkSearchParamsTest {

    @Test
    fun create() {
        V1TrademarkSearchParams.builder()
            .registrationNumber("registrationNumber")
            .serialNumber("serialNumber")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1TrademarkSearchParams.builder()
                .registrationNumber("registrationNumber")
                .serialNumber("serialNumber")
                .build()

        val body = params._body()

        assertThat(body.registrationNumber()).contains("registrationNumber")
        assertThat(body.serialNumber()).contains("serialNumber")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1TrademarkSearchParams.builder().build()

        val body = params._body()
    }
}
