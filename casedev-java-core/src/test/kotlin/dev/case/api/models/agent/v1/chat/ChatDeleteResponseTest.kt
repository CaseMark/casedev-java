// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.chat

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
                .runtimeMs(0L)
                .snapshotImageId("snapshotImageId")
                .status("status")
                .build()

        assertThat(chatDeleteResponse.id()).contains("id")
        assertThat(chatDeleteResponse.cost()).contains(0.0)
        assertThat(chatDeleteResponse.runtimeMs()).contains(0L)
        assertThat(chatDeleteResponse.snapshotImageId()).contains("snapshotImageId")
        assertThat(chatDeleteResponse.status()).contains("status")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatDeleteResponse =
            ChatDeleteResponse.builder()
                .id("id")
                .cost(0.0)
                .runtimeMs(0L)
                .snapshotImageId("snapshotImageId")
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
