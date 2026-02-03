// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.superdoc

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.superdoc.v1.V1AnnotateParams
import dev.casedev.models.superdoc.v1.V1ConvertParams
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

    /**
     * Populate fields inside a DOCX template using SuperDoc annotations. Supports text, images,
     * dates, and numbers. Can target individual fields by ID or multiple fields by group.
     */
    fun annotate(params: V1AnnotateParams): CompletableFuture<HttpResponse> =
        annotate(params, RequestOptions.none())

    /** @see annotate */
    fun annotate(
        params: V1AnnotateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /**
     * Convert documents between formats using SuperDoc. Supports DOCX to PDF, Markdown to DOCX, and
     * HTML to DOCX conversions.
     */
    fun convert(params: V1ConvertParams): CompletableFuture<HttpResponse> =
        convert(params, RequestOptions.none())

    /** @see convert */
    fun convert(
        params: V1ConvertParams,
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

        /**
         * Returns a raw HTTP response for `post /superdoc/v1/annotate`, but is otherwise the same
         * as [V1ServiceAsync.annotate].
         */
        fun annotate(params: V1AnnotateParams): CompletableFuture<HttpResponse> =
            annotate(params, RequestOptions.none())

        /** @see annotate */
        fun annotate(
            params: V1AnnotateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /superdoc/v1/convert`, but is otherwise the same as
         * [V1ServiceAsync.convert].
         */
        fun convert(params: V1ConvertParams): CompletableFuture<HttpResponse> =
            convert(params, RequestOptions.none())

        /** @see convert */
        fun convert(
            params: V1ConvertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
