// File generated from our OpenAPI spec by Stainless.

package dev.case.models.agent.v1.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.JsonValue
import dev.case.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentRetrieveResponseTest {

    @Test
    fun create() {
        val agentRetrieveResponse =
            AgentRetrieveResponse.builder()
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
                .addVaultId("string")
                .build()

        assertThat(agentRetrieveResponse.id()).contains("id")
        assertThat(agentRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentRetrieveResponse.description()).contains("description")
        assertThat(agentRetrieveResponse.disabledTools().getOrNull()).containsExactly("string")
        assertThat(agentRetrieveResponse.enabledTools().getOrNull()).containsExactly("string")
        assertThat(agentRetrieveResponse.instructions()).contains("instructions")
        assertThat(agentRetrieveResponse.isActive()).contains(true)
        assertThat(agentRetrieveResponse.model()).contains("model")
        assertThat(agentRetrieveResponse.name()).contains("name")
        assertThat(agentRetrieveResponse._sandbox()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(agentRetrieveResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(agentRetrieveResponse.vaultIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentRetrieveResponse =
            AgentRetrieveResponse.builder()
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
                .addVaultId("string")
                .build()

        val roundtrippedAgentRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentRetrieveResponse),
                jacksonTypeRef<AgentRetrieveResponse>(),
            )

        assertThat(roundtrippedAgentRetrieveResponse).isEqualTo(agentRetrieveResponse)
    }
}
