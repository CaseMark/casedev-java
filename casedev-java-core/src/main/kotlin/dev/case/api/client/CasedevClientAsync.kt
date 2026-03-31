// File generated from our OpenAPI spec by Stainless.

package dev.case.api.client

import dev.case.api.core.ClientOptions
import dev.case.api.services.async.AgentServiceAsync
import dev.case.api.services.async.ApplicationServiceAsync
import dev.case.api.services.async.ComputeServiceAsync
import dev.case.api.services.async.DatabaseServiceAsync
import dev.case.api.services.async.FormatServiceAsync
import dev.case.api.services.async.LegalServiceAsync
import dev.case.api.services.async.LlmServiceAsync
import dev.case.api.services.async.MailServiceAsync
import dev.case.api.services.async.MatterServiceAsync
import dev.case.api.services.async.MemoryServiceAsync
import dev.case.api.services.async.OcrServiceAsync
import dev.case.api.services.async.PrivilegeServiceAsync
import dev.case.api.services.async.SearchServiceAsync
import dev.case.api.services.async.SkillServiceAsync
import dev.case.api.services.async.SuperdocServiceAsync
import dev.case.api.services.async.SystemServiceAsync
import dev.case.api.services.async.TranslateServiceAsync
import dev.case.api.services.async.VaultServiceAsync
import dev.case.api.services.async.VoiceServiceAsync
import java.util.function.Consumer

/**
 * A client for interacting with the Casedev REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
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
interface CasedevClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): CasedevClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CasedevClientAsync

    fun agent(): AgentServiceAsync

    /** Public system metadata and discovery endpoints */
    fun system(): SystemServiceAsync

    fun applications(): ApplicationServiceAsync

    fun compute(): ComputeServiceAsync

    fun database(): DatabaseServiceAsync

    fun format(): FormatServiceAsync

    fun legal(): LegalServiceAsync

    fun matters(): MatterServiceAsync

    /** Access 40+ language models through a unified API */
    fun llm(): LlmServiceAsync

    fun memory(): MemoryServiceAsync

    fun ocr(): OcrServiceAsync

    fun privilege(): PrivilegeServiceAsync

    fun mail(): MailServiceAsync

    /** Search and read legal AI skills for agents */
    fun skills(): SkillServiceAsync

    fun search(): SearchServiceAsync

    fun superdoc(): SuperdocServiceAsync

    fun translate(): TranslateServiceAsync

    /** Secure document storage with semantic search and GraphRAG */
    fun vault(): VaultServiceAsync

    fun voice(): VoiceServiceAsync

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

    /**
     * A view of [CasedevClientAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CasedevClientAsync.WithRawResponse

        fun agent(): AgentServiceAsync.WithRawResponse

        /** Public system metadata and discovery endpoints */
        fun system(): SystemServiceAsync.WithRawResponse

        fun applications(): ApplicationServiceAsync.WithRawResponse

        fun compute(): ComputeServiceAsync.WithRawResponse

        fun database(): DatabaseServiceAsync.WithRawResponse

        fun format(): FormatServiceAsync.WithRawResponse

        fun legal(): LegalServiceAsync.WithRawResponse

        fun matters(): MatterServiceAsync.WithRawResponse

        /** Access 40+ language models through a unified API */
        fun llm(): LlmServiceAsync.WithRawResponse

        fun memory(): MemoryServiceAsync.WithRawResponse

        fun ocr(): OcrServiceAsync.WithRawResponse

        fun privilege(): PrivilegeServiceAsync.WithRawResponse

        fun mail(): MailServiceAsync.WithRawResponse

        /** Search and read legal AI skills for agents */
        fun skills(): SkillServiceAsync.WithRawResponse

        fun search(): SearchServiceAsync.WithRawResponse

        fun superdoc(): SuperdocServiceAsync.WithRawResponse

        fun translate(): TranslateServiceAsync.WithRawResponse

        /** Secure document storage with semantic search and GraphRAG */
        fun vault(): VaultServiceAsync.WithRawResponse

        fun voice(): VoiceServiceAsync.WithRawResponse
    }
}
