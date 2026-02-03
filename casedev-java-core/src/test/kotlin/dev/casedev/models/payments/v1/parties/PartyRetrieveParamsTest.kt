// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.parties

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartyRetrieveParamsTest {

    @Test
    fun create() {
        PartyRetrieveParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = PartyRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
