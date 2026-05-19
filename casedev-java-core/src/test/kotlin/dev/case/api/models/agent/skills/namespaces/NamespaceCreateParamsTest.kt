// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.agent.skills.namespaces

import dev.case.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NamespaceCreateParamsTest {

    @Test
    fun create() {
        NamespaceCreateParams.builder()
            .namespaceId("namespaceId")
            .description("description")
            .label("label")
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun body() {
        val params =
            NamespaceCreateParams.builder()
                .namespaceId("namespaceId")
                .description("description")
                .label("label")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body.namespaceId()).isEqualTo("namespaceId")
        assertThat(body.description()).contains("description")
        assertThat(body.label()).contains("label")
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = NamespaceCreateParams.builder().namespaceId("namespaceId").build()

        val body = params._body()

        assertThat(body.namespaceId()).isEqualTo("namespaceId")
    }
}
