// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.convert.v1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ProcessParamsTest {

    @Test
    fun create() {
        V1ProcessParams.builder()
            .inputUrl("https://example.com")
            .callbackUrl("https://example.com")
            .build()
    }

    @Test
    fun body() {
        val params =
            V1ProcessParams.builder()
                .inputUrl("https://example.com")
                .callbackUrl("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.inputUrl()).isEqualTo("https://example.com")
        assertThat(body.callbackUrl()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1ProcessParams.builder().inputUrl("https://example.com").build()

        val body = params._body()

        assertThat(body.inputUrl()).isEqualTo("https://example.com")
    }
}
