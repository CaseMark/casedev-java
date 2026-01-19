// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.vault.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectGetTextResponseTest {

    @Test
    fun create() {
        val objectGetTextResponse =
            ObjectGetTextResponse.builder()
                .metadata(
                    ObjectGetTextResponse.Metadata.builder()
                        .chunkCount(0L)
                        .filename("filename")
                        .ingestionCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .length(0L)
                        .objectId("object_id")
                        .vaultId("vault_id")
                        .build()
                )
                .text("text")
                .build()

        assertThat(objectGetTextResponse.metadata())
            .contains(
                ObjectGetTextResponse.Metadata.builder()
                    .chunkCount(0L)
                    .filename("filename")
                    .ingestionCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .length(0L)
                    .objectId("object_id")
                    .vaultId("vault_id")
                    .build()
            )
        assertThat(objectGetTextResponse.text()).contains("text")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectGetTextResponse =
            ObjectGetTextResponse.builder()
                .metadata(
                    ObjectGetTextResponse.Metadata.builder()
                        .chunkCount(0L)
                        .filename("filename")
                        .ingestionCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .length(0L)
                        .objectId("object_id")
                        .vaultId("vault_id")
                        .build()
                )
                .text("text")
                .build()

        val roundtrippedObjectGetTextResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectGetTextResponse),
                jacksonTypeRef<ObjectGetTextResponse>(),
            )

        assertThat(roundtrippedObjectGetTextResponse).isEqualTo(objectGetTextResponse)
    }
}
