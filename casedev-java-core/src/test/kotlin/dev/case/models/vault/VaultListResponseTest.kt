// File generated from our OpenAPI spec by Stainless.

package dev.case.models.vault

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultListResponseTest {

    @Test
    fun create() {
        val vaultListResponse =
            VaultListResponse.builder()
                .total(0L)
                .addVault(
                    VaultListResponse.Vault.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .enableGraph(true)
                        .name("name")
                        .totalBytes(0L)
                        .totalObjects(0L)
                        .build()
                )
                .build()

        assertThat(vaultListResponse.total()).contains(0L)
        assertThat(vaultListResponse.vaults().getOrNull())
            .containsExactly(
                VaultListResponse.Vault.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .enableGraph(true)
                    .name("name")
                    .totalBytes(0L)
                    .totalObjects(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vaultListResponse =
            VaultListResponse.builder()
                .total(0L)
                .addVault(
                    VaultListResponse.Vault.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .enableGraph(true)
                        .name("name")
                        .totalBytes(0L)
                        .totalObjects(0L)
                        .build()
                )
                .build()

        val roundtrippedVaultListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vaultListResponse),
                jacksonTypeRef<VaultListResponse>(),
            )

        assertThat(roundtrippedVaultListResponse).isEqualTo(vaultListResponse)
    }
}
