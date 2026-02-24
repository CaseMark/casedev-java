// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.format.v1.templates

import dev.case.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateCreateParamsTest {

    @Test
    fun create() {
        TemplateCreateParams.builder()
            .content("content")
            .name("name")
            .type(TemplateCreateParams.Type.CAPTION)
            .description("description")
            .styles(JsonValue.from(mapOf<String, Any>()))
            .addTag("string")
            .addVariable("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            TemplateCreateParams.builder()
                .content("content")
                .name("name")
                .type(TemplateCreateParams.Type.CAPTION)
                .description("description")
                .styles(JsonValue.from(mapOf<String, Any>()))
                .addTag("string")
                .addVariable("string")
                .build()

        val body = params._body()

        assertThat(body.content()).isEqualTo("content")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.type()).isEqualTo(TemplateCreateParams.Type.CAPTION)
        assertThat(body.description()).contains("description")
        assertThat(body._styles()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.variables().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TemplateCreateParams.builder()
                .content("content")
                .name("name")
                .type(TemplateCreateParams.Type.CAPTION)
                .build()

        val body = params._body()

        assertThat(body.content()).isEqualTo("content")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.type()).isEqualTo(TemplateCreateParams.Type.CAPTION)
    }
}
