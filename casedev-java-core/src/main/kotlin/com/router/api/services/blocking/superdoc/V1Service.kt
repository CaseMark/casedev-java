// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.superdoc

import com.google.errorprone.annotations.MustBeClosed
import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponse
import com.router.api.models.superdoc.v1.V1AnnotateParams
import com.router.api.models.superdoc.v1.V1ConvertParams
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

    /**
     * Populate fields inside a DOCX template using SuperDoc annotations. Supports text, images,
     * dates, and numbers. Can target individual fields by ID or multiple fields by group.
     */
    @MustBeClosed
    fun annotate(params: V1AnnotateParams): HttpResponse = annotate(params, RequestOptions.none())

    /** @see annotate */
    @MustBeClosed
    fun annotate(
        params: V1AnnotateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * Convert documents between formats using SuperDoc. Supports DOCX to PDF, Markdown to DOCX, and
     * HTML to DOCX conversions.
     */
    @MustBeClosed
    fun convert(params: V1ConvertParams): HttpResponse = convert(params, RequestOptions.none())

    /** @see convert */
    @MustBeClosed
    fun convert(
        params: V1ConvertParams,
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

        /**
         * Returns a raw HTTP response for `post /superdoc/v1/annotate`, but is otherwise the same
         * as [V1Service.annotate].
         */
        @MustBeClosed
        fun annotate(params: V1AnnotateParams): HttpResponse =
            annotate(params, RequestOptions.none())

        /** @see annotate */
        @MustBeClosed
        fun annotate(
            params: V1AnnotateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /superdoc/v1/convert`, but is otherwise the same as
         * [V1Service.convert].
         */
        @MustBeClosed
        fun convert(params: V1ConvertParams): HttpResponse = convert(params, RequestOptions.none())

        /** @see convert */
        @MustBeClosed
        fun convert(
            params: V1ConvertParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
