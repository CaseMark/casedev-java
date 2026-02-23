// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.compute.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1GetUsageResponseTest {

    @Test
    fun create() {
        val v1GetUsageResponse =
            V1GetUsageResponse.builder()
                .addByEnvironment(
                    V1GetUsageResponse.ByEnvironment.builder()
                        .environment("environment")
                        .totalCostCents(0L)
                        .totalCostFormatted("totalCostFormatted")
                        .totalCpuSeconds(0L)
                        .totalGpuSeconds(0L)
                        .totalRuns(0L)
                        .build()
                )
                .period(
                    V1GetUsageResponse.Period.builder()
                        .month(0L)
                        .monthName("monthName")
                        .year(0L)
                        .build()
                )
                .summary(
                    V1GetUsageResponse.Summary.builder()
                        .totalCostCents(0L)
                        .totalCostFormatted("totalCostFormatted")
                        .totalCpuHours(0.0)
                        .totalGpuHours(0.0)
                        .totalRuns(0L)
                        .build()
                )
                .build()

        assertThat(v1GetUsageResponse.byEnvironment().getOrNull())
            .containsExactly(
                V1GetUsageResponse.ByEnvironment.builder()
                    .environment("environment")
                    .totalCostCents(0L)
                    .totalCostFormatted("totalCostFormatted")
                    .totalCpuSeconds(0L)
                    .totalGpuSeconds(0L)
                    .totalRuns(0L)
                    .build()
            )
        assertThat(v1GetUsageResponse.period())
            .contains(
                V1GetUsageResponse.Period.builder()
                    .month(0L)
                    .monthName("monthName")
                    .year(0L)
                    .build()
            )
        assertThat(v1GetUsageResponse.summary())
            .contains(
                V1GetUsageResponse.Summary.builder()
                    .totalCostCents(0L)
                    .totalCostFormatted("totalCostFormatted")
                    .totalCpuHours(0.0)
                    .totalGpuHours(0.0)
                    .totalRuns(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1GetUsageResponse =
            V1GetUsageResponse.builder()
                .addByEnvironment(
                    V1GetUsageResponse.ByEnvironment.builder()
                        .environment("environment")
                        .totalCostCents(0L)
                        .totalCostFormatted("totalCostFormatted")
                        .totalCpuSeconds(0L)
                        .totalGpuSeconds(0L)
                        .totalRuns(0L)
                        .build()
                )
                .period(
                    V1GetUsageResponse.Period.builder()
                        .month(0L)
                        .monthName("monthName")
                        .year(0L)
                        .build()
                )
                .summary(
                    V1GetUsageResponse.Summary.builder()
                        .totalCostCents(0L)
                        .totalCostFormatted("totalCostFormatted")
                        .totalCpuHours(0.0)
                        .totalGpuHours(0.0)
                        .totalRuns(0L)
                        .build()
                )
                .build()

        val roundtrippedV1GetUsageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1GetUsageResponse),
                jacksonTypeRef<V1GetUsageResponse>(),
            )

        assertThat(roundtrippedV1GetUsageResponse).isEqualTo(v1GetUsageResponse)
    }
}
