// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.webhooks.v1.endpoints

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EndpointRotateSecretParamsTest {

    @Test
    fun create() {
        EndpointRotateSecretParams.builder().id("id").previousSecretExpiresInSec(0L).build()
    }

    @Test
    fun pathParams() {
        val params = EndpointRotateSecretParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EndpointRotateSecretParams.builder().id("id").previousSecretExpiresInSec(0L).build()

        val body = params._body()

        assertThat(body.previousSecretExpiresInSec()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EndpointRotateSecretParams.builder().id("id").build()

        val body = params._body()
    }
}
