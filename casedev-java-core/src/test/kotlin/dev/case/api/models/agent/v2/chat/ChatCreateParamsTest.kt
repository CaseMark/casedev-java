// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.chat

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCreateParamsTest {

    @Test
    fun create() {
        ChatCreateParams.builder()
            .idleTimeoutMs(0L)
            .instructions("instructions")
            .model("model")
            .title("title")
            .addVaultId("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            ChatCreateParams.builder()
                .idleTimeoutMs(0L)
                .instructions("instructions")
                .model("model")
                .title("title")
                .addVaultId("string")
                .build()

        val body = params._body()

        assertThat(body.idleTimeoutMs()).contains(0L)
        assertThat(body.instructions()).contains("instructions")
        assertThat(body.model()).contains("model")
        assertThat(body.title()).contains("title")
        assertThat(body.vaultIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ChatCreateParams.builder().build()

        val body = params._body()
    }
}
