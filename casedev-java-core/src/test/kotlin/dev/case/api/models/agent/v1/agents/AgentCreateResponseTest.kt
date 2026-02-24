// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.JsonValue
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentCreateResponseTest {

    @Test
    fun create() {
        val agentCreateResponse =
            AgentCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .addDisabledTool("string")
                .addEnabledTool("string")
                .instructions("instructions")
                .model("model")
                .name("name")
                .sandbox(JsonValue.from(mapOf<String, Any>()))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addVaultId("string")
                .build()

        assertThat(agentCreateResponse.id()).contains("id")
        assertThat(agentCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentCreateResponse.description()).contains("description")
        assertThat(agentCreateResponse.disabledTools().getOrNull()).containsExactly("string")
        assertThat(agentCreateResponse.enabledTools().getOrNull()).containsExactly("string")
        assertThat(agentCreateResponse.instructions()).contains("instructions")
        assertThat(agentCreateResponse.model()).contains("model")
        assertThat(agentCreateResponse.name()).contains("name")
        assertThat(agentCreateResponse._sandbox()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(agentCreateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentCreateResponse.vaultIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentCreateResponse =
            AgentCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .addDisabledTool("string")
                .addEnabledTool("string")
                .instructions("instructions")
                .model("model")
                .name("name")
                .sandbox(JsonValue.from(mapOf<String, Any>()))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addVaultId("string")
                .build()

        val roundtrippedAgentCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentCreateResponse),
                jacksonTypeRef<AgentCreateResponse>(),
            )

        assertThat(roundtrippedAgentCreateResponse).isEqualTo(agentCreateResponse)
    }
}
