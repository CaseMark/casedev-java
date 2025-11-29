// File generated from our OpenAPI spec by Stainless.

package dev.casedev.client

import dev.casedev.core.ClientOptions
import dev.casedev.core.getPackageVersion
import dev.casedev.services.blocking.ActionService
import dev.casedev.services.blocking.ActionServiceImpl
import dev.casedev.services.blocking.ComputeService
import dev.casedev.services.blocking.ComputeServiceImpl
import dev.casedev.services.blocking.ConvertService
import dev.casedev.services.blocking.ConvertServiceImpl
import dev.casedev.services.blocking.FormatService
import dev.casedev.services.blocking.FormatServiceImpl
import dev.casedev.services.blocking.LlmService
import dev.casedev.services.blocking.LlmServiceImpl
import dev.casedev.services.blocking.OcrService
import dev.casedev.services.blocking.OcrServiceImpl
import dev.casedev.services.blocking.SearchService
import dev.casedev.services.blocking.SearchServiceImpl
import dev.casedev.services.blocking.VaultService
import dev.casedev.services.blocking.VaultServiceImpl
import dev.casedev.services.blocking.VoiceService
import dev.casedev.services.blocking.VoiceServiceImpl
import dev.casedev.services.blocking.WebhookService
import dev.casedev.services.blocking.WebhookServiceImpl
import dev.casedev.services.blocking.WorkflowService
import dev.casedev.services.blocking.WorkflowServiceImpl
import java.util.function.Consumer

class CasedevClientImpl(private val clientOptions: ClientOptions) : CasedevClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: CasedevClientAsync by lazy { CasedevClientAsyncImpl(clientOptions) }

    private val withRawResponse: CasedevClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val actions: ActionService by lazy { ActionServiceImpl(clientOptionsWithUserAgent) }

    private val compute: ComputeService by lazy { ComputeServiceImpl(clientOptionsWithUserAgent) }

    private val convert: ConvertService by lazy { ConvertServiceImpl(clientOptionsWithUserAgent) }

    private val format: FormatService by lazy { FormatServiceImpl(clientOptionsWithUserAgent) }

    private val llm: LlmService by lazy { LlmServiceImpl(clientOptionsWithUserAgent) }

    private val ocr: OcrService by lazy { OcrServiceImpl(clientOptionsWithUserAgent) }

    private val search: SearchService by lazy { SearchServiceImpl(clientOptionsWithUserAgent) }

    private val vault: VaultService by lazy { VaultServiceImpl(clientOptionsWithUserAgent) }

    private val voice: VoiceService by lazy { VoiceServiceImpl(clientOptionsWithUserAgent) }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptionsWithUserAgent) }

    private val workflows: WorkflowService by lazy {
        WorkflowServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): CasedevClientAsync = async

    override fun withRawResponse(): CasedevClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CasedevClient =
        CasedevClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun actions(): ActionService = actions

    override fun compute(): ComputeService = compute

    override fun convert(): ConvertService = convert

    override fun format(): FormatService = format

    override fun llm(): LlmService = llm

    override fun ocr(): OcrService = ocr

    override fun search(): SearchService = search

    override fun vault(): VaultService = vault

    override fun voice(): VoiceService = voice

    override fun webhooks(): WebhookService = webhooks

    override fun workflows(): WorkflowService = workflows

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CasedevClient.WithRawResponse {

        private val actions: ActionService.WithRawResponse by lazy {
            ActionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val compute: ComputeService.WithRawResponse by lazy {
            ComputeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val convert: ConvertService.WithRawResponse by lazy {
            ConvertServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val format: FormatService.WithRawResponse by lazy {
            FormatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val llm: LlmService.WithRawResponse by lazy {
            LlmServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ocr: OcrService.WithRawResponse by lazy {
            OcrServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val search: SearchService.WithRawResponse by lazy {
            SearchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val vault: VaultService.WithRawResponse by lazy {
            VaultServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val voice: VoiceService.WithRawResponse by lazy {
            VoiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val webhooks: WebhookService.WithRawResponse by lazy {
            WebhookServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val workflows: WorkflowService.WithRawResponse by lazy {
            WorkflowServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CasedevClient.WithRawResponse =
            CasedevClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun actions(): ActionService.WithRawResponse = actions

        override fun compute(): ComputeService.WithRawResponse = compute

        override fun convert(): ConvertService.WithRawResponse = convert

        override fun format(): FormatService.WithRawResponse = format

        override fun llm(): LlmService.WithRawResponse = llm

        override fun ocr(): OcrService.WithRawResponse = ocr

        override fun search(): SearchService.WithRawResponse = search

        override fun vault(): VaultService.WithRawResponse = vault

        override fun voice(): VoiceService.WithRawResponse = voice

        override fun webhooks(): WebhookService.WithRawResponse = webhooks

        override fun workflows(): WorkflowService.WithRawResponse = workflows
    }
}
