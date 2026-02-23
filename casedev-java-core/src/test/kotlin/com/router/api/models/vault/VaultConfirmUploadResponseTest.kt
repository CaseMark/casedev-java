// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.vault

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultConfirmUploadResponseTest {

    @Test
    fun create() {
        val vaultConfirmUploadResponse =
            VaultConfirmUploadResponse.builder()
                .alreadyConfirmed(true)
                .objectId("objectId")
                .status(VaultConfirmUploadResponse.Status.COMPLETED)
                .vaultId("vaultId")
                .build()

        assertThat(vaultConfirmUploadResponse.alreadyConfirmed()).contains(true)
        assertThat(vaultConfirmUploadResponse.objectId()).contains("objectId")
        assertThat(vaultConfirmUploadResponse.status())
            .contains(VaultConfirmUploadResponse.Status.COMPLETED)
        assertThat(vaultConfirmUploadResponse.vaultId()).contains("vaultId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vaultConfirmUploadResponse =
            VaultConfirmUploadResponse.builder()
                .alreadyConfirmed(true)
                .objectId("objectId")
                .status(VaultConfirmUploadResponse.Status.COMPLETED)
                .vaultId("vaultId")
                .build()

        val roundtrippedVaultConfirmUploadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vaultConfirmUploadResponse),
                jacksonTypeRef<VaultConfirmUploadResponse>(),
            )

        assertThat(roundtrippedVaultConfirmUploadResponse).isEqualTo(vaultConfirmUploadResponse)
    }
}
