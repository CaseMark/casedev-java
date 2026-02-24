// File generated from our OpenAPI spec by Stainless.

package dev.case.models.voice.v1.speak

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpeakCreateParamsTest {

    @Test
    fun create() {
        SpeakCreateParams.builder()
            .text("text")
            .applyTextNormalization(true)
            .enableLogging(true)
            .languageCode("en")
            .modelId(SpeakCreateParams.ModelId.ELEVEN_MULTILINGUAL_V2)
            .nextText("next_text")
            .optimizeStreamingLatency(0L)
            .outputFormat(SpeakCreateParams.OutputFormat.MP3_44100_128)
            .previousText("previous_text")
            .seed(0L)
            .voiceId("voice_id")
            .voiceSettings(
                SpeakCreateParams.VoiceSettings.builder()
                    .similarityBoost(0.0)
                    .stability(0.0)
                    .style(0.0)
                    .useSpeakerBoost(true)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SpeakCreateParams.builder()
                .text("text")
                .applyTextNormalization(true)
                .enableLogging(true)
                .languageCode("en")
                .modelId(SpeakCreateParams.ModelId.ELEVEN_MULTILINGUAL_V2)
                .nextText("next_text")
                .optimizeStreamingLatency(0L)
                .outputFormat(SpeakCreateParams.OutputFormat.MP3_44100_128)
                .previousText("previous_text")
                .seed(0L)
                .voiceId("voice_id")
                .voiceSettings(
                    SpeakCreateParams.VoiceSettings.builder()
                        .similarityBoost(0.0)
                        .stability(0.0)
                        .style(0.0)
                        .useSpeakerBoost(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.text()).isEqualTo("text")
        assertThat(body.applyTextNormalization()).contains(true)
        assertThat(body.enableLogging()).contains(true)
        assertThat(body.languageCode()).contains("en")
        assertThat(body.modelId()).contains(SpeakCreateParams.ModelId.ELEVEN_MULTILINGUAL_V2)
        assertThat(body.nextText()).contains("next_text")
        assertThat(body.optimizeStreamingLatency()).contains(0L)
        assertThat(body.outputFormat()).contains(SpeakCreateParams.OutputFormat.MP3_44100_128)
        assertThat(body.previousText()).contains("previous_text")
        assertThat(body.seed()).contains(0L)
        assertThat(body.voiceId()).contains("voice_id")
        assertThat(body.voiceSettings())
            .contains(
                SpeakCreateParams.VoiceSettings.builder()
                    .similarityBoost(0.0)
                    .stability(0.0)
                    .style(0.0)
                    .useSpeakerBoost(true)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SpeakCreateParams.builder().text("text").build()

        val body = params._body()

        assertThat(body.text()).isEqualTo("text")
    }
}
