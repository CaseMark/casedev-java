// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.compute.v1.instances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.JsonValue
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstanceRetrieveResponseTest {

    @Test
    fun create() {
        val instanceRetrieveResponse =
            InstanceRetrieveResponse.builder()
                .id("id")
                .autoShutdownMinutes(0L)
                .createdAt("createdAt")
                .currentCost("currentCost")
                .currentRuntimeSeconds(0L)
                .gpu("gpu")
                .instanceType("instanceType")
                .ip("ip")
                .name("name")
                .pricePerHour("pricePerHour")
                .region("region")
                .specs(JsonValue.from(mapOf<String, Any>()))
                .ssh(
                    InstanceRetrieveResponse.Ssh.builder()
                        .command("command")
                        .host("host")
                        .addInstruction(JsonValue.from(mapOf<String, Any>()))
                        .privateKey("privateKey")
                        .user("user")
                        .build()
                )
                .startedAt("startedAt")
                .status("status")
                .vaultMounts(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(instanceRetrieveResponse.id()).contains("id")
        assertThat(instanceRetrieveResponse.autoShutdownMinutes()).contains(0L)
        assertThat(instanceRetrieveResponse.createdAt()).contains("createdAt")
        assertThat(instanceRetrieveResponse.currentCost()).contains("currentCost")
        assertThat(instanceRetrieveResponse.currentRuntimeSeconds()).contains(0L)
        assertThat(instanceRetrieveResponse.gpu()).contains("gpu")
        assertThat(instanceRetrieveResponse.instanceType()).contains("instanceType")
        assertThat(instanceRetrieveResponse.ip()).contains("ip")
        assertThat(instanceRetrieveResponse.name()).contains("name")
        assertThat(instanceRetrieveResponse.pricePerHour()).contains("pricePerHour")
        assertThat(instanceRetrieveResponse.region()).contains("region")
        assertThat(instanceRetrieveResponse._specs())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(instanceRetrieveResponse.ssh())
            .contains(
                InstanceRetrieveResponse.Ssh.builder()
                    .command("command")
                    .host("host")
                    .addInstruction(JsonValue.from(mapOf<String, Any>()))
                    .privateKey("privateKey")
                    .user("user")
                    .build()
            )
        assertThat(instanceRetrieveResponse.startedAt()).contains("startedAt")
        assertThat(instanceRetrieveResponse.status()).contains("status")
        assertThat(instanceRetrieveResponse._vaultMounts())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instanceRetrieveResponse =
            InstanceRetrieveResponse.builder()
                .id("id")
                .autoShutdownMinutes(0L)
                .createdAt("createdAt")
                .currentCost("currentCost")
                .currentRuntimeSeconds(0L)
                .gpu("gpu")
                .instanceType("instanceType")
                .ip("ip")
                .name("name")
                .pricePerHour("pricePerHour")
                .region("region")
                .specs(JsonValue.from(mapOf<String, Any>()))
                .ssh(
                    InstanceRetrieveResponse.Ssh.builder()
                        .command("command")
                        .host("host")
                        .addInstruction(JsonValue.from(mapOf<String, Any>()))
                        .privateKey("privateKey")
                        .user("user")
                        .build()
                )
                .startedAt("startedAt")
                .status("status")
                .vaultMounts(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedInstanceRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instanceRetrieveResponse),
                jacksonTypeRef<InstanceRetrieveResponse>(),
            )

        assertThat(roundtrippedInstanceRetrieveResponse).isEqualTo(instanceRetrieveResponse)
    }
}
