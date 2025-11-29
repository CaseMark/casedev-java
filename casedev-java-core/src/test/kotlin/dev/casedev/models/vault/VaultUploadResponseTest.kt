// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultUploadResponseTest {

    @Test
    fun create() {
        val vaultUploadResponse =
            VaultUploadResponse.builder()
                .autoIndex(true)
                .expiresIn(0.0)
                .instructions(
                    VaultUploadResponse.Instructions.builder()
                        .headers(JsonValue.from(mapOf<String, Any>()))
                        .method("method")
                        .note("note")
                        .build()
                )
                .nextStep("next_step")
                .objectId("objectId")
                .s3Key("s3Key")
                .uploadUrl("uploadUrl")
                .build()

        assertThat(vaultUploadResponse.autoIndex()).contains(true)
        assertThat(vaultUploadResponse.expiresIn()).contains(0.0)
        assertThat(vaultUploadResponse.instructions())
            .contains(
                VaultUploadResponse.Instructions.builder()
                    .headers(JsonValue.from(mapOf<String, Any>()))
                    .method("method")
                    .note("note")
                    .build()
            )
        assertThat(vaultUploadResponse.nextStep()).contains("next_step")
        assertThat(vaultUploadResponse.objectId()).contains("objectId")
        assertThat(vaultUploadResponse.s3Key()).contains("s3Key")
        assertThat(vaultUploadResponse.uploadUrl()).contains("uploadUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vaultUploadResponse =
            VaultUploadResponse.builder()
                .autoIndex(true)
                .expiresIn(0.0)
                .instructions(
                    VaultUploadResponse.Instructions.builder()
                        .headers(JsonValue.from(mapOf<String, Any>()))
                        .method("method")
                        .note("note")
                        .build()
                )
                .nextStep("next_step")
                .objectId("objectId")
                .s3Key("s3Key")
                .uploadUrl("uploadUrl")
                .build()

        val roundtrippedVaultUploadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vaultUploadResponse),
                jacksonTypeRef<VaultUploadResponse>(),
            )

        assertThat(roundtrippedVaultUploadResponse).isEqualTo(vaultUploadResponse)
    }
}
