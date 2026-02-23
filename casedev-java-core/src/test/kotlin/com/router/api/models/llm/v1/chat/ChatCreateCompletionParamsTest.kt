// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.llm.v1.chat

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCreateCompletionParamsTest {

    @Test
    fun create() {
        ChatCreateCompletionParams.builder()
            .addMessage(
                ChatCreateCompletionParams.Message.builder()
                    .content("content")
                    .role(ChatCreateCompletionParams.Message.Role.SYSTEM)
                    .build()
            )
            .casemarkShowReasoning(false)
            .frequencyPenalty(0.0)
            .maxTokens(1000L)
            .model("casemark/casemark-core-3")
            .presencePenalty(0.0)
            .stream(false)
            .temperature(0.7)
            .topP(0.0)
            .build()
    }

    @Test
    fun body() {
        val params =
            ChatCreateCompletionParams.builder()
                .addMessage(
                    ChatCreateCompletionParams.Message.builder()
                        .content("content")
                        .role(ChatCreateCompletionParams.Message.Role.SYSTEM)
                        .build()
                )
                .casemarkShowReasoning(false)
                .frequencyPenalty(0.0)
                .maxTokens(1000L)
                .model("casemark/casemark-core-3")
                .presencePenalty(0.0)
                .stream(false)
                .temperature(0.7)
                .topP(0.0)
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                ChatCreateCompletionParams.Message.builder()
                    .content("content")
                    .role(ChatCreateCompletionParams.Message.Role.SYSTEM)
                    .build()
            )
        assertThat(body.casemarkShowReasoning()).contains(false)
        assertThat(body.frequencyPenalty()).contains(0.0)
        assertThat(body.maxTokens()).contains(1000L)
        assertThat(body.model()).contains("casemark/casemark-core-3")
        assertThat(body.presencePenalty()).contains(0.0)
        assertThat(body.stream()).contains(false)
        assertThat(body.temperature()).contains(0.7)
        assertThat(body.topP()).contains(0.0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChatCreateCompletionParams.builder()
                .addMessage(ChatCreateCompletionParams.Message.builder().build())
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(ChatCreateCompletionParams.Message.builder().build())
    }
}
