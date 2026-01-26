// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultSearchResponseTest {

    @Test
    fun create() {
        val vaultSearchResponse =
            VaultSearchResponse.builder()
                .addChunk(
                    VaultSearchResponse.Chunk.builder()
                        .chunkIndex(0L)
                        .distance(0.0)
                        .objectId("object_id")
                        .pageEnd(0L)
                        .pageStart(0L)
                        .score(0.0)
                        .source("source")
                        .text("text")
                        .wordEndIndex(0L)
                        .wordStartIndex(0L)
                        .build()
                )
                .method("method")
                .query("query")
                .response("response")
                .addSource(
                    VaultSearchResponse.Source.builder()
                        .id("id")
                        .chunkCount(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filename("filename")
                        .ingestionCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .pageCount(0L)
                        .textLength(0L)
                        .build()
                )
                .vaultId("vault_id")
                .build()

        assertThat(vaultSearchResponse.chunks().getOrNull())
            .containsExactly(
                VaultSearchResponse.Chunk.builder()
                    .chunkIndex(0L)
                    .distance(0.0)
                    .objectId("object_id")
                    .pageEnd(0L)
                    .pageStart(0L)
                    .score(0.0)
                    .source("source")
                    .text("text")
                    .wordEndIndex(0L)
                    .wordStartIndex(0L)
                    .build()
            )
        assertThat(vaultSearchResponse.method()).contains("method")
        assertThat(vaultSearchResponse.query()).contains("query")
        assertThat(vaultSearchResponse.response()).contains("response")
        assertThat(vaultSearchResponse.sources().getOrNull())
            .containsExactly(
                VaultSearchResponse.Source.builder()
                    .id("id")
                    .chunkCount(0L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filename("filename")
                    .ingestionCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .pageCount(0L)
                    .textLength(0L)
                    .build()
            )
        assertThat(vaultSearchResponse.vaultId()).contains("vault_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vaultSearchResponse =
            VaultSearchResponse.builder()
                .addChunk(
                    VaultSearchResponse.Chunk.builder()
                        .chunkIndex(0L)
                        .distance(0.0)
                        .objectId("object_id")
                        .pageEnd(0L)
                        .pageStart(0L)
                        .score(0.0)
                        .source("source")
                        .text("text")
                        .wordEndIndex(0L)
                        .wordStartIndex(0L)
                        .build()
                )
                .method("method")
                .query("query")
                .response("response")
                .addSource(
                    VaultSearchResponse.Source.builder()
                        .id("id")
                        .chunkCount(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filename("filename")
                        .ingestionCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .pageCount(0L)
                        .textLength(0L)
                        .build()
                )
                .vaultId("vault_id")
                .build()

        val roundtrippedVaultSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vaultSearchResponse),
                jacksonTypeRef<VaultSearchResponse>(),
            )

        assertThat(roundtrippedVaultSearchResponse).isEqualTo(vaultSearchResponse)
    }
}
