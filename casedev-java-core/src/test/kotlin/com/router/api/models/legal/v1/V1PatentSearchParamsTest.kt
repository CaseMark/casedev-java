// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.legal.v1

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1PatentSearchParamsTest {

    @Test
    fun create() {
        V1PatentSearchParams.builder()
            .query("x")
            .applicationStatus("applicationStatus")
            .applicationType(V1PatentSearchParams.ApplicationType.UTILITY)
            .assignee("assignee")
            .filingDateFrom(LocalDate.parse("2019-12-27"))
            .filingDateTo(LocalDate.parse("2019-12-27"))
            .grantDateFrom(LocalDate.parse("2019-12-27"))
            .grantDateTo(LocalDate.parse("2019-12-27"))
            .inventor("inventor")
            .limit(1L)
            .offset(0L)
            .sortBy(V1PatentSearchParams.SortBy.FILING_DATE)
            .sortOrder(V1PatentSearchParams.SortOrder.ASC)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1PatentSearchParams.builder()
                .query("x")
                .applicationStatus("applicationStatus")
                .applicationType(V1PatentSearchParams.ApplicationType.UTILITY)
                .assignee("assignee")
                .filingDateFrom(LocalDate.parse("2019-12-27"))
                .filingDateTo(LocalDate.parse("2019-12-27"))
                .grantDateFrom(LocalDate.parse("2019-12-27"))
                .grantDateTo(LocalDate.parse("2019-12-27"))
                .inventor("inventor")
                .limit(1L)
                .offset(0L)
                .sortBy(V1PatentSearchParams.SortBy.FILING_DATE)
                .sortOrder(V1PatentSearchParams.SortOrder.ASC)
                .build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("x")
        assertThat(body.applicationStatus()).contains("applicationStatus")
        assertThat(body.applicationType()).contains(V1PatentSearchParams.ApplicationType.UTILITY)
        assertThat(body.assignee()).contains("assignee")
        assertThat(body.filingDateFrom()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.filingDateTo()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.grantDateFrom()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.grantDateTo()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.inventor()).contains("inventor")
        assertThat(body.limit()).contains(1L)
        assertThat(body.offset()).contains(0L)
        assertThat(body.sortBy()).contains(V1PatentSearchParams.SortBy.FILING_DATE)
        assertThat(body.sortOrder()).contains(V1PatentSearchParams.SortOrder.ASC)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1PatentSearchParams.builder().query("x").build()

        val body = params._body()

        assertThat(body.query()).isEqualTo("x")
    }
}
