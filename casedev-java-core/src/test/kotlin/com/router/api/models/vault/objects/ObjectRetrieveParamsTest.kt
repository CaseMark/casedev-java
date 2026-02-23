// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.vault.objects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectRetrieveParamsTest {

    @Test
    fun create() {
        ObjectRetrieveParams.builder().id("id").objectId("objectId").build()
    }

    @Test
    fun pathParams() {
        val params = ObjectRetrieveParams.builder().id("id").objectId("objectId").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
