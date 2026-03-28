// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.matters.v1

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListParamsTest {

    @Test
    fun create() {
        V1ListParams.builder()
            .matterType("matter_type")
            .practiceArea("practice_area")
            .query("query")
            .status("status")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V1ListParams.builder()
                .matterType("matter_type")
                .practiceArea("practice_area")
                .query("query")
                .status("status")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("matter_type", "matter_type")
                    .put("practice_area", "practice_area")
                    .put("query", "query")
                    .put("status", "status")
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
