// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.legal.v1

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1SimilarParamsTest {

    @Test
    fun create() {
        V1SimilarParams.builder()
            .url("https://example.com")
            .jurisdiction("jurisdiction")
            .numResults(1L)
            .startPublishedDate(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun body() {
        val params =
            V1SimilarParams.builder()
                .url("https://example.com")
                .jurisdiction("jurisdiction")
                .numResults(1L)
                .startPublishedDate(LocalDate.parse("2019-12-27"))
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.jurisdiction()).contains("jurisdiction")
        assertThat(body.numResults()).contains(1L)
        assertThat(body.startPublishedDate()).contains(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1SimilarParams.builder().url("https://example.com").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
