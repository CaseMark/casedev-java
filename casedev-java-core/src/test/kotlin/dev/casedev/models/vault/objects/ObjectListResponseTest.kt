// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.JsonValue
import dev.casedev.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectListResponseTest {

    @Test
    fun create() {
        val objectListResponse =
            ObjectListResponse.builder()
                .count(0.0)
                .addObject(
                    ObjectListResponse.Object.builder()
                        .id("id")
                        .chunkCount(0.0)
                        .contentType("contentType")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filename("filename")
                        .ingestionCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .ingestionStatus("ingestionStatus")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .pageCount(0.0)
                        .path("path")
                        .sizeBytes(0.0)
                        .addTag("string")
                        .textLength(0.0)
                        .vectorCount(0.0)
                        .build()
                )
                .vaultId("vaultId")
                .build()

        assertThat(objectListResponse.count()).contains(0.0)
        assertThat(objectListResponse.objects().getOrNull())
            .containsExactly(
                ObjectListResponse.Object.builder()
                    .id("id")
                    .chunkCount(0.0)
                    .contentType("contentType")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filename("filename")
                    .ingestionCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ingestionStatus("ingestionStatus")
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .pageCount(0.0)
                    .path("path")
                    .sizeBytes(0.0)
                    .addTag("string")
                    .textLength(0.0)
                    .vectorCount(0.0)
                    .build()
            )
        assertThat(objectListResponse.vaultId()).contains("vaultId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectListResponse =
            ObjectListResponse.builder()
                .count(0.0)
                .addObject(
                    ObjectListResponse.Object.builder()
                        .id("id")
                        .chunkCount(0.0)
                        .contentType("contentType")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filename("filename")
                        .ingestionCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .ingestionStatus("ingestionStatus")
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .pageCount(0.0)
                        .path("path")
                        .sizeBytes(0.0)
                        .addTag("string")
                        .textLength(0.0)
                        .vectorCount(0.0)
                        .build()
                )
                .vaultId("vaultId")
                .build()

        val roundtrippedObjectListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectListResponse),
                jacksonTypeRef<ObjectListResponse>(),
            )

        assertThat(roundtrippedObjectListResponse).isEqualTo(objectListResponse)
    }
}
