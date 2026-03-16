// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills

import dev.case.api.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SkillUpdateParamsTest {

    @Test
    fun create() {
        SkillUpdateParams.builder()
            .pathSlug("slug")
            .content("content")
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .name("name")
            .bodySlug("slug")
            .summary("summary")
            .addTag("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = SkillUpdateParams.builder().pathSlug("slug").build()

        assertThat(params._pathParam(0)).isEqualTo("slug")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SkillUpdateParams.builder()
                .pathSlug("slug")
                .content("content")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .bodySlug("slug")
                .summary("summary")
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body.content()).contains("content")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.name()).contains("name")
        assertThat(body.bodySlug()).contains("slug")
        assertThat(body.summary()).contains("summary")
        assertThat(body.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SkillUpdateParams.builder().pathSlug("slug").build()

        val body = params._body()
    }
}
