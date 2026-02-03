// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.ledger

import dev.casedev.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerListTransactionsParamsTest {

    @Test
    fun create() {
        LedgerListTransactionsParams.builder()
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(0L)
            .offset(0L)
            .referenceId("reference_id")
            .referenceType("reference_type")
            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LedgerListTransactionsParams.builder()
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(0L)
                .offset(0L)
                .referenceId("reference_id")
                .referenceType("reference_type")
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end_date", "2019-12-27T18:11:19.117Z")
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("reference_id", "reference_id")
                    .put("reference_type", "reference_type")
                    .put("start_date", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerListTransactionsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
