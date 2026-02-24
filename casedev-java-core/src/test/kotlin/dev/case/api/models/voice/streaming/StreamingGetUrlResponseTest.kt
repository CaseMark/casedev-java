// File generated from our OpenAPI spec by Stainless.

package dev.case.api.models.voice.streaming

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import dev.case.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StreamingGetUrlResponseTest {

    @Test
    fun create() {
        val streamingGetUrlResponse =
            StreamingGetUrlResponse.builder()
                .audioFormat(
                    StreamingGetUrlResponse.AudioFormat.builder()
                        .channels(0L)
                        .encoding("encoding")
                        .sampleRate(0L)
                        .build()
                )
                .connectUrl("connect_url")
                .pricing(
                    StreamingGetUrlResponse.Pricing.builder()
                        .currency("currency")
                        .perHour(0.0)
                        .perMinute(0.0)
                        .build()
                )
                .protocol("protocol")
                .url("url")
                .build()

        assertThat(streamingGetUrlResponse.audioFormat())
            .contains(
                StreamingGetUrlResponse.AudioFormat.builder()
                    .channels(0L)
                    .encoding("encoding")
                    .sampleRate(0L)
                    .build()
            )
        assertThat(streamingGetUrlResponse.connectUrl()).contains("connect_url")
        assertThat(streamingGetUrlResponse.pricing())
            .contains(
                StreamingGetUrlResponse.Pricing.builder()
                    .currency("currency")
                    .perHour(0.0)
                    .perMinute(0.0)
                    .build()
            )
        assertThat(streamingGetUrlResponse.protocol()).contains("protocol")
        assertThat(streamingGetUrlResponse.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val streamingGetUrlResponse =
            StreamingGetUrlResponse.builder()
                .audioFormat(
                    StreamingGetUrlResponse.AudioFormat.builder()
                        .channels(0L)
                        .encoding("encoding")
                        .sampleRate(0L)
                        .build()
                )
                .connectUrl("connect_url")
                .pricing(
                    StreamingGetUrlResponse.Pricing.builder()
                        .currency("currency")
                        .perHour(0.0)
                        .perMinute(0.0)
                        .build()
                )
                .protocol("protocol")
                .url("url")
                .build()

        val roundtrippedStreamingGetUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(streamingGetUrlResponse),
                jacksonTypeRef<StreamingGetUrlResponse>(),
            )

        assertThat(roundtrippedStreamingGetUrlResponse).isEqualTo(streamingGetUrlResponse)
    }
}
