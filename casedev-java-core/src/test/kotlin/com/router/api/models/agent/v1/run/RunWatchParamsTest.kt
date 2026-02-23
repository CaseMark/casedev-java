// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.agent.v1.run

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunWatchParamsTest {

    @Test
    fun create() {
        RunWatchParams.builder().id("id").callbackUrl("https://example.com").build()
    }

    @Test
    fun pathParams() {
        val params = RunWatchParams.builder().id("id").callbackUrl("https://example.com").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = RunWatchParams.builder().id("id").callbackUrl("https://example.com").build()

        val body = params._body()

        assertThat(body.callbackUrl()).isEqualTo("https://example.com")
    }
}
