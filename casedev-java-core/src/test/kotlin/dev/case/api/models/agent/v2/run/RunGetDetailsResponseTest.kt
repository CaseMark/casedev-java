// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.run

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunGetDetailsResponseTest {

    @Test
    fun create() {
        val runGetDetailsResponse = RunGetDetailsResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runGetDetailsResponse = RunGetDetailsResponse.builder().build()

        val roundtrippedRunGetDetailsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runGetDetailsResponse),
                jacksonTypeRef<RunGetDetailsResponse>(),
            )

        assertThat(roundtrippedRunGetDetailsResponse).isEqualTo(runGetDetailsResponse)
    }
}
