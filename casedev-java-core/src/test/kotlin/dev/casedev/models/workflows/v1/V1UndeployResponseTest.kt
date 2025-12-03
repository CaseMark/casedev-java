// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1UndeployResponseTest {

    @Test
    fun create() {
        val v1UndeployResponse =
            V1UndeployResponse.builder().message("message").success(true).build()

        assertThat(v1UndeployResponse.message()).contains("message")
        assertThat(v1UndeployResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1UndeployResponse =
            V1UndeployResponse.builder().message("message").success(true).build()

        val roundtrippedV1UndeployResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1UndeployResponse),
                jacksonTypeRef<V1UndeployResponse>(),
            )

        assertThat(roundtrippedV1UndeployResponse).isEqualTo(v1UndeployResponse)
    }
}
