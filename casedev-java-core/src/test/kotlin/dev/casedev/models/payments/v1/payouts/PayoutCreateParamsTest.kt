// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.payouts

import dev.casedev.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PayoutCreateParamsTest {

    @Test
    fun create() {
        PayoutCreateParams.builder()
            .amount(0L)
            .destinationType(PayoutCreateParams.DestinationType.BANK_ACCOUNT)
            .fromAccountId("from_account_id")
            .currency("currency")
            .memo("memo")
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .partyId("party_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            PayoutCreateParams.builder()
                .amount(0L)
                .destinationType(PayoutCreateParams.DestinationType.BANK_ACCOUNT)
                .fromAccountId("from_account_id")
                .currency("currency")
                .memo("memo")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .partyId("party_id")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.destinationType())
            .isEqualTo(PayoutCreateParams.DestinationType.BANK_ACCOUNT)
        assertThat(body.fromAccountId()).isEqualTo("from_account_id")
        assertThat(body.currency()).contains("currency")
        assertThat(body.memo()).contains("memo")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.partyId()).contains("party_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PayoutCreateParams.builder()
                .amount(0L)
                .destinationType(PayoutCreateParams.DestinationType.BANK_ACCOUNT)
                .fromAccountId("from_account_id")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.destinationType())
            .isEqualTo(PayoutCreateParams.DestinationType.BANK_ACCOUNT)
        assertThat(body.fromAccountId()).isEqualTo("from_account_id")
    }
}
