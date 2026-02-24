// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.llm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.JsonValue
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LlmGetConfigResponseTest {

    @Test
    fun create() {
        val llmGetConfigResponse =
            LlmGetConfigResponse.builder()
                .addModel(
                    LlmGetConfigResponse.Model.builder()
                        .id("id")
                        .modelType("modelType")
                        .name("name")
                        .description("description")
                        .pricing(JsonValue.from(mapOf<String, Any>()))
                        .specification(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(llmGetConfigResponse.models())
            .containsExactly(
                LlmGetConfigResponse.Model.builder()
                    .id("id")
                    .modelType("modelType")
                    .name("name")
                    .description("description")
                    .pricing(JsonValue.from(mapOf<String, Any>()))
                    .specification(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val llmGetConfigResponse =
            LlmGetConfigResponse.builder()
                .addModel(
                    LlmGetConfigResponse.Model.builder()
                        .id("id")
                        .modelType("modelType")
                        .name("name")
                        .description("description")
                        .pricing(JsonValue.from(mapOf<String, Any>()))
                        .specification(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedLlmGetConfigResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(llmGetConfigResponse),
                jacksonTypeRef<LlmGetConfigResponse>(),
            )

        assertThat(roundtrippedLlmGetConfigResponse).isEqualTo(llmGetConfigResponse)
    }
}
