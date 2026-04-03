// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.memory

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemoryListResponseTest {

    @Test
    fun create() {
        val memoryListResponse =
            MemoryListResponse.builder()
                .addEntry(
                    MemoryListResponse.Entry.builder()
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
                .meta(
                    MemoryListResponse.Meta.builder()
                        .chars(0L)
                        .count(0L)
                        .maxChars(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(memoryListResponse.entries().getOrNull())
            .containsExactly(
                MemoryListResponse.Entry.builder()
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
        assertThat(memoryListResponse.meta())
            .contains(
                MemoryListResponse.Meta.builder()
                    .chars(0L)
                    .count(0L)
                    .maxChars(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val memoryListResponse =
            MemoryListResponse.builder()
                .addEntry(
                    MemoryListResponse.Entry.builder()
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
                .meta(
                    MemoryListResponse.Meta.builder()
                        .chars(0L)
                        .count(0L)
                        .maxChars(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedMemoryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memoryListResponse),
                jacksonTypeRef<MemoryListResponse>(),
            )

        assertThat(roundtrippedMemoryListResponse).isEqualTo(memoryListResponse)
    }
}
