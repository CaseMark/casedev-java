// File generated from our OpenAPI spec by Stainless.

package dev.casedev.models.voice.transcription

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionCreateParamsTest {

    @Test
    fun create() {
        TranscriptionCreateParams.builder()
            .audioUrl("audio_url")
            .autoHighlights(true)
            .boostParam(TranscriptionCreateParams.BoostParam.LOW)
            .contentSafetyLabels(true)
            .format(TranscriptionCreateParams.Format.JSON)
            .formatText(true)
            .languageCode("language_code")
            .languageDetection(true)
            .objectId("object_id")
            .punctuate(true)
            .speakerLabels(true)
            .speakersExpected(0L)
            .vaultId("vault_id")
            .addWordBoost("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            TranscriptionCreateParams.builder()
                .audioUrl("audio_url")
                .autoHighlights(true)
                .boostParam(TranscriptionCreateParams.BoostParam.LOW)
                .contentSafetyLabels(true)
                .format(TranscriptionCreateParams.Format.JSON)
                .formatText(true)
                .languageCode("language_code")
                .languageDetection(true)
                .objectId("object_id")
                .punctuate(true)
                .speakerLabels(true)
                .speakersExpected(0L)
                .vaultId("vault_id")
                .addWordBoost("string")
                .build()

        val body = params._body()

        assertThat(body.audioUrl()).contains("audio_url")
        assertThat(body.autoHighlights()).contains(true)
        assertThat(body.boostParam()).contains(TranscriptionCreateParams.BoostParam.LOW)
        assertThat(body.contentSafetyLabels()).contains(true)
        assertThat(body.format()).contains(TranscriptionCreateParams.Format.JSON)
        assertThat(body.formatText()).contains(true)
        assertThat(body.languageCode()).contains("language_code")
        assertThat(body.languageDetection()).contains(true)
        assertThat(body.objectId()).contains("object_id")
        assertThat(body.punctuate()).contains(true)
        assertThat(body.speakerLabels()).contains(true)
        assertThat(body.speakersExpected()).contains(0L)
        assertThat(body.vaultId()).contains("vault_id")
        assertThat(body.wordBoost().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TranscriptionCreateParams.builder().build()

        val body = params._body()
    }
}
