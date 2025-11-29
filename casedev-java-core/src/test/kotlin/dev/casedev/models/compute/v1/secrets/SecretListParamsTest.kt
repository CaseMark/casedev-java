// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.compute.v1.secrets

import dev.casedev.core.http.QueryParams
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
