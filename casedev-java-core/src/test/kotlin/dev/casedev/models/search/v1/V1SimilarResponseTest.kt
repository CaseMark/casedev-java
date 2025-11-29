// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.search.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1SimilarResponseTest {

    @Test
    fun create() {
        val v1SimilarResponse =
            V1SimilarResponse.builder()
                .processingTime(0.0)
                .addResult(
                    V1SimilarResponse.Result.builder()
                        .domain("domain")
                        .publishedDate("publishedDate")
                        .similarityScore(0.0)
                        .snippet("snippet")
                        .text("text")
                        .title("title")
                        .url("url")
                        .build()
                )
                .totalResults(0L)
                .build()

        assertThat(v1SimilarResponse.processingTime()).contains(0.0)
        assertThat(v1SimilarResponse.results().getOrNull())
            .containsExactly(
                V1SimilarResponse.Result.builder()
                    .domain("domain")
                    .publishedDate("publishedDate")
                    .similarityScore(0.0)
                    .snippet("snippet")
                    .text("text")
                    .title("title")
                    .url("url")
                    .build()
            )
        assertThat(v1SimilarResponse.totalResults()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1SimilarResponse =
            V1SimilarResponse.builder()
                .processingTime(0.0)
                .addResult(
                    V1SimilarResponse.Result.builder()
                        .domain("domain")
                        .publishedDate("publishedDate")
                        .similarityScore(0.0)
                        .snippet("snippet")
                        .text("text")
                        .title("title")
                        .url("url")
                        .build()
                )
                .totalResults(0L)
                .build()

        val roundtrippedV1SimilarResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1SimilarResponse),
                jacksonTypeRef<V1SimilarResponse>(),
            )

        assertThat(roundtrippedV1SimilarResponse).isEqualTo(v1SimilarResponse)
    }
}
