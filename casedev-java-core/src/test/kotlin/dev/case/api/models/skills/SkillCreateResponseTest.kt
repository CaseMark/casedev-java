// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.JsonValue
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SkillCreateResponseTest {

    @Test
    fun create() {
        val skillCreateResponse =
            SkillCreateResponse.builder()
                .content("content")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .slug("slug")
                .summary("summary")
                .addTag("string")
                .version(0L)
                .build()

        assertThat(skillCreateResponse.content()).contains("content")
        assertThat(skillCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(skillCreateResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(skillCreateResponse.name()).contains("name")
        assertThat(skillCreateResponse.slug()).contains("slug")
        assertThat(skillCreateResponse.summary()).contains("summary")
        assertThat(skillCreateResponse.tags().getOrNull()).containsExactly("string")
        assertThat(skillCreateResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val skillCreateResponse =
            SkillCreateResponse.builder()
                .content("content")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .slug("slug")
                .summary("summary")
                .addTag("string")
                .version(0L)
                .build()

        val roundtrippedSkillCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(skillCreateResponse),
                jacksonTypeRef<SkillCreateResponse>(),
            )

        assertThat(roundtrippedSkillCreateResponse).isEqualTo(skillCreateResponse)
    }
}
