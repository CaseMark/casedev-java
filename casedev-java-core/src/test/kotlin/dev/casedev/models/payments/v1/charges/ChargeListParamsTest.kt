// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.charges

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargeListParamsTest {

    @Test
    fun create() {
        ChargeListParams.builder()
            .destinationAccountId("destination_account_id")
            .limit(0L)
            .offset(0L)
            .partyId("party_id")
            .status("status")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ChargeListParams.builder()
                .destinationAccountId("destination_account_id")
                .limit(0L)
                .offset(0L)
                .partyId("party_id")
                .status("status")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("destination_account_id", "destination_account_id")
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("party_id", "party_id")
                    .put("status", "status")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ChargeListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
