// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.applications.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.models.applications.v1.deployments.DeploymentCancelParams
import dev.casedev.models.applications.v1.deployments.DeploymentCreateParams
import dev.casedev.models.applications.v1.deployments.DeploymentGetLogsParams
import dev.casedev.models.applications.v1.deployments.DeploymentListParams
import dev.casedev.models.applications.v1.deployments.DeploymentRetrieveParams
import dev.casedev.models.applications.v1.deployments.DeploymentStreamParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeploymentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentService = client.applications().v1().deployments()

        deploymentService.create(
            DeploymentCreateParams.builder()
                .projectId("projectId")
                .ref("ref")
                .target(DeploymentCreateParams.Target.PRODUCTION)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentService = client.applications().v1().deployments()

        deploymentService.retrieve(
            DeploymentRetrieveParams.builder()
                .id("id")
                .projectId("projectId")
                .includeLogs(true)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentService = client.applications().v1().deployments()

        deploymentService.list(
            DeploymentListParams.builder()
                .projectId("projectId")
                .limit(0.0)
                .state("state")
                .target(DeploymentListParams.Target.PRODUCTION)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentService = client.applications().v1().deployments()

        deploymentService.cancel(
            DeploymentCancelParams.builder().id("id").projectId("projectId").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createFromFiles() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentService = client.applications().v1().deployments()

        deploymentService.createFromFiles()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getLogs() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentService = client.applications().v1().deployments()

        deploymentService.getLogs(
            DeploymentGetLogsParams.builder().id("id").projectId("projectId").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getStatus() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentService = client.applications().v1().deployments()

        deploymentService.getStatus("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stream() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentService = client.applications().v1().deployments()

        deploymentService.stream(
            DeploymentStreamParams.builder().id("id").projectId("projectId").startIndex(0.0).build()
        )
    }
}
