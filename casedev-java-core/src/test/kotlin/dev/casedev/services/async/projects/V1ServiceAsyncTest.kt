// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.projects

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.models.projects.v1.V1CreateEnvVarsParams
import dev.casedev.models.projects.v1.V1CreateParams
import dev.casedev.models.projects.v1.V1DeleteParams
import dev.casedev.models.projects.v1.V1ListEnvVarsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.projects().v1()

        val future =
            v1ServiceAsync.create(
                V1CreateParams.builder()
                    .name("name")
                    .sourceType(V1CreateParams.SourceType.GITHUB)
                    .buildCommand("buildCommand")
                    .defaultMemory("defaultMemory")
                    .defaultVcpu("defaultVcpu")
                    .description("description")
                    .framework("framework")
                    .githubBranch("githubBranch")
                    .githubRepo("githubRepo")
                    .installCommand("installCommand")
                    .rootDirectory("rootDirectory")
                    .s3SourceBucket("s3SourceBucket")
                    .s3SourcePrefix("s3SourcePrefix")
                    .startCommand("startCommand")
                    .thurgoodSessionId("thurgoodSessionId")
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
        val v1ServiceAsync = client.projects().v1()

        val future = v1ServiceAsync.retrieve("id")

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
        val v1ServiceAsync = client.projects().v1()

        val v1sFuture = v1ServiceAsync.list()

        val v1s = v1sFuture.get()
        v1s.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.projects().v1()

        val v1Future =
            v1ServiceAsync.delete(V1DeleteParams.builder().id("id").deleteDeployments(true).build())

        val v1 = v1Future.get()
        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createEnvVars() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.projects().v1()

        val future =
            v1ServiceAsync.createEnvVars(
                V1CreateEnvVarsParams.builder()
                    .id("id")
                    .addEnvVar(
                        V1CreateEnvVarsParams.EnvVar.builder()
                            .environment(V1CreateEnvVarsParams.EnvVar.Environment.PRODUCTION)
                            .key("key")
                            .value("value")
                            .description("description")
                            .isSecret(true)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listEnvVars() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.projects().v1()

        val future =
            v1ServiceAsync.listEnvVars(
                V1ListEnvVarsParams.builder()
                    .id("id")
                    .environment(V1ListEnvVarsParams.Environment.PRODUCTION)
                    .build()
            )

        val response = future.get()
    }
}
