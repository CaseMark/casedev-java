// File generated from our OpenAPI spec by Stainless.

package dev.case.models.agent.v1.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
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
                .build()

        val roundtrippedAgentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentListResponse),
                jacksonTypeRef<AgentListResponse>(),
            )

        assertThat(roundtrippedAgentListResponse).isEqualTo(agentListResponse)
    }
}
