// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultIngestResponseTest {

    @Test
    fun create() {
        val vaultIngestResponse =
            VaultIngestResponse.builder()
                .enableGraphRag(true)
                .message("message")
                .objectId("objectId")
                .status(VaultIngestResponse.Status.PROCESSING)
                .workflowId("workflowId")
                .build()

        assertThat(vaultIngestResponse.enableGraphRag()).isEqualTo(true)
        assertThat(vaultIngestResponse.message()).isEqualTo("message")
        assertThat(vaultIngestResponse.objectId()).isEqualTo("objectId")
        assertThat(vaultIngestResponse.status()).isEqualTo(VaultIngestResponse.Status.PROCESSING)
        assertThat(vaultIngestResponse.workflowId()).isEqualTo("workflowId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vaultIngestResponse =
            VaultIngestResponse.builder()
                .enableGraphRag(true)
                .message("message")
                .objectId("objectId")
                .status(VaultIngestResponse.Status.PROCESSING)
                .workflowId("workflowId")
                .build()

        val roundtrippedVaultIngestResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vaultIngestResponse),
                jacksonTypeRef<VaultIngestResponse>(),
            )

        assertThat(roundtrippedVaultIngestResponse).isEqualTo(vaultIngestResponse)
    }
}
