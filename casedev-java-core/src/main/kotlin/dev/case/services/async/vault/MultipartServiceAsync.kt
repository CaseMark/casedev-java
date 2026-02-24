// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async.vault

import dev.case.core.ClientOptions
import dev.case.core.RequestOptions
import dev.case.core.http.HttpResponse
import dev.case.core.http.HttpResponseFor
import dev.case.models.vault.multipart.MultipartAbortParams
import dev.case.models.vault.multipart.MultipartGetPartUrlsParams
import dev.case.models.vault.multipart.MultipartGetPartUrlsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MultipartServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultipartServiceAsync

    /** Abort a multipart upload and discard uploaded parts (live). */
    fun abort(id: String, params: MultipartAbortParams): CompletableFuture<Void?> =
        abort(id, params, RequestOptions.none())

    /** @see abort */
    fun abort(
        id: String,
        params: MultipartAbortParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = abort(params.toBuilder().id(id).build(), requestOptions)

    /** @see abort */
    fun abort(params: MultipartAbortParams): CompletableFuture<Void?> =
        abort(params, RequestOptions.none())

    /** @see abort */
    fun abort(
        params: MultipartAbortParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Generate presigned URLs for individual multipart upload parts (live). */
    fun getPartUrls(
        id: String,
        params: MultipartGetPartUrlsParams,
    ): CompletableFuture<MultipartGetPartUrlsResponse> =
        getPartUrls(id, params, RequestOptions.none())

    /** @see getPartUrls */
    fun getPartUrls(
        id: String,
        params: MultipartGetPartUrlsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MultipartGetPartUrlsResponse> =
        getPartUrls(params.toBuilder().id(id).build(), requestOptions)

    /** @see getPartUrls */
    fun getPartUrls(
        params: MultipartGetPartUrlsParams
    ): CompletableFuture<MultipartGetPartUrlsResponse> = getPartUrls(params, RequestOptions.none())

    /** @see getPartUrls */
    fun getPartUrls(
        params: MultipartGetPartUrlsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MultipartGetPartUrlsResponse>

    /**
     * A view of [MultipartServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultipartServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /vault/{id}/multipart/abort`, but is otherwise the
         * same as [MultipartServiceAsync.abort].
         */
        fun abort(id: String, params: MultipartAbortParams): CompletableFuture<HttpResponse> =
            abort(id, params, RequestOptions.none())

        /** @see abort */
        fun abort(
            id: String,
            params: MultipartAbortParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            abort(params.toBuilder().id(id).build(), requestOptions)

        /** @see abort */
        fun abort(params: MultipartAbortParams): CompletableFuture<HttpResponse> =
            abort(params, RequestOptions.none())

        /** @see abort */
        fun abort(
            params: MultipartAbortParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /vault/{id}/multipart/part-urls`, but is otherwise
         * the same as [MultipartServiceAsync.getPartUrls].
         */
        fun getPartUrls(
            id: String,
            params: MultipartGetPartUrlsParams,
        ): CompletableFuture<HttpResponseFor<MultipartGetPartUrlsResponse>> =
            getPartUrls(id, params, RequestOptions.none())

        /** @see getPartUrls */
        fun getPartUrls(
            id: String,
            params: MultipartGetPartUrlsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MultipartGetPartUrlsResponse>> =
            getPartUrls(params.toBuilder().id(id).build(), requestOptions)

        /** @see getPartUrls */
        fun getPartUrls(
            params: MultipartGetPartUrlsParams
        ): CompletableFuture<HttpResponseFor<MultipartGetPartUrlsResponse>> =
            getPartUrls(params, RequestOptions.none())

        /** @see getPartUrls */
        fun getPartUrls(
            params: MultipartGetPartUrlsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MultipartGetPartUrlsResponse>>
    }
}
