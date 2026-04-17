// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectGetChunksResponseTest {

    @Test
    fun create() {
        val objectGetChunksResponse =
            ObjectGetChunksResponse.builder()
                .addChunk(
                    ObjectGetChunksResponse.Chunk.builder()
                        .index(0L)
                        .pageEnd(0L)
                        .pageStart(0L)
                        .text("text")
                        .wordEndIndex(0L)
                        .wordStartIndex(0L)
                        .build()
                )
                .objectId("object_id")
                .totalChunks(0L)
                .vaultId("vault_id")
                .build()

        assertThat(objectGetChunksResponse.chunks())
            .containsExactly(
                ObjectGetChunksResponse.Chunk.builder()
                    .index(0L)
                    .pageEnd(0L)
                    .pageStart(0L)
                    .text("text")
                    .wordEndIndex(0L)
                    .wordStartIndex(0L)
                    .build()
            )
        assertThat(objectGetChunksResponse.objectId()).isEqualTo("object_id")
        assertThat(objectGetChunksResponse.totalChunks()).isEqualTo(0L)
        assertThat(objectGetChunksResponse.vaultId()).isEqualTo("vault_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectGetChunksResponse =
            ObjectGetChunksResponse.builder()
                .addChunk(
                    ObjectGetChunksResponse.Chunk.builder()
                        .index(0L)
                        .pageEnd(0L)
                        .pageStart(0L)
                        .text("text")
                        .wordEndIndex(0L)
                        .wordStartIndex(0L)
                        .build()
                )
                .objectId("object_id")
                .totalChunks(0L)
                .vaultId("vault_id")
                .build()

        val roundtrippedObjectGetChunksResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectGetChunksResponse),
                jacksonTypeRef<ObjectGetChunksResponse>(),
            )

        assertThat(roundtrippedObjectGetChunksResponse).isEqualTo(objectGetChunksResponse)
    }
}
