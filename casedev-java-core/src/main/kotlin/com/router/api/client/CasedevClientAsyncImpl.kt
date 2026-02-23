// File generated from our OpenAPI spec by Stainless.

package com.router.api.client

import com.router.api.core.ClientOptions
import com.router.api.core.getPackageVersion
import com.router.api.services.async.AgentServiceAsync
import com.router.api.services.async.AgentServiceAsyncImpl
import com.router.api.services.async.ApplicationServiceAsync
import com.router.api.services.async.ApplicationServiceAsyncImpl
import com.router.api.services.async.ComputeServiceAsync
import com.router.api.services.async.ComputeServiceAsyncImpl
import com.router.api.services.async.DatabaseServiceAsync
import com.router.api.services.async.DatabaseServiceAsyncImpl
import com.router.api.services.async.FormatServiceAsync
import com.router.api.services.async.FormatServiceAsyncImpl
import com.router.api.services.async.LegalServiceAsync
import com.router.api.services.async.LegalServiceAsyncImpl
import com.router.api.services.async.LlmServiceAsync
import com.router.api.services.async.LlmServiceAsyncImpl
import com.router.api.services.async.MemoryServiceAsync
import com.router.api.services.async.MemoryServiceAsyncImpl
import com.router.api.services.async.OcrServiceAsync
import com.router.api.services.async.OcrServiceAsyncImpl
import com.router.api.services.async.PrivilegeServiceAsync
import com.router.api.services.async.PrivilegeServiceAsyncImpl
import com.router.api.services.async.SearchServiceAsync
import com.router.api.services.async.SearchServiceAsyncImpl
import com.router.api.services.async.SuperdocServiceAsync
import com.router.api.services.async.SuperdocServiceAsyncImpl
import com.router.api.services.async.SystemServiceAsync
import com.router.api.services.async.SystemServiceAsyncImpl
import com.router.api.services.async.TranslateServiceAsync
import com.router.api.services.async.TranslateServiceAsyncImpl
import com.router.api.services.async.VaultServiceAsync
import com.router.api.services.async.VaultServiceAsyncImpl
import com.router.api.services.async.VoiceServiceAsync
import com.router.api.services.async.VoiceServiceAsyncImpl
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

    private val agent: AgentServiceAsync by lazy {
        AgentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val system: SystemServiceAsync by lazy {
        SystemServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val applications: ApplicationServiceAsync by lazy {
        ApplicationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val compute: ComputeServiceAsync by lazy {
        ComputeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val database: DatabaseServiceAsync by lazy {
        DatabaseServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val format: FormatServiceAsync by lazy {
        FormatServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val legal: LegalServiceAsync by lazy {
        LegalServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val llm: LlmServiceAsync by lazy { LlmServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val memory: MemoryServiceAsync by lazy {
        MemoryServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ocr: OcrServiceAsync by lazy { OcrServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val privilege: PrivilegeServiceAsync by lazy {
        PrivilegeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val search: SearchServiceAsync by lazy {
        SearchServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val superdoc: SuperdocServiceAsync by lazy {
        SuperdocServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val translate: TranslateServiceAsync by lazy {
        TranslateServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val vault: VaultServiceAsync by lazy {
        VaultServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val voice: VoiceServiceAsync by lazy {
        VoiceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): CasedevClient = sync

    override fun withRawResponse(): CasedevClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CasedevClientAsync =
        CasedevClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun agent(): AgentServiceAsync = agent

    override fun system(): SystemServiceAsync = system

    override fun applications(): ApplicationServiceAsync = applications

    override fun compute(): ComputeServiceAsync = compute

    override fun database(): DatabaseServiceAsync = database

    override fun format(): FormatServiceAsync = format

    override fun legal(): LegalServiceAsync = legal

    override fun llm(): LlmServiceAsync = llm

    override fun memory(): MemoryServiceAsync = memory

    override fun ocr(): OcrServiceAsync = ocr

    override fun privilege(): PrivilegeServiceAsync = privilege

    override fun search(): SearchServiceAsync = search

    override fun superdoc(): SuperdocServiceAsync = superdoc

    override fun translate(): TranslateServiceAsync = translate

    override fun vault(): VaultServiceAsync = vault

    override fun voice(): VoiceServiceAsync = voice

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CasedevClientAsync.WithRawResponse {

        private val agent: AgentServiceAsync.WithRawResponse by lazy {
            AgentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val system: SystemServiceAsync.WithRawResponse by lazy {
            SystemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val applications: ApplicationServiceAsync.WithRawResponse by lazy {
            ApplicationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val compute: ComputeServiceAsync.WithRawResponse by lazy {
            ComputeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val database: DatabaseServiceAsync.WithRawResponse by lazy {
            DatabaseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val format: FormatServiceAsync.WithRawResponse by lazy {
            FormatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val legal: LegalServiceAsync.WithRawResponse by lazy {
            LegalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val llm: LlmServiceAsync.WithRawResponse by lazy {
            LlmServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val memory: MemoryServiceAsync.WithRawResponse by lazy {
            MemoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ocr: OcrServiceAsync.WithRawResponse by lazy {
            OcrServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val privilege: PrivilegeServiceAsync.WithRawResponse by lazy {
            PrivilegeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val search: SearchServiceAsync.WithRawResponse by lazy {
            SearchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val superdoc: SuperdocServiceAsync.WithRawResponse by lazy {
            SuperdocServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val translate: TranslateServiceAsync.WithRawResponse by lazy {
            TranslateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val vault: VaultServiceAsync.WithRawResponse by lazy {
            VaultServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val voice: VoiceServiceAsync.WithRawResponse by lazy {
            VoiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CasedevClientAsync.WithRawResponse =
            CasedevClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun agent(): AgentServiceAsync.WithRawResponse = agent

        override fun system(): SystemServiceAsync.WithRawResponse = system

        override fun applications(): ApplicationServiceAsync.WithRawResponse = applications

        override fun compute(): ComputeServiceAsync.WithRawResponse = compute

        override fun database(): DatabaseServiceAsync.WithRawResponse = database

        override fun format(): FormatServiceAsync.WithRawResponse = format

        override fun legal(): LegalServiceAsync.WithRawResponse = legal

        override fun llm(): LlmServiceAsync.WithRawResponse = llm

        override fun memory(): MemoryServiceAsync.WithRawResponse = memory

        override fun ocr(): OcrServiceAsync.WithRawResponse = ocr

        override fun privilege(): PrivilegeServiceAsync.WithRawResponse = privilege

        override fun search(): SearchServiceAsync.WithRawResponse = search

        override fun superdoc(): SuperdocServiceAsync.WithRawResponse = superdoc

        override fun translate(): TranslateServiceAsync.WithRawResponse = translate

        override fun vault(): VaultServiceAsync.WithRawResponse = vault

        override fun voice(): VoiceServiceAsync.WithRawResponse = voice
    }
}
