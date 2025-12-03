// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import dev.casedev.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateParamsTest {

    @Test
    fun create() {
        V1CreateParams.builder()
            .name("Document Processor")
            .description("description")
            .addEdge(JsonValue.from(mapOf<String, Any>()))
            .addNode(JsonValue.from(mapOf<String, Any>()))
            .triggerConfig(JsonValue.from(mapOf<String, Any>()))
            .triggerType(V1CreateParams.TriggerType.MANUAL)
            .visibility(V1CreateParams.Visibility.PRIVATE)
            .build()
    }

    @Test
    fun body() {
        val params =
            V1CreateParams.builder()
                .name("Document Processor")
                .description("description")
                .addEdge(JsonValue.from(mapOf<String, Any>()))
                .addNode(JsonValue.from(mapOf<String, Any>()))
                .triggerConfig(JsonValue.from(mapOf<String, Any>()))
                .triggerType(V1CreateParams.TriggerType.MANUAL)
                .visibility(V1CreateParams.Visibility.PRIVATE)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Document Processor")
        assertThat(body.description()).contains("description")
        assertThat(body.edges().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.nodes().getOrNull()).containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._triggerConfig()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.triggerType()).contains(V1CreateParams.TriggerType.MANUAL)
        assertThat(body.visibility()).contains(V1CreateParams.Visibility.PRIVATE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = V1CreateParams.builder().name("Document Processor").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Document Processor")
    }
}
