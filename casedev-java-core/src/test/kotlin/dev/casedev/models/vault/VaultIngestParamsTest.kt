// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultIngestParamsTest {

    @Test
    fun create() {
        VaultIngestParams.builder().id("id").objectId("objectId").build()
    }

    @Test
    fun pathParams() {
        val params = VaultIngestParams.builder().id("id").objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
