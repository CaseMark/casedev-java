// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.format

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.format.v1.V1CreateDocumentParams
import dev.case.api.services.async.format.v1.TemplateServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

    fun templates(): TemplateServiceAsync

    /**
     * Convert Markdown, JSON, or text content to professionally formatted PDF, DOCX, or HTML
     * documents. Supports template components with variable interpolation for creating consistent
     * legal documents like contracts, briefs, and reports.
     */
    fun createDocument(params: V1CreateDocumentParams): CompletableFuture<HttpResponse> =
        createDocument(params, RequestOptions.none())

    /** @see createDocument */
    fun createDocument(
        params: V1CreateDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        fun templates(): TemplateServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /format/v1/document`, but is otherwise the same as
         * [V1ServiceAsync.createDocument].
         */
        fun createDocument(params: V1CreateDocumentParams): CompletableFuture<HttpResponse> =
            createDocument(params, RequestOptions.none())

        /** @see createDocument */
        fun createDocument(
            params: V1CreateDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
