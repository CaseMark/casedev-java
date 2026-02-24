// File generated from our OpenAPI spec by Stainless.

package dev.case.models.vault.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.JsonValue
import dev.case.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectUpdateResponseTest {

    @Test
    fun create() {
        val objectUpdateResponse =
            ObjectUpdateResponse.builder()
                .id("id")
                .contentType("contentType")
                .filename("filename")
                .ingestionStatus("ingestionStatus")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .path("path")
                .sizeBytes(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vaultId("vaultId")
                .build()

        assertThat(objectUpdateResponse.id()).contains("id")
        assertThat(objectUpdateResponse.contentType()).contains("contentType")
        assertThat(objectUpdateResponse.filename()).contains("filename")
        assertThat(objectUpdateResponse.ingestionStatus()).contains("ingestionStatus")
        assertThat(objectUpdateResponse._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(objectUpdateResponse.path()).contains("path")
        assertThat(objectUpdateResponse.sizeBytes()).contains(0L)
        assertThat(objectUpdateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(objectUpdateResponse.vaultId()).contains("vaultId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectUpdateResponse =
            ObjectUpdateResponse.builder()
                .id("id")
                .contentType("contentType")
                .filename("filename")
                .ingestionStatus("ingestionStatus")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .path("path")
                .sizeBytes(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vaultId("vaultId")
                .build()

        val roundtrippedObjectUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectUpdateResponse),
                jacksonTypeRef<ObjectUpdateResponse>(),
            )

        assertThat(roundtrippedObjectUpdateResponse).isEqualTo(objectUpdateResponse)
    }
}
