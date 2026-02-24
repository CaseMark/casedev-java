// File generated from our OpenAPI spec by Stainless.

package dev.case.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1GetFullTextResponseTest {

    @Test
    fun create() {
        val v1GetFullTextResponse =
            V1GetFullTextResponse.builder()
                .author("author")
                .characterCount(0L)
                .addHighlight("string")
                .publishedDate("publishedDate")
                .summary("summary")
                .text("text")
                .title("title")
                .url("url")
                .build()

        assertThat(v1GetFullTextResponse.author()).contains("author")
        assertThat(v1GetFullTextResponse.characterCount()).contains(0L)
        assertThat(v1GetFullTextResponse.highlights().getOrNull()).containsExactly("string")
        assertThat(v1GetFullTextResponse.publishedDate()).contains("publishedDate")
        assertThat(v1GetFullTextResponse.summary()).contains("summary")
        assertThat(v1GetFullTextResponse.text()).contains("text")
        assertThat(v1GetFullTextResponse.title()).contains("title")
        assertThat(v1GetFullTextResponse.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1GetFullTextResponse =
            V1GetFullTextResponse.builder()
                .author("author")
                .characterCount(0L)
                .addHighlight("string")
                .publishedDate("publishedDate")
                .summary("summary")
                .text("text")
                .title("title")
                .url("url")
                .build()

        val roundtrippedV1GetFullTextResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1GetFullTextResponse),
                jacksonTypeRef<V1GetFullTextResponse>(),
            )

        assertThat(roundtrippedV1GetFullTextResponse).isEqualTo(v1GetFullTextResponse)
    }
}
