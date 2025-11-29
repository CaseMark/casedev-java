// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.search.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1SearchResponseTest {

    @Test
    fun create() {
        val v1SearchResponse =
            V1SearchResponse.builder()
                .query("query")
                .addResult(
                    V1SearchResponse.Result.builder()
                        .domain("domain")
                        .publishedDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .snippet("snippet")
                        .title("title")
                        .url("url")
                        .build()
                )
                .totalResults(0L)
                .build()

        assertThat(v1SearchResponse.query()).contains("query")
        assertThat(v1SearchResponse.results().getOrNull())
            .containsExactly(
                V1SearchResponse.Result.builder()
                    .domain("domain")
                    .publishedDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .snippet("snippet")
                    .title("title")
                    .url("url")
                    .build()
            )
        assertThat(v1SearchResponse.totalResults()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1SearchResponse =
            V1SearchResponse.builder()
                .query("query")
                .addResult(
                    V1SearchResponse.Result.builder()
                        .domain("domain")
                        .publishedDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .snippet("snippet")
                        .title("title")
                        .url("url")
                        .build()
                )
                .totalResults(0L)
                .build()

        val roundtrippedV1SearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1SearchResponse),
                jacksonTypeRef<V1SearchResponse>(),
            )

        assertThat(roundtrippedV1SearchResponse).isEqualTo(v1SearchResponse)
    }
}
