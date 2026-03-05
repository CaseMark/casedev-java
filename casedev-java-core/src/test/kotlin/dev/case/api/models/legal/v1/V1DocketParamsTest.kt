// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1DocketParamsTest {

    @Test
    fun create() {
        V1DocketParams.builder()
            .type(V1DocketParams.Type.SEARCH)
            .court("court")
            .dateFiledAfter(LocalDate.parse("2019-12-27"))
            .dateFiledBefore(LocalDate.parse("2019-12-27"))
            .docketId("docketId")
            .includeEntries(true)
            .limit(1L)
            .live(true)
            .offset(0L)
            .query("xx")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1DocketParams.builder()
                .type(V1DocketParams.Type.SEARCH)
                .court("court")
                .dateFiledAfter(LocalDate.parse("2019-12-27"))
                .dateFiledBefore(LocalDate.parse("2019-12-27"))
                .docketId("docketId")
                .includeEntries(true)
                .limit(1L)
                .live(true)
                .offset(0L)
                .query("xx")
                .build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(V1DocketParams.Type.SEARCH)
        assertThat(body.court()).contains("court")
        assertThat(body.dateFiledAfter()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.dateFiledBefore()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.docketId()).contains("docketId")
        assertThat(body.includeEntries()).contains(true)
        assertThat(body.limit()).contains(1L)
        assertThat(body.live()).contains(true)
        assertThat(body.offset()).contains(0L)
        assertThat(body.query()).contains("xx")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1DocketParams.builder().type(V1DocketParams.Type.SEARCH).build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(V1DocketParams.Type.SEARCH)
    }
}
