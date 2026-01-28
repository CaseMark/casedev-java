// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.ocr.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
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
                .status(V1RetrieveResponse.Status.PENDING)
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .pageCount(0L)
                .text("text")
                .build()

        assertThat(v1RetrieveResponse.id()).isEqualTo("id")
        assertThat(v1RetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1RetrieveResponse.status()).isEqualTo(V1RetrieveResponse.Status.PENDING)
        assertThat(v1RetrieveResponse.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1RetrieveResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(v1RetrieveResponse.pageCount()).contains(0L)
        assertThat(v1RetrieveResponse.text()).contains("text")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1RetrieveResponse =
            V1RetrieveResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(V1RetrieveResponse.Status.PENDING)
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .pageCount(0L)
                .text("text")
                .build()

        val roundtrippedV1RetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1RetrieveResponse),
                jacksonTypeRef<V1RetrieveResponse>(),
            )

        assertThat(roundtrippedV1RetrieveResponse).isEqualTo(v1RetrieveResponse)
    }
}
