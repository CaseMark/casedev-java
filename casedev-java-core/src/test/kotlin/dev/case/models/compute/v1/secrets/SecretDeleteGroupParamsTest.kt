// File generated from our OpenAPI spec by Stainless.

package dev.case.models.compute.v1.secrets

import dev.case.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretDeleteGroupParamsTest {

    @Test
    fun create() {
        SecretDeleteGroupParams.builder().group("group").env("env").key("key").build()
    }

    @Test
    fun pathParams() {
        val params = SecretDeleteGroupParams.builder().group("group").build()

        assertThat(params._pathParam(0)).isEqualTo("group")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = SecretDeleteGroupParams.builder().group("group").env("env").key("key").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("env", "env").put("key", "key").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SecretDeleteGroupParams.builder().group("group").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
