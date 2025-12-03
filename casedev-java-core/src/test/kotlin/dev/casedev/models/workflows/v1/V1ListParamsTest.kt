// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListParamsTest {

    @Test
    fun create() {
        V1ListParams.builder()
            .limit(100L)
            .offset(0L)
            .visibility(V1ListParams.Visibility.PRIVATE)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V1ListParams.builder()
                .limit(100L)
                .offset(0L)
                .visibility(V1ListParams.Visibility.PRIVATE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "100")
                    .put("offset", "0")
                    .put("visibility", "private")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V1ListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
