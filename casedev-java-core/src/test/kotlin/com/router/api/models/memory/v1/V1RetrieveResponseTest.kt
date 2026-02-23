// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.memory.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.JsonValue
import com.router.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1RetrieveResponseTest {

    @Test
    fun create() {
        val v1RetrieveResponse =
            V1RetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .memory("memory")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(v1RetrieveResponse.id()).contains("id")
        assertThat(v1RetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1RetrieveResponse.memory()).contains("memory")
        assertThat(v1RetrieveResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(v1RetrieveResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1RetrieveResponse =
            V1RetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .memory("memory")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedV1RetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1RetrieveResponse),
                jacksonTypeRef<V1RetrieveResponse>(),
            )

        assertThat(roundtrippedV1RetrieveResponse).isEqualTo(v1RetrieveResponse)
    }
}
