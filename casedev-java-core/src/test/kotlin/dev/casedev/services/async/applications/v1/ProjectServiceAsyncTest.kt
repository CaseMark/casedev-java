// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.applications.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.models.applications.v1.projects.ProjectCreateDeploymentParams
import dev.casedev.models.applications.v1.projects.ProjectCreateDomainParams
import dev.casedev.models.applications.v1.projects.ProjectCreateEnvParams
import dev.casedev.models.applications.v1.projects.ProjectCreateParams
import dev.casedev.models.applications.v1.projects.ProjectDeleteDomainParams
import dev.casedev.models.applications.v1.projects.ProjectDeleteEnvParams
import dev.casedev.models.applications.v1.projects.ProjectDeleteParams
import dev.casedev.models.applications.v1.projects.ProjectGetRuntimeLogsParams
import dev.casedev.models.applications.v1.projects.ProjectListDeploymentsParams
import dev.casedev.models.applications.v1.projects.ProjectListEnvParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProjectServiceAsyncTest {

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.applications().v1().projects()

        val projectsFuture = projectServiceAsync.list()

        val projects = projectsFuture.get()
        projects.validate()
    }

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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
