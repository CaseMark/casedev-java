// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking

import com.router.api.core.ClientOptions
import com.router.api.services.blocking.voice.StreamingService
import com.router.api.services.blocking.voice.StreamingServiceImpl
import com.router.api.services.blocking.voice.TranscriptionService
import com.router.api.services.blocking.voice.TranscriptionServiceImpl
import com.router.api.services.blocking.voice.V1Service
import com.router.api.services.blocking.voice.V1ServiceImpl
import java.util.function.Consumer

class VoiceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VoiceService {

    private val withRawResponse: VoiceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val streaming: StreamingService by lazy { StreamingServiceImpl(clientOptions) }

    private val transcription: TranscriptionService by lazy {
        TranscriptionServiceImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): VoiceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VoiceService =
        VoiceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun streaming(): StreamingService = streaming

    override fun transcription(): TranscriptionService = transcription

    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VoiceService.WithRawResponse {

        private val streaming: StreamingService.WithRawResponse by lazy {
            StreamingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transcription: TranscriptionService.WithRawResponse by lazy {
            TranscriptionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VoiceService.WithRawResponse =
            VoiceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun streaming(): StreamingService.WithRawResponse = streaming

        override fun transcription(): TranscriptionService.WithRawResponse = transcription

        override fun v1(): V1Service.WithRawResponse = v1
    }
}
