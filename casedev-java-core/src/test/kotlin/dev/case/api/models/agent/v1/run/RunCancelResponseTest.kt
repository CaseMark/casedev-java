// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.run

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunCancelResponseTest {

    @Test
    fun create() {
        val runCancelResponse =
            RunCancelResponse.builder()
                .id("id")
                .message("message")
                .status(RunCancelResponse.Status.CANCELLED)
                .build()

        assertThat(runCancelResponse.id()).contains("id")
        assertThat(runCancelResponse.message()).contains("message")
        assertThat(runCancelResponse.status()).contains(RunCancelResponse.Status.CANCELLED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runCancelResponse =
            RunCancelResponse.builder()
                .id("id")
                .message("message")
                .status(RunCancelResponse.Status.CANCELLED)
                .build()

        val roundtrippedRunCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runCancelResponse),
                jacksonTypeRef<RunCancelResponse>(),
            )

        assertThat(roundtrippedRunCancelResponse).isEqualTo(runCancelResponse)
    }
}
