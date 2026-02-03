// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.applications.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.models.applications.v1.workflows.WorkflowGetStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WorkflowServiceTest {

    @Disabled("Prism tests are disabled")
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
