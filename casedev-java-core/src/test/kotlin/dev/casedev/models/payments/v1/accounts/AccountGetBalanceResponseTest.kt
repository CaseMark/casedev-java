// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGetBalanceResponseTest {

    @Test
    fun create() {
        val accountGetBalanceResponse =
            AccountGetBalanceResponse.builder()
                .accountId("accountId")
                .availableBalance(0.0)
                .balance(0.0)
                .currency("currency")
                .heldAmount(0.0)
                .pendingCharges(0.0)
                .build()

        assertThat(accountGetBalanceResponse.accountId()).contains("accountId")
        assertThat(accountGetBalanceResponse.availableBalance()).contains(0.0)
        assertThat(accountGetBalanceResponse.balance()).contains(0.0)
        assertThat(accountGetBalanceResponse.currency()).contains("currency")
        assertThat(accountGetBalanceResponse.heldAmount()).contains(0.0)
        assertThat(accountGetBalanceResponse.pendingCharges()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountGetBalanceResponse =
            AccountGetBalanceResponse.builder()
                .accountId("accountId")
                .availableBalance(0.0)
                .balance(0.0)
                .currency("currency")
                .heldAmount(0.0)
                .pendingCharges(0.0)
                .build()

        val roundtrippedAccountGetBalanceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountGetBalanceResponse),
                jacksonTypeRef<AccountGetBalanceResponse>(),
            )

        assertThat(roundtrippedAccountGetBalanceResponse).isEqualTo(accountGetBalanceResponse)
    }
}
