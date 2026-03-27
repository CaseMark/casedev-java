// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.execute

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
                .provider(ExecuteCreateResponse.Provider.DAYTONA)
                .runId("runId")
                .runtimeState(ExecuteCreateResponse.RuntimeState.RUNNING)
                .status(ExecuteCreateResponse.Status.RUNNING)
                .build()

        assertThat(executeCreateResponse.agentId()).contains("agentId")
        assertThat(executeCreateResponse.message()).contains("message")
        assertThat(executeCreateResponse.provider())
            .contains(ExecuteCreateResponse.Provider.DAYTONA)
        assertThat(executeCreateResponse.runId()).contains("runId")
        assertThat(executeCreateResponse.runtimeState())
            .contains(ExecuteCreateResponse.RuntimeState.RUNNING)
        assertThat(executeCreateResponse.status()).contains(ExecuteCreateResponse.Status.RUNNING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val executeCreateResponse =
            ExecuteCreateResponse.builder()
                .agentId("agentId")
                .message("message")
                .provider(ExecuteCreateResponse.Provider.DAYTONA)
                .runId("runId")
                .runtimeState(ExecuteCreateResponse.RuntimeState.RUNNING)
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
