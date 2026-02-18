// File generated from our OpenAPI spec by Stainless.

package dev.casedev.client

import dev.casedev.core.ClientOptions
import dev.casedev.services.async.ApplicationServiceAsync
import dev.casedev.services.async.ComputeServiceAsync
import dev.casedev.services.async.DatabaseServiceAsync
import dev.casedev.services.async.FormatServiceAsync
import dev.casedev.services.async.LegalServiceAsync
import dev.casedev.services.async.LlmServiceAsync
import dev.casedev.services.async.MemoryServiceAsync
import dev.casedev.services.async.OcrServiceAsync
import dev.casedev.services.async.PrivilegeServiceAsync
import dev.casedev.services.async.SearchServiceAsync
import dev.casedev.services.async.SuperdocServiceAsync
import dev.casedev.services.async.SystemServiceAsync
import dev.casedev.services.async.TranslateServiceAsync
import dev.casedev.services.async.VaultServiceAsync
import dev.casedev.services.async.VoiceServiceAsync
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

    fun system(): SystemServiceAsync

    fun applications(): ApplicationServiceAsync

    fun compute(): ComputeServiceAsync

    fun database(): DatabaseServiceAsync

    fun format(): FormatServiceAsync

    fun legal(): LegalServiceAsync

    fun llm(): LlmServiceAsync

    fun memory(): MemoryServiceAsync

    fun ocr(): OcrServiceAsync

    fun privilege(): PrivilegeServiceAsync

    fun search(): SearchServiceAsync

    fun superdoc(): SuperdocServiceAsync

    fun translate(): TranslateServiceAsync

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

        fun system(): SystemServiceAsync.WithRawResponse

        fun applications(): ApplicationServiceAsync.WithRawResponse

        fun compute(): ComputeServiceAsync.WithRawResponse

        fun database(): DatabaseServiceAsync.WithRawResponse

        fun format(): FormatServiceAsync.WithRawResponse

        fun legal(): LegalServiceAsync.WithRawResponse

        fun llm(): LlmServiceAsync.WithRawResponse

        fun memory(): MemoryServiceAsync.WithRawResponse

        fun ocr(): OcrServiceAsync.WithRawResponse

        fun privilege(): PrivilegeServiceAsync.WithRawResponse

        fun search(): SearchServiceAsync.WithRawResponse

        fun superdoc(): SuperdocServiceAsync.WithRawResponse

        fun translate(): TranslateServiceAsync.WithRawResponse

        fun vault(): VaultServiceAsync.WithRawResponse

        fun voice(): VoiceServiceAsync.WithRawResponse
    }
}
