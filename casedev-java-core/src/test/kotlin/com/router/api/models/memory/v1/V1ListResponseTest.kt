// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.memory.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.JsonValue
import com.router.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListResponseTest {

    @Test
    fun create() {
        val v1ListResponse =
            V1ListResponse.builder()
                .count(0L)
                .addResult(
                    V1ListResponse.Result.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .memory("memory")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .tags(JsonValue.from(mapOf<String, Any>()))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(v1ListResponse.count()).contains(0L)
        assertThat(v1ListResponse.results().getOrNull())
            .containsExactly(
                V1ListResponse.Result.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .memory("memory")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .tags(JsonValue.from(mapOf<String, Any>()))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ListResponse =
            V1ListResponse.builder()
                .count(0L)
                .addResult(
                    V1ListResponse.Result.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .memory("memory")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .tags(JsonValue.from(mapOf<String, Any>()))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedV1ListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ListResponse),
                jacksonTypeRef<V1ListResponse>(),
            )

        assertThat(roundtrippedV1ListResponse).isEqualTo(v1ListResponse)
    }
}
