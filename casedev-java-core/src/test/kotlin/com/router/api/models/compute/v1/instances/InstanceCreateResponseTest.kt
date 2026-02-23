// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.compute.v1.instances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.JsonValue
import com.router.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstanceCreateResponseTest {

    @Test
    fun create() {
        val instanceCreateResponse =
            InstanceCreateResponse.builder()
                .id("id")
                .autoShutdownMinutes(0L)
                .createdAt("createdAt")
                .gpu("gpu")
                .instanceType("instanceType")
                .message("message")
                .name("name")
                .pricePerHour("pricePerHour")
                .region("region")
                .specs(JsonValue.from(mapOf<String, Any>()))
                .status("status")
                .addVault(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(instanceCreateResponse.id()).contains("id")
        assertThat(instanceCreateResponse.autoShutdownMinutes()).contains(0L)
        assertThat(instanceCreateResponse.createdAt()).contains("createdAt")
        assertThat(instanceCreateResponse.gpu()).contains("gpu")
        assertThat(instanceCreateResponse.instanceType()).contains("instanceType")
        assertThat(instanceCreateResponse.message()).contains("message")
        assertThat(instanceCreateResponse.name()).contains("name")
        assertThat(instanceCreateResponse.pricePerHour()).contains("pricePerHour")
        assertThat(instanceCreateResponse.region()).contains("region")
        assertThat(instanceCreateResponse._specs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(instanceCreateResponse.status()).contains("status")
        assertThat(instanceCreateResponse.vaults().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instanceCreateResponse =
            InstanceCreateResponse.builder()
                .id("id")
                .autoShutdownMinutes(0L)
                .createdAt("createdAt")
                .gpu("gpu")
                .instanceType("instanceType")
                .message("message")
                .name("name")
                .pricePerHour("pricePerHour")
                .region("region")
                .specs(JsonValue.from(mapOf<String, Any>()))
                .status("status")
                .addVault(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedInstanceCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instanceCreateResponse),
                jacksonTypeRef<InstanceCreateResponse>(),
            )

        assertThat(roundtrippedInstanceCreateResponse).isEqualTo(instanceCreateResponse)
    }
}
