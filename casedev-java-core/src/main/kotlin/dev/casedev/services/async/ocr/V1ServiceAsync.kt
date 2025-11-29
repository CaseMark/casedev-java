// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.ocr

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.ocr.v1.V1DownloadParams
import dev.casedev.models.ocr.v1.V1ProcessParams
import dev.casedev.models.ocr.v1.V1ProcessResponse
import dev.casedev.models.ocr.v1.V1RetrieveParams
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
     * Retrieve the status and results of an OCR job. Returns job progress, extracted text, and
     * metadata when processing is complete.
     */
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, V1RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: V1RetrieveParams = V1RetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: V1RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: V1RetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, V1RetrieveParams.none(), requestOptions)

    /**
     * Download OCR processing results in various formats. Returns the processed document as text
     * extraction, structured JSON with coordinates, searchable PDF with text layer, or the original
     * uploaded document.
     */
    fun download(type: V1DownloadParams.Type, params: V1DownloadParams): CompletableFuture<Void?> =
        download(type, params, RequestOptions.none())

    /** @see download */
    fun download(
        type: V1DownloadParams.Type,
        params: V1DownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = download(params.toBuilder().type(type).build(), requestOptions)

    /** @see download */
    fun download(params: V1DownloadParams): CompletableFuture<Void?> =
        download(params, RequestOptions.none())

    /** @see download */
    fun download(
        params: V1DownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Submit a document for OCR processing to extract text, detect tables, forms, and other
     * features. Supports PDFs, images, and scanned documents. Returns a job ID that can be used to
     * track processing status.
     */
    fun process(params: V1ProcessParams): CompletableFuture<V1ProcessResponse> =
        process(params, RequestOptions.none())

    /** @see process */
    fun process(
        params: V1ProcessParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ProcessResponse>

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ocr/v1/{id}`, but is otherwise the same as
         * [V1ServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, V1RetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: V1RetrieveParams = V1RetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: V1RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: V1RetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, V1RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /ocr/v1/{id}/download/{type}`, but is otherwise the
         * same as [V1ServiceAsync.download].
         */
        fun download(
            type: V1DownloadParams.Type,
            params: V1DownloadParams,
        ): CompletableFuture<HttpResponse> = download(type, params, RequestOptions.none())

        /** @see download */
        fun download(
            type: V1DownloadParams.Type,
            params: V1DownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            download(params.toBuilder().type(type).build(), requestOptions)

        /** @see download */
        fun download(params: V1DownloadParams): CompletableFuture<HttpResponse> =
            download(params, RequestOptions.none())

        /** @see download */
        fun download(
            params: V1DownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /ocr/v1/process`, but is otherwise the same as
         * [V1ServiceAsync.process].
         */
        fun process(
            params: V1ProcessParams
        ): CompletableFuture<HttpResponseFor<V1ProcessResponse>> =
            process(params, RequestOptions.none())

        /** @see process */
        fun process(
            params: V1ProcessParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1ProcessResponse>>
    }
}
