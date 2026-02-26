// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.execute

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecuteCreateResponseTest {

    @Test
    fun create() {
        val executeCreateResponse =
            ExecuteCreateResponse.builder()
                .agentId("agentId")
                .message("message")
                .runId("runId")
                .status(ExecuteCreateResponse.Status.RUNNING)
                .build()

        assertThat(executeCreateResponse.agentId()).contains("agentId")
        assertThat(executeCreateResponse.message()).contains("message")
        assertThat(executeCreateResponse.runId()).contains("runId")
        assertThat(executeCreateResponse.status()).contains(ExecuteCreateResponse.Status.RUNNING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val executeCreateResponse =
            ExecuteCreateResponse.builder()
                .agentId("agentId")
                .message("message")
                .runId("runId")
                .status(ExecuteCreateResponse.Status.RUNNING)
                .build()

        val roundtrippedExecuteCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(executeCreateResponse),
                jacksonTypeRef<ExecuteCreateResponse>(),
            )

        assertThat(roundtrippedExecuteCreateResponse).isEqualTo(executeCreateResponse)
    }
}
