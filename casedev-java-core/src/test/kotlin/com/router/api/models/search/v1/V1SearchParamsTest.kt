// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.search.v1

import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1SearchParamsTest {

    @Test
    fun create() {
        V1SearchParams.builder()
            .query("query")
            .addAdditionalQuery("string")
            .category("category")
            .contents("contents")
            .endCrawlDate(LocalDate.parse("2019-12-27"))
            .endPublishedDate(LocalDate.parse("2019-12-27"))
            .addExcludeDomain("string")
            .addIncludeDomain("string")
            .includeText(true)
            .numResults(1L)
            .startCrawlDate(LocalDate.parse("2019-12-27"))
            .startPublishedDate(LocalDate.parse("2019-12-27"))
            .type(V1SearchParams.Type.AUTO)
            .userLocation("userLocation")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1SearchParams.builder()
                .query("query")
                .addAdditionalQuery("string")
                .category("category")
                .contents("contents")
                .endCrawlDate(LocalDate.parse("2019-12-27"))
                .endPublishedDate(LocalDate.parse("2019-12-27"))
                .addExcludeDomain("string")
                .addIncludeDomain("string")
                .includeText(true)
                .numResults(1L)
                .startCrawlDate(LocalDate.parse("2019-12-27"))
                .startPublishedDate(LocalDate.parse("2019-12-27"))
                .type(V1SearchParams.Type.AUTO)
                .userLocation("userLocation")
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("query")
        assertThat(body.additionalQueries().getOrNull()).containsExactly("string")
        assertThat(body.category()).contains("category")
        assertThat(body.contents()).contains("contents")
        assertThat(body.endCrawlDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.endPublishedDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.excludeDomains().getOrNull()).containsExactly("string")
        assertThat(body.includeDomains().getOrNull()).containsExactly("string")
        assertThat(body.includeText()).contains(true)
        assertThat(body.numResults()).contains(1L)
        assertThat(body.startCrawlDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.startPublishedDate()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.type()).contains(V1SearchParams.Type.AUTO)
        assertThat(body.userLocation()).contains("userLocation")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1SearchParams.builder().query("query").build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("query")
    }
}
