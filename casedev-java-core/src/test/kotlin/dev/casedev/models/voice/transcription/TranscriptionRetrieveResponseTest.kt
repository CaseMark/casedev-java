// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.voice.transcription

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.casedev.core.jsonMapper
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
                .text("text")
                .addWord(
                    TranscriptionRetrieveResponse.Word.builder()
                        .confidence(0.0)
                        .end(0.0)
                        .start(0.0)
                        .text("text")
                        .build()
                )
                .build()

        assertThat(transcriptionRetrieveResponse.id()).isEqualTo("id")
        assertThat(transcriptionRetrieveResponse.status())
            .isEqualTo(TranscriptionRetrieveResponse.Status.QUEUED)
        assertThat(transcriptionRetrieveResponse.audioDuration()).contains(0.0)
        assertThat(transcriptionRetrieveResponse.confidence()).contains(0.0)
        assertThat(transcriptionRetrieveResponse.error()).contains("error")
        assertThat(transcriptionRetrieveResponse.text()).contains("text")
        assertThat(transcriptionRetrieveResponse.words().getOrNull())
            .containsExactly(
                TranscriptionRetrieveResponse.Word.builder()
                    .confidence(0.0)
                    .end(0.0)
                    .start(0.0)
                    .text("text")
                    .build()
            )
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
                .text("text")
                .addWord(
                    TranscriptionRetrieveResponse.Word.builder()
                        .confidence(0.0)
                        .end(0.0)
                        .start(0.0)
                        .text("text")
                        .build()
                )
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
