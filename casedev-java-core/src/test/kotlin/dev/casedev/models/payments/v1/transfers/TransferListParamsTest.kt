// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.transfers

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferListParamsTest {

    @Test
    fun create() {
        TransferListParams.builder()
            .fromAccountId("from_account_id")
            .limit(0L)
            .offset(0L)
            .status("status")
            .toAccountId("to_account_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TransferListParams.builder()
                .fromAccountId("from_account_id")
                .limit(0L)
                .offset(0L)
                .status("status")
                .toAccountId("to_account_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("from_account_id", "from_account_id")
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("status", "status")
                    .put("to_account_id", "to_account_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TransferListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
