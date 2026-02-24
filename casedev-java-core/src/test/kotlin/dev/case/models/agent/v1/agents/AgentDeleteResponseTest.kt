// File generated from our OpenAPI spec by Stainless.

package dev.case.models.agent.v1.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentDeleteResponseTest {

    @Test
    fun create() {
        val agentDeleteResponse = AgentDeleteResponse.builder().ok(true).build()

        assertThat(agentDeleteResponse.ok()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentDeleteResponse = AgentDeleteResponse.builder().ok(true).build()

        val roundtrippedAgentDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentDeleteResponse),
                jacksonTypeRef<AgentDeleteResponse>(),
            )

        assertThat(roundtrippedAgentDeleteResponse).isEqualTo(agentDeleteResponse)
    }
}
