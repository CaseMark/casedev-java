// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.ledger

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerGetParamsTest {

    @Test
    fun create() {
        LedgerGetParams.builder()
            .accountId("account_id")
            .limit(0L)
            .offset(0L)
            .transactionId("transaction_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LedgerGetParams.builder()
                .accountId("account_id")
                .limit(0L)
                .offset(0L)
                .transactionId("transaction_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("transaction_id", "transaction_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerGetParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
