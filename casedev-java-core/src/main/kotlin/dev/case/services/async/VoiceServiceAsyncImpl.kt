// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async

import dev.case.core.ClientOptions
import dev.case.services.async.voice.StreamingServiceAsync
import dev.case.services.async.voice.StreamingServiceAsyncImpl
import dev.case.services.async.voice.TranscriptionServiceAsync
import dev.case.services.async.voice.TranscriptionServiceAsyncImpl
import dev.case.services.async.voice.V1ServiceAsync
import dev.case.services.async.voice.V1ServiceAsyncImpl
import java.util.function.Consumer

class VoiceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VoiceServiceAsync {

    private val withRawResponse: VoiceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val streaming: StreamingServiceAsync by lazy {
        StreamingServiceAsyncImpl(clientOptions)
    }

    private val transcription: TranscriptionServiceAsync by lazy {
        TranscriptionServiceAsyncImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): VoiceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceServiceAsync =
        VoiceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun streaming(): StreamingServiceAsync = streaming

    override fun transcription(): TranscriptionServiceAsync = transcription

    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VoiceServiceAsync.WithRawResponse {

        private val streaming: StreamingServiceAsync.WithRawResponse by lazy {
            StreamingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transcription: TranscriptionServiceAsync.WithRawResponse by lazy {
            TranscriptionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoiceServiceAsync.WithRawResponse =
            VoiceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun streaming(): StreamingServiceAsync.WithRawResponse = streaming

        override fun transcription(): TranscriptionServiceAsync.WithRawResponse = transcription

        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
