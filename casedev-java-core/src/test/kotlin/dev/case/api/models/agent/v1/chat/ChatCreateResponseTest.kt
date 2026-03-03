// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCreateResponseTest {

    @Test
    fun create() {
        val chatCreateResponse =
            ChatCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .idleTimeoutMs(0L)
                .status("status")
                .build()

        assertThat(chatCreateResponse.id()).contains("id")
        assertThat(chatCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chatCreateResponse.idleTimeoutMs()).contains(0L)
        assertThat(chatCreateResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCreateResponse =
            ChatCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .idleTimeoutMs(0L)
                .status("status")
                .build()

        val roundtrippedChatCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCreateResponse),
                jacksonTypeRef<ChatCreateResponse>(),
            )

        assertThat(roundtrippedChatCreateResponse).isEqualTo(chatCreateResponse)
    }
}
