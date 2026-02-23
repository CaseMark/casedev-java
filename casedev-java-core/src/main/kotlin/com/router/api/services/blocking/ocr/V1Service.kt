// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.ocr

import com.google.errorprone.annotations.MustBeClosed
import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponse
import com.router.api.core.http.HttpResponseFor
import com.router.api.models.ocr.v1.V1DownloadParams
import com.router.api.models.ocr.v1.V1ProcessParams
import com.router.api.models.ocr.v1.V1ProcessResponse
import com.router.api.models.ocr.v1.V1RetrieveParams
import com.router.api.models.ocr.v1.V1RetrieveResponse
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
     * Retrieve the status and results of an OCR job. Returns job progress, extracted text, and
     * metadata when processing is complete.
     */
    fun retrieve(id: String): V1RetrieveResponse = retrieve(id, V1RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1RetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
    ): V1RetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: V1RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1RetrieveResponse

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams): V1RetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): V1RetrieveResponse =
        retrieve(id, V1RetrieveParams.none(), requestOptions)

    /**
     * Download OCR processing results in various formats. Returns the processed document as text
     * extraction, structured JSON with coordinates, searchable PDF with text layer, or the original
     * uploaded document.
     */
    @MustBeClosed
    fun download(type: V1DownloadParams.Type, params: V1DownloadParams): HttpResponse =
        download(type, params, RequestOptions.none())

    /** @see download */
    @MustBeClosed
    fun download(
        type: V1DownloadParams.Type,
        params: V1DownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = download(params.toBuilder().type(type).build(), requestOptions)

    /** @see download */
    @MustBeClosed
    fun download(params: V1DownloadParams): HttpResponse = download(params, RequestOptions.none())

    /** @see download */
    @MustBeClosed
    fun download(
        params: V1DownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * Submit a document for OCR processing to extract text, detect tables, forms, and other
     * features. Supports PDFs, images, and scanned documents. Returns a job ID that can be used to
     * track processing status.
     */
    fun process(params: V1ProcessParams): V1ProcessResponse = process(params, RequestOptions.none())

    /** @see process */
    fun process(
        params: V1ProcessParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ProcessResponse

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ocr/v1/{id}`, but is otherwise the same as
         * [V1Service.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<V1RetrieveResponse> =
            retrieve(id, V1RetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1RetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
        ): HttpResponseFor<V1RetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: V1RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1RetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: V1RetrieveParams): HttpResponseFor<V1RetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1RetrieveResponse> =
            retrieve(id, V1RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ocr/v1/{id}/download/{type}`, but is otherwise the
         * same as [V1Service.download].
         */
        @MustBeClosed
        fun download(type: V1DownloadParams.Type, params: V1DownloadParams): HttpResponse =
            download(type, params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(
            type: V1DownloadParams.Type,
            params: V1DownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = download(params.toBuilder().type(type).build(), requestOptions)

        /** @see download */
        @MustBeClosed
        fun download(params: V1DownloadParams): HttpResponse =
            download(params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(
            params: V1DownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /ocr/v1/process`, but is otherwise the same as
         * [V1Service.process].
         */
        @MustBeClosed
        fun process(params: V1ProcessParams): HttpResponseFor<V1ProcessResponse> =
            process(params, RequestOptions.none())

        /** @see process */
        @MustBeClosed
        fun process(
            params: V1ProcessParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ProcessResponse>
    }
}
