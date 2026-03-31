// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.parties

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartyUpdateParamsTest {

    @Test
    fun create() {
        PartyUpdateParams.builder().partyId("partyId").build()
    }

    @Test
    fun pathParams() {
        val params = PartyUpdateParams.builder().partyId("partyId").build()

        assertThat(params._pathParam(0)).isEqualTo("partyId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
