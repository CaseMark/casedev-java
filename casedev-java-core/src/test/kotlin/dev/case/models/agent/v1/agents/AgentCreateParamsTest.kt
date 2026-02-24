// File generated from our OpenAPI spec by Stainless.

package dev.case.models.agent.v1.agents

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentCreateParamsTest {

    @Test
    fun create() {
        AgentCreateParams.builder()
            .instructions("instructions")
            .name("name")
            .description("description")
            .addDisabledTool("string")
            .addEnabledTool("string")
            .model("model")
            .sandbox(AgentCreateParams.Sandbox.builder().cpu(0L).memoryMiB(0L).build())
            .addVaultId("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            AgentCreateParams.builder()
                .instructions("instructions")
                .name("name")
                .description("description")
                .addDisabledTool("string")
                .addEnabledTool("string")
                .model("model")
                .sandbox(AgentCreateParams.Sandbox.builder().cpu(0L).memoryMiB(0L).build())
                .addVaultId("string")
                .build()

        val body = params._body()

        assertThat(body.instructions()).isEqualTo("instructions")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.description()).contains("description")
        assertThat(body.disabledTools().getOrNull()).containsExactly("string")
        assertThat(body.enabledTools().getOrNull()).containsExactly("string")
        assertThat(body.model()).contains("model")
        assertThat(body.sandbox())
            .contains(AgentCreateParams.Sandbox.builder().cpu(0L).memoryMiB(0L).build())
        assertThat(body.vaultIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AgentCreateParams.builder().instructions("instructions").name("name").build()

        val body = params._body()

        assertThat(body.instructions()).isEqualTo("instructions")
        assertThat(body.name()).isEqualTo("name")
    }
}
