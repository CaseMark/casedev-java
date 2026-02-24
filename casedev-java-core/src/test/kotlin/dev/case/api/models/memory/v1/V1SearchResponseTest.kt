// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.memory.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.JsonValue
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1SearchResponseTest {

    @Test
    fun create() {
        val v1SearchResponse =
            V1SearchResponse.builder()
                .addResult(
                    V1SearchResponse.Result.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .memory("memory")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .score(0.0)
                        .tags(
                            V1SearchResponse.Result.Tags.builder()
                                .tag1("tag_1")
                                .tag10("tag_10")
                                .tag11("tag_11")
                                .tag12("tag_12")
                                .tag2("tag_2")
                                .tag3("tag_3")
                                .tag4("tag_4")
                                .tag5("tag_5")
                                .tag6("tag_6")
                                .tag7("tag_7")
                                .tag8("tag_8")
                                .tag9("tag_9")
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(v1SearchResponse.results().getOrNull())
            .containsExactly(
                V1SearchResponse.Result.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .memory("memory")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .score(0.0)
                    .tags(
                        V1SearchResponse.Result.Tags.builder()
                            .tag1("tag_1")
                            .tag10("tag_10")
                            .tag11("tag_11")
                            .tag12("tag_12")
                            .tag2("tag_2")
                            .tag3("tag_3")
                            .tag4("tag_4")
                            .tag5("tag_5")
                            .tag6("tag_6")
                            .tag7("tag_7")
                            .tag8("tag_8")
                            .tag9("tag_9")
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1SearchResponse =
            V1SearchResponse.builder()
                .addResult(
                    V1SearchResponse.Result.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .memory("memory")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .score(0.0)
                        .tags(
                            V1SearchResponse.Result.Tags.builder()
                                .tag1("tag_1")
                                .tag10("tag_10")
                                .tag11("tag_11")
                                .tag12("tag_12")
                                .tag2("tag_2")
                                .tag3("tag_3")
                                .tag4("tag_4")
                                .tag5("tag_5")
                                .tag6("tag_6")
                                .tag7("tag_7")
                                .tag8("tag_8")
                                .tag9("tag_9")
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedV1SearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1SearchResponse),
                jacksonTypeRef<V1SearchResponse>(),
            )

        assertThat(roundtrippedV1SearchResponse).isEqualTo(v1SearchResponse)
    }
}
