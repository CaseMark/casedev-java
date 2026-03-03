// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.skills

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SkillReadParamsTest {

    @Test
    fun create() {
        SkillReadParams.builder().slug("slug").build()
    }

    @Test
    fun pathParams() {
        val params = SkillReadParams.builder().slug("slug").build()

        assertThat(params._pathParam(0)).isEqualTo("slug")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
