// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultUpdateResponseTest {

    @Test
    fun create() {
        val vaultUpdateResponse =
            VaultUpdateResponse.builder()
                .id("id")
                .chunkStrategy(JsonValue.from(mapOf<String, Any>()))
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

        assertThat(vaultUpdateResponse.id()).contains("id")
        assertThat(vaultUpdateResponse._chunkStrategy())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(vaultUpdateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(vaultUpdateResponse.description()).contains("description")
        assertThat(vaultUpdateResponse.enableGraph()).contains(true)
        assertThat(vaultUpdateResponse.filesBucket()).contains("filesBucket")
        assertThat(vaultUpdateResponse.indexName()).contains("indexName")
        assertThat(vaultUpdateResponse.kmsKeyId()).contains("kmsKeyId")
        assertThat(vaultUpdateResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(vaultUpdateResponse.name()).contains("name")
        assertThat(vaultUpdateResponse.region()).contains("region")
        assertThat(vaultUpdateResponse.totalBytes()).contains(0L)
        assertThat(vaultUpdateResponse.totalObjects()).contains(0L)
        assertThat(vaultUpdateResponse.totalVectors()).contains(0L)
        assertThat(vaultUpdateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(vaultUpdateResponse.vectorBucket()).contains("vectorBucket")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vaultUpdateResponse =
            VaultUpdateResponse.builder()
                .id("id")
                .chunkStrategy(JsonValue.from(mapOf<String, Any>()))
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

        val roundtrippedVaultUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vaultUpdateResponse),
                jacksonTypeRef<VaultUpdateResponse>(),
            )

        assertThat(roundtrippedVaultUpdateResponse).isEqualTo(vaultUpdateResponse)
    }
}
