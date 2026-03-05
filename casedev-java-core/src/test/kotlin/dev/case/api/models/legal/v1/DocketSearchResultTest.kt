// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocketSearchResultTest {

    @Test
    fun create() {
        val docketSearchResult =
            DocketSearchResult.builder()
                .id("id")
                .assignedTo("assignedTo")
                .caseName("caseName")
                .cause("cause")
                .court("court")
                .courtId("courtId")
                .dateFiled(LocalDate.parse("2019-12-27"))
                .dateTerminated(LocalDate.parse("2019-12-27"))
                .docketNumber("docketNumber")
                .natureOfSuit("natureOfSuit")
                .pacerCaseId("pacerCaseId")
                .addParty("string")
                .url("url")
                .build()

        assertThat(docketSearchResult.id()).contains("id")
        assertThat(docketSearchResult.assignedTo()).contains("assignedTo")
        assertThat(docketSearchResult.caseName()).contains("caseName")
        assertThat(docketSearchResult.cause()).contains("cause")
        assertThat(docketSearchResult.court()).contains("court")
        assertThat(docketSearchResult.courtId()).contains("courtId")
        assertThat(docketSearchResult.dateFiled()).contains(LocalDate.parse("2019-12-27"))
        assertThat(docketSearchResult.dateTerminated()).contains(LocalDate.parse("2019-12-27"))
        assertThat(docketSearchResult.docketNumber()).contains("docketNumber")
        assertThat(docketSearchResult.natureOfSuit()).contains("natureOfSuit")
        assertThat(docketSearchResult.pacerCaseId()).contains("pacerCaseId")
        assertThat(docketSearchResult.parties().getOrNull()).containsExactly("string")
        assertThat(docketSearchResult.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val docketSearchResult =
            DocketSearchResult.builder()
                .id("id")
                .assignedTo("assignedTo")
                .caseName("caseName")
                .cause("cause")
                .court("court")
                .courtId("courtId")
                .dateFiled(LocalDate.parse("2019-12-27"))
                .dateTerminated(LocalDate.parse("2019-12-27"))
                .docketNumber("docketNumber")
                .natureOfSuit("natureOfSuit")
                .pacerCaseId("pacerCaseId")
                .addParty("string")
                .url("url")
                .build()

        val roundtrippedDocketSearchResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(docketSearchResult),
                jacksonTypeRef<DocketSearchResult>(),
            )

        assertThat(roundtrippedDocketSearchResult).isEqualTo(docketSearchResult)
    }
}
