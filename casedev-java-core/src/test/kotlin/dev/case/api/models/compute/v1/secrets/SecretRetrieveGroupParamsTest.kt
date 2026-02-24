// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.compute.v1.secrets

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretRetrieveGroupParamsTest {

    @Test
    fun create() {
        SecretRetrieveGroupParams.builder().group("group").env("env").build()
    }

    @Test
    fun pathParams() {
        val params = SecretRetrieveGroupParams.builder().group("group").build()

        assertThat(params._pathParam(0)).isEqualTo("group")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = SecretRetrieveGroupParams.builder().group("group").env("env").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("env", "env").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SecretRetrieveGroupParams.builder().group("group").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
