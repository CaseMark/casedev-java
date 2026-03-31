// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.execute

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExecuteCreateParamsTest {

    @Test
    fun create() {
        ExecuteCreateParams.builder()
            .prompt("prompt")
            .addDisabledTool("string")
            .addEnabledTool("string")
            .guidance("guidance")
            .instructions("instructions")
            .model("model")
            .addObjectId("string")
            .sandbox(ExecuteCreateParams.Sandbox.builder().cpu(0L).memoryMiB(0L).build())
            .addVaultId("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            ExecuteCreateParams.builder()
                .prompt("prompt")
                .addDisabledTool("string")
                .addEnabledTool("string")
                .guidance("guidance")
                .instructions("instructions")
                .model("model")
                .addObjectId("string")
                .sandbox(ExecuteCreateParams.Sandbox.builder().cpu(0L).memoryMiB(0L).build())
                .addVaultId("string")
                .build()

        val body = params._body()

        assertThat(body.prompt()).isEqualTo("prompt")
        assertThat(body.disabledTools().getOrNull()).containsExactly("string")
        assertThat(body.enabledTools().getOrNull()).containsExactly("string")
        assertThat(body.guidance()).contains("guidance")
        assertThat(body.instructions()).contains("instructions")
        assertThat(body.model()).contains("model")
        assertThat(body.objectIds().getOrNull()).containsExactly("string")
        assertThat(body.sandbox())
            .contains(ExecuteCreateParams.Sandbox.builder().cpu(0L).memoryMiB(0L).build())
        assertThat(body.vaultIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ExecuteCreateParams.builder().prompt("prompt").build()

        val body = params._body()

        assertThat(body.prompt()).isEqualTo("prompt")
    }
}
