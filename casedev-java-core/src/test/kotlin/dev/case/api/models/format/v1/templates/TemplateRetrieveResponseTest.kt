// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.format.v1.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.JsonValue
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateRetrieveResponseTest {

    @Test
    fun create() {
        val templateRetrieveResponse =
            TemplateRetrieveResponse.builder()
                .id("id")
                .content(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("name")
                .organizationId("organizationId")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(templateRetrieveResponse.id()).contains("id")
        assertThat(templateRetrieveResponse._content())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(templateRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(templateRetrieveResponse.description()).contains("description")
        assertThat(templateRetrieveResponse.name()).contains("name")
        assertThat(templateRetrieveResponse.organizationId()).contains("organizationId")
        assertThat(templateRetrieveResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templateRetrieveResponse =
            TemplateRetrieveResponse.builder()
                .id("id")
                .content(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .name("name")
                .organizationId("organizationId")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedTemplateRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templateRetrieveResponse),
                jacksonTypeRef<TemplateRetrieveResponse>(),
            )

        assertThat(roundtrippedTemplateRetrieveResponse).isEqualTo(templateRetrieveResponse)
    }
}
