// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.charges

import dev.casedev.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChargeCreateParamsTest {

    @Test
    fun create() {
        ChargeCreateParams.builder()
            .amount(0L)
            .destinationAccountId("destination_account_id")
            .partyId("party_id")
            .currency("currency")
            .description("description")
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .addPaymentMethod("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            ChargeCreateParams.builder()
                .amount(0L)
                .destinationAccountId("destination_account_id")
                .partyId("party_id")
                .currency("currency")
                .description("description")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .addPaymentMethod("string")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.destinationAccountId()).isEqualTo("destination_account_id")
        assertThat(body.partyId()).isEqualTo("party_id")
        assertThat(body.currency()).contains("currency")
        assertThat(body.description()).contains("description")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.paymentMethods().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChargeCreateParams.builder()
                .amount(0L)
                .destinationAccountId("destination_account_id")
                .partyId("party_id")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.destinationAccountId()).isEqualTo("destination_account_id")
        assertThat(body.partyId()).isEqualTo("party_id")
    }
}
