// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.run

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunWatchResponseTest {

    @Test
    fun create() {
        val runWatchResponse =
            RunWatchResponse.builder().callbackUrl("callbackUrl").ok(true).build()

        assertThat(runWatchResponse.callbackUrl()).contains("callbackUrl")
        assertThat(runWatchResponse.ok()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runWatchResponse =
            RunWatchResponse.builder().callbackUrl("callbackUrl").ok(true).build()

        val roundtrippedRunWatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runWatchResponse),
                jacksonTypeRef<RunWatchResponse>(),
            )

        assertThat(roundtrippedRunWatchResponse).isEqualTo(runWatchResponse)
    }
}
