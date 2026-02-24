// File generated from our OpenAPI spec by Stainless.

package dev.case.models.voice.transcription

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.core.JsonValue
import dev.case.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionRetrieveResponseTest {

    @Test
    fun create() {
        val transcriptionRetrieveResponse =
            TranscriptionRetrieveResponse.builder()
                .id("id")
                .status(TranscriptionRetrieveResponse.Status.QUEUED)
                .audioDuration(0.0)
                .confidence(0.0)
                .error("error")
                .resultObjectId("result_object_id")
                .sourceObjectId("source_object_id")
                .text("text")
                .vaultId("vault_id")
                .wordCount(0L)
                .addWord(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(transcriptionRetrieveResponse.id()).isEqualTo("id")
        assertThat(transcriptionRetrieveResponse.status())
            .isEqualTo(TranscriptionRetrieveResponse.Status.QUEUED)
        assertThat(transcriptionRetrieveResponse.audioDuration()).contains(0.0)
        assertThat(transcriptionRetrieveResponse.confidence()).contains(0.0)
        assertThat(transcriptionRetrieveResponse.error()).contains("error")
        assertThat(transcriptionRetrieveResponse.resultObjectId()).contains("result_object_id")
        assertThat(transcriptionRetrieveResponse.sourceObjectId()).contains("source_object_id")
        assertThat(transcriptionRetrieveResponse.text()).contains("text")
        assertThat(transcriptionRetrieveResponse.vaultId()).contains("vault_id")
        assertThat(transcriptionRetrieveResponse.wordCount()).contains(0L)
        assertThat(transcriptionRetrieveResponse.words().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionRetrieveResponse =
            TranscriptionRetrieveResponse.builder()
                .id("id")
                .status(TranscriptionRetrieveResponse.Status.QUEUED)
                .audioDuration(0.0)
                .confidence(0.0)
                .error("error")
                .resultObjectId("result_object_id")
                .sourceObjectId("source_object_id")
                .text("text")
                .vaultId("vault_id")
                .wordCount(0L)
                .addWord(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedTranscriptionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionRetrieveResponse),
                jacksonTypeRef<TranscriptionRetrieveResponse>(),
            )

        assertThat(roundtrippedTranscriptionRetrieveResponse)
            .isEqualTo(transcriptionRetrieveResponse)
    }
}
