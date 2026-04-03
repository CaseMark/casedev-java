// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.memory

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemorySearchResponseTest {

    @Test
    fun create() {
        val memorySearchResponse =
            MemorySearchResponse.builder()
                .addResult(
                    MemorySearchResponse.Result.builder()
                        .id("id")
                        .content("content")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdBy("created_by")
                        .source("source")
                        .addTag("string")
                        .type("type")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(memorySearchResponse.results().getOrNull())
            .containsExactly(
                MemorySearchResponse.Result.builder()
                    .id("id")
                    .content("content")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdBy("created_by")
                    .source("source")
                    .addTag("string")
                    .type("type")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val memorySearchResponse =
            MemorySearchResponse.builder()
                .addResult(
                    MemorySearchResponse.Result.builder()
                        .id("id")
                        .content("content")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdBy("created_by")
                        .source("source")
                        .addTag("string")
                        .type("type")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedMemorySearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memorySearchResponse),
                jacksonTypeRef<MemorySearchResponse>(),
            )

        assertThat(roundtrippedMemorySearchResponse).isEqualTo(memorySearchResponse)
    }
}
