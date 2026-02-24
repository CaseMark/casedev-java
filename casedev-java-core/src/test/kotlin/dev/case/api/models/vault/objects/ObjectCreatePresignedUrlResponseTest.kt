// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.vault.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.JsonValue
import dev.case.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectCreatePresignedUrlResponseTest {

    @Test
    fun create() {
        val objectCreatePresignedUrlResponse =
            ObjectCreatePresignedUrlResponse.builder()
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresIn(0L)
                .filename("filename")
                .instructions(JsonValue.from(mapOf<String, Any>()))
                .metadata(
                    ObjectCreatePresignedUrlResponse.Metadata.builder()
                        .bucket("bucket")
                        .contentType("contentType")
                        .region("region")
                        .sizeBytes(0L)
                        .build()
                )
                .objectId("objectId")
                .operation("operation")
                .presignedUrl("presignedUrl")
                .s3Key("s3Key")
                .vaultId("vaultId")
                .build()

        assertThat(objectCreatePresignedUrlResponse.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(objectCreatePresignedUrlResponse.expiresIn()).contains(0L)
        assertThat(objectCreatePresignedUrlResponse.filename()).contains("filename")
        assertThat(objectCreatePresignedUrlResponse._instructions())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(objectCreatePresignedUrlResponse.metadata())
            .contains(
                ObjectCreatePresignedUrlResponse.Metadata.builder()
                    .bucket("bucket")
                    .contentType("contentType")
                    .region("region")
                    .sizeBytes(0L)
                    .build()
            )
        assertThat(objectCreatePresignedUrlResponse.objectId()).contains("objectId")
        assertThat(objectCreatePresignedUrlResponse.operation()).contains("operation")
        assertThat(objectCreatePresignedUrlResponse.presignedUrl()).contains("presignedUrl")
        assertThat(objectCreatePresignedUrlResponse.s3Key()).contains("s3Key")
        assertThat(objectCreatePresignedUrlResponse.vaultId()).contains("vaultId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectCreatePresignedUrlResponse =
            ObjectCreatePresignedUrlResponse.builder()
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresIn(0L)
                .filename("filename")
                .instructions(JsonValue.from(mapOf<String, Any>()))
                .metadata(
                    ObjectCreatePresignedUrlResponse.Metadata.builder()
                        .bucket("bucket")
                        .contentType("contentType")
                        .region("region")
                        .sizeBytes(0L)
                        .build()
                )
                .objectId("objectId")
                .operation("operation")
                .presignedUrl("presignedUrl")
                .s3Key("s3Key")
                .vaultId("vaultId")
                .build()

        val roundtrippedObjectCreatePresignedUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectCreatePresignedUrlResponse),
                jacksonTypeRef<ObjectCreatePresignedUrlResponse>(),
            )

        assertThat(roundtrippedObjectCreatePresignedUrlResponse)
            .isEqualTo(objectCreatePresignedUrlResponse)
    }
}
