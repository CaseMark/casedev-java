// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.voice.BoostListServiceAsync
import dev.case.api.services.async.voice.BoostListServiceAsyncImpl
import dev.case.api.services.async.voice.StreamingServiceAsync
import dev.case.api.services.async.voice.StreamingServiceAsyncImpl
import dev.case.api.services.async.voice.TranscriptionServiceAsync
import dev.case.api.services.async.voice.TranscriptionServiceAsyncImpl
import dev.case.api.services.async.voice.V1ServiceAsync
import dev.case.api.services.async.voice.V1ServiceAsyncImpl
import java.util.function.Consumer

class VoiceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VoiceServiceAsync {

    private val withRawResponse: VoiceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val streaming: StreamingServiceAsync by lazy {
        StreamingServiceAsyncImpl(clientOptions)
    }

    private val boostList: BoostListServiceAsync by lazy {
        BoostListServiceAsyncImpl(clientOptions)
    }

    private val transcription: TranscriptionServiceAsync by lazy {
        TranscriptionServiceAsyncImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): VoiceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceServiceAsync =
        VoiceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Audio transcription and text-to-speech */
    override fun streaming(): StreamingServiceAsync = streaming

    /** Audio transcription and text-to-speech */
    override fun boostList(): BoostListServiceAsync = boostList

    /** Audio transcription and text-to-speech */
    override fun transcription(): TranscriptionServiceAsync = transcription

    /** Audio transcription and text-to-speech */
    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VoiceServiceAsync.WithRawResponse {

        private val streaming: StreamingServiceAsync.WithRawResponse by lazy {
            StreamingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val boostList: BoostListServiceAsync.WithRawResponse by lazy {
            BoostListServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        /** Audio transcription and text-to-speech */
        override fun streaming(): StreamingServiceAsync.WithRawResponse = streaming

        /** Audio transcription and text-to-speech */
        override fun boostList(): BoostListServiceAsync.WithRawResponse = boostList

        /** Audio transcription and text-to-speech */
        override fun transcription(): TranscriptionServiceAsync.WithRawResponse = transcription

        /** Audio transcription and text-to-speech */
        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
