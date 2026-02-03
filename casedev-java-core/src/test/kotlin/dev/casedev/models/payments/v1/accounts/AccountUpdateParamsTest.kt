// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.accounts

import dev.casedev.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountUpdateParamsTest {

    @Test
    fun create() {
        AccountUpdateParams.builder()
            .id("id")
            .isActive(true)
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params = AccountUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AccountUpdateParams.builder()
                .id("id")
                .isActive(true)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.isActive()).contains(true)
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccountUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
