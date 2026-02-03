// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.holds

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HoldListParamsTest {

    @Test
    fun create() {
        HoldListParams.builder()
            .accountId("account_id")
            .limit(0L)
            .offset(0L)
            .status("status")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            HoldListParams.builder()
                .accountId("account_id")
                .limit(0L)
                .offset(0L)
                .status("status")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("account_id", "account_id")
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("status", "status")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HoldListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
