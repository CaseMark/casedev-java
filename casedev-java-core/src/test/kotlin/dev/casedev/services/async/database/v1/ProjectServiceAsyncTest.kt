// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.database.v1

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.models.database.v1.projects.ProjectCreateBranchParams
import dev.casedev.models.database.v1.projects.ProjectCreateParams
import dev.casedev.models.database.v1.projects.ProjectGetConnectionParams
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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

    @Disabled("Prism tests are disabled")
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
