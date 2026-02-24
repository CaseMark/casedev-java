// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1SimilarResponseTest {

    @Test
    fun create() {
        val v1SimilarResponse =
            V1SimilarResponse.builder()
                .found(0L)
                .hint("hint")
                .jurisdiction("jurisdiction")
                .addSimilarSource(
                    V1SimilarResponse.SimilarSource.builder()
                        .publishedDate("publishedDate")
                        .snippet("snippet")
                        .source("source")
                        .title("title")
                        .url("url")
                        .build()
                )
                .sourceUrl("sourceUrl")
                .build()

        assertThat(v1SimilarResponse.found()).contains(0L)
        assertThat(v1SimilarResponse.hint()).contains("hint")
        assertThat(v1SimilarResponse.jurisdiction()).contains("jurisdiction")
        assertThat(v1SimilarResponse.similarSources().getOrNull())
            .containsExactly(
                V1SimilarResponse.SimilarSource.builder()
                    .publishedDate("publishedDate")
                    .snippet("snippet")
                    .source("source")
                    .title("title")
                    .url("url")
                    .build()
            )
        assertThat(v1SimilarResponse.sourceUrl()).contains("sourceUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1SimilarResponse =
            V1SimilarResponse.builder()
                .found(0L)
                .hint("hint")
                .jurisdiction("jurisdiction")
                .addSimilarSource(
                    V1SimilarResponse.SimilarSource.builder()
                        .publishedDate("publishedDate")
                        .snippet("snippet")
                        .source("source")
                        .title("title")
                        .url("url")
                        .build()
                )
                .sourceUrl("sourceUrl")
                .build()

        val roundtrippedV1SimilarResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1SimilarResponse),
                jacksonTypeRef<V1SimilarResponse>(),
            )

        assertThat(roundtrippedV1SimilarResponse).isEqualTo(v1SimilarResponse)
    }
}
