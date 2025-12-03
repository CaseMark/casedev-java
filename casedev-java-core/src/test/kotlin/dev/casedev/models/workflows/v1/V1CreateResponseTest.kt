// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateResponseTest {

    @Test
    fun create() {
        val v1CreateResponse =
            V1CreateResponse.builder()
                .id("id")
                .createdAt("createdAt")
                .description("description")
                .addEdge(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .addNode(JsonValue.from(mapOf<String, Any>()))
                .triggerType("triggerType")
                .updatedAt("updatedAt")
                .visibility("visibility")
                .build()

        assertThat(v1CreateResponse.id()).contains("id")
        assertThat(v1CreateResponse.createdAt()).contains("createdAt")
        assertThat(v1CreateResponse.description()).contains("description")
        assertThat(v1CreateResponse.edges().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(v1CreateResponse.name()).contains("name")
        assertThat(v1CreateResponse.nodes().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(v1CreateResponse.triggerType()).contains("triggerType")
        assertThat(v1CreateResponse.updatedAt()).contains("updatedAt")
        assertThat(v1CreateResponse.visibility()).contains("visibility")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1CreateResponse =
            V1CreateResponse.builder()
                .id("id")
                .createdAt("createdAt")
                .description("description")
                .addEdge(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .addNode(JsonValue.from(mapOf<String, Any>()))
                .triggerType("triggerType")
                .updatedAt("updatedAt")
                .visibility("visibility")
                .build()

        val roundtrippedV1CreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1CreateResponse),
                jacksonTypeRef<V1CreateResponse>(),
            )

        assertThat(roundtrippedV1CreateResponse).isEqualTo(v1CreateResponse)
    }
}
