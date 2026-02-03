// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.applications.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
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
internal class ProjectServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.applications().v1().projects()

        projectService.create(
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
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.applications().v1().projects()

        projectService.retrieve("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.applications().v1().projects()

        val projects = projectService.list()

        projects.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.applications().v1().projects()

        projectService.delete(
            ProjectDeleteParams.builder().id("id").deleteFromHosting(true).build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createDeployment() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.applications().v1().projects()

        projectService.createDeployment(
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
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createDomain() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.applications().v1().projects()

        projectService.createDomain(
            ProjectCreateDomainParams.builder()
                .id("id")
                .domain("domain")
                .gitBranch("gitBranch")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createEnv() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.applications().v1().projects()

        projectService.createEnv(
            ProjectCreateEnvParams.builder()
                .id("id")
                .key("key")
                .addTarget(ProjectCreateEnvParams.Target.PRODUCTION)
                .value("value")
                .gitBranch("gitBranch")
                .type(ProjectCreateEnvParams.Type.PLAIN)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteDomain() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.applications().v1().projects()

        projectService.deleteDomain(
            ProjectDeleteDomainParams.builder().id("id").domain("domain").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteEnv() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.applications().v1().projects()

        projectService.deleteEnv(ProjectDeleteEnvParams.builder().id("id").envId("envId").build())
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getRuntimeLogs() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.applications().v1().projects()

        projectService.getRuntimeLogs(
            ProjectGetRuntimeLogsParams.builder().id("id").limit(0.0).build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listDeployments() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.applications().v1().projects()

        projectService.listDeployments(
            ProjectListDeploymentsParams.builder()
                .id("id")
                .limit(0.0)
                .state("state")
                .target(ProjectListDeploymentsParams.Target.PRODUCTION)
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listDomains() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.applications().v1().projects()

        projectService.listDomains("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listEnv() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.applications().v1().projects()

        projectService.listEnv(ProjectListEnvParams.builder().id("id").decrypt(true).build())
    }
}
