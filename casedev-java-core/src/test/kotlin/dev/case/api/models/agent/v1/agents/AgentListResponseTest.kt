// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentListResponseTest {

    @Test
    fun create() {
        val agentListResponse =
            AgentListResponse.builder()
                .addAgent(
                    AgentListResponse.Agent.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .isActive(true)
                        .model("model")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addVaultId("string")
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .build()

        assertThat(agentListResponse.agents().getOrNull())
            .containsExactly(
                AgentListResponse.Agent.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .isActive(true)
                    .model("model")
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addVaultId("string")
                    .build()
            )
        assertThat(agentListResponse.hasMore()).contains(true)
        assertThat(agentListResponse.nextCursor()).contains("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentListResponse =
            AgentListResponse.builder()
                .addAgent(
                    AgentListResponse.Agent.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .isActive(true)
                        .model("model")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addVaultId("string")
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .build()

        val roundtrippedAgentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentListResponse),
                jacksonTypeRef<AgentListResponse>(),
            )

        assertThat(roundtrippedAgentListResponse).isEqualTo(agentListResponse)
    }
}
