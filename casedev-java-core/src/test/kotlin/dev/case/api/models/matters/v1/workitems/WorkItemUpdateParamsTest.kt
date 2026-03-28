// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.workitems

import dev.case.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkItemUpdateParamsTest {

    @Test
    fun create() {
        WorkItemUpdateParams.builder()
            .id("id")
            .workItemId("workItemId")
            .assigneeId("assignee_id")
            .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .description("description")
            .dueAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addExitCriterion("string")
            .instructions("instructions")
            .metadata(
                WorkItemUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .priority(WorkItemUpdateParams.Priority.LOW)
            .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .status(WorkItemUpdateParams.Status.DRAFT)
            .title("title")
            .type(WorkItemUpdateParams.Type.TASK)
            .build()
    }

    @Test
    fun pathParams() {
        val params = WorkItemUpdateParams.builder().id("id").workItemId("workItemId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("workItemId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WorkItemUpdateParams.builder()
                .id("id")
                .workItemId("workItemId")
                .assigneeId("assignee_id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .dueAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addExitCriterion("string")
                .instructions("instructions")
                .metadata(
                    WorkItemUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .priority(WorkItemUpdateParams.Priority.LOW)
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(WorkItemUpdateParams.Status.DRAFT)
                .title("title")
                .type(WorkItemUpdateParams.Type.TASK)
                .build()

        val body = params._body()

        assertThat(body.assigneeId()).contains("assignee_id")
        assertThat(body.completedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.description()).contains("description")
        assertThat(body.dueAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.exitCriteria().getOrNull()).containsExactly("string")
        assertThat(body.instructions()).contains("instructions")
        assertThat(body.metadata())
            .contains(
                WorkItemUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.priority()).contains(WorkItemUpdateParams.Priority.LOW)
        assertThat(body.startedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.status()).contains(WorkItemUpdateParams.Status.DRAFT)
        assertThat(body.title()).contains("title")
        assertThat(body.type()).contains(WorkItemUpdateParams.Type.TASK)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WorkItemUpdateParams.builder().id("id").workItemId("workItemId").build()

        val body = params._body()
    }
}
