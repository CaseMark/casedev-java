// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.execute

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.JsonValue
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecuteCreateResponseTest {

    @Test
    fun create() {
        val executeCreateResponse =
            ExecuteCreateResponse.builder()
                .agentId("agentId")
                .error("error")
                .logs(ExecuteCreateResponse.Logs.builder().linc("linc").runner("runner").build())
                .message("message")
                .output("output")
                .provider(ExecuteCreateResponse.Provider.DAYTONA)
                .runId("runId")
                .runtimeId("runtimeId")
                .runtimeState(ExecuteCreateResponse.RuntimeState.RUNNING)
                .status(ExecuteCreateResponse.Status.RUNNING)
                .usage(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(executeCreateResponse.agentId()).contains("agentId")
        assertThat(executeCreateResponse.error()).contains("error")
        assertThat(executeCreateResponse.logs())
            .contains(ExecuteCreateResponse.Logs.builder().linc("linc").runner("runner").build())
        assertThat(executeCreateResponse.message()).contains("message")
        assertThat(executeCreateResponse.output()).contains("output")
        assertThat(executeCreateResponse.provider())
            .contains(ExecuteCreateResponse.Provider.DAYTONA)
        assertThat(executeCreateResponse.runId()).contains("runId")
        assertThat(executeCreateResponse.runtimeId()).contains("runtimeId")
        assertThat(executeCreateResponse.runtimeState())
            .contains(ExecuteCreateResponse.RuntimeState.RUNNING)
        assertThat(executeCreateResponse.status()).contains(ExecuteCreateResponse.Status.RUNNING)
        assertThat(executeCreateResponse._usage()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val executeCreateResponse =
            ExecuteCreateResponse.builder()
                .agentId("agentId")
                .error("error")
                .logs(ExecuteCreateResponse.Logs.builder().linc("linc").runner("runner").build())
                .message("message")
                .output("output")
                .provider(ExecuteCreateResponse.Provider.DAYTONA)
                .runId("runId")
                .runtimeId("runtimeId")
                .runtimeState(ExecuteCreateResponse.RuntimeState.RUNNING)
                .status(ExecuteCreateResponse.Status.RUNNING)
                .usage(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedExecuteCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(executeCreateResponse),
                jacksonTypeRef<ExecuteCreateResponse>(),
            )

        assertThat(roundtrippedExecuteCreateResponse).isEqualTo(executeCreateResponse)
    }
}
