// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.voice.transcription

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionCreateParamsTest {

    @Test
    fun create() {
        TranscriptionCreateParams.builder()
            .audioUrl("audio_url")
            .autoHighlights(true)
            .contentSafetyLabels(true)
            .formatText(true)
            .languageCode("language_code")
            .languageDetection(true)
            .punctuate(true)
            .speakerLabels(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            TranscriptionCreateParams.builder()
                .audioUrl("audio_url")
                .autoHighlights(true)
                .contentSafetyLabels(true)
                .formatText(true)
                .languageCode("language_code")
                .languageDetection(true)
                .punctuate(true)
                .speakerLabels(true)
                .build()

        val body = params._body()

        assertThat(body.audioUrl()).isEqualTo("audio_url")
        assertThat(body.autoHighlights()).contains(true)
        assertThat(body.contentSafetyLabels()).contains(true)
        assertThat(body.formatText()).contains(true)
        assertThat(body.languageCode()).contains("language_code")
        assertThat(body.languageDetection()).contains(true)
        assertThat(body.punctuate()).contains(true)
        assertThat(body.speakerLabels()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TranscriptionCreateParams.builder().audioUrl("audio_url").build()

        val body = params._body()

        assertThat(body.audioUrl()).isEqualTo("audio_url")
    }
}
