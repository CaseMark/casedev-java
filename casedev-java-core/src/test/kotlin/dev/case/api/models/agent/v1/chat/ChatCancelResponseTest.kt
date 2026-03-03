// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCancelResponseTest {

    @Test
    fun create() {
        val chatCancelResponse = ChatCancelResponse.builder().id("id").ok(true).build()

        assertThat(chatCancelResponse.id()).contains("id")
        assertThat(chatCancelResponse.ok()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCancelResponse = ChatCancelResponse.builder().id("id").ok(true).build()

        val roundtrippedChatCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCancelResponse),
                jacksonTypeRef<ChatCancelResponse>(),
            )

        assertThat(roundtrippedChatCancelResponse).isEqualTo(chatCancelResponse)
    }
}
