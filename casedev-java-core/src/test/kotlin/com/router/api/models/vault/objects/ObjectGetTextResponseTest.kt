// File generated from our OpenAPI spec by Stainless.

package com.router.api.models.vault.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.router.api.core.jsonMapper
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
                        .length(0L)
                        .objectId("object_id")
                        .vaultId("vault_id")
                        .ingestionCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .text("text")
                .build()

        assertThat(objectGetTextResponse.metadata())
            .isEqualTo(
                ObjectGetTextResponse.Metadata.builder()
                    .chunkCount(0L)
                    .filename("filename")
                    .length(0L)
                    .objectId("object_id")
                    .vaultId("vault_id")
                    .ingestionCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(objectGetTextResponse.text()).isEqualTo("text")
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
                        .length(0L)
                        .objectId("object_id")
                        .vaultId("vault_id")
                        .ingestionCompletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
