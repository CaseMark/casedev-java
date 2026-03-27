// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatDeleteResponseTest {

    @Test
    fun create() {
        val chatDeleteResponse =
            ChatDeleteResponse.builder()
                .id("id")
                .cost(0.0)
                .provider("provider")
                .runtimeId("runtimeId")
                .runtimeMs(0L)
                .status("status")
                .build()

        assertThat(chatDeleteResponse.id()).contains("id")
        assertThat(chatDeleteResponse.cost()).contains(0.0)
        assertThat(chatDeleteResponse.provider()).contains("provider")
        assertThat(chatDeleteResponse.runtimeId()).contains("runtimeId")
        assertThat(chatDeleteResponse.runtimeMs()).contains(0L)
        assertThat(chatDeleteResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatDeleteResponse =
            ChatDeleteResponse.builder()
                .id("id")
                .cost(0.0)
                .provider("provider")
                .runtimeId("runtimeId")
                .runtimeMs(0L)
                .status("status")
                .build()

        val roundtrippedChatDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatDeleteResponse),
                jacksonTypeRef<ChatDeleteResponse>(),
            )

        assertThat(roundtrippedChatDeleteResponse).isEqualTo(chatDeleteResponse)
    }
}
