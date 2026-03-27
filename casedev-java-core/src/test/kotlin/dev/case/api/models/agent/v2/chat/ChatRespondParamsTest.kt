// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.chat

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatRespondParamsTest {

    @Test
    fun create() {
        ChatRespondParams.builder()
            .id("id")
            .addPart(
                ChatRespondParams.Part.builder()
                    .text("text")
                    .type(ChatRespondParams.Part.Type.TEXT)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = ChatRespondParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ChatRespondParams.builder()
                .id("id")
                .addPart(
                    ChatRespondParams.Part.builder()
                        .text("text")
                        .type(ChatRespondParams.Part.Type.TEXT)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.parts().getOrNull())
            .containsExactly(
                ChatRespondParams.Part.builder()
                    .text("text")
                    .type(ChatRespondParams.Part.Type.TEXT)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ChatRespondParams.builder().id("id").build()

        val body = params._body()
    }
}
