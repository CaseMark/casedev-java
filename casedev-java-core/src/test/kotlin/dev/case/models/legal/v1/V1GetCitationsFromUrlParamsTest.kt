// File generated from our OpenAPI spec by Stainless.

package dev.case.models.legal.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1GetCitationsFromUrlParamsTest {

    @Test
    fun create() {
        V1GetCitationsFromUrlParams.builder().url("https://example.com").build()
    }

    @Test
    fun body() {
        val params = V1GetCitationsFromUrlParams.builder().url("https://example.com").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
