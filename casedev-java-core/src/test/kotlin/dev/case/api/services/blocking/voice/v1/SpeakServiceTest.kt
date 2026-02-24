// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.voice.v1

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import dev.case.api.TestServerExtension
import dev.case.api.client.okhttp.CasedevOkHttpClient
import dev.case.api.models.voice.v1.speak.SpeakCreateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class SpeakServiceTest {

    @Test
    fun create(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            CasedevOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
        val speakService = client.voice().v1().speak()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val speak =
            speakService.create(
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
            )

        assertThat(speak.body()).hasContent("abc")
    }
}
