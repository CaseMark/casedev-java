// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultDeleteResponseTest {

    @Test
    fun create() {
        val vaultDeleteResponse =
            VaultDeleteResponse.builder()
                .deletedVault(
                    VaultDeleteResponse.DeletedVault.builder()
                        .id("id")
                        .bytesFreed(0L)
                        .name("name")
                        .objectsDeleted(0L)
                        .vectorsDeleted(0L)
                        .build()
                )
                .status("status")
                .success(true)
                .build()

        assertThat(vaultDeleteResponse.deletedVault())
            .contains(
                VaultDeleteResponse.DeletedVault.builder()
                    .id("id")
                    .bytesFreed(0L)
                    .name("name")
                    .objectsDeleted(0L)
                    .vectorsDeleted(0L)
                    .build()
            )
        assertThat(vaultDeleteResponse.status()).contains("status")
        assertThat(vaultDeleteResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vaultDeleteResponse =
            VaultDeleteResponse.builder()
                .deletedVault(
                    VaultDeleteResponse.DeletedVault.builder()
                        .id("id")
                        .bytesFreed(0L)
                        .name("name")
                        .objectsDeleted(0L)
                        .vectorsDeleted(0L)
                        .build()
                )
                .status("status")
                .success(true)
                .build()

        val roundtrippedVaultDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vaultDeleteResponse),
                jacksonTypeRef<VaultDeleteResponse>(),
            )

        assertThat(roundtrippedVaultDeleteResponse).isEqualTo(vaultDeleteResponse)
    }
}
