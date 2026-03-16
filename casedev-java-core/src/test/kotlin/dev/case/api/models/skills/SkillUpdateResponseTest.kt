// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.JsonValue
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SkillUpdateResponseTest {

    @Test
    fun create() {
        val skillUpdateResponse =
            SkillUpdateResponse.builder()
                .content("content")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .slug("slug")
                .summary("summary")
                .addTag("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0L)
                .build()

        assertThat(skillUpdateResponse.content()).contains("content")
        assertThat(skillUpdateResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(skillUpdateResponse.name()).contains("name")
        assertThat(skillUpdateResponse.slug()).contains("slug")
        assertThat(skillUpdateResponse.summary()).contains("summary")
        assertThat(skillUpdateResponse.tags().getOrNull()).containsExactly("string")
        assertThat(skillUpdateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(skillUpdateResponse.version()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val skillUpdateResponse =
            SkillUpdateResponse.builder()
                .content("content")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .slug("slug")
                .summary("summary")
                .addTag("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0L)
                .build()

        val roundtrippedSkillUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(skillUpdateResponse),
                jacksonTypeRef<SkillUpdateResponse>(),
            )

        assertThat(roundtrippedSkillUpdateResponse).isEqualTo(skillUpdateResponse)
    }
}
