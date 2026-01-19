// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.voice.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListVoicesResponseTest {

    @Test
    fun create() {
        val v1ListVoicesResponse =
            V1ListVoicesResponse.builder()
                .nextPageToken("next_page_token")
                .totalCount(0L)
                .addVoice(
                    V1ListVoicesResponse.Voice.builder()
                        .addAvailableForTier("string")
                        .category("category")
                        .description("description")
                        .labels(JsonValue.from(mapOf<String, Any>()))
                        .name("name")
                        .previewUrl("preview_url")
                        .voiceId("voice_id")
                        .build()
                )
                .build()

        assertThat(v1ListVoicesResponse.nextPageToken()).contains("next_page_token")
        assertThat(v1ListVoicesResponse.totalCount()).contains(0L)
        assertThat(v1ListVoicesResponse.voices().getOrNull())
            .containsExactly(
                V1ListVoicesResponse.Voice.builder()
                    .addAvailableForTier("string")
                    .category("category")
                    .description("description")
                    .labels(JsonValue.from(mapOf<String, Any>()))
                    .name("name")
                    .previewUrl("preview_url")
                    .voiceId("voice_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ListVoicesResponse =
            V1ListVoicesResponse.builder()
                .nextPageToken("next_page_token")
                .totalCount(0L)
                .addVoice(
                    V1ListVoicesResponse.Voice.builder()
                        .addAvailableForTier("string")
                        .category("category")
                        .description("description")
                        .labels(JsonValue.from(mapOf<String, Any>()))
                        .name("name")
                        .previewUrl("preview_url")
                        .voiceId("voice_id")
                        .build()
                )
                .build()

        val roundtrippedV1ListVoicesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ListVoicesResponse),
                jacksonTypeRef<V1ListVoicesResponse>(),
            )

        assertThat(roundtrippedV1ListVoicesResponse).isEqualTo(v1ListVoicesResponse)
    }
}
