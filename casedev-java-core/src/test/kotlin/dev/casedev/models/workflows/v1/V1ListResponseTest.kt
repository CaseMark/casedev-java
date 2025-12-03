// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListResponseTest {

    @Test
    fun create() {
        val v1ListResponse =
            V1ListResponse.builder()
                .limit(0L)
                .offset(0L)
                .total(0L)
                .addWorkflow(
                    V1ListResponse.Workflow.builder()
                        .id("id")
                        .createdAt("createdAt")
                        .deployedAt("deployedAt")
                        .description("description")
                        .name("name")
                        .triggerType("triggerType")
                        .updatedAt("updatedAt")
                        .visibility("visibility")
                        .build()
                )
                .build()

        assertThat(v1ListResponse.limit()).contains(0L)
        assertThat(v1ListResponse.offset()).contains(0L)
        assertThat(v1ListResponse.total()).contains(0L)
        assertThat(v1ListResponse.workflows().getOrNull())
            .containsExactly(
                V1ListResponse.Workflow.builder()
                    .id("id")
                    .createdAt("createdAt")
                    .deployedAt("deployedAt")
                    .description("description")
                    .name("name")
                    .triggerType("triggerType")
                    .updatedAt("updatedAt")
                    .visibility("visibility")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1ListResponse =
            V1ListResponse.builder()
                .limit(0L)
                .offset(0L)
                .total(0L)
                .addWorkflow(
                    V1ListResponse.Workflow.builder()
                        .id("id")
                        .createdAt("createdAt")
                        .deployedAt("deployedAt")
                        .description("description")
                        .name("name")
                        .triggerType("triggerType")
                        .updatedAt("updatedAt")
                        .visibility("visibility")
                        .build()
                )
                .build()

        val roundtrippedV1ListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1ListResponse),
                jacksonTypeRef<V1ListResponse>(),
            )

        assertThat(roundtrippedV1ListResponse).isEqualTo(v1ListResponse)
    }
}
