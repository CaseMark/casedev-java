// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.matters.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.core.JsonValue
import dev.case.api.models.matters.v1.workitems.WorkItemCreateParams
import dev.case.api.models.matters.v1.workitems.WorkItemDecideParams
import dev.case.api.models.matters.v1.workitems.WorkItemListExecutionsParams
import dev.case.api.models.matters.v1.workitems.WorkItemListParams
import dev.case.api.models.matters.v1.workitems.WorkItemRetrieveParams
import dev.case.api.models.matters.v1.workitems.WorkItemUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WorkItemServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workItemServiceAsync = client.matters().v1().workItems()

        val future =
            workItemServiceAsync.create(
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
            )

        val response = future.get()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workItemServiceAsync = client.matters().v1().workItems()

        val future =
            workItemServiceAsync.retrieve(
                WorkItemRetrieveParams.builder().id("id").workItemId("workItemId").build()
            )

        val response = future.get()
    }

    @Test
    fun update() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workItemServiceAsync = client.matters().v1().workItems()

        val future =
            workItemServiceAsync.update(
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
            )

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workItemServiceAsync = client.matters().v1().workItems()

        val future =
            workItemServiceAsync.list(
                WorkItemListParams.builder()
                    .id("id")
                    .assigneeId("assignee_id")
                    .status("status")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun decide() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workItemServiceAsync = client.matters().v1().workItems()

        val future =
            workItemServiceAsync.decide(
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
            )

        val response = future.get()
    }

    @Test
    fun listExecutions() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workItemServiceAsync = client.matters().v1().workItems()

        val future =
            workItemServiceAsync.listExecutions(
                WorkItemListExecutionsParams.builder().id("id").workItemId("workItemId").build()
            )

        val response = future.get()
    }
}
