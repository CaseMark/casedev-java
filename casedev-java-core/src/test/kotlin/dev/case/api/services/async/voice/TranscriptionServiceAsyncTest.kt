// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.voice

import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClientAsync
import dev.case.api.models.voice.transcription.TranscriptionCreateParams
import dev.case.api.models.voice.transcription.TranscriptionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TranscriptionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transcriptionServiceAsync = client.voice().transcription()

        val transcriptionFuture =
            transcriptionServiceAsync.create(
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

        val transcription = transcriptionFuture.get()
        transcription.validate()
    }

    @Test
    fun retrieve() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transcriptionServiceAsync = client.voice().transcription()

        val transcriptionFuture =
            transcriptionServiceAsync.retrieve(
                TranscriptionRetrieveParams.builder()
                    .id("tr_abc123def456")
                    .includeText(TranscriptionRetrieveParams.IncludeText.TRUE)
                    .build()
            )

        val transcription = transcriptionFuture.get()
        transcription.validate()
    }

    @Test
    fun delete() {
        val client =
            CasedevOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transcriptionServiceAsync = client.voice().transcription()

        val future = transcriptionServiceAsync.delete("id")

        val response = future.get()
    }
}
