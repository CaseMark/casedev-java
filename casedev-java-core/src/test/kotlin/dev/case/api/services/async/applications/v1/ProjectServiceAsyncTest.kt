// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.applications.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.applications.v1.projects.ProjectCreateDeploymentParams
import dev.case.api.models.applications.v1.projects.ProjectCreateDomainParams
import dev.case.api.models.applications.v1.projects.ProjectCreateEnvParams
import dev.case.api.models.applications.v1.projects.ProjectCreateParams
import dev.case.api.models.applications.v1.projects.ProjectDeleteDomainParams
import dev.case.api.models.applications.v1.projects.ProjectDeleteEnvParams
import dev.case.api.models.applications.v1.projects.ProjectDeleteParams
import dev.case.api.models.applications.v1.projects.ProjectGetRuntimeLogsParams
import dev.case.api.models.applications.v1.projects.ProjectListDeploymentsParams
import dev.case.api.models.applications.v1.projects.ProjectListEnvParams
import dev.case.api.models.applications.v1.projects.ProjectListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProjectServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.applications().v1().projects()

        val future =
            projectServiceAsync.create(
                ProjectCreateParams.builder()
                    .gitRepo("gitRepo")
                    .name("name")
                    .buildCommand("buildCommand")
                    .addEnvironmentVariable(
                        ProjectCreateParams.EnvironmentVariable.builder()
                            .key("key")
                            .addTarget(ProjectCreateParams.EnvironmentVariable.Target.PRODUCTION)
                            .value("value")
                            .type(ProjectCreateParams.EnvironmentVariable.Type.PLAIN)
                            .build()
                    )
                    .framework("framework")
                    .gitBranch("gitBranch")
                    .installCommand("installCommand")
                    .outputDirectory("outputDirectory")
                    .rootDirectory("rootDirectory")
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
        val projectServiceAsync = client.applications().v1().projects()

        val future = projectServiceAsync.retrieve("id")

        val response = future.get()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.applications().v1().projects()

        val projectsFuture =
            projectServiceAsync.list(ProjectListParams.builder().enrich(true).limit(0.0).build())

        val projects = projectsFuture.get()
        projects.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.applications().v1().projects()

        val future =
            projectServiceAsync.delete(
                ProjectDeleteParams.builder().id("id").deleteFromHosting(true).build()
            )

        val response = future.get()
    }

    @Test
    fun createDeployment() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.applications().v1().projects()

        val future =
            projectServiceAsync.createDeployment(
                ProjectCreateDeploymentParams.builder()
                    .id("id")
                    .addEnvironmentVariable(
                        ProjectCreateDeploymentParams.EnvironmentVariable.builder()
                            .key("key")
                            .addTarget(
                                ProjectCreateDeploymentParams.EnvironmentVariable.Target.PRODUCTION
                            )
                            .value("value")
                            .type(ProjectCreateDeploymentParams.EnvironmentVariable.Type.PLAIN)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun createDomain() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.applications().v1().projects()

        val future =
            projectServiceAsync.createDomain(
                ProjectCreateDomainParams.builder()
                    .id("id")
                    .domain("domain")
                    .gitBranch("gitBranch")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun createEnv() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.applications().v1().projects()

        val future =
            projectServiceAsync.createEnv(
                ProjectCreateEnvParams.builder()
                    .id("id")
                    .key("key")
                    .addTarget(ProjectCreateEnvParams.Target.PRODUCTION)
                    .value("value")
                    .gitBranch("gitBranch")
                    .type(ProjectCreateEnvParams.Type.PLAIN)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun deleteDomain() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.applications().v1().projects()

        val future =
            projectServiceAsync.deleteDomain(
                ProjectDeleteDomainParams.builder().id("id").domain("domain").build()
            )

        val response = future.get()
    }

    @Test
    fun deleteEnv() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.applications().v1().projects()

        val future =
            projectServiceAsync.deleteEnv(
                ProjectDeleteEnvParams.builder().id("id").envId("envId").build()
            )

        val response = future.get()
    }

    @Test
    fun getRuntimeLogs() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.applications().v1().projects()

        val future =
            projectServiceAsync.getRuntimeLogs(
                ProjectGetRuntimeLogsParams.builder().id("id").limit(0.0).build()
            )

        val response = future.get()
    }

    @Test
    fun listDeployments() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.applications().v1().projects()

        val future =
            projectServiceAsync.listDeployments(
                ProjectListDeploymentsParams.builder()
                    .id("id")
                    .limit(0.0)
                    .state("state")
                    .target(ProjectListDeploymentsParams.Target.PRODUCTION)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun listDomains() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.applications().v1().projects()

        val future = projectServiceAsync.listDomains("id")

        val response = future.get()
    }

    @Test
    fun listEnv() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.applications().v1().projects()

        val future =
            projectServiceAsync.listEnv(
                ProjectListEnvParams.builder().id("id").decrypt(true).build()
            )

        val response = future.get()
    }
}
