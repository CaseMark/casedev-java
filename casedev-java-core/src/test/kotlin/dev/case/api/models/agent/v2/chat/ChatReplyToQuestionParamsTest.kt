// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.chat

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatReplyToQuestionParamsTest {

    @Test
    fun create() {
        ChatReplyToQuestionParams.builder()
            .id("id")
            .requestId("requestID")
            .addAnswer(listOf("string"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ChatReplyToQuestionParams.builder()
                .id("id")
                .requestId("requestID")
                .addAnswer(listOf("string"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("requestID")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ChatReplyToQuestionParams.builder()
                .id("id")
                .requestId("requestID")
                .addAnswer(listOf("string"))
                .build()

        val body = params._body()

        assertThat(body.answers()).containsExactly(listOf("string"))
    }
}
