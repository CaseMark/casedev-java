// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.workflows.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1RetrieveResponseTest {

    @Test
    fun create() {
        val v1RetrieveResponse =
            V1RetrieveResponse.builder()
                .id("id")
                .createdAt("createdAt")
                .deployedAt("deployedAt")
                .deploymentUrl("deploymentUrl")
                .description("description")
                .addEdge(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .addNode(JsonValue.from(mapOf<String, Any>()))
                .triggerConfig(JsonValue.from(mapOf<String, Any>()))
                .triggerType("triggerType")
                .updatedAt("updatedAt")
                .visibility("visibility")
                .build()

        assertThat(v1RetrieveResponse.id()).contains("id")
        assertThat(v1RetrieveResponse.createdAt()).contains("createdAt")
        assertThat(v1RetrieveResponse.deployedAt()).contains("deployedAt")
        assertThat(v1RetrieveResponse.deploymentUrl()).contains("deploymentUrl")
        assertThat(v1RetrieveResponse.description()).contains("description")
        assertThat(v1RetrieveResponse.edges().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(v1RetrieveResponse.name()).contains("name")
        assertThat(v1RetrieveResponse.nodes().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(v1RetrieveResponse._triggerConfig())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(v1RetrieveResponse.triggerType()).contains("triggerType")
        assertThat(v1RetrieveResponse.updatedAt()).contains("updatedAt")
        assertThat(v1RetrieveResponse.visibility()).contains("visibility")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1RetrieveResponse =
            V1RetrieveResponse.builder()
                .id("id")
                .createdAt("createdAt")
                .deployedAt("deployedAt")
                .deploymentUrl("deploymentUrl")
                .description("description")
                .addEdge(JsonValue.from(mapOf<String, Any>()))
                .name("name")
                .addNode(JsonValue.from(mapOf<String, Any>()))
                .triggerConfig(JsonValue.from(mapOf<String, Any>()))
                .triggerType("triggerType")
                .updatedAt("updatedAt")
                .visibility("visibility")
                .build()

        val roundtrippedV1RetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1RetrieveResponse),
                jacksonTypeRef<V1RetrieveResponse>(),
            )

        assertThat(roundtrippedV1RetrieveResponse).isEqualTo(v1RetrieveResponse)
    }
}
