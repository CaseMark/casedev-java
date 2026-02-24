// File generated from our OpenAPI spec by Stainless.

package dev.case.models.vault

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultRetrieveParamsTest {

    @Test
    fun create() {
        VaultRetrieveParams.builder().id("vault_abc123").build()
    }

    @Test
    fun pathParams() {
        val params = VaultRetrieveParams.builder().id("vault_abc123").build()

        assertThat(params._pathParam(0)).isEqualTo("vault_abc123")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
