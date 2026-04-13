// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCreateStreamTokenResponseTest {

    @Test
    fun create() {
        val chatCreateStreamTokenResponse =
            ChatCreateStreamTokenResponse.builder()
                .token("token")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .streamUrl("https://example.com")
                .build()

        assertThat(chatCreateStreamTokenResponse.token()).isEqualTo("token")
        assertThat(chatCreateStreamTokenResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(chatCreateStreamTokenResponse.streamUrl()).isEqualTo("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCreateStreamTokenResponse =
            ChatCreateStreamTokenResponse.builder()
                .token("token")
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .streamUrl("https://example.com")
                .build()

        val roundtrippedChatCreateStreamTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCreateStreamTokenResponse),
                jacksonTypeRef<ChatCreateStreamTokenResponse>(),
            )

        assertThat(roundtrippedChatCreateStreamTokenResponse)
            .isEqualTo(chatCreateStreamTokenResponse)
    }
}
