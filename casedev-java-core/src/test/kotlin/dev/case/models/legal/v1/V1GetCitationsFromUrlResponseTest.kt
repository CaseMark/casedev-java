// File generated from our OpenAPI spec by Stainless.

package dev.case.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1GetCitationsFromUrlResponseTest {

    @Test
    fun create() {
        val v1GetCitationsFromUrlResponse =
            V1GetCitationsFromUrlResponse.builder()
                .citations(
                    V1GetCitationsFromUrlResponse.Citations.builder()
                        .addCase(
                            V1GetCitationsFromUrlResponse.Citations.Case.builder()
                                .citation("citation")
                                .count(0L)
                                .type("type")
                                .build()
                        )
                        .addRegulation(
                            V1GetCitationsFromUrlResponse.Citations.Regulation.builder()
                                .citation("citation")
                                .count(0L)
                                .type("type")
                                .build()
                        )
                        .addStatute(
                            V1GetCitationsFromUrlResponse.Citations.Statute.builder()
                                .citation("citation")
                                .count(0L)
                                .type("type")
                                .build()
                        )
                        .build()
                )
                .addExternalLink("string")
                .hint("hint")
                .title("title")
                .totalCitations(0L)
                .url("url")
                .build()

        assertThat(v1GetCitationsFromUrlResponse.citations())
            .contains(
                V1GetCitationsFromUrlResponse.Citations.builder()
                    .addCase(
                        V1GetCitationsFromUrlResponse.Citations.Case.builder()
                            .citation("citation")
                            .count(0L)
                            .type("type")
                            .build()
                    )
                    .addRegulation(
                        V1GetCitationsFromUrlResponse.Citations.Regulation.builder()
                            .citation("citation")
                            .count(0L)
                            .type("type")
                            .build()
                    )
                    .addStatute(
                        V1GetCitationsFromUrlResponse.Citations.Statute.builder()
                            .citation("citation")
                            .count(0L)
                            .type("type")
                            .build()
                    )
                    .build()
            )
        assertThat(v1GetCitationsFromUrlResponse.externalLinks().getOrNull())
            .containsExactly("string")
        assertThat(v1GetCitationsFromUrlResponse.hint()).contains("hint")
        assertThat(v1GetCitationsFromUrlResponse.title()).contains("title")
        assertThat(v1GetCitationsFromUrlResponse.totalCitations()).contains(0L)
        assertThat(v1GetCitationsFromUrlResponse.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1GetCitationsFromUrlResponse =
            V1GetCitationsFromUrlResponse.builder()
                .citations(
                    V1GetCitationsFromUrlResponse.Citations.builder()
                        .addCase(
                            V1GetCitationsFromUrlResponse.Citations.Case.builder()
                                .citation("citation")
                                .count(0L)
                                .type("type")
                                .build()
                        )
                        .addRegulation(
                            V1GetCitationsFromUrlResponse.Citations.Regulation.builder()
                                .citation("citation")
                                .count(0L)
                                .type("type")
                                .build()
                        )
                        .addStatute(
                            V1GetCitationsFromUrlResponse.Citations.Statute.builder()
                                .citation("citation")
                                .count(0L)
                                .type("type")
                                .build()
                        )
                        .build()
                )
                .addExternalLink("string")
                .hint("hint")
                .title("title")
                .totalCitations(0L)
                .url("url")
                .build()

        val roundtrippedV1GetCitationsFromUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1GetCitationsFromUrlResponse),
                jacksonTypeRef<V1GetCitationsFromUrlResponse>(),
            )

        assertThat(roundtrippedV1GetCitationsFromUrlResponse)
            .isEqualTo(v1GetCitationsFromUrlResponse)
    }
}
