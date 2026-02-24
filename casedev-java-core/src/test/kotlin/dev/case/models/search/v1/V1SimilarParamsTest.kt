// File generated from our OpenAPI spec by Stainless.

package dev.case.models.search.v1

import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1SimilarParamsTest {

    @Test
    fun create() {
        V1SimilarParams.builder()
            .url("https://example.com")
            .contents("contents")
            .endCrawlDate(LocalDate.parse("2019-12-27"))
            .endPublishedDate(LocalDate.parse("2019-12-27"))
            .addExcludeDomain("string")
            .addIncludeDomain("string")
            .includeText(true)
            .numResults(1L)
            .startCrawlDate(LocalDate.parse("2019-12-27"))
            .startPublishedDate(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun body() {
        val params =
            V1SimilarParams.builder()
                .url("https://example.com")
                .contents("contents")
                .endCrawlDate(LocalDate.parse("2019-12-27"))
                .endPublishedDate(LocalDate.parse("2019-12-27"))
                .addExcludeDomain("string")
                .addIncludeDomain("string")
                .includeText(true)
                .numResults(1L)
                .startCrawlDate(LocalDate.parse("2019-12-27"))
                .startPublishedDate(LocalDate.parse("2019-12-27"))
                .build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
        assertThat(body.contents()).contains("contents")
        assertThat(body.endCrawlDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.endPublishedDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.excludeDomains().getOrNull()).containsExactly("string")
        assertThat(body.includeDomains().getOrNull()).containsExactly("string")
        assertThat(body.includeText()).contains(true)
        assertThat(body.numResults()).contains(1L)
        assertThat(body.startCrawlDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.startPublishedDate()).contains(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1SimilarParams.builder().url("https://example.com").build()

        val body = params._body()

        assertThat(body.url()).isEqualTo("https://example.com")
    }
}
