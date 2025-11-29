// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.objects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectListParamsTest {

    @Test
    fun create() {
        ObjectListParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = ObjectListParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
