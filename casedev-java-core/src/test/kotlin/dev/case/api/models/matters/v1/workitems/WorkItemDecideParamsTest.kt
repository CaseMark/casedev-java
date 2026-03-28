// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.workitems

import dev.case.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkItemDecideParamsTest {

    @Test
    fun create() {
        WorkItemDecideParams.builder()
            .id("id")
            .workItemId("workItemId")
            .decision(WorkItemDecideParams.Decision.APPROVE)
            .agentTypeId("agent_type_id")
            .metadata(
                WorkItemDecideParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .reason("reason")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WorkItemDecideParams.builder()
                .id("id")
                .workItemId("workItemId")
                .decision(WorkItemDecideParams.Decision.APPROVE)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("workItemId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WorkItemDecideParams.builder()
                .id("id")
                .workItemId("workItemId")
                .decision(WorkItemDecideParams.Decision.APPROVE)
                .agentTypeId("agent_type_id")
                .metadata(
                    WorkItemDecideParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .reason("reason")
                .build()

        val body = params._body()

        assertThat(body.decision()).isEqualTo(WorkItemDecideParams.Decision.APPROVE)
        assertThat(body.agentTypeId()).contains("agent_type_id")
        assertThat(body.metadata())
            .contains(
                WorkItemDecideParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.reason()).contains("reason")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WorkItemDecideParams.builder()
                .id("id")
                .workItemId("workItemId")
                .decision(WorkItemDecideParams.Decision.APPROVE)
                .build()

        val body = params._body()

        assertThat(body.decision()).isEqualTo(WorkItemDecideParams.Decision.APPROVE)
    }
}
