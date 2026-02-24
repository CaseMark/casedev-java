// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.JsonValue
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectRetrieveResponseTest {

    @Test
    fun create() {
        val objectRetrieveResponse =
            ObjectRetrieveResponse.builder()
                .id("id")
                .contentType("contentType")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .downloadUrl("downloadUrl")
                .expiresIn(0L)
                .filename("filename")
                .ingestionStatus("ingestionStatus")
                .vaultId("vaultId")
                .chunkCount(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .pageCount(0L)
                .path("path")
                .sizeBytes(0L)
                .textLength(0L)
                .vectorCount(0L)
                .build()

        assertThat(objectRetrieveResponse.id()).isEqualTo("id")
        assertThat(objectRetrieveResponse.contentType()).isEqualTo("contentType")
        assertThat(objectRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(objectRetrieveResponse.downloadUrl()).isEqualTo("downloadUrl")
        assertThat(objectRetrieveResponse.expiresIn()).isEqualTo(0L)
        assertThat(objectRetrieveResponse.filename()).isEqualTo("filename")
        assertThat(objectRetrieveResponse.ingestionStatus()).isEqualTo("ingestionStatus")
        assertThat(objectRetrieveResponse.vaultId()).isEqualTo("vaultId")
        assertThat(objectRetrieveResponse.chunkCount()).contains(0L)
        assertThat(objectRetrieveResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(objectRetrieveResponse.pageCount()).contains(0L)
        assertThat(objectRetrieveResponse.path()).contains("path")
        assertThat(objectRetrieveResponse.sizeBytes()).contains(0L)
        assertThat(objectRetrieveResponse.textLength()).contains(0L)
        assertThat(objectRetrieveResponse.vectorCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectRetrieveResponse =
            ObjectRetrieveResponse.builder()
                .id("id")
                .contentType("contentType")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .downloadUrl("downloadUrl")
                .expiresIn(0L)
                .filename("filename")
                .ingestionStatus("ingestionStatus")
                .vaultId("vaultId")
                .chunkCount(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .pageCount(0L)
                .path("path")
                .sizeBytes(0L)
                .textLength(0L)
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
