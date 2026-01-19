// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.voice

import dev.casedev.TestServerExtension
import dev.casedev.client.okhttp.CasedevOkHttpClient
import dev.casedev.models.voice.transcription.TranscriptionCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TranscriptionServiceTest {

    @Disabled("Prism tests are disabled")
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
                    .vaultId("vault_id")
                    .addWordBoost("string")
                    .build()
            )

        transcription.validate()
    }

    @Disabled("Prism tests are disabled")
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
}
