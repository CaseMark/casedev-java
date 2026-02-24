// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.voice

import dev.case.TestServerExtension
import dev.case.client.okhttp.CasedevOkHttpClient
import dev.case.models.voice.transcription.TranscriptionCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TranscriptionServiceTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transcriptionService = client.voice().transcription()

        val transcription =
            transcriptionService.create(
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
                    .addSpeechModel("string")
                    .vaultId("vault_id")
                    .addWordBoost("string")
                    .build()
            )

        transcription.validate()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transcriptionService = client.voice().transcription()

        val transcription = transcriptionService.retrieve("tr_abc123def456")

        transcription.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transcriptionService = client.voice().transcription()

        transcriptionService.delete("id")
    }
}
