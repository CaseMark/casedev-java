// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.compute.v1.secrets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SecretCreateParamsTest {

    @Test
    fun create() {
        SecretCreateParams.builder().name("name").description("description").env("env").build()
    }

    @Test
    fun body() {
        val params =
            SecretCreateParams.builder().name("name").description("description").env("env").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.description()).contains("description")
        assertThat(body.env()).contains("env")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SecretCreateParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
