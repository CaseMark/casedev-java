// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1UpdateResponseTest {

    @Test
    fun create() {
        val v1UpdateResponse =
            V1UpdateResponse.builder().id("id").name("name").updatedAt("updatedAt").build()

        assertThat(v1UpdateResponse.id()).contains("id")
        assertThat(v1UpdateResponse.name()).contains("name")
        assertThat(v1UpdateResponse.updatedAt()).contains("updatedAt")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1UpdateResponse =
            V1UpdateResponse.builder().id("id").name("name").updatedAt("updatedAt").build()

        val roundtrippedV1UpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1UpdateResponse),
                jacksonTypeRef<V1UpdateResponse>(),
            )

        assertThat(roundtrippedV1UpdateResponse).isEqualTo(v1UpdateResponse)
    }
}
