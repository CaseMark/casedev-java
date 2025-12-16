// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ExecuteResponseTest {

    @Test
    fun create() {
        val v1ExecuteResponse =
            V1ExecuteResponse.builder()
                .duration(0L)
                .executionArn("executionArn")
                .executionId("executionId")
                .mode(V1ExecuteResponse.Mode.FIRE_AND_FORGET)
                .output(JsonValue.from(mapOf<String, Any>()))
                .status(V1ExecuteResponse.Status.RUNNING)
                .build()

        assertThat(v1ExecuteResponse.duration()).contains(0L)
        assertThat(v1ExecuteResponse.executionArn()).contains("executionArn")
        assertThat(v1ExecuteResponse.executionId()).contains("executionId")
        assertThat(v1ExecuteResponse.mode()).contains(V1ExecuteResponse.Mode.FIRE_AND_FORGET)
        assertThat(v1ExecuteResponse._output()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(v1ExecuteResponse.status()).contains(V1ExecuteResponse.Status.RUNNING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ExecuteResponse =
            V1ExecuteResponse.builder()
                .duration(0L)
                .executionArn("executionArn")
                .executionId("executionId")
                .mode(V1ExecuteResponse.Mode.FIRE_AND_FORGET)
                .output(JsonValue.from(mapOf<String, Any>()))
                .status(V1ExecuteResponse.Status.RUNNING)
                .build()

        val roundtrippedV1ExecuteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ExecuteResponse),
                jacksonTypeRef<V1ExecuteResponse>(),
            )

        assertThat(roundtrippedV1ExecuteResponse).isEqualTo(v1ExecuteResponse)
    }
}
