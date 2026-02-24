// File generated from our OpenAPI spec by Stainless.

package dev.case.models.ocr.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ProcessResponseTest {

    @Test
    fun create() {
        val v1ProcessResponse =
            V1ProcessResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .documentId("document_id")
                .engine("engine")
                .estimatedCompletion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pageCount(0L)
                .status(V1ProcessResponse.Status.QUEUED)
                .build()

        assertThat(v1ProcessResponse.id()).contains("id")
        assertThat(v1ProcessResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1ProcessResponse.documentId()).contains("document_id")
        assertThat(v1ProcessResponse.engine()).contains("engine")
        assertThat(v1ProcessResponse.estimatedCompletion())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(v1ProcessResponse.pageCount()).contains(0L)
        assertThat(v1ProcessResponse.status()).contains(V1ProcessResponse.Status.QUEUED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ProcessResponse =
            V1ProcessResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .documentId("document_id")
                .engine("engine")
                .estimatedCompletion(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pageCount(0L)
                .status(V1ProcessResponse.Status.QUEUED)
                .build()

        val roundtrippedV1ProcessResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ProcessResponse),
                jacksonTypeRef<V1ProcessResponse>(),
            )

        assertThat(roundtrippedV1ProcessResponse).isEqualTo(v1ProcessResponse)
    }
}
