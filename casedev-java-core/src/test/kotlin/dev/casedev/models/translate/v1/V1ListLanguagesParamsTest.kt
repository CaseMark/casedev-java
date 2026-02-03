// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.translate.v1

import dev.casedev.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ListLanguagesParamsTest {

    @Test
    fun create() {
        V1ListLanguagesParams.builder()
            .model(V1ListLanguagesParams.Model.NMT)
            .target("target")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            V1ListLanguagesParams.builder()
                .model(V1ListLanguagesParams.Model.NMT)
                .target("target")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("model", "nmt").put("target", "target").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = V1ListLanguagesParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
