// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.vault

import com.router.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaultDeleteParamsTest {

    @Test
    fun create() {
        VaultDeleteParams.builder().id("id").async(true).build()
    }

    @Test
    fun pathParams() {
        val params = VaultDeleteParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = VaultDeleteParams.builder().id("id").async(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("async", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VaultDeleteParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
