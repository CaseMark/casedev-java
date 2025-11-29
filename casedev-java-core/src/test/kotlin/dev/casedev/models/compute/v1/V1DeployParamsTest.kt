// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1

import dev.casedev.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DeployParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.entrypointName()).isEqualTo("entrypointName")
        assertThat(body.type()).isEqualTo(V1DeployParams.Type.TASK)
        assertThat(body.code()).contains("code")
        assertThat(body.config())
            .contains(
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
        assertThat(body.dockerfile()).contains("dockerfile")
        assertThat(body.entrypointFile()).contains("entrypointFile")
        assertThat(body.environment()).contains("environment")
        assertThat(body.image()).contains("image")
        assertThat(body.runtime()).contains(V1DeployParams.Runtime.PYTHON)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            V1DeployParams.builder()
                .entrypointName("entrypointName")
                .type(V1DeployParams.Type.TASK)
                .build()

        val body = params._body()

        assertThat(body.entrypointName()).isEqualTo("entrypointName")
        assertThat(body.type()).isEqualTo(V1DeployParams.Type.TASK)
    }
}
