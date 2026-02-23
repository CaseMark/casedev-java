// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.compute.v1.instances

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstanceListResponseTest {

    @Test
    fun create() {
        val instanceListResponse =
            InstanceListResponse.builder()
                .count(0L)
                .addInstance(
                    InstanceListResponse.Instance.builder()
                        .id("id")
                        .autoShutdownMinutes(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gpu("gpu")
                        .instanceType("instanceType")
                        .ip("ip")
                        .name("name")
                        .pricePerHour("pricePerHour")
                        .region("region")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(InstanceListResponse.Instance.Status.BOOTING)
                        .totalCost("totalCost")
                        .totalRuntimeSeconds(0L)
                        .build()
                )
                .build()

        assertThat(instanceListResponse.count()).contains(0L)
        assertThat(instanceListResponse.instances().getOrNull())
            .containsExactly(
                InstanceListResponse.Instance.builder()
                    .id("id")
                    .autoShutdownMinutes(0L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .gpu("gpu")
                    .instanceType("instanceType")
                    .ip("ip")
                    .name("name")
                    .pricePerHour("pricePerHour")
                    .region("region")
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(InstanceListResponse.Instance.Status.BOOTING)
                    .totalCost("totalCost")
                    .totalRuntimeSeconds(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instanceListResponse =
            InstanceListResponse.builder()
                .count(0L)
                .addInstance(
                    InstanceListResponse.Instance.builder()
                        .id("id")
                        .autoShutdownMinutes(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .gpu("gpu")
                        .instanceType("instanceType")
                        .ip("ip")
                        .name("name")
                        .pricePerHour("pricePerHour")
                        .region("region")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(InstanceListResponse.Instance.Status.BOOTING)
                        .totalCost("totalCost")
                        .totalRuntimeSeconds(0L)
                        .build()
                )
                .build()

        val roundtrippedInstanceListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instanceListResponse),
                jacksonTypeRef<InstanceListResponse>(),
            )

        assertThat(roundtrippedInstanceListResponse).isEqualTo(instanceListResponse)
    }
}
