// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.projects

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.models.projects.v1.V1CreateEnvVarsParams
import dev.casedev.models.projects.v1.V1CreateParams
import dev.casedev.models.projects.v1.V1DeleteParams
import dev.casedev.models.projects.v1.V1ListEnvVarsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.projects().v1()

        v1Service.create(
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
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.projects().v1()

        v1Service.retrieve("id")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.projects().v1()

        val v1s = v1Service.list()

        v1s.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.projects().v1()

        val v1 = v1Service.delete(V1DeleteParams.builder().id("id").deleteDeployments(true).build())

        v1.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createEnvVars() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.projects().v1()

        v1Service.createEnvVars(
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
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listEnvVars() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1Service = client.projects().v1()

        v1Service.listEnvVars(
            V1ListEnvVarsParams.builder()
                .id("id")
                .environment(V1ListEnvVarsParams.Environment.PRODUCTION)
                .build()
        )
    }
}
