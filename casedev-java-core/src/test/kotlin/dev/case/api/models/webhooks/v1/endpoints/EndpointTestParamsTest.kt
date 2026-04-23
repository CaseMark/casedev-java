// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.webhooks.v1.endpoints

import dev.case.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EndpointTestParamsTest {

    @Test
    fun create() {
        EndpointTestParams.builder()
            .id("id")
            .eventType("eventType")
            .payload(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun pathParams() {
        val params = EndpointTestParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EndpointTestParams.builder()
                .id("id")
                .eventType("eventType")
                .payload(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body.eventType()).contains("eventType")
        assertThat(body._payload()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EndpointTestParams.builder().id("id").build()

        val body = params._body()
    }
}
