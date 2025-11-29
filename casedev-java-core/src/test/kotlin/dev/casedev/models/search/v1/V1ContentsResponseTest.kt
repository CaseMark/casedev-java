// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.search.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ContentsResponseTest {

    @Test
    fun create() {
        val v1ContentsResponse =
            V1ContentsResponse.builder()
                .addResult(
                    V1ContentsResponse.Result.builder()
                        .addHighlight("string")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .summary("summary")
                        .text("text")
                        .title("title")
                        .url("url")
                        .build()
                )
                .build()

        assertThat(v1ContentsResponse.results().getOrNull())
            .containsExactly(
                V1ContentsResponse.Result.builder()
                    .addHighlight("string")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .summary("summary")
                    .text("text")
                    .title("title")
                    .url("url")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ContentsResponse =
            V1ContentsResponse.builder()
                .addResult(
                    V1ContentsResponse.Result.builder()
                        .addHighlight("string")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .summary("summary")
                        .text("text")
                        .title("title")
                        .url("url")
                        .build()
                )
                .build()

        val roundtrippedV1ContentsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ContentsResponse),
                jacksonTypeRef<V1ContentsResponse>(),
            )

        assertThat(roundtrippedV1ContentsResponse).isEqualTo(v1ContentsResponse)
    }
}
