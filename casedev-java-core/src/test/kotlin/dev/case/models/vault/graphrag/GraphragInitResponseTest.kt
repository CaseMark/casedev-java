// File generated from our OpenAPI spec by Stainless.

package dev.case.models.vault.graphrag

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GraphragInitResponseTest {

    @Test
    fun create() {
        val graphragInitResponse =
            GraphragInitResponse.builder()
                .message("message")
                .status("status")
                .success(true)
                .vaultId("vault_id")
                .build()

        assertThat(graphragInitResponse.message()).contains("message")
        assertThat(graphragInitResponse.status()).contains("status")
        assertThat(graphragInitResponse.success()).contains(true)
        assertThat(graphragInitResponse.vaultId()).contains("vault_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val graphragInitResponse =
            GraphragInitResponse.builder()
                .message("message")
                .status("status")
                .success(true)
                .vaultId("vault_id")
                .build()

        val roundtrippedGraphragInitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(graphragInitResponse),
                jacksonTypeRef<GraphragInitResponse>(),
            )

        assertThat(roundtrippedGraphragInitResponse).isEqualTo(graphragInitResponse)
    }
}
