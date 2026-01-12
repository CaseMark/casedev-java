// File generated from our OpenAPI spec by Stainless.

package dev.casedev.client

import dev.casedev.core.ClientOptions
import dev.casedev.core.getPackageVersion
import dev.casedev.services.async.ComputeServiceAsync
import dev.casedev.services.async.ComputeServiceAsyncImpl
import dev.casedev.services.async.FormatServiceAsync
import dev.casedev.services.async.FormatServiceAsyncImpl
import dev.casedev.services.async.LlmServiceAsync
import dev.casedev.services.async.LlmServiceAsyncImpl
import dev.casedev.services.async.OcrServiceAsync
import dev.casedev.services.async.OcrServiceAsyncImpl
import dev.casedev.services.async.SearchServiceAsync
import dev.casedev.services.async.SearchServiceAsyncImpl
import dev.casedev.services.async.VaultServiceAsync
import dev.casedev.services.async.VaultServiceAsyncImpl
import dev.casedev.services.async.VoiceServiceAsync
import dev.casedev.services.async.VoiceServiceAsyncImpl
import dev.casedev.services.async.WebhookServiceAsync
import dev.casedev.services.async.WebhookServiceAsyncImpl
import java.util.function.Consumer

class CasedevClientAsyncImpl(private val clientOptions: ClientOptions) : CasedevClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: CasedevClient by lazy { CasedevClientImpl(clientOptions) }

    private val withRawResponse: CasedevClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val compute: ComputeServiceAsync by lazy {
        ComputeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val format: FormatServiceAsync by lazy {
        FormatServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val llm: LlmServiceAsync by lazy { LlmServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val ocr: OcrServiceAsync by lazy { OcrServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val search: SearchServiceAsync by lazy {
        SearchServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val vault: VaultServiceAsync by lazy {
        VaultServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val voice: VoiceServiceAsync by lazy {
        VoiceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookServiceAsync by lazy {
        WebhookServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): CasedevClient = sync

    override fun withRawResponse(): CasedevClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CasedevClientAsync =
        CasedevClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun compute(): ComputeServiceAsync = compute

    override fun format(): FormatServiceAsync = format

    override fun llm(): LlmServiceAsync = llm

    override fun ocr(): OcrServiceAsync = ocr

    override fun search(): SearchServiceAsync = search

    override fun vault(): VaultServiceAsync = vault

    override fun voice(): VoiceServiceAsync = voice

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CasedevClientAsync.WithRawResponse {

        private val compute: ComputeServiceAsync.WithRawResponse by lazy {
            ComputeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val format: FormatServiceAsync.WithRawResponse by lazy {
            FormatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val llm: LlmServiceAsync.WithRawResponse by lazy {
            LlmServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ocr: OcrServiceAsync.WithRawResponse by lazy {
            OcrServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val search: SearchServiceAsync.WithRawResponse by lazy {
            SearchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val vault: VaultServiceAsync.WithRawResponse by lazy {
            VaultServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val voice: VoiceServiceAsync.WithRawResponse by lazy {
            VoiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookServiceAsync.WithRawResponse by lazy {
            WebhookServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CasedevClientAsync.WithRawResponse =
            CasedevClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun compute(): ComputeServiceAsync.WithRawResponse = compute

        override fun format(): FormatServiceAsync.WithRawResponse = format

        override fun llm(): LlmServiceAsync.WithRawResponse = llm

        override fun ocr(): OcrServiceAsync.WithRawResponse = ocr

        override fun search(): SearchServiceAsync.WithRawResponse = search

        override fun vault(): VaultServiceAsync.WithRawResponse = vault

        override fun voice(): VoiceServiceAsync.WithRawResponse = voice

        override fun webhooks(): WebhookServiceAsync.WithRawResponse = webhooks
    }
}
