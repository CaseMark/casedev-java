// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DraftResponseTest {

    @Test
    fun create() {
        val v1DraftResponse =
            V1DraftResponse.builder()
                .agentId("agent_id")
                .message("message")
                .runId("run_id")
                .status(V1DraftResponse.Status.RUNNING)
                .build()

        assertThat(v1DraftResponse.agentId()).contains("agent_id")
        assertThat(v1DraftResponse.message()).contains("message")
        assertThat(v1DraftResponse.runId()).contains("run_id")
        assertThat(v1DraftResponse.status()).contains(V1DraftResponse.Status.RUNNING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1DraftResponse =
            V1DraftResponse.builder()
                .agentId("agent_id")
                .message("message")
                .runId("run_id")
                .status(V1DraftResponse.Status.RUNNING)
                .build()

        val roundtrippedV1DraftResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1DraftResponse),
                jacksonTypeRef<V1DraftResponse>(),
            )

        assertThat(roundtrippedV1DraftResponse).isEqualTo(v1DraftResponse)
    }
}
