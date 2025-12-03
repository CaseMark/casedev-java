// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DeleteResponseTest {

    @Test
    fun create() {
        val v1DeleteResponse = V1DeleteResponse.builder().message("message").success(true).build()

        assertThat(v1DeleteResponse.message()).contains("message")
        assertThat(v1DeleteResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1DeleteResponse = V1DeleteResponse.builder().message("message").success(true).build()

        val roundtrippedV1DeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1DeleteResponse),
                jacksonTypeRef<V1DeleteResponse>(),
            )

        assertThat(roundtrippedV1DeleteResponse).isEqualTo(v1DeleteResponse)
    }
}
