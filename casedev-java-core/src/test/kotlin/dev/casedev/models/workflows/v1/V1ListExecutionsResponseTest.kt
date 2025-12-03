// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListExecutionsResponseTest {

    @Test
    fun create() {
        val v1ListExecutionsResponse =
            V1ListExecutionsResponse.builder()
                .addExecution(
                    V1ListExecutionsResponse.Execution.builder()
                        .id("id")
                        .completedAt("completedAt")
                        .durationMs(0L)
                        .startedAt("startedAt")
                        .status("status")
                        .triggerType("triggerType")
                        .build()
                )
                .build()

        assertThat(v1ListExecutionsResponse.executions().getOrNull())
            .containsExactly(
                V1ListExecutionsResponse.Execution.builder()
                    .id("id")
                    .completedAt("completedAt")
                    .durationMs(0L)
                    .startedAt("startedAt")
                    .status("status")
                    .triggerType("triggerType")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ListExecutionsResponse =
            V1ListExecutionsResponse.builder()
                .addExecution(
                    V1ListExecutionsResponse.Execution.builder()
                        .id("id")
                        .completedAt("completedAt")
                        .durationMs(0L)
                        .startedAt("startedAt")
                        .status("status")
                        .triggerType("triggerType")
                        .build()
                )
                .build()

        val roundtrippedV1ListExecutionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ListExecutionsResponse),
                jacksonTypeRef<V1ListExecutionsResponse>(),
            )

        assertThat(roundtrippedV1ListExecutionsResponse).isEqualTo(v1ListExecutionsResponse)
    }
}
