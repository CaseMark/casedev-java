// File generated from our OpenAPI spec by Stainless.

package dev.casedev.client

import dev.casedev.core.ClientOptions
import dev.casedev.core.getPackageVersion
import dev.casedev.services.blocking.ApplicationService
import dev.casedev.services.blocking.ApplicationServiceImpl
import dev.casedev.services.blocking.ComputeService
import dev.casedev.services.blocking.ComputeServiceImpl
import dev.casedev.services.blocking.DatabaseService
import dev.casedev.services.blocking.DatabaseServiceImpl
import dev.casedev.services.blocking.FormatService
import dev.casedev.services.blocking.FormatServiceImpl
import dev.casedev.services.blocking.LegalService
import dev.casedev.services.blocking.LegalServiceImpl
import dev.casedev.services.blocking.LlmService
import dev.casedev.services.blocking.LlmServiceImpl
import dev.casedev.services.blocking.MemoryService
import dev.casedev.services.blocking.MemoryServiceImpl
import dev.casedev.services.blocking.OcrService
import dev.casedev.services.blocking.OcrServiceImpl
import dev.casedev.services.blocking.PrivilegeService
import dev.casedev.services.blocking.PrivilegeServiceImpl
import dev.casedev.services.blocking.SearchService
import dev.casedev.services.blocking.SearchServiceImpl
import dev.casedev.services.blocking.SuperdocService
import dev.casedev.services.blocking.SuperdocServiceImpl
import dev.casedev.services.blocking.SystemService
import dev.casedev.services.blocking.SystemServiceImpl
import dev.casedev.services.blocking.TranslateService
import dev.casedev.services.blocking.TranslateServiceImpl
import dev.casedev.services.blocking.VaultService
import dev.casedev.services.blocking.VaultServiceImpl
import dev.casedev.services.blocking.VoiceService
import dev.casedev.services.blocking.VoiceServiceImpl
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

    private val system: SystemService by lazy { SystemServiceImpl(clientOptionsWithUserAgent) }

    private val applications: ApplicationService by lazy {
        ApplicationServiceImpl(clientOptionsWithUserAgent)
    }

    private val compute: ComputeService by lazy { ComputeServiceImpl(clientOptionsWithUserAgent) }

    private val database: DatabaseService by lazy {
        DatabaseServiceImpl(clientOptionsWithUserAgent)
    }

    private val format: FormatService by lazy { FormatServiceImpl(clientOptionsWithUserAgent) }

    private val legal: LegalService by lazy { LegalServiceImpl(clientOptionsWithUserAgent) }

    private val llm: LlmService by lazy { LlmServiceImpl(clientOptionsWithUserAgent) }

    private val memory: MemoryService by lazy { MemoryServiceImpl(clientOptionsWithUserAgent) }

    private val ocr: OcrService by lazy { OcrServiceImpl(clientOptionsWithUserAgent) }

    private val privilege: PrivilegeService by lazy {
        PrivilegeServiceImpl(clientOptionsWithUserAgent)
    }

    private val search: SearchService by lazy { SearchServiceImpl(clientOptionsWithUserAgent) }

    private val superdoc: SuperdocService by lazy {
        SuperdocServiceImpl(clientOptionsWithUserAgent)
    }

    private val translate: TranslateService by lazy {
        TranslateServiceImpl(clientOptionsWithUserAgent)
    }

    private val vault: VaultService by lazy { VaultServiceImpl(clientOptionsWithUserAgent) }

    private val voice: VoiceService by lazy { VoiceServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): CasedevClientAsync = async

    override fun withRawResponse(): CasedevClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CasedevClient =
        CasedevClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun system(): SystemService = system

    override fun applications(): ApplicationService = applications

    override fun compute(): ComputeService = compute

    override fun database(): DatabaseService = database

    override fun format(): FormatService = format

    override fun legal(): LegalService = legal

    override fun llm(): LlmService = llm

    override fun memory(): MemoryService = memory

    override fun ocr(): OcrService = ocr

    override fun privilege(): PrivilegeService = privilege

    override fun search(): SearchService = search

    override fun superdoc(): SuperdocService = superdoc

    override fun translate(): TranslateService = translate

    override fun vault(): VaultService = vault

    override fun voice(): VoiceService = voice

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CasedevClient.WithRawResponse {

        private val system: SystemService.WithRawResponse by lazy {
            SystemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val applications: ApplicationService.WithRawResponse by lazy {
            ApplicationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val compute: ComputeService.WithRawResponse by lazy {
            ComputeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val database: DatabaseService.WithRawResponse by lazy {
            DatabaseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val format: FormatService.WithRawResponse by lazy {
            FormatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val legal: LegalService.WithRawResponse by lazy {
            LegalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val llm: LlmService.WithRawResponse by lazy {
            LlmServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val memory: MemoryService.WithRawResponse by lazy {
            MemoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ocr: OcrService.WithRawResponse by lazy {
            OcrServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val privilege: PrivilegeService.WithRawResponse by lazy {
            PrivilegeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val search: SearchService.WithRawResponse by lazy {
            SearchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val superdoc: SuperdocService.WithRawResponse by lazy {
            SuperdocServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val translate: TranslateService.WithRawResponse by lazy {
            TranslateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val vault: VaultService.WithRawResponse by lazy {
            VaultServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val voice: VoiceService.WithRawResponse by lazy {
            VoiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CasedevClient.WithRawResponse =
            CasedevClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun system(): SystemService.WithRawResponse = system

        override fun applications(): ApplicationService.WithRawResponse = applications

        override fun compute(): ComputeService.WithRawResponse = compute

        override fun database(): DatabaseService.WithRawResponse = database

        override fun format(): FormatService.WithRawResponse = format

        override fun legal(): LegalService.WithRawResponse = legal

        override fun llm(): LlmService.WithRawResponse = llm

        override fun memory(): MemoryService.WithRawResponse = memory

        override fun ocr(): OcrService.WithRawResponse = ocr

        override fun privilege(): PrivilegeService.WithRawResponse = privilege

        override fun search(): SearchService.WithRawResponse = search

        override fun superdoc(): SuperdocService.WithRawResponse = superdoc

        override fun translate(): TranslateService.WithRawResponse = translate

        override fun vault(): VaultService.WithRawResponse = vault

        override fun voice(): VoiceService.WithRawResponse = voice
    }
}
