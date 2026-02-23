// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.format.v1.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.JsonValue
import com.router.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateListResponseTest {

    @Test
    fun create() {
        val templateListResponse =
            TemplateListResponse.builder()
                .addTemplate(
                    TemplateListResponse.Template.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .name("name")
                        .addTag(JsonValue.from(mapOf<String, Any>()))
                        .type("type")
                        .usageCount(0L)
                        .addVariable(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(templateListResponse.templates().getOrNull())
            .containsExactly(
                TemplateListResponse.Template.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .name("name")
                    .addTag(JsonValue.from(mapOf<String, Any>()))
                    .type("type")
                    .usageCount(0L)
                    .addVariable(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templateListResponse =
            TemplateListResponse.builder()
                .addTemplate(
                    TemplateListResponse.Template.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("description")
                        .name("name")
                        .addTag(JsonValue.from(mapOf<String, Any>()))
                        .type("type")
                        .usageCount(0L)
                        .addVariable(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedTemplateListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templateListResponse),
                jacksonTypeRef<TemplateListResponse>(),
            )

        assertThat(roundtrippedTemplateListResponse).isEqualTo(templateListResponse)
    }
}
