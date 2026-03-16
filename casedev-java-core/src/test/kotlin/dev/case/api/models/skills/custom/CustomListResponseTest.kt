// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills.custom

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.JsonValue
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomListResponseTest {

    @Test
    fun create() {
        val customListResponse =
            CustomListResponse.builder()
                .hasMore(true)
                .nextCursor("next_cursor")
                .addSkill(
                    CustomListResponse.Skill.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .name("name")
                        .slug("slug")
                        .summary("summary")
                        .addTag("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .version(0L)
                        .build()
                )
                .build()

        assertThat(customListResponse.hasMore()).contains(true)
        assertThat(customListResponse.nextCursor()).contains("next_cursor")
        assertThat(customListResponse.skills().getOrNull())
            .containsExactly(
                CustomListResponse.Skill.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .name("name")
                    .slug("slug")
                    .summary("summary")
                    .addTag("string")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .version(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customListResponse =
            CustomListResponse.builder()
                .hasMore(true)
                .nextCursor("next_cursor")
                .addSkill(
                    CustomListResponse.Skill.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .name("name")
                        .slug("slug")
                        .summary("summary")
                        .addTag("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .version(0L)
                        .build()
                )
                .build()

        val roundtrippedCustomListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customListResponse),
                jacksonTypeRef<CustomListResponse>(),
            )

        assertThat(roundtrippedCustomListResponse).isEqualTo(customListResponse)
    }
}
