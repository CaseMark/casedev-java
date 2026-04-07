// File generated from our OpenAPI spec by Stainless.

package dev.case.api.client

import dev.case.api.core.ClientOptions
import dev.case.api.services.blocking.AgentService
import dev.case.api.services.blocking.ApplicationService
import dev.case.api.services.blocking.ComputeService
import dev.case.api.services.blocking.DatabaseService
import dev.case.api.services.blocking.FormatService
import dev.case.api.services.blocking.LegalService
import dev.case.api.services.blocking.LlmService
import dev.case.api.services.blocking.MailService
import dev.case.api.services.blocking.MatterService
import dev.case.api.services.blocking.MemoryService
import dev.case.api.services.blocking.OcrService
import dev.case.api.services.blocking.PrivilegeService
import dev.case.api.services.blocking.SearchService
import dev.case.api.services.blocking.SkillService
import dev.case.api.services.blocking.SuperdocService
import dev.case.api.services.blocking.SystemService
import dev.case.api.services.blocking.TranslateService
import dev.case.api.services.blocking.UsageService
import dev.case.api.services.blocking.VaultService
import dev.case.api.services.blocking.VoiceService
import java.util.function.Consumer

/**
 * A client for interacting with the Casedev REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface CasedevClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): CasedevClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CasedevClient

    fun agent(): AgentService

    /** Public system metadata and discovery endpoints */
    fun system(): SystemService

    fun applications(): ApplicationService

    fun compute(): ComputeService

    fun database(): DatabaseService

    fun format(): FormatService

    fun legal(): LegalService

    fun matters(): MatterService

    /** Access 40+ language models through a unified API */
    fun llm(): LlmService

    fun memory(): MemoryService

    fun ocr(): OcrService

    fun privilege(): PrivilegeService

    fun mail(): MailService

    /** Search and read legal AI skills for agents */
    fun skills(): SkillService

    fun search(): SearchService

    fun superdoc(): SuperdocService

    fun translate(): TranslateService

    fun usage(): UsageService

    /** Secure document storage with semantic search and GraphRAG */
    fun vault(): VaultService

    fun voice(): VoiceService

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()

    /** A view of [CasedevClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CasedevClient.WithRawResponse

        fun agent(): AgentService.WithRawResponse

        /** Public system metadata and discovery endpoints */
        fun system(): SystemService.WithRawResponse

        fun applications(): ApplicationService.WithRawResponse

        fun compute(): ComputeService.WithRawResponse

        fun database(): DatabaseService.WithRawResponse

        fun format(): FormatService.WithRawResponse

        fun legal(): LegalService.WithRawResponse

        fun matters(): MatterService.WithRawResponse

        /** Access 40+ language models through a unified API */
        fun llm(): LlmService.WithRawResponse

        fun memory(): MemoryService.WithRawResponse

        fun ocr(): OcrService.WithRawResponse

        fun privilege(): PrivilegeService.WithRawResponse

        fun mail(): MailService.WithRawResponse

        /** Search and read legal AI skills for agents */
        fun skills(): SkillService.WithRawResponse

        fun search(): SearchService.WithRawResponse

        fun superdoc(): SuperdocService.WithRawResponse

        fun translate(): TranslateService.WithRawResponse

        fun usage(): UsageService.WithRawResponse

        /** Secure document storage with semantic search and GraphRAG */
        fun vault(): VaultService.WithRawResponse

        fun voice(): VoiceService.WithRawResponse
    }
}
