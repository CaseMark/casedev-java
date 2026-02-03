// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1.instancetypes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstanceTypeListResponseTest {

    @Test
    fun create() {
        val instanceTypeListResponse =
            InstanceTypeListResponse.builder()
                .count(0L)
                .addInstanceType(
                    InstanceTypeListResponse.InstanceType.builder()
                        .description("description")
                        .gpu("gpu")
                        .name("name")
                        .pricePerHour("pricePerHour")
                        .addRegionsAvailable("string")
                        .specs(
                            InstanceTypeListResponse.InstanceType.Specs.builder()
                                .memoryGib(0L)
                                .storageGib(0L)
                                .vcpus(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(instanceTypeListResponse.count()).isEqualTo(0L)
        assertThat(instanceTypeListResponse.instanceTypes())
            .containsExactly(
                InstanceTypeListResponse.InstanceType.builder()
                    .description("description")
                    .gpu("gpu")
                    .name("name")
                    .pricePerHour("pricePerHour")
                    .addRegionsAvailable("string")
                    .specs(
                        InstanceTypeListResponse.InstanceType.Specs.builder()
                            .memoryGib(0L)
                            .storageGib(0L)
                            .vcpus(0L)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instanceTypeListResponse =
            InstanceTypeListResponse.builder()
                .count(0L)
                .addInstanceType(
                    InstanceTypeListResponse.InstanceType.builder()
                        .description("description")
                        .gpu("gpu")
                        .name("name")
                        .pricePerHour("pricePerHour")
                        .addRegionsAvailable("string")
                        .specs(
                            InstanceTypeListResponse.InstanceType.Specs.builder()
                                .memoryGib(0L)
                                .storageGib(0L)
                                .vcpus(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedInstanceTypeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instanceTypeListResponse),
                jacksonTypeRef<InstanceTypeListResponse>(),
            )

        assertThat(roundtrippedInstanceTypeListResponse).isEqualTo(instanceTypeListResponse)
    }
}
