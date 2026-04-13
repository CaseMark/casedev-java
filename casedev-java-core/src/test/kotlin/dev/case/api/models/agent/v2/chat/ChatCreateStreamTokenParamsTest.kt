// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v2.chat

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCreateStreamTokenParamsTest {

    @Test
    fun create() {
        ChatCreateStreamTokenParams.builder().id("id").build()
    }

    @Test
    fun pathParams() {
        val params = ChatCreateStreamTokenParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
