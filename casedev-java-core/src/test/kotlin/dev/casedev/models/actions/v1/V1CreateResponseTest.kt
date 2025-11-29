// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.actions.v1

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V1CreateResponseTest {

    @Test
    fun create() {
        val v1CreateResponse =
            V1CreateResponse.builder()
                .id("id")
                .createdAt("createdAt")
                .createdBy("createdBy")
                .definition(JsonValue.from(mapOf<String, Any>()))
                .description("description")
                .isActive(true)
                .name("name")
                .organizationId("organizationId")
                .updatedAt("updatedAt")
                .version(0.0)
                .webhookEndpointId("webhookEndpointId")
                .build()

        assertThat(v1CreateResponse.id()).contains("id")
        assertThat(v1CreateResponse.createdAt()).contains("createdAt")
        assertThat(v1CreateResponse.createdBy()).contains("createdBy")
        assertThat(v1CreateResponse._definition()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(v1CreateResponse.description()).contains("description")
        assertThat(v1CreateResponse.isActive()).contains(true)
        assertThat(v1CreateResponse.name()).contains("name")
        assertThat(v1CreateResponse.organizationId()).contains("organizationId")
        assertThat(v1CreateResponse.updatedAt()).contains("updatedAt")
        assertThat(v1CreateResponse.version()).contains(0.0)
        assertThat(v1CreateResponse.webhookEndpointId()).contains("webhookEndpointId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val v1CreateResponse =
            V1CreateResponse.builder()
                .id("id")
                .createdAt("createdAt")
                .createdBy("createdBy")
                .definition(JsonValue.from(mapOf<String, Any>()))
                .description("description")
                .isActive(true)
                .name("name")
                .organizationId("organizationId")
                .updatedAt("updatedAt")
                .version(0.0)
                .webhookEndpointId("webhookEndpointId")
                .build()

        val roundtrippedV1CreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(v1CreateResponse),
                jacksonTypeRef<V1CreateResponse>(),
            )

        assertThat(roundtrippedV1CreateResponse).isEqualTo(v1CreateResponse)
    }
}
