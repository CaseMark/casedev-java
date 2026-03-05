// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.chat

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCreateParamsTest {

    @Test
    fun create() {
        ChatCreateParams.builder().idleTimeoutMs(0L).model("model").title("title").build()
    }

    @Test
    fun body() {
        val params =
            ChatCreateParams.builder().idleTimeoutMs(0L).model("model").title("title").build()

        val body = params._body()

        assertThat(body.idleTimeoutMs()).contains(0L)
        assertThat(body.model()).contains("model")
        assertThat(body.title()).contains("title")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ChatCreateParams.builder().build()

        val body = params._body()
    }
}
