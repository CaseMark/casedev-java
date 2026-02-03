// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountGetLedgerResponseTest {

    @Test
    fun create() {
        val accountGetLedgerResponse =
            AccountGetLedgerResponse.builder()
                .addEntry(JsonValue.from(mapOf<String, Any>()))
                .pagination(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(accountGetLedgerResponse.entries().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(accountGetLedgerResponse._pagination())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountGetLedgerResponse =
            AccountGetLedgerResponse.builder()
                .addEntry(JsonValue.from(mapOf<String, Any>()))
                .pagination(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedAccountGetLedgerResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountGetLedgerResponse),
                jacksonTypeRef<AccountGetLedgerResponse>(),
            )

        assertThat(roundtrippedAccountGetLedgerResponse).isEqualTo(accountGetLedgerResponse)
    }
}
