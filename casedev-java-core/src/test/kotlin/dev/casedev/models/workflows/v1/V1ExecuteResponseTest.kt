// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ExecuteResponseTest {

    @Test
    fun create() {
        val v1ExecuteResponse =
            V1ExecuteResponse.builder()
                .result(JsonValue.from(mapOf<String, Any>()))
                .status(V1ExecuteResponse.Status.COMPLETED)
                .usage(
                    V1ExecuteResponse.Usage.builder()
                        .completionTokens(0L)
                        .cost(0.0)
                        .promptTokens(0L)
                        .totalTokens(0L)
                        .build()
                )
                .workflowName("workflow_name")
                .build()

        assertThat(v1ExecuteResponse._result()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(v1ExecuteResponse.status()).contains(V1ExecuteResponse.Status.COMPLETED)
        assertThat(v1ExecuteResponse.usage())
            .contains(
                V1ExecuteResponse.Usage.builder()
                    .completionTokens(0L)
                    .cost(0.0)
                    .promptTokens(0L)
                    .totalTokens(0L)
                    .build()
            )
        assertThat(v1ExecuteResponse.workflowName()).contains("workflow_name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ExecuteResponse =
            V1ExecuteResponse.builder()
                .result(JsonValue.from(mapOf<String, Any>()))
                .status(V1ExecuteResponse.Status.COMPLETED)
                .usage(
                    V1ExecuteResponse.Usage.builder()
                        .completionTokens(0L)
                        .cost(0.0)
                        .promptTokens(0L)
                        .totalTokens(0L)
                        .build()
                )
                .workflowName("workflow_name")
                .build()

        val roundtrippedV1ExecuteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ExecuteResponse),
                jacksonTypeRef<V1ExecuteResponse>(),
            )

        assertThat(roundtrippedV1ExecuteResponse).isEqualTo(v1ExecuteResponse)
    }
}
