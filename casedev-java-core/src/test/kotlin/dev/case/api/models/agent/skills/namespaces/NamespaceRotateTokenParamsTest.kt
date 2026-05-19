// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.skills.namespaces

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamespaceRotateTokenParamsTest {

    @Test
    fun create() {
        NamespaceRotateTokenParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = NamespaceRotateTokenParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
