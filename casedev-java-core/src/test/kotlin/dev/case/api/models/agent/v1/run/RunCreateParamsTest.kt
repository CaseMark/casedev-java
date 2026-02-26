// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.run

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunCreateParamsTest {

    @Test
    fun create() {
        RunCreateParams.builder()
            .agentId("agentId")
            .prompt("prompt")
            .guidance("guidance")
            .model("model")
            .addObjectId("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            RunCreateParams.builder()
                .agentId("agentId")
                .prompt("prompt")
                .guidance("guidance")
                .model("model")
                .addObjectId("string")
                .build()

        val body = params._body()

        assertThat(body.agentId()).isEqualTo("agentId")
        assertThat(body.prompt()).isEqualTo("prompt")
        assertThat(body.guidance()).contains("guidance")
        assertThat(body.model()).contains("model")
        assertThat(body.objectIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RunCreateParams.builder().agentId("agentId").prompt("prompt").build()

        val body = params._body()

        assertThat(body.agentId()).isEqualTo("agentId")
        assertThat(body.prompt()).isEqualTo("prompt")
    }
}
