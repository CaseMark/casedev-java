// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.run

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunListResponseTest {

    @Test
    fun create() {
        val runListResponse =
            RunListResponse.builder()
                .hasMore(true)
                .nextCursor("nextCursor")
                .addRun(
                    RunListResponse.Run.builder()
                        .id("id")
                        .agentId("agentId")
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .model("model")
                        .prompt("prompt")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(RunListResponse.Run.Status.QUEUED)
                        .build()
                )
                .build()

        assertThat(runListResponse.hasMore()).contains(true)
        assertThat(runListResponse.nextCursor()).contains("nextCursor")
        assertThat(runListResponse.runs().getOrNull())
            .containsExactly(
                RunListResponse.Run.builder()
                    .id("id")
                    .agentId("agentId")
                    .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .model("model")
                    .prompt("prompt")
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(RunListResponse.Run.Status.QUEUED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runListResponse =
            RunListResponse.builder()
                .hasMore(true)
                .nextCursor("nextCursor")
                .addRun(
                    RunListResponse.Run.builder()
                        .id("id")
                        .agentId("agentId")
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .model("model")
                        .prompt("prompt")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(RunListResponse.Run.Status.QUEUED)
                        .build()
                )
                .build()

        val roundtrippedRunListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runListResponse),
                jacksonTypeRef<RunListResponse>(),
            )

        assertThat(roundtrippedRunListResponse).isEqualTo(runListResponse)
    }
}
