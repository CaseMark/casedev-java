// File generated from our OpenAPI spec by Stainless.

package dev.case.models.legal.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1GetFullTextParamsTest {

    @Test
    fun create() {
        V1GetFullTextParams.builder()
            .url("https://example.com")
            .highlightQuery("highlightQuery")
            .maxCharacters(1000L)
            .summaryQuery("summaryQuery")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1GetFullTextParams.builder()
                .url("https://example.com")
                .highlightQuery("highlightQuery")
                .maxCharacters(1000L)
                .summaryQuery("summaryQuery")
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.highlightQuery()).contains("highlightQuery")
        assertThat(body.maxCharacters()).contains(1000L)
        assertThat(body.summaryQuery()).contains("summaryQuery")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1GetFullTextParams.builder().url("https://example.com").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
