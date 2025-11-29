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

        transcriptionService.create(
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
        )
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

        val transcription = transcriptionService.retrieve("5551902f-fc65-4a61-81b2-e002d4e464e5")

        transcription.validate()
    }
}
