// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClientAsync
import dev.casedev.core.JsonValue
import dev.casedev.models.compute.v1.V1DeployParams
import dev.casedev.models.compute.v1.V1GetUsageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class V1ServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun deploy() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.compute().v1()

        val responseFuture =
            v1ServiceAsync.deploy(
                V1DeployParams.builder()
                    .entrypointName("entrypointName")
                    .type(V1DeployParams.Type.TASK)
                    .code("code")
                    .config(
                        V1DeployParams.Config.builder()
                            .addPython("addPython")
                            .allowNetwork(true)
                            .addCmd("string")
                            .concurrency(0L)
                            .cpuCount(0L)
                            .cronSchedule("cronSchedule")
                            .addDependency("string")
                            .addEntrypoint("string")
                            .env(
                                V1DeployParams.Config.Env.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .gpuCount(0L)
                            .gpuType(V1DeployParams.Config.GpuType.CPU)
                            .isWebService(true)
                            .memoryMb(0L)
                            .addPipInstall("string")
                            .port(0L)
                            .pythonVersion("pythonVersion")
                            .retries(0L)
                            .addSecretGroup("string")
                            .timeoutSeconds(0L)
                            .useUv(true)
                            .warmInstances(0L)
                            .workdir("workdir")
                            .build()
                    )
                    .dockerfile("dockerfile")
                    .entrypointFile("entrypointFile")
                    .environment("environment")
                    .image("image")
                    .runtime(V1DeployParams.Runtime.PYTHON)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getPricing() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.compute().v1()

        val future = v1ServiceAsync.getPricing()

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getUsage() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val v1ServiceAsync = client.compute().v1()

        val future =
            v1ServiceAsync.getUsage(V1GetUsageParams.builder().month(3L).year(2024L).build())

        val response = future.get()
    }
}
