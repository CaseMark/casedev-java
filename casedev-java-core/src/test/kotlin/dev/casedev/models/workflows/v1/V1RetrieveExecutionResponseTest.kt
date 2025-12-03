// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1RetrieveExecutionResponseTest {

    @Test
    fun create() {
        val v1RetrieveExecutionResponse =
            V1RetrieveExecutionResponse.builder()
                .id("id")
                .completedAt("completedAt")
                .durationMs(0L)
                .error("error")
                .input(JsonValue.from(mapOf<String, Any>()))
                .output(JsonValue.from(mapOf<String, Any>()))
                .startedAt("startedAt")
                .status("status")
                .triggerType("triggerType")
                .workflowId("workflowId")
                .build()

        assertThat(v1RetrieveExecutionResponse.id()).contains("id")
        assertThat(v1RetrieveExecutionResponse.completedAt()).contains("completedAt")
        assertThat(v1RetrieveExecutionResponse.durationMs()).contains(0L)
        assertThat(v1RetrieveExecutionResponse.error()).contains("error")
        assertThat(v1RetrieveExecutionResponse._input())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(v1RetrieveExecutionResponse._output())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(v1RetrieveExecutionResponse.startedAt()).contains("startedAt")
        assertThat(v1RetrieveExecutionResponse.status()).contains("status")
        assertThat(v1RetrieveExecutionResponse.triggerType()).contains("triggerType")
        assertThat(v1RetrieveExecutionResponse.workflowId()).contains("workflowId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1RetrieveExecutionResponse =
            V1RetrieveExecutionResponse.builder()
                .id("id")
                .completedAt("completedAt")
                .durationMs(0L)
                .error("error")
                .input(JsonValue.from(mapOf<String, Any>()))
                .output(JsonValue.from(mapOf<String, Any>()))
                .startedAt("startedAt")
                .status("status")
                .triggerType("triggerType")
                .workflowId("workflowId")
                .build()

        val roundtrippedV1RetrieveExecutionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1RetrieveExecutionResponse),
                jacksonTypeRef<V1RetrieveExecutionResponse>(),
            )

        assertThat(roundtrippedV1RetrieveExecutionResponse).isEqualTo(v1RetrieveExecutionResponse)
    }
}
