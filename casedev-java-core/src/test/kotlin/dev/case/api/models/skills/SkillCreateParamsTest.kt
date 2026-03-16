// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills

import dev.case.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SkillCreateParamsTest {

    @Test
    fun create() {
        SkillCreateParams.builder()
            .content("x")
            .name("x")
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .slug("slug")
            .summary("summary")
            .addTag("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            SkillCreateParams.builder()
                .content("x")
                .name("x")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .slug("slug")
                .summary("summary")
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body.content()).isEqualTo("x")
        assertThat(body.name()).isEqualTo("x")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.slug()).contains("slug")
        assertThat(body.summary()).contains("summary")
        assertThat(body.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SkillCreateParams.builder().content("x").name("x").build()

        val body = params._body()

        assertThat(body.content()).isEqualTo("x")
        assertThat(body.name()).isEqualTo("x")
    }
}
