// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.chat

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatSendMessageParamsTest {

    @Test
    fun create() {
        ChatSendMessageParams.builder()
            .id("id")
            .model("model")
            .addPart(
                ChatSendMessageParams.Part.builder()
                    .text("text")
                    .type(ChatSendMessageParams.Part.Type.TEXT)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = ChatSendMessageParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ChatSendMessageParams.builder()
                .id("id")
                .model("model")
                .addPart(
                    ChatSendMessageParams.Part.builder()
                        .text("text")
                        .type(ChatSendMessageParams.Part.Type.TEXT)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.model()).contains("model")
        assertThat(body.parts().getOrNull())
            .containsExactly(
                ChatSendMessageParams.Part.builder()
                    .text("text")
                    .type(ChatSendMessageParams.Part.Type.TEXT)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ChatSendMessageParams.builder().id("id").build()

        val body = params._body()
    }
}
