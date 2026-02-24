// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.database.v1

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.database.v1.projects.ProjectCreateBranchParams
import dev.case.api.models.database.v1.projects.ProjectCreateParams
import dev.case.api.models.database.v1.projects.ProjectGetConnectionParams
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
        val projectServiceAsync = client.database().v1().projects()

        val projectFuture =
            projectServiceAsync.create(
                ProjectCreateParams.builder()
                    .name("litigation-docs-db")
                    .description("Production database for litigation document management")
                    .region(ProjectCreateParams.Region.AWS_US_EAST_1)
                    .build()
            )

        val project = projectFuture.get()
        project.validate()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.database().v1().projects()

        val projectFuture = projectServiceAsync.retrieve("id")

        val project = projectFuture.get()
        project.validate()
    }

    @Test
    fun list() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.database().v1().projects()

        val projectsFuture = projectServiceAsync.list()

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
        val projectServiceAsync = client.database().v1().projects()

        val projectFuture = projectServiceAsync.delete("id")

        val project = projectFuture.get()
        project.validate()
    }

    @Test
    fun createBranch() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.database().v1().projects()

        val responseFuture =
            projectServiceAsync.createBranch(
                ProjectCreateBranchParams.builder()
                    .id("id")
                    .name("staging")
                    .parentBranchId("branch_main_123")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getConnection() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.database().v1().projects()

        val responseFuture =
            projectServiceAsync.getConnection(
                ProjectGetConnectionParams.builder().id("id").branch("branch").pooled(true).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listBranches() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val projectServiceAsync = client.database().v1().projects()

        val responseFuture = projectServiceAsync.listBranches("id")

        val response = responseFuture.get()
        response.validate()
    }
}
