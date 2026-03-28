// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.workitems

import dev.case.api.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkItemCreateParamsTest {

    @Test
    fun create() {
        WorkItemCreateParams.builder()
            .id("id")
            .title("title")
            .assigneeId("assignee_id")
            .description("description")
            .dueAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addExitCriterion("string")
            .instructions("instructions")
            .metadata(
                WorkItemCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .priority(WorkItemCreateParams.Priority.LOW)
            .type(WorkItemCreateParams.Type.TASK)
            .build()
    }

    @Test
    fun pathParams() {
        val params = WorkItemCreateParams.builder().id("id").title("title").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WorkItemCreateParams.builder()
                .id("id")
                .title("title")
                .assigneeId("assignee_id")
                .description("description")
                .dueAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addExitCriterion("string")
                .instructions("instructions")
                .metadata(
                    WorkItemCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .priority(WorkItemCreateParams.Priority.LOW)
                .type(WorkItemCreateParams.Type.TASK)
                .build()

        val body = params._body()

        assertThat(body.title()).isEqualTo("title")
        assertThat(body.assigneeId()).contains("assignee_id")
        assertThat(body.description()).contains("description")
        assertThat(body.dueAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.exitCriteria().getOrNull()).containsExactly("string")
        assertThat(body.instructions()).contains("instructions")
        assertThat(body.metadata())
            .contains(
                WorkItemCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.priority()).contains(WorkItemCreateParams.Priority.LOW)
        assertThat(body.type()).contains(WorkItemCreateParams.Type.TASK)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WorkItemCreateParams.builder().id("id").title("title").build()

        val body = params._body()

        assertThat(body.title()).isEqualTo("title")
    }
}
