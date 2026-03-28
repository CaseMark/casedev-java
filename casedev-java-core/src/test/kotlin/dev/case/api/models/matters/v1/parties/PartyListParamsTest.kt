// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1.parties

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartyListParamsTest {

    @Test
    fun create() {
        PartyListParams.builder()
            .email("email")
            .query("query")
            .type(PartyListParams.Type.PERSON)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PartyListParams.builder()
                .email("email")
                .query("query")
                .type(PartyListParams.Type.PERSON)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("email", "email")
                    .put("query", "query")
                    .put("type", "person")
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
