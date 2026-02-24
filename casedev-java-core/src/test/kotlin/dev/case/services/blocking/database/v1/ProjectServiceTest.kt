// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.database.v1

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
import dev.case.models.database.v1.projects.ProjectCreateBranchParams
import dev.case.models.database.v1.projects.ProjectCreateParams
import dev.case.models.database.v1.projects.ProjectGetConnectionParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ProjectServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.database().v1().projects()

        val project =
            projectService.create(
                ProjectCreateParams.builder()
                    .name("litigation-docs-db")
                    .description("Production database for litigation document management")
                    .region(ProjectCreateParams.Region.AWS_US_EAST_1)
                    .build()
            )

        project.validate()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.database().v1().projects()

        val project = projectService.retrieve("id")

        project.validate()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.database().v1().projects()

        val projects = projectService.list()

        projects.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.database().v1().projects()

        val project = projectService.delete("id")

        project.validate()
    }

    @Test
    fun createBranch() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.database().v1().projects()

        val response =
            projectService.createBranch(
                ProjectCreateBranchParams.builder()
                    .id("id")
                    .name("staging")
                    .parentBranchId("branch_main_123")
                    .build()
            )

        response.validate()
    }

    @Test
    fun getConnection() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.database().v1().projects()

        val response =
            projectService.getConnection(
                ProjectGetConnectionParams.builder().id("id").branch("branch").pooled(true).build()
            )

        response.validate()
    }

    @Test
    fun listBranches() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectService = client.database().v1().projects()

        val response = projectService.listBranches("id")

        response.validate()
    }
}
