// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.applications.v1

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
import dev.case.models.applications.v1.workflows.WorkflowGetStatusParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WorkflowServiceTest {

    @Test
    fun getStatus() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workflowService = client.applications().v1().workflows()

        workflowService.getStatus(
            WorkflowGetStatusParams.builder().id("id").projectId("projectId").build()
        )
    }
}
