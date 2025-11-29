// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.convert.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ProcessResponseTest {

    @Test
    fun create() {
        val v1ProcessResponse =
            V1ProcessResponse.builder()
                .jobId("job_id")
                .message("message")
                .status(V1ProcessResponse.Status.QUEUED)
                .build()

        assertThat(v1ProcessResponse.jobId()).contains("job_id")
        assertThat(v1ProcessResponse.message()).contains("message")
        assertThat(v1ProcessResponse.status()).contains(V1ProcessResponse.Status.QUEUED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ProcessResponse =
            V1ProcessResponse.builder()
                .jobId("job_id")
                .message("message")
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
