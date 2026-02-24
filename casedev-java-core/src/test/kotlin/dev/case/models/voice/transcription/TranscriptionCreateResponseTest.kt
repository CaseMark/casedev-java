// File generated from our OpenAPI spec by Stainless.

package dev.case.models.voice.transcription

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionCreateResponseTest {

    @Test
    fun create() {
        val transcriptionCreateResponse =
            TranscriptionCreateResponse.builder()
                .id("id")
                .sourceObjectId("source_object_id")
                .status(TranscriptionCreateResponse.Status.QUEUED)
                .vaultId("vault_id")
                .build()

        assertThat(transcriptionCreateResponse.id()).contains("id")
        assertThat(transcriptionCreateResponse.sourceObjectId()).contains("source_object_id")
        assertThat(transcriptionCreateResponse.status())
            .contains(TranscriptionCreateResponse.Status.QUEUED)
        assertThat(transcriptionCreateResponse.vaultId()).contains("vault_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionCreateResponse =
            TranscriptionCreateResponse.builder()
                .id("id")
                .sourceObjectId("source_object_id")
                .status(TranscriptionCreateResponse.Status.QUEUED)
                .vaultId("vault_id")
                .build()

        val roundtrippedTranscriptionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionCreateResponse),
                jacksonTypeRef<TranscriptionCreateResponse>(),
            )

        assertThat(roundtrippedTranscriptionCreateResponse).isEqualTo(transcriptionCreateResponse)
    }
}
