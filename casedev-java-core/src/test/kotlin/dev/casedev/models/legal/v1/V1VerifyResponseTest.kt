// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1VerifyResponseTest {

    @Test
    fun create() {
        val v1VerifyResponse =
            V1VerifyResponse.builder()
                .addCitation(
                    V1VerifyResponse.Citation.builder()
                        .addCandidate(
                            V1VerifyResponse.Citation.Candidate.builder()
                                .court("court")
                                .dateDecided("dateDecided")
                                .name("name")
                                .url("url")
                                .build()
                        )
                        .case_(
                            V1VerifyResponse.Citation.Case.builder()
                                .id(0L)
                                .court("court")
                                .dateDecided("dateDecided")
                                .docketNumber("docketNumber")
                                .name("name")
                                .addParallelCitation("string")
                                .shortName("shortName")
                                .url("url")
                                .build()
                        )
                        .confidence(0.0)
                        .normalized("normalized")
                        .original("original")
                        .span(V1VerifyResponse.Citation.Span.builder().end(0L).start(0L).build())
                        .status(V1VerifyResponse.Citation.Status.VERIFIED)
                        .verificationSource(
                            V1VerifyResponse.Citation.VerificationSource.COURTLISTENER
                        )
                        .build()
                )
                .summary(
                    V1VerifyResponse.Summary.builder()
                        .multipleMatches(0L)
                        .notFound(0L)
                        .total(0L)
                        .verified(0L)
                        .build()
                )
                .build()

        assertThat(v1VerifyResponse.citations().getOrNull())
            .containsExactly(
                V1VerifyResponse.Citation.builder()
                    .addCandidate(
                        V1VerifyResponse.Citation.Candidate.builder()
                            .court("court")
                            .dateDecided("dateDecided")
                            .name("name")
                            .url("url")
                            .build()
                    )
                    .case_(
                        V1VerifyResponse.Citation.Case.builder()
                            .id(0L)
                            .court("court")
                            .dateDecided("dateDecided")
                            .docketNumber("docketNumber")
                            .name("name")
                            .addParallelCitation("string")
                            .shortName("shortName")
                            .url("url")
                            .build()
                    )
                    .confidence(0.0)
                    .normalized("normalized")
                    .original("original")
                    .span(V1VerifyResponse.Citation.Span.builder().end(0L).start(0L).build())
                    .status(V1VerifyResponse.Citation.Status.VERIFIED)
                    .verificationSource(V1VerifyResponse.Citation.VerificationSource.COURTLISTENER)
                    .build()
            )
        assertThat(v1VerifyResponse.summary())
            .contains(
                V1VerifyResponse.Summary.builder()
                    .multipleMatches(0L)
                    .notFound(0L)
                    .total(0L)
                    .verified(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1VerifyResponse =
            V1VerifyResponse.builder()
                .addCitation(
                    V1VerifyResponse.Citation.builder()
                        .addCandidate(
                            V1VerifyResponse.Citation.Candidate.builder()
                                .court("court")
                                .dateDecided("dateDecided")
                                .name("name")
                                .url("url")
                                .build()
                        )
                        .case_(
                            V1VerifyResponse.Citation.Case.builder()
                                .id(0L)
                                .court("court")
                                .dateDecided("dateDecided")
                                .docketNumber("docketNumber")
                                .name("name")
                                .addParallelCitation("string")
                                .shortName("shortName")
                                .url("url")
                                .build()
                        )
                        .confidence(0.0)
                        .normalized("normalized")
                        .original("original")
                        .span(V1VerifyResponse.Citation.Span.builder().end(0L).start(0L).build())
                        .status(V1VerifyResponse.Citation.Status.VERIFIED)
                        .verificationSource(
                            V1VerifyResponse.Citation.VerificationSource.COURTLISTENER
                        )
                        .build()
                )
                .summary(
                    V1VerifyResponse.Summary.builder()
                        .multipleMatches(0L)
                        .notFound(0L)
                        .total(0L)
                        .verified(0L)
                        .build()
                )
                .build()

        val roundtrippedV1VerifyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1VerifyResponse),
                jacksonTypeRef<V1VerifyResponse>(),
            )

        assertThat(roundtrippedV1VerifyResponse).isEqualTo(v1VerifyResponse)
    }
}
