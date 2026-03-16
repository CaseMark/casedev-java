// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills.custom

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomListParamsTest {

    @Test
    fun create() {
        CustomListParams.builder().cursor("cursor").limit(1L).tag("tag").build()
    }

    @Test
    fun queryParams() {
        val params = CustomListParams.builder().cursor("cursor").limit(1L).tag("tag").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("tag", "tag")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
