// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1FindResponseTest {

    @Test
    fun create() {
        val v1FindResponse =
            V1FindResponse.builder()
                .addCandidate(
                    V1FindResponse.Candidate.builder()
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
                .build()

        assertThat(v1FindResponse.candidates().getOrNull())
            .containsExactly(
                V1FindResponse.Candidate.builder()
                    .snippet("snippet")
                    .source("source")
                    .title("title")
                    .url("url")
                    .build()
            )
        assertThat(v1FindResponse.found()).contains(0L)
        assertThat(v1FindResponse.hint()).contains("hint")
        assertThat(v1FindResponse.jurisdiction()).contains("jurisdiction")
        assertThat(v1FindResponse.query()).contains("query")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1FindResponse =
            V1FindResponse.builder()
                .addCandidate(
                    V1FindResponse.Candidate.builder()
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
                .build()

        val roundtrippedV1FindResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1FindResponse),
                jacksonTypeRef<V1FindResponse>(),
            )

        assertThat(roundtrippedV1FindResponse).isEqualTo(v1FindResponse)
    }
}
