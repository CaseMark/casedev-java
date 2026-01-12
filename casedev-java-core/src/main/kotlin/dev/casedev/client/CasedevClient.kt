// File generated from our OpenAPI spec by Stainless.

package dev.casedev.client

import dev.casedev.core.ClientOptions
import dev.casedev.services.blocking.ComputeService
import dev.casedev.services.blocking.FormatService
import dev.casedev.services.blocking.LlmService
import dev.casedev.services.blocking.OcrService
import dev.casedev.services.blocking.SearchService
import dev.casedev.services.blocking.VaultService
import dev.casedev.services.blocking.VoiceService
import dev.casedev.services.blocking.WebhookService
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

    fun compute(): ComputeService

    fun format(): FormatService

    fun llm(): LlmService

    fun ocr(): OcrService

    fun search(): SearchService

    fun vault(): VaultService

    fun voice(): VoiceService

    fun webhooks(): WebhookService

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

        fun compute(): ComputeService.WithRawResponse

        fun format(): FormatService.WithRawResponse

        fun llm(): LlmService.WithRawResponse

        fun ocr(): OcrService.WithRawResponse

        fun search(): SearchService.WithRawResponse

        fun vault(): VaultService.WithRawResponse

        fun voice(): VoiceService.WithRawResponse

        fun webhooks(): WebhookService.WithRawResponse
    }
}
