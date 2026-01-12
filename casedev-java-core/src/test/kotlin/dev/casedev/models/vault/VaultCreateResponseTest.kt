// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultCreateResponseTest {

    @Test
    fun create() {
        val vaultCreateResponse =
            VaultCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .filesBucket("filesBucket")
                .indexName("indexName")
                .name("name")
                .region("region")
                .vectorBucket("vectorBucket")
                .build()

        assertThat(vaultCreateResponse.id()).contains("id")
        assertThat(vaultCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(vaultCreateResponse.description()).contains("description")
        assertThat(vaultCreateResponse.filesBucket()).contains("filesBucket")
        assertThat(vaultCreateResponse.indexName()).contains("indexName")
        assertThat(vaultCreateResponse.name()).contains("name")
        assertThat(vaultCreateResponse.region()).contains("region")
        assertThat(vaultCreateResponse.vectorBucket()).contains("vectorBucket")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vaultCreateResponse =
            VaultCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .filesBucket("filesBucket")
                .indexName("indexName")
                .name("name")
                .region("region")
                .vectorBucket("vectorBucket")
                .build()

        val roundtrippedVaultCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vaultCreateResponse),
                jacksonTypeRef<VaultCreateResponse>(),
            )

        assertThat(roundtrippedVaultCreateResponse).isEqualTo(vaultCreateResponse)
    }
}
