// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.memory.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DeleteAllResponseTest {

    @Test
    fun create() {
        val v1DeleteAllResponse = V1DeleteAllResponse.builder().deleted(0L).build()

        assertThat(v1DeleteAllResponse.deleted()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1DeleteAllResponse = V1DeleteAllResponse.builder().deleted(0L).build()

        val roundtrippedV1DeleteAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1DeleteAllResponse),
                jacksonTypeRef<V1DeleteAllResponse>(),
            )

        assertThat(roundtrippedV1DeleteAllResponse).isEqualTo(v1DeleteAllResponse)
    }
}
