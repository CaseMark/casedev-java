// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.accounts

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountListParamsTest {

    @Test
    fun create() {
        AccountListParams.builder()
            .limit(0L)
            .matterId("matter_id")
            .offset(0L)
            .parentAccountId("parent_account_id")
            .type("type")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AccountListParams.builder()
                .limit(0L)
                .matterId("matter_id")
                .offset(0L)
                .parentAccountId("parent_account_id")
                .type("type")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "0")
                    .put("matter_id", "matter_id")
                    .put("offset", "0")
                    .put("parent_account_id", "parent_account_id")
                    .put("type", "type")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AccountListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
