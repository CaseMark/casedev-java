// File generated from our OpenAPI spec by Stainless.

package dev.case.models.memory.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateResponseTest {

    @Test
    fun create() {
        val v1CreateResponse =
            V1CreateResponse.builder()
                .addResult(
                    V1CreateResponse.Result.builder()
                        .id("id")
                        .event(V1CreateResponse.Result.Event.ADD)
                        .memory("memory")
                        .build()
                )
                .build()

        assertThat(v1CreateResponse.results().getOrNull())
            .containsExactly(
                V1CreateResponse.Result.builder()
                    .id("id")
                    .event(V1CreateResponse.Result.Event.ADD)
                    .memory("memory")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1CreateResponse =
            V1CreateResponse.builder()
                .addResult(
                    V1CreateResponse.Result.builder()
                        .id("id")
                        .event(V1CreateResponse.Result.Event.ADD)
                        .memory("memory")
                        .build()
                )
                .build()

        val roundtrippedV1CreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1CreateResponse),
                jacksonTypeRef<V1CreateResponse>(),
            )

        assertThat(roundtrippedV1CreateResponse).isEqualTo(v1CreateResponse)
    }
}
