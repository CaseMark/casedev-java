// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.payments.v1.parties

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartyListParamsTest {

    @Test
    fun create() {
        PartyListParams.builder().limit(0L).offset(0L).role("role").type("type").build()
    }

    @Test
    fun queryParams() {
        val params =
            PartyListParams.builder().limit(0L).offset(0L).role("role").type("type").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("role", "role")
                    .put("type", "type")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PartyListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
