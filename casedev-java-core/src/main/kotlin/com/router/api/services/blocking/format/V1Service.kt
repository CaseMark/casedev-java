// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.format

import com.google.errorprone.annotations.MustBeClosed
import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponse
import com.router.api.models.format.v1.V1CreateDocumentParams
import com.router.api.services.blocking.format.v1.TemplateService
import java.util.function.Consumer

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    fun templates(): TemplateService

    /**
     * Convert Markdown, JSON, or text content to professionally formatted PDF, DOCX, or HTML
     * documents. Supports template components with variable interpolation for creating consistent
     * legal documents like contracts, briefs, and reports.
     */
    @MustBeClosed
    fun createDocument(params: V1CreateDocumentParams): HttpResponse =
        createDocument(params, RequestOptions.none())

    /** @see createDocument */
    @MustBeClosed
    fun createDocument(
        params: V1CreateDocumentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        fun templates(): TemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /format/v1/document`, but is otherwise the same as
         * [V1Service.createDocument].
         */
        @MustBeClosed
        fun createDocument(params: V1CreateDocumentParams): HttpResponse =
            createDocument(params, RequestOptions.none())

        /** @see createDocument */
        @MustBeClosed
        fun createDocument(
            params: V1CreateDocumentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
