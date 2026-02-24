// File generated from our OpenAPI spec by Stainless.

package dev.case.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ResearchResponseTest {

    @Test
    fun create() {
        val v1ResearchResponse =
            V1ResearchResponse.builder()
                .addAdditionalQuery("string")
                .addCandidate(
                    V1ResearchResponse.Candidate.builder()
                        .addHighlight("string")
                        .publishedDate("publishedDate")
                        .snippet("snippet")
                        .source("source")
                        .title("title")
                        .url("url")
                        .build()
                )
                .found(0L)
                .hint("hint")
                .jurisdiction("jurisdiction")
                .query("query")
                .searchType("searchType")
                .build()

        assertThat(v1ResearchResponse.additionalQueries().getOrNull()).containsExactly("string")
        assertThat(v1ResearchResponse.candidates().getOrNull())
            .containsExactly(
                V1ResearchResponse.Candidate.builder()
                    .addHighlight("string")
                    .publishedDate("publishedDate")
                    .snippet("snippet")
                    .source("source")
                    .title("title")
                    .url("url")
                    .build()
            )
        assertThat(v1ResearchResponse.found()).contains(0L)
        assertThat(v1ResearchResponse.hint()).contains("hint")
        assertThat(v1ResearchResponse.jurisdiction()).contains("jurisdiction")
        assertThat(v1ResearchResponse.query()).contains("query")
        assertThat(v1ResearchResponse.searchType()).contains("searchType")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ResearchResponse =
            V1ResearchResponse.builder()
                .addAdditionalQuery("string")
                .addCandidate(
                    V1ResearchResponse.Candidate.builder()
                        .addHighlight("string")
                        .publishedDate("publishedDate")
                        .snippet("snippet")
                        .source("source")
                        .title("title")
                        .url("url")
                        .build()
                )
                .found(0L)
                .hint("hint")
                .jurisdiction("jurisdiction")
                .query("query")
                .searchType("searchType")
                .build()

        val roundtrippedV1ResearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ResearchResponse),
                jacksonTypeRef<V1ResearchResponse>(),
            )

        assertThat(roundtrippedV1ResearchResponse).isEqualTo(v1ResearchResponse)
    }
}
