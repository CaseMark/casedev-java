// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1SecFilingResponseTest {

    @Test
    fun create() {
        val v1SecFilingResponse =
            V1SecFilingResponse.builder()
                .cik("cik")
                .dateAfter(LocalDate.parse("2019-12-27"))
                .dateBefore(LocalDate.parse("2019-12-27"))
                .entity("entity")
                .addFiling(
                    V1SecFilingResponse.Filing.builder()
                        .accessionNumber("accessionNumber")
                        .description("description")
                        .addDocument(
                            V1SecFilingResponse.Filing.Document.builder()
                                .description("description")
                                .type("type")
                                .url("url")
                                .build()
                        )
                        .entity(
                            V1SecFilingResponse.Filing.Entity.builder()
                                .cik("cik")
                                .entityType("entityType")
                                .name("name")
                                .sic("sic")
                                .sicDescription("sicDescription")
                                .stateOfIncorporation("stateOfIncorporation")
                                .ticker("ticker")
                                .build()
                        )
                        .filedAt(LocalDate.parse("2019-12-27"))
                        .formType("formType")
                        .periodOfReport(LocalDate.parse("2019-12-27"))
                        .secUrl("secUrl")
                        .snippet("snippet")
                        .build()
                )
                .addFormType("string")
                .limit(0L)
                .offset(0L)
                .query("query")
                .ticker("ticker")
                .total(0L)
                .type(V1SecFilingResponse.Type.SEARCH)
                .build()

        assertThat(v1SecFilingResponse.cik()).contains("cik")
        assertThat(v1SecFilingResponse.dateAfter()).contains(LocalDate.parse("2019-12-27"))
        assertThat(v1SecFilingResponse.dateBefore()).contains(LocalDate.parse("2019-12-27"))
        assertThat(v1SecFilingResponse.entity()).contains("entity")
        assertThat(v1SecFilingResponse.filings().getOrNull())
            .containsExactly(
                V1SecFilingResponse.Filing.builder()
                    .accessionNumber("accessionNumber")
                    .description("description")
                    .addDocument(
                        V1SecFilingResponse.Filing.Document.builder()
                            .description("description")
                            .type("type")
                            .url("url")
                            .build()
                    )
                    .entity(
                        V1SecFilingResponse.Filing.Entity.builder()
                            .cik("cik")
                            .entityType("entityType")
                            .name("name")
                            .sic("sic")
                            .sicDescription("sicDescription")
                            .stateOfIncorporation("stateOfIncorporation")
                            .ticker("ticker")
                            .build()
                    )
                    .filedAt(LocalDate.parse("2019-12-27"))
                    .formType("formType")
                    .periodOfReport(LocalDate.parse("2019-12-27"))
                    .secUrl("secUrl")
                    .snippet("snippet")
                    .build()
            )
        assertThat(v1SecFilingResponse.formTypes().getOrNull()).containsExactly("string")
        assertThat(v1SecFilingResponse.limit()).contains(0L)
        assertThat(v1SecFilingResponse.offset()).contains(0L)
        assertThat(v1SecFilingResponse.query()).contains("query")
        assertThat(v1SecFilingResponse.ticker()).contains("ticker")
        assertThat(v1SecFilingResponse.total()).contains(0L)
        assertThat(v1SecFilingResponse.type()).contains(V1SecFilingResponse.Type.SEARCH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1SecFilingResponse =
            V1SecFilingResponse.builder()
                .cik("cik")
                .dateAfter(LocalDate.parse("2019-12-27"))
                .dateBefore(LocalDate.parse("2019-12-27"))
                .entity("entity")
                .addFiling(
                    V1SecFilingResponse.Filing.builder()
                        .accessionNumber("accessionNumber")
                        .description("description")
                        .addDocument(
                            V1SecFilingResponse.Filing.Document.builder()
                                .description("description")
                                .type("type")
                                .url("url")
                                .build()
                        )
                        .entity(
                            V1SecFilingResponse.Filing.Entity.builder()
                                .cik("cik")
                                .entityType("entityType")
                                .name("name")
                                .sic("sic")
                                .sicDescription("sicDescription")
                                .stateOfIncorporation("stateOfIncorporation")
                                .ticker("ticker")
                                .build()
                        )
                        .filedAt(LocalDate.parse("2019-12-27"))
                        .formType("formType")
                        .periodOfReport(LocalDate.parse("2019-12-27"))
                        .secUrl("secUrl")
                        .snippet("snippet")
                        .build()
                )
                .addFormType("string")
                .limit(0L)
                .offset(0L)
                .query("query")
                .ticker("ticker")
                .total(0L)
                .type(V1SecFilingResponse.Type.SEARCH)
                .build()

        val roundtrippedV1SecFilingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1SecFilingResponse),
                jacksonTypeRef<V1SecFilingResponse>(),
            )

        assertThat(roundtrippedV1SecFilingResponse).isEqualTo(v1SecFilingResponse)
    }
}
