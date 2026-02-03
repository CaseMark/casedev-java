// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.accounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountCreateResponseTest {

    @Test
    fun create() {
        val accountCreateResponse =
            AccountCreateResponse.builder()
                .id("id")
                .cachedAvailableBalance(0.0)
                .cachedBalance(0.0)
                .createdAt("createdAt")
                .currency("currency")
                .isActive(true)
                .name("name")
                .organizationId("organizationId")
                .type("type")
                .build()

        assertThat(accountCreateResponse.id()).contains("id")
        assertThat(accountCreateResponse.cachedAvailableBalance()).contains(0.0)
        assertThat(accountCreateResponse.cachedBalance()).contains(0.0)
        assertThat(accountCreateResponse.createdAt()).contains("createdAt")
        assertThat(accountCreateResponse.currency()).contains("currency")
        assertThat(accountCreateResponse.isActive()).contains(true)
        assertThat(accountCreateResponse.name()).contains("name")
        assertThat(accountCreateResponse.organizationId()).contains("organizationId")
        assertThat(accountCreateResponse.type()).contains("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountCreateResponse =
            AccountCreateResponse.builder()
                .id("id")
                .cachedAvailableBalance(0.0)
                .cachedBalance(0.0)
                .createdAt("createdAt")
                .currency("currency")
                .isActive(true)
                .name("name")
                .organizationId("organizationId")
                .type("type")
                .build()

        val roundtrippedAccountCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountCreateResponse),
                jacksonTypeRef<AccountCreateResponse>(),
            )

        assertThat(roundtrippedAccountCreateResponse).isEqualTo(accountCreateResponse)
    }
}
