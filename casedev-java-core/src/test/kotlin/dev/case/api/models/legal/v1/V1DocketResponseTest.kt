// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DocketResponseTest {

    @Test
    fun create() {
        val v1DocketResponse =
            V1DocketResponse.builder()
                .court("court")
                .dateFiledAfter(LocalDate.parse("2019-12-27"))
                .dateFiledBefore(LocalDate.parse("2019-12-27"))
                .docket(
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
                )
                .addDocket(
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
                )
                .addEntry(
                    V1DocketResponse.Entry.builder()
                        .date(LocalDate.parse("2019-12-27"))
                        .description("description")
                        .addDocument(
                            V1DocketResponse.Entry.Document.builder()
                                .id("id")
                                .attachmentNumber(0L)
                                .description("description")
                                .documentNumber("documentNumber")
                                .isAvailable(true)
                                .pageCount(0L)
                                .pdfUrl("pdfUrl")
                                .build()
                        )
                        .entryNumber(0L)
                        .build()
                )
                .found(0L)
                .includeEntries(true)
                .pagination(
                    V1DocketResponse.Pagination.builder().limit(0L).offset(0L).returned(0L).build()
                )
                .query("query")
                .type(V1DocketResponse.Type.SEARCH)
                .build()

        assertThat(v1DocketResponse.court()).contains("court")
        assertThat(v1DocketResponse.dateFiledAfter()).contains(LocalDate.parse("2019-12-27"))
        assertThat(v1DocketResponse.dateFiledBefore()).contains(LocalDate.parse("2019-12-27"))
        assertThat(v1DocketResponse.docket())
            .contains(
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
            )
        assertThat(v1DocketResponse.dockets().getOrNull())
            .containsExactly(
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
            )
        assertThat(v1DocketResponse.entries().getOrNull())
            .containsExactly(
                V1DocketResponse.Entry.builder()
                    .date(LocalDate.parse("2019-12-27"))
                    .description("description")
                    .addDocument(
                        V1DocketResponse.Entry.Document.builder()
                            .id("id")
                            .attachmentNumber(0L)
                            .description("description")
                            .documentNumber("documentNumber")
                            .isAvailable(true)
                            .pageCount(0L)
                            .pdfUrl("pdfUrl")
                            .build()
                    )
                    .entryNumber(0L)
                    .build()
            )
        assertThat(v1DocketResponse.found()).contains(0L)
        assertThat(v1DocketResponse.includeEntries()).contains(true)
        assertThat(v1DocketResponse.pagination())
            .contains(
                V1DocketResponse.Pagination.builder().limit(0L).offset(0L).returned(0L).build()
            )
        assertThat(v1DocketResponse.query()).contains("query")
        assertThat(v1DocketResponse.type()).contains(V1DocketResponse.Type.SEARCH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1DocketResponse =
            V1DocketResponse.builder()
                .court("court")
                .dateFiledAfter(LocalDate.parse("2019-12-27"))
                .dateFiledBefore(LocalDate.parse("2019-12-27"))
                .docket(
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
                )
                .addDocket(
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
                )
                .addEntry(
                    V1DocketResponse.Entry.builder()
                        .date(LocalDate.parse("2019-12-27"))
                        .description("description")
                        .addDocument(
                            V1DocketResponse.Entry.Document.builder()
                                .id("id")
                                .attachmentNumber(0L)
                                .description("description")
                                .documentNumber("documentNumber")
                                .isAvailable(true)
                                .pageCount(0L)
                                .pdfUrl("pdfUrl")
                                .build()
                        )
                        .entryNumber(0L)
                        .build()
                )
                .found(0L)
                .includeEntries(true)
                .pagination(
                    V1DocketResponse.Pagination.builder().limit(0L).offset(0L).returned(0L).build()
                )
                .query("query")
                .type(V1DocketResponse.Type.SEARCH)
                .build()

        val roundtrippedV1DocketResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1DocketResponse),
                jacksonTypeRef<V1DocketResponse>(),
            )

        assertThat(roundtrippedV1DocketResponse).isEqualTo(v1DocketResponse)
    }
}
