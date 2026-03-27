// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.run

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunExecResponseTest {

    @Test
    fun create() {
        val runExecResponse =
            RunExecResponse.builder()
                .id("id")
                .message("message")
                .provider(RunExecResponse.Provider.DAYTONA)
                .runtimeState(RunExecResponse.RuntimeState.RUNNING)
                .status(RunExecResponse.Status.RUNNING)
                .workflowId("workflowId")
                .build()

        assertThat(runExecResponse.id()).contains("id")
        assertThat(runExecResponse.message()).contains("message")
        assertThat(runExecResponse.provider()).contains(RunExecResponse.Provider.DAYTONA)
        assertThat(runExecResponse.runtimeState()).contains(RunExecResponse.RuntimeState.RUNNING)
        assertThat(runExecResponse.status()).contains(RunExecResponse.Status.RUNNING)
        assertThat(runExecResponse.workflowId()).contains("workflowId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runExecResponse =
            RunExecResponse.builder()
                .id("id")
                .message("message")
                .provider(RunExecResponse.Provider.DAYTONA)
                .runtimeState(RunExecResponse.RuntimeState.RUNNING)
                .status(RunExecResponse.Status.RUNNING)
                .workflowId("workflowId")
                .build()

        val roundtrippedRunExecResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runExecResponse),
                jacksonTypeRef<RunExecResponse>(),
            )

        assertThat(roundtrippedRunExecResponse).isEqualTo(runExecResponse)
    }
}
