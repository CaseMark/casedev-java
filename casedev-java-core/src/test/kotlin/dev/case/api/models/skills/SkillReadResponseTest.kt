// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.JsonValue
import dev.case.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SkillReadResponseTest {

    @Test
    fun create() {
        val skillReadResponse =
            SkillReadResponse.builder()
                .authorName("author_name")
                .content("content")
                .license("license")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .slug("slug")
                .source(SkillReadResponse.Source.CURATED)
                .summary("summary")
                .addTag("string")
                .version("version")
                .build()

        assertThat(skillReadResponse.authorName()).contains("author_name")
        assertThat(skillReadResponse.content()).contains("content")
        assertThat(skillReadResponse.license()).contains("license")
        assertThat(skillReadResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(skillReadResponse.name()).contains("name")
        assertThat(skillReadResponse.slug()).contains("slug")
        assertThat(skillReadResponse.source()).contains(SkillReadResponse.Source.CURATED)
        assertThat(skillReadResponse.summary()).contains("summary")
        assertThat(skillReadResponse.tags().getOrNull()).containsExactly("string")
        assertThat(skillReadResponse.version()).contains("version")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val skillReadResponse =
            SkillReadResponse.builder()
                .authorName("author_name")
                .content("content")
                .license("license")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .slug("slug")
                .source(SkillReadResponse.Source.CURATED)
                .summary("summary")
                .addTag("string")
                .version("version")
                .build()

        val roundtrippedSkillReadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(skillReadResponse),
                jacksonTypeRef<SkillReadResponse>(),
            )

        assertThat(roundtrippedSkillReadResponse).isEqualTo(skillReadResponse)
    }
}
