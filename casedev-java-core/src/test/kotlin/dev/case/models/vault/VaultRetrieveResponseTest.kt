// File generated from our OpenAPI spec by Stainless.

package dev.case.models.vault

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.JsonValue
import dev.case.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultRetrieveResponseTest {

    @Test
    fun create() {
        val vaultRetrieveResponse =
            VaultRetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filesBucket("filesBucket")
                .name("name")
                .region("region")
                .chunkStrategy(
                    VaultRetrieveResponse.ChunkStrategy.builder()
                        .chunkSize(0L)
                        .method("method")
                        .minChunkSize(0L)
                        .overlap(0L)
                        .build()
                )
                .description("description")
                .enableGraph(true)
                .indexName("indexName")
                .kmsKeyId("kmsKeyId")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .totalBytes(0L)
                .totalObjects(0L)
                .totalVectors(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vectorBucket("vectorBucket")
                .build()

        assertThat(vaultRetrieveResponse.id()).isEqualTo("id")
        assertThat(vaultRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(vaultRetrieveResponse.filesBucket()).isEqualTo("filesBucket")
        assertThat(vaultRetrieveResponse.name()).isEqualTo("name")
        assertThat(vaultRetrieveResponse.region()).isEqualTo("region")
        assertThat(vaultRetrieveResponse.chunkStrategy())
            .contains(
                VaultRetrieveResponse.ChunkStrategy.builder()
                    .chunkSize(0L)
                    .method("method")
                    .minChunkSize(0L)
                    .overlap(0L)
                    .build()
            )
        assertThat(vaultRetrieveResponse.description()).contains("description")
        assertThat(vaultRetrieveResponse.enableGraph()).contains(true)
        assertThat(vaultRetrieveResponse.indexName()).contains("indexName")
        assertThat(vaultRetrieveResponse.kmsKeyId()).contains("kmsKeyId")
        assertThat(vaultRetrieveResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
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
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filesBucket("filesBucket")
                .name("name")
                .region("region")
                .chunkStrategy(
                    VaultRetrieveResponse.ChunkStrategy.builder()
                        .chunkSize(0L)
                        .method("method")
                        .minChunkSize(0L)
                        .overlap(0L)
                        .build()
                )
                .description("description")
                .enableGraph(true)
                .indexName("indexName")
                .kmsKeyId("kmsKeyId")
                .metadata(JsonValue.from(mapOf<String, Any>()))
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
