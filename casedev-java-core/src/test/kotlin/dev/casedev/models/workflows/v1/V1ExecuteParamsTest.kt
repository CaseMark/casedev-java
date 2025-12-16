// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import dev.casedev.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1ExecuteParamsTest {

    @Test
    fun create() {
        V1ExecuteParams.builder()
            .id("id")
            .callbackHeaders(JsonValue.from(mapOf<String, Any>()))
            .callbackUrl("callbackUrl")
            .input(JsonValue.from(mapOf<String, Any>()))
            .timeout("timeout")
            .wait(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = V1ExecuteParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            V1ExecuteParams.builder()
                .id("id")
                .callbackHeaders(JsonValue.from(mapOf<String, Any>()))
                .callbackUrl("callbackUrl")
                .input(JsonValue.from(mapOf<String, Any>()))
                .timeout("timeout")
                .wait(true)
                .build()

        val body = params._body()

        assertThat(body._callbackHeaders()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.callbackUrl()).contains("callbackUrl")
        assertThat(body._input()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.timeout()).contains("timeout")
        assertThat(body.wait()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1ExecuteParams.builder().id("id").build()

        val body = params._body()
    }
}
