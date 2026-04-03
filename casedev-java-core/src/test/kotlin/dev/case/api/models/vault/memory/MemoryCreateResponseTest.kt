// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.memory

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemoryCreateResponseTest {

    @Test
    fun create() {
        val memoryCreateResponse =
            MemoryCreateResponse.builder()
                .entry(
                    MemoryCreateResponse.Entry.builder()
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

        assertThat(memoryCreateResponse.entry())
            .contains(
                MemoryCreateResponse.Entry.builder()
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
        val memoryCreateResponse =
            MemoryCreateResponse.builder()
                .entry(
                    MemoryCreateResponse.Entry.builder()
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

        val roundtrippedMemoryCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(memoryCreateResponse),
                jacksonTypeRef<MemoryCreateResponse>(),
            )

        assertThat(roundtrippedMemoryCreateResponse).isEqualTo(memoryCreateResponse)
    }
}
