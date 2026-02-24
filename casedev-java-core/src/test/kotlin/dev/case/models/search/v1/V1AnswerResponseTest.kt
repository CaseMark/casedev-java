// File generated from our OpenAPI spec by Stainless.

package dev.case.models.search.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1AnswerResponseTest {

    @Test
    fun create() {
        val v1AnswerResponse =
            V1AnswerResponse.builder()
                .answer("answer")
                .addCitation(
                    V1AnswerResponse.Citation.builder()
                        .id("id")
                        .publishedDate("publishedDate")
                        .text("text")
                        .title("title")
                        .url("url")
                        .build()
                )
                .model("model")
                .searchType("searchType")
                .build()

        assertThat(v1AnswerResponse.answer()).contains("answer")
        assertThat(v1AnswerResponse.citations().getOrNull())
            .containsExactly(
                V1AnswerResponse.Citation.builder()
                    .id("id")
                    .publishedDate("publishedDate")
                    .text("text")
                    .title("title")
                    .url("url")
                    .build()
            )
        assertThat(v1AnswerResponse.model()).contains("model")
        assertThat(v1AnswerResponse.searchType()).contains("searchType")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1AnswerResponse =
            V1AnswerResponse.builder()
                .answer("answer")
                .addCitation(
                    V1AnswerResponse.Citation.builder()
                        .id("id")
                        .publishedDate("publishedDate")
                        .text("text")
                        .title("title")
                        .url("url")
                        .build()
                )
                .model("model")
                .searchType("searchType")
                .build()

        val roundtrippedV1AnswerResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1AnswerResponse),
                jacksonTypeRef<V1AnswerResponse>(),
            )

        assertThat(roundtrippedV1AnswerResponse).isEqualTo(v1AnswerResponse)
    }
}
