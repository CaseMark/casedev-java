// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.agent.v1.run

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.JsonValue
import com.router.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunGetDetailsResponseTest {

    @Test
    fun create() {
        val runGetDetailsResponse =
            RunGetDetailsResponse.builder()
                .id("id")
                .agentId("agentId")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .guidance("guidance")
                .model("model")
                .prompt("prompt")
                .result(
                    RunGetDetailsResponse.Result.builder()
                        .logs(
                            RunGetDetailsResponse.Result.Logs.builder()
                                .opencode("opencode")
                                .runner("runner")
                                .build()
                        )
                        .output("output")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(RunGetDetailsResponse.Status.QUEUED)
                .addStep(
                    RunGetDetailsResponse.Step.builder()
                        .id("id")
                        .content("content")
                        .durationMs(0L)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .toolInput(JsonValue.from(mapOf<String, Any>()))
                        .toolName("toolName")
                        .toolOutput(JsonValue.from(mapOf<String, Any>()))
                        .type(RunGetDetailsResponse.Step.Type.OUTPUT)
                        .build()
                )
                .usage(
                    RunGetDetailsResponse.Usage.builder()
                        .durationMs(0L)
                        .inputTokens(0L)
                        .model("model")
                        .outputTokens(0L)
                        .toolCalls(0L)
                        .build()
                )
                .build()

        assertThat(runGetDetailsResponse.id()).contains("id")
        assertThat(runGetDetailsResponse.agentId()).contains("agentId")
        assertThat(runGetDetailsResponse.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runGetDetailsResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runGetDetailsResponse.guidance()).contains("guidance")
        assertThat(runGetDetailsResponse.model()).contains("model")
        assertThat(runGetDetailsResponse.prompt()).contains("prompt")
        assertThat(runGetDetailsResponse.result())
            .contains(
                RunGetDetailsResponse.Result.builder()
                    .logs(
                        RunGetDetailsResponse.Result.Logs.builder()
                            .opencode("opencode")
                            .runner("runner")
                            .build()
                    )
                    .output("output")
                    .build()
            )
        assertThat(runGetDetailsResponse.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runGetDetailsResponse.status()).contains(RunGetDetailsResponse.Status.QUEUED)
        assertThat(runGetDetailsResponse.steps().getOrNull())
            .containsExactly(
                RunGetDetailsResponse.Step.builder()
                    .id("id")
                    .content("content")
                    .durationMs(0L)
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .toolInput(JsonValue.from(mapOf<String, Any>()))
                    .toolName("toolName")
                    .toolOutput(JsonValue.from(mapOf<String, Any>()))
                    .type(RunGetDetailsResponse.Step.Type.OUTPUT)
                    .build()
            )
        assertThat(runGetDetailsResponse.usage())
            .contains(
                RunGetDetailsResponse.Usage.builder()
                    .durationMs(0L)
                    .inputTokens(0L)
                    .model("model")
                    .outputTokens(0L)
                    .toolCalls(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runGetDetailsResponse =
            RunGetDetailsResponse.builder()
                .id("id")
                .agentId("agentId")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .guidance("guidance")
                .model("model")
                .prompt("prompt")
                .result(
                    RunGetDetailsResponse.Result.builder()
                        .logs(
                            RunGetDetailsResponse.Result.Logs.builder()
                                .opencode("opencode")
                                .runner("runner")
                                .build()
                        )
                        .output("output")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(RunGetDetailsResponse.Status.QUEUED)
                .addStep(
                    RunGetDetailsResponse.Step.builder()
                        .id("id")
                        .content("content")
                        .durationMs(0L)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .toolInput(JsonValue.from(mapOf<String, Any>()))
                        .toolName("toolName")
                        .toolOutput(JsonValue.from(mapOf<String, Any>()))
                        .type(RunGetDetailsResponse.Step.Type.OUTPUT)
                        .build()
                )
                .usage(
                    RunGetDetailsResponse.Usage.builder()
                        .durationMs(0L)
                        .inputTokens(0L)
                        .model("model")
                        .outputTokens(0L)
                        .toolCalls(0L)
                        .build()
                )
                .build()

        val roundtrippedRunGetDetailsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runGetDetailsResponse),
                jacksonTypeRef<RunGetDetailsResponse>(),
            )

        assertThat(roundtrippedRunGetDetailsResponse).isEqualTo(runGetDetailsResponse)
    }
}
