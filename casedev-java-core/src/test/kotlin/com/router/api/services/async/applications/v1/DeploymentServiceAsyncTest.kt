// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.applications.v1

import com.router.api.TestServerExtension
import com.router.api.client.okhttp.CasedevOkHttpClientAsync
import com.router.api.models.applications.v1.deployments.DeploymentCancelParams
import com.router.api.models.applications.v1.deployments.DeploymentCreateParams
import com.router.api.models.applications.v1.deployments.DeploymentGetLogsParams
import com.router.api.models.applications.v1.deployments.DeploymentListParams
import com.router.api.models.applications.v1.deployments.DeploymentRetrieveParams
import com.router.api.models.applications.v1.deployments.DeploymentStreamParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeploymentServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentServiceAsync = client.applications().v1().deployments()

        val future =
            deploymentServiceAsync.create(
                DeploymentCreateParams.builder()
                    .projectId("projectId")
                    .ref("ref")
                    .target(DeploymentCreateParams.Target.PRODUCTION)
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
        val deploymentServiceAsync = client.applications().v1().deployments()

        val future =
            deploymentServiceAsync.retrieve(
                DeploymentRetrieveParams.builder()
                    .id("id")
                    .projectId("projectId")
                    .includeLogs(true)
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
        val deploymentServiceAsync = client.applications().v1().deployments()

        val future =
            deploymentServiceAsync.list(
                DeploymentListParams.builder()
                    .projectId("projectId")
                    .limit(0.0)
                    .state("state")
                    .target(DeploymentListParams.Target.PRODUCTION)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun cancel() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentServiceAsync = client.applications().v1().deployments()

        val future =
            deploymentServiceAsync.cancel(
                DeploymentCancelParams.builder().id("id").projectId("projectId").build()
            )

        val response = future.get()
    }

    @Test
    fun createFromFiles() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentServiceAsync = client.applications().v1().deployments()

        val future = deploymentServiceAsync.createFromFiles()

        val response = future.get()
    }

    @Test
    fun getLogs() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentServiceAsync = client.applications().v1().deployments()

        val future =
            deploymentServiceAsync.getLogs(
                DeploymentGetLogsParams.builder().id("id").projectId("projectId").build()
            )

        val response = future.get()
    }

    @Test
    fun getStatus() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentServiceAsync = client.applications().v1().deployments()

        val future = deploymentServiceAsync.getStatus("id")

        val response = future.get()
    }

    @Test
    fun stream() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val deploymentServiceAsync = client.applications().v1().deployments()

        val future =
            deploymentServiceAsync.stream(
                DeploymentStreamParams.builder()
                    .id("id")
                    .projectId("projectId")
                    .startIndex(0.0)
                    .build()
            )

        val response = future.get()
    }
}
