// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.v1.chat

import dev.case.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatStreamParamsTest {

    @Test
    fun create() {
        ChatStreamParams.builder().id("id").lastEventId(0L).build()
    }

    @Test
    fun pathParams() {
        val params = ChatStreamParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = ChatStreamParams.builder().id("id").lastEventId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("lastEventId", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ChatStreamParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
