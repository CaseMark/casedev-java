// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListParamsTest {

    @Test
    fun create() {
        V1ListParams.builder()
            .category("category")
            .limit(1L)
            .offset(0L)
            .published(true)
            .subCategory("sub_category")
            .type("type")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V1ListParams.builder()
                .category("category")
                .limit(1L)
                .offset(0L)
                .published(true)
                .subCategory("sub_category")
                .type("type")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("category", "category")
                    .put("limit", "1")
                    .put("offset", "0")
                    .put("published", "true")
                    .put("sub_category", "sub_category")
                    .put("type", "type")
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
