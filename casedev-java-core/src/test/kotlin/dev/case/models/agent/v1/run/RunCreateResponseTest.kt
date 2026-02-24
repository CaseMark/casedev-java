// File generated from our OpenAPI spec by Stainless.

package dev.case.models.agent.v1.run

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunCreateResponseTest {

    @Test
    fun create() {
        val runCreateResponse =
            RunCreateResponse.builder()
                .id("id")
                .agentId("agentId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(RunCreateResponse.Status.QUEUED)
                .build()

        assertThat(runCreateResponse.id()).contains("id")
        assertThat(runCreateResponse.agentId()).contains("agentId")
        assertThat(runCreateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runCreateResponse.status()).contains(RunCreateResponse.Status.QUEUED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runCreateResponse =
            RunCreateResponse.builder()
                .id("id")
                .agentId("agentId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(RunCreateResponse.Status.QUEUED)
                .build()

        val roundtrippedRunCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runCreateResponse),
                jacksonTypeRef<RunCreateResponse>(),
            )

        assertThat(roundtrippedRunCreateResponse).isEqualTo(runCreateResponse)
    }
}
