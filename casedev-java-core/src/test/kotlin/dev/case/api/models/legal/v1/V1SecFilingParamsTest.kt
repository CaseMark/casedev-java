// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.legal.v1

import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1SecFilingParamsTest {

    @Test
    fun create() {
        V1SecFilingParams.builder()
            .type(V1SecFilingParams.Type.SEARCH)
            .cik("cik")
            .dateAfter(LocalDate.parse("2019-12-27"))
            .dateBefore(LocalDate.parse("2019-12-27"))
            .entity("entity")
            .addFormType("string")
            .limit(1L)
            .offset(0L)
            .query("xx")
            .ticker("ticker")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1SecFilingParams.builder()
                .type(V1SecFilingParams.Type.SEARCH)
                .cik("cik")
                .dateAfter(LocalDate.parse("2019-12-27"))
                .dateBefore(LocalDate.parse("2019-12-27"))
                .entity("entity")
                .addFormType("string")
                .limit(1L)
                .offset(0L)
                .query("xx")
                .ticker("ticker")
                .build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(V1SecFilingParams.Type.SEARCH)
        assertThat(body.cik()).contains("cik")
        assertThat(body.dateAfter()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.dateBefore()).contains(LocalDate.parse("2019-12-27"))
        assertThat(body.entity()).contains("entity")
        assertThat(body.formTypes().getOrNull()).containsExactly("string")
        assertThat(body.limit()).contains(1L)
        assertThat(body.offset()).contains(0L)
        assertThat(body.query()).contains("xx")
        assertThat(body.ticker()).contains("ticker")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1SecFilingParams.builder().type(V1SecFilingParams.Type.SEARCH).build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(V1SecFilingParams.Type.SEARCH)
    }
}
