// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.applications.v1

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
import dev.case.models.applications.v1.deployments.DeploymentCancelParams
import dev.case.models.applications.v1.deployments.DeploymentCreateParams
import dev.case.models.applications.v1.deployments.DeploymentGetLogsParams
import dev.case.models.applications.v1.deployments.DeploymentListParams
import dev.case.models.applications.v1.deployments.DeploymentRetrieveParams
import dev.case.models.applications.v1.deployments.DeploymentStreamParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeploymentServiceTest {

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
