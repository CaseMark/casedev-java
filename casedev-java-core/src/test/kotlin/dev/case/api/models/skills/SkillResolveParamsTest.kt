// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SkillResolveParamsTest {

    @Test
    fun create() {
        SkillResolveParams.builder().q("q").limit(1L).build()
    }

    @Test
    fun queryParams() {
        val params = SkillResolveParams.builder().q("q").limit(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("q", "q").put("limit", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SkillResolveParams.builder().q("q").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("q", "q").build())
    }
}
