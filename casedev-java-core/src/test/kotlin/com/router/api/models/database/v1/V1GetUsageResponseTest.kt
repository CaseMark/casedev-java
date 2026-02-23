// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.database.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1GetUsageResponseTest {

    @Test
    fun create() {
        val v1GetUsageResponse =
            V1GetUsageResponse.builder()
                .period(
                    V1GetUsageResponse.Period.builder()
                        .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pricing(
                    V1GetUsageResponse.Pricing.builder()
                        .branchPerMonth(0.0)
                        .computePerCuHour(0.0)
                        .freeBranches(0L)
                        .storagePerGbMonth(0.0)
                        .transferPerGb(0.0)
                        .build()
                )
                .projectCount(0L)
                .addProject(
                    V1GetUsageResponse.Project.builder()
                        .id("id")
                        .branchCount(0L)
                        .computeCuHours(0.0)
                        .costs(
                            V1GetUsageResponse.Project.Costs.builder()
                                .branches("branches")
                                .compute("compute")
                                .storage("storage")
                                .total("total")
                                .transfer("transfer")
                                .build()
                        )
                        .lastUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .projectId("projectId")
                        .projectName("projectName")
                        .storageGbMonths(0.0)
                        .transferGb(0.0)
                        .build()
                )
                .totals(
                    V1GetUsageResponse.Totals.builder()
                        .branchCostDollars("branchCostDollars")
                        .computeCostDollars("computeCostDollars")
                        .computeCuHours(0.0)
                        .storageCostDollars("storageCostDollars")
                        .storageGbMonths(0.0)
                        .totalBranches(0L)
                        .totalCostDollars("totalCostDollars")
                        .transferCostDollars("transferCostDollars")
                        .transferGb(0.0)
                        .build()
                )
                .build()

        assertThat(v1GetUsageResponse.period())
            .contains(
                V1GetUsageResponse.Period.builder()
                    .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(v1GetUsageResponse.pricing())
            .contains(
                V1GetUsageResponse.Pricing.builder()
                    .branchPerMonth(0.0)
                    .computePerCuHour(0.0)
                    .freeBranches(0L)
                    .storagePerGbMonth(0.0)
                    .transferPerGb(0.0)
                    .build()
            )
        assertThat(v1GetUsageResponse.projectCount()).contains(0L)
        assertThat(v1GetUsageResponse.projects().getOrNull())
            .containsExactly(
                V1GetUsageResponse.Project.builder()
                    .id("id")
                    .branchCount(0L)
                    .computeCuHours(0.0)
                    .costs(
                        V1GetUsageResponse.Project.Costs.builder()
                            .branches("branches")
                            .compute("compute")
                            .storage("storage")
                            .total("total")
                            .transfer("transfer")
                            .build()
                    )
                    .lastUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .projectId("projectId")
                    .projectName("projectName")
                    .storageGbMonths(0.0)
                    .transferGb(0.0)
                    .build()
            )
        assertThat(v1GetUsageResponse.totals())
            .contains(
                V1GetUsageResponse.Totals.builder()
                    .branchCostDollars("branchCostDollars")
                    .computeCostDollars("computeCostDollars")
                    .computeCuHours(0.0)
                    .storageCostDollars("storageCostDollars")
                    .storageGbMonths(0.0)
                    .totalBranches(0L)
                    .totalCostDollars("totalCostDollars")
                    .transferCostDollars("transferCostDollars")
                    .transferGb(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1GetUsageResponse =
            V1GetUsageResponse.builder()
                .period(
                    V1GetUsageResponse.Period.builder()
                        .end(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .start(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pricing(
                    V1GetUsageResponse.Pricing.builder()
                        .branchPerMonth(0.0)
                        .computePerCuHour(0.0)
                        .freeBranches(0L)
                        .storagePerGbMonth(0.0)
                        .transferPerGb(0.0)
                        .build()
                )
                .projectCount(0L)
                .addProject(
                    V1GetUsageResponse.Project.builder()
                        .id("id")
                        .branchCount(0L)
                        .computeCuHours(0.0)
                        .costs(
                            V1GetUsageResponse.Project.Costs.builder()
                                .branches("branches")
                                .compute("compute")
                                .storage("storage")
                                .total("total")
                                .transfer("transfer")
                                .build()
                        )
                        .lastUpdated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .projectId("projectId")
                        .projectName("projectName")
                        .storageGbMonths(0.0)
                        .transferGb(0.0)
                        .build()
                )
                .totals(
                    V1GetUsageResponse.Totals.builder()
                        .branchCostDollars("branchCostDollars")
                        .computeCostDollars("computeCostDollars")
                        .computeCuHours(0.0)
                        .storageCostDollars("storageCostDollars")
                        .storageGbMonths(0.0)
                        .totalBranches(0L)
                        .totalCostDollars("totalCostDollars")
                        .transferCostDollars("transferCostDollars")
                        .transferGb(0.0)
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
