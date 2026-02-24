// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async.applications.v1

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClientAsync
import dev.case.models.applications.v1.workflows.WorkflowGetStatusParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WorkflowServiceAsyncTest {

    @Test
    fun getStatus() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val workflowServiceAsync = client.applications().v1().workflows()

        val future =
            workflowServiceAsync.getStatus(
                WorkflowGetStatusParams.builder().id("id").projectId("projectId").build()
            )

        val response = future.get()
    }
}
