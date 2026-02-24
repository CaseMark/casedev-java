// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.compute.v1.secrets

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretListParamsTest {

    @Test
    fun create() {
        SecretListParams.builder().env("env").build()
    }

    @Test
    fun queryParams() {
        val params = SecretListParams.builder().env("env").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("env", "env").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SecretListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
