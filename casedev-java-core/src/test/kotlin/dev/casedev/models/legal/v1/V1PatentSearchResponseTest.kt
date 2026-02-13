// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.legal.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1PatentSearchResponseTest {

    @Test
    fun create() {
        val v1PatentSearchResponse =
            V1PatentSearchResponse.builder()
                .limit(0L)
                .offset(0L)
                .query("query")
                .addResult(
                    V1PatentSearchResponse.Result.builder()
                        .applicationNumber("applicationNumber")
                        .applicationType("applicationType")
                        .addAssignee("string")
                        .entityStatus("entityStatus")
                        .filingDate(LocalDate.parse("2019-12-27"))
                        .grantDate(LocalDate.parse("2019-12-27"))
                        .addInventor("string")
                        .patentNumber("patentNumber")
                        .status("status")
                        .title("title")
                        .build()
                )
                .totalResults(0L)
                .build()

        assertThat(v1PatentSearchResponse.limit()).contains(0L)
        assertThat(v1PatentSearchResponse.offset()).contains(0L)
        assertThat(v1PatentSearchResponse.query()).contains("query")
        assertThat(v1PatentSearchResponse.results().getOrNull())
            .containsExactly(
                V1PatentSearchResponse.Result.builder()
                    .applicationNumber("applicationNumber")
                    .applicationType("applicationType")
                    .addAssignee("string")
                    .entityStatus("entityStatus")
                    .filingDate(LocalDate.parse("2019-12-27"))
                    .grantDate(LocalDate.parse("2019-12-27"))
                    .addInventor("string")
                    .patentNumber("patentNumber")
                    .status("status")
                    .title("title")
                    .build()
            )
        assertThat(v1PatentSearchResponse.totalResults()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1PatentSearchResponse =
            V1PatentSearchResponse.builder()
                .limit(0L)
                .offset(0L)
                .query("query")
                .addResult(
                    V1PatentSearchResponse.Result.builder()
                        .applicationNumber("applicationNumber")
                        .applicationType("applicationType")
                        .addAssignee("string")
                        .entityStatus("entityStatus")
                        .filingDate(LocalDate.parse("2019-12-27"))
                        .grantDate(LocalDate.parse("2019-12-27"))
                        .addInventor("string")
                        .patentNumber("patentNumber")
                        .status("status")
                        .title("title")
                        .build()
                )
                .totalResults(0L)
                .build()

        val roundtrippedV1PatentSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1PatentSearchResponse),
                jacksonTypeRef<V1PatentSearchResponse>(),
            )

        assertThat(roundtrippedV1PatentSearchResponse).isEqualTo(v1PatentSearchResponse)
    }
}
