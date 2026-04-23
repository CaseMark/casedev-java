// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.compute.v1.instances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstanceDeleteResponseTest {

    @Test
    fun create() {
        val instanceDeleteResponse =
            InstanceDeleteResponse.builder()
                .id("id")
                .message("message")
                .name("name")
                .status("status")
                .totalCost("totalCost")
                .totalRuntimeSeconds(0L)
                .build()

        assertThat(instanceDeleteResponse.id()).contains("id")
        assertThat(instanceDeleteResponse.message()).contains("message")
        assertThat(instanceDeleteResponse.name()).contains("name")
        assertThat(instanceDeleteResponse.status()).contains("status")
        assertThat(instanceDeleteResponse.totalCost()).contains("totalCost")
        assertThat(instanceDeleteResponse.totalRuntimeSeconds()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instanceDeleteResponse =
            InstanceDeleteResponse.builder()
                .id("id")
                .message("message")
                .name("name")
                .status("status")
                .totalCost("totalCost")
                .totalRuntimeSeconds(0L)
                .build()

        val roundtrippedInstanceDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instanceDeleteResponse),
                jacksonTypeRef<InstanceDeleteResponse>(),
            )

        assertThat(roundtrippedInstanceDeleteResponse).isEqualTo(instanceDeleteResponse)
    }
}
