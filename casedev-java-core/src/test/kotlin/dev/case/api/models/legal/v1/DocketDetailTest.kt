// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocketDetailTest {

    @Test
    fun create() {
        val docketDetail =
            DocketDetail.builder()
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

        assertThat(docketDetail.id()).contains("id")
        assertThat(docketDetail.assignedTo()).contains("assignedTo")
        assertThat(docketDetail.caseName()).contains("caseName")
        assertThat(docketDetail.cause()).contains("cause")
        assertThat(docketDetail.court()).contains("court")
        assertThat(docketDetail.courtId()).contains("courtId")
        assertThat(docketDetail.dateFiled()).contains(LocalDate.parse("2019-12-27"))
        assertThat(docketDetail.dateTerminated()).contains(LocalDate.parse("2019-12-27"))
        assertThat(docketDetail.docketNumber()).contains("docketNumber")
        assertThat(docketDetail.natureOfSuit()).contains("natureOfSuit")
        assertThat(docketDetail.pacerCaseId()).contains("pacerCaseId")
        assertThat(docketDetail.parties().getOrNull()).containsExactly("string")
        assertThat(docketDetail.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val docketDetail =
            DocketDetail.builder()
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

        val roundtrippedDocketDetail =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(docketDetail),
                jacksonTypeRef<DocketDetail>(),
            )

        assertThat(roundtrippedDocketDetail).isEqualTo(docketDetail)
    }
}
