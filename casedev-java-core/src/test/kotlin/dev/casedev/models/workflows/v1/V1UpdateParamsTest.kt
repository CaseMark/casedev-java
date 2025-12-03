// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import dev.casedev.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1UpdateParamsTest {

    @Test
    fun create() {
        V1UpdateParams.builder()
            .id("id")
            .description("description")
            .addEdge(JsonValue.from(mapOf<String, Any>()))
            .name("name")
            .addNode(JsonValue.from(mapOf<String, Any>()))
            .triggerConfig(JsonValue.from(mapOf<String, Any>()))
            .triggerType(V1UpdateParams.TriggerType.MANUAL)
            .visibility(V1UpdateParams.Visibility.PRIVATE)
            .build()
    }

    @Test
    fun pathParams() {
        val params = V1UpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            V1UpdateParams.builder()
                .id("id")
                .description("description")
                .addEdge(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .addNode(JsonValue.from(mapOf<String, Any>()))
                .triggerConfig(JsonValue.from(mapOf<String, Any>()))
                .triggerType(V1UpdateParams.TriggerType.MANUAL)
                .visibility(V1UpdateParams.Visibility.PRIVATE)
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.edges().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.name()).contains("name")
        assertThat(body.nodes().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._triggerConfig()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.triggerType()).contains(V1UpdateParams.TriggerType.MANUAL)
        assertThat(body.visibility()).contains(V1UpdateParams.Visibility.PRIVATE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1UpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
