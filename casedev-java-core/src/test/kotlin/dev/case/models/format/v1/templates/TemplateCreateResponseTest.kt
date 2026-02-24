// File generated from our OpenAPI spec by Stainless.

package dev.case.models.format.v1.templates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateCreateResponseTest {

    @Test
    fun create() {
        val templateCreateResponse =
            TemplateCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .type("type")
                .addVariable("string")
                .build()

        assertThat(templateCreateResponse.id()).contains("id")
        assertThat(templateCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(templateCreateResponse.name()).contains("name")
        assertThat(templateCreateResponse.type()).contains("type")
        assertThat(templateCreateResponse.variables().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val templateCreateResponse =
            TemplateCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .type("type")
                .addVariable("string")
                .build()

        val roundtrippedTemplateCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(templateCreateResponse),
                jacksonTypeRef<TemplateCreateResponse>(),
            )

        assertThat(roundtrippedTemplateCreateResponse).isEqualTo(templateCreateResponse)
    }
}
