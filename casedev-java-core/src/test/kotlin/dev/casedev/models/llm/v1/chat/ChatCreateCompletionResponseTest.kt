// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.llm.v1.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCreateCompletionResponseTest {

    @Test
    fun create() {
        val chatCreateCompletionResponse =
            ChatCreateCompletionResponse.builder()
                .id("id")
                .addChoice(
                    ChatCreateCompletionResponse.Choice.builder()
                        .finishReason("finish_reason")
                        .index(0L)
                        .message(
                            ChatCreateCompletionResponse.Choice.Message.builder()
                                .content("content")
                                .role("role")
                                .build()
                        )
                        .build()
                )
                .created(0L)
                .model("model")
                .object_("chat.completion")
                .usage(
                    ChatCreateCompletionResponse.Usage.builder()
                        .completionTokens(0L)
                        .cost(0.0)
                        .promptTokens(0L)
                        .totalTokens(0L)
                        .build()
                )
                .build()

        assertThat(chatCreateCompletionResponse.id()).contains("id")
        assertThat(chatCreateCompletionResponse.choices().getOrNull())
            .containsExactly(
                ChatCreateCompletionResponse.Choice.builder()
                    .finishReason("finish_reason")
                    .index(0L)
                    .message(
                        ChatCreateCompletionResponse.Choice.Message.builder()
                            .content("content")
                            .role("role")
                            .build()
                    )
                    .build()
            )
        assertThat(chatCreateCompletionResponse.created()).contains(0L)
        assertThat(chatCreateCompletionResponse.model()).contains("model")
        assertThat(chatCreateCompletionResponse.object_()).contains("chat.completion")
        assertThat(chatCreateCompletionResponse.usage())
            .contains(
                ChatCreateCompletionResponse.Usage.builder()
                    .completionTokens(0L)
                    .cost(0.0)
                    .promptTokens(0L)
                    .totalTokens(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCreateCompletionResponse =
            ChatCreateCompletionResponse.builder()
                .id("id")
                .addChoice(
                    ChatCreateCompletionResponse.Choice.builder()
                        .finishReason("finish_reason")
                        .index(0L)
                        .message(
                            ChatCreateCompletionResponse.Choice.Message.builder()
                                .content("content")
                                .role("role")
                                .build()
                        )
                        .build()
                )
                .created(0L)
                .model("model")
                .object_("chat.completion")
                .usage(
                    ChatCreateCompletionResponse.Usage.builder()
                        .completionTokens(0L)
                        .cost(0.0)
                        .promptTokens(0L)
                        .totalTokens(0L)
                        .build()
                )
                .build()

        val roundtrippedChatCreateCompletionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCreateCompletionResponse),
                jacksonTypeRef<ChatCreateCompletionResponse>(),
            )

        assertThat(roundtrippedChatCreateCompletionResponse).isEqualTo(chatCreateCompletionResponse)
    }
}
