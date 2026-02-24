// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.agents

import dev.case.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUpdateParamsTest {

    @Test
    fun create() {
        AgentUpdateParams.builder()
            .id("id")
            .description("description")
            .addDisabledTool("string")
            .addEnabledTool("string")
            .instructions("instructions")
            .model("model")
            .name("name")
            .sandbox(JsonValue.from(mapOf<String, Any>()))
            .addVaultId("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = AgentUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentUpdateParams.builder()
                .id("id")
                .description("description")
                .addDisabledTool("string")
                .addEnabledTool("string")
                .instructions("instructions")
                .model("model")
                .name("name")
                .sandbox(JsonValue.from(mapOf<String, Any>()))
                .addVaultId("string")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.disabledTools().getOrNull()).containsExactly("string")
        assertThat(body.enabledTools().getOrNull()).containsExactly("string")
        assertThat(body.instructions()).contains("instructions")
        assertThat(body.model()).contains("model")
        assertThat(body.name()).contains("name")
        assertThat(body._sandbox()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.vaultIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AgentUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
