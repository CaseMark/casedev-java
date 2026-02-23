// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.format.v1.templates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateRetrieveParamsTest {

    @Test
    fun create() {
        TemplateRetrieveParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = TemplateRetrieveParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
