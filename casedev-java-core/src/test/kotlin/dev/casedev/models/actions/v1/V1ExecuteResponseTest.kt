// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.actions.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ExecuteResponseTest {

    @Test
    fun create() {
        val v1ExecuteResponse =
            V1ExecuteResponse.builder()
                .durationMs(0.0)
                .executionId("execution_id")
                .message("message")
                .output(
                    V1ExecuteResponse.Output.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .status(V1ExecuteResponse.Status.COMPLETED)
                .addStepResult(
                    V1ExecuteResponse.StepResult.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .webhookConfigured(true)
                .build()

        assertThat(v1ExecuteResponse.durationMs()).contains(0.0)
        assertThat(v1ExecuteResponse.executionId()).contains("execution_id")
        assertThat(v1ExecuteResponse.message()).contains("message")
        assertThat(v1ExecuteResponse.output())
            .contains(
                V1ExecuteResponse.Output.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(v1ExecuteResponse.status()).contains(V1ExecuteResponse.Status.COMPLETED)
        assertThat(v1ExecuteResponse.stepResults().getOrNull())
            .containsExactly(
                V1ExecuteResponse.StepResult.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(v1ExecuteResponse.webhookConfigured()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ExecuteResponse =
            V1ExecuteResponse.builder()
                .durationMs(0.0)
                .executionId("execution_id")
                .message("message")
                .output(
                    V1ExecuteResponse.Output.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .status(V1ExecuteResponse.Status.COMPLETED)
                .addStepResult(
                    V1ExecuteResponse.StepResult.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .webhookConfigured(true)
                .build()

        val roundtrippedV1ExecuteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ExecuteResponse),
                jacksonTypeRef<V1ExecuteResponse>(),
            )

        assertThat(roundtrippedV1ExecuteResponse).isEqualTo(v1ExecuteResponse)
    }
}
