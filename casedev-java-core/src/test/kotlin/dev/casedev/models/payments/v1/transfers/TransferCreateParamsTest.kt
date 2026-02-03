// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.transfers

import dev.casedev.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransferCreateParamsTest {

    @Test
    fun create() {
        TransferCreateParams.builder()
            .amount(0L)
            .fromAccountId("from_account_id")
            .toAccountId("to_account_id")
            .memo("memo")
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun body() {
        val params =
            TransferCreateParams.builder()
                .amount(0L)
                .fromAccountId("from_account_id")
                .toAccountId("to_account_id")
                .memo("memo")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.fromAccountId()).isEqualTo("from_account_id")
        assertThat(body.toAccountId()).isEqualTo("to_account_id")
        assertThat(body.memo()).contains("memo")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransferCreateParams.builder()
                .amount(0L)
                .fromAccountId("from_account_id")
                .toAccountId("to_account_id")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.fromAccountId()).isEqualTo("from_account_id")
        assertThat(body.toAccountId()).isEqualTo("to_account_id")
    }
}
