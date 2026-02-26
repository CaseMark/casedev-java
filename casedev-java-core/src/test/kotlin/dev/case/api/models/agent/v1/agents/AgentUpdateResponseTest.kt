// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.JsonValue
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUpdateResponseTest {

    @Test
    fun create() {
        val agentUpdateResponse =
            AgentUpdateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .addDisabledTool("string")
                .addEnabledTool("string")
                .instructions("instructions")
                .isActive(true)
                .model("model")
                .name("name")
                .sandbox(JsonValue.from(mapOf<String, Any>()))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addVaultGroup("string")
                .addVaultId("string")
                .build()

        assertThat(agentUpdateResponse.id()).contains("id")
        assertThat(agentUpdateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentUpdateResponse.description()).contains("description")
        assertThat(agentUpdateResponse.disabledTools().getOrNull()).containsExactly("string")
        assertThat(agentUpdateResponse.enabledTools().getOrNull()).containsExactly("string")
        assertThat(agentUpdateResponse.instructions()).contains("instructions")
        assertThat(agentUpdateResponse.isActive()).contains(true)
        assertThat(agentUpdateResponse.model()).contains("model")
        assertThat(agentUpdateResponse.name()).contains("name")
        assertThat(agentUpdateResponse._sandbox()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(agentUpdateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentUpdateResponse.vaultGroups().getOrNull()).containsExactly("string")
        assertThat(agentUpdateResponse.vaultIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentUpdateResponse =
            AgentUpdateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .addDisabledTool("string")
                .addEnabledTool("string")
                .instructions("instructions")
                .isActive(true)
                .model("model")
                .name("name")
                .sandbox(JsonValue.from(mapOf<String, Any>()))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addVaultGroup("string")
                .addVaultId("string")
                .build()

        val roundtrippedAgentUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentUpdateResponse),
                jacksonTypeRef<AgentUpdateResponse>(),
            )

        assertThat(roundtrippedAgentUpdateResponse).isEqualTo(agentUpdateResponse)
    }
}
