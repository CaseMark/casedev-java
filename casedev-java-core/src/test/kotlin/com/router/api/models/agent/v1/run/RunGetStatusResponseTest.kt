// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.agent.v1.run

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunGetStatusResponseTest {

    @Test
    fun create() {
        val runGetStatusResponse =
            RunGetStatusResponse.builder()
                .id("id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .durationMs(0L)
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(RunGetStatusResponse.Status.QUEUED)
                .build()

        assertThat(runGetStatusResponse.id()).contains("id")
        assertThat(runGetStatusResponse.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runGetStatusResponse.durationMs()).contains(0L)
        assertThat(runGetStatusResponse.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runGetStatusResponse.status()).contains(RunGetStatusResponse.Status.QUEUED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runGetStatusResponse =
            RunGetStatusResponse.builder()
                .id("id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .durationMs(0L)
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(RunGetStatusResponse.Status.QUEUED)
                .build()

        val roundtrippedRunGetStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runGetStatusResponse),
                jacksonTypeRef<RunGetStatusResponse>(),
            )

        assertThat(roundtrippedRunGetStatusResponse).isEqualTo(runGetStatusResponse)
    }
}
