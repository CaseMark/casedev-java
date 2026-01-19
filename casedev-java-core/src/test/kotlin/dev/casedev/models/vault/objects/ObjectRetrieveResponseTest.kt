// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectRetrieveResponseTest {

    @Test
    fun create() {
        val objectRetrieveResponse =
            ObjectRetrieveResponse.builder()
                .id("id")
                .chunkCount(0L)
                .contentType("contentType")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .downloadUrl("downloadUrl")
                .expiresIn(0L)
                .filename("filename")
                .ingestionStatus("ingestionStatus")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .pageCount(0L)
                .path("path")
                .sizeBytes(0L)
                .textLength(0L)
                .vaultId("vaultId")
                .vectorCount(0L)
                .build()

        assertThat(objectRetrieveResponse.id()).contains("id")
        assertThat(objectRetrieveResponse.chunkCount()).contains(0L)
        assertThat(objectRetrieveResponse.contentType()).contains("contentType")
        assertThat(objectRetrieveResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(objectRetrieveResponse.downloadUrl()).contains("downloadUrl")
        assertThat(objectRetrieveResponse.expiresIn()).contains(0L)
        assertThat(objectRetrieveResponse.filename()).contains("filename")
        assertThat(objectRetrieveResponse.ingestionStatus()).contains("ingestionStatus")
        assertThat(objectRetrieveResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(objectRetrieveResponse.pageCount()).contains(0L)
        assertThat(objectRetrieveResponse.path()).contains("path")
        assertThat(objectRetrieveResponse.sizeBytes()).contains(0L)
        assertThat(objectRetrieveResponse.textLength()).contains(0L)
        assertThat(objectRetrieveResponse.vaultId()).contains("vaultId")
        assertThat(objectRetrieveResponse.vectorCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectRetrieveResponse =
            ObjectRetrieveResponse.builder()
                .id("id")
                .chunkCount(0L)
                .contentType("contentType")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .downloadUrl("downloadUrl")
                .expiresIn(0L)
                .filename("filename")
                .ingestionStatus("ingestionStatus")
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .pageCount(0L)
                .path("path")
                .sizeBytes(0L)
                .textLength(0L)
                .vaultId("vaultId")
                .vectorCount(0L)
                .build()

        val roundtrippedObjectRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectRetrieveResponse),
                jacksonTypeRef<ObjectRetrieveResponse>(),
            )

        assertThat(roundtrippedObjectRetrieveResponse).isEqualTo(objectRetrieveResponse)
    }
}
