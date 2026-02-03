// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.payouts

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayoutListParamsTest {

    @Test
    fun create() {
        PayoutListParams.builder()
            .fromAccountId("from_account_id")
            .limit(0L)
            .offset(0L)
            .partyId("party_id")
            .status(PayoutListParams.Status.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PayoutListParams.builder()
                .fromAccountId("from_account_id")
                .limit(0L)
                .offset(0L)
                .partyId("party_id")
                .status(PayoutListParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("from_account_id", "from_account_id")
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("party_id", "party_id")
                    .put("status", "pending")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PayoutListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
