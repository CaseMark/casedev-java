// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1.runs

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunListParamsTest {

    @Test
    fun create() {
        RunListParams.builder().env("env").function("function").limit(1L).build()
    }

    @Test
    fun queryParams() {
        val params = RunListParams.builder().env("env").function("function").limit(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("env", "env")
                    .put("function", "function")
                    .put("limit", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RunListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
