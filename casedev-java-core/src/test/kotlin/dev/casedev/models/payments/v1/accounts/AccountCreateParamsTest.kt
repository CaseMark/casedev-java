// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.accounts

import dev.casedev.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountCreateParamsTest {

    @Test
    fun create() {
        AccountCreateParams.builder()
            .name("name")
            .type(AccountCreateParams.Type.TRUST)
            .currency("currency")
            .matterId("matter_id")
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .parentAccountId("parent_account_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountCreateParams.builder()
                .name("name")
                .type(AccountCreateParams.Type.TRUST)
                .currency("currency")
                .matterId("matter_id")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .parentAccountId("parent_account_id")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.type()).isEqualTo(AccountCreateParams.Type.TRUST)
        assertThat(body.currency()).contains("currency")
        assertThat(body.matterId()).contains("matter_id")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.parentAccountId()).contains("parent_account_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountCreateParams.builder().name("name").type(AccountCreateParams.Type.TRUST).build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.type()).isEqualTo(AccountCreateParams.Type.TRUST)
    }
}
