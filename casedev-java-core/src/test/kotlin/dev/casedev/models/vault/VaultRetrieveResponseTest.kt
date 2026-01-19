// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultRetrieveResponseTest {

    @Test
    fun create() {
        val vaultRetrieveResponse =
            VaultRetrieveResponse.builder()
                .id("id")
                .chunkStrategy(
                    VaultRetrieveResponse.ChunkStrategy.builder()
                        .chunkSize(0L)
                        .method("method")
                        .minChunkSize(0L)
                        .overlap(0L)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .enableGraph(true)
                .filesBucket("filesBucket")
                .indexName("indexName")
                .kmsKeyId("kmsKeyId")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .region("region")
                .totalBytes(0L)
                .totalObjects(0L)
                .totalVectors(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vectorBucket("vectorBucket")
                .build()

        assertThat(vaultRetrieveResponse.id()).contains("id")
        assertThat(vaultRetrieveResponse.chunkStrategy())
            .contains(
                VaultRetrieveResponse.ChunkStrategy.builder()
                    .chunkSize(0L)
                    .method("method")
                    .minChunkSize(0L)
                    .overlap(0L)
                    .build()
            )
        assertThat(vaultRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(vaultRetrieveResponse.description()).contains("description")
        assertThat(vaultRetrieveResponse.enableGraph()).contains(true)
        assertThat(vaultRetrieveResponse.filesBucket()).contains("filesBucket")
        assertThat(vaultRetrieveResponse.indexName()).contains("indexName")
        assertThat(vaultRetrieveResponse.kmsKeyId()).contains("kmsKeyId")
        assertThat(vaultRetrieveResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(vaultRetrieveResponse.name()).contains("name")
        assertThat(vaultRetrieveResponse.region()).contains("region")
        assertThat(vaultRetrieveResponse.totalBytes()).contains(0L)
        assertThat(vaultRetrieveResponse.totalObjects()).contains(0L)
        assertThat(vaultRetrieveResponse.totalVectors()).contains(0L)
        assertThat(vaultRetrieveResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(vaultRetrieveResponse.vectorBucket()).contains("vectorBucket")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vaultRetrieveResponse =
            VaultRetrieveResponse.builder()
                .id("id")
                .chunkStrategy(
                    VaultRetrieveResponse.ChunkStrategy.builder()
                        .chunkSize(0L)
                        .method("method")
                        .minChunkSize(0L)
                        .overlap(0L)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .enableGraph(true)
                .filesBucket("filesBucket")
                .indexName("indexName")
                .kmsKeyId("kmsKeyId")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .region("region")
                .totalBytes(0L)
                .totalObjects(0L)
                .totalVectors(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vectorBucket("vectorBucket")
                .build()

        val roundtrippedVaultRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vaultRetrieveResponse),
                jacksonTypeRef<VaultRetrieveResponse>(),
            )

        assertThat(roundtrippedVaultRetrieveResponse).isEqualTo(vaultRetrieveResponse)
    }
}
