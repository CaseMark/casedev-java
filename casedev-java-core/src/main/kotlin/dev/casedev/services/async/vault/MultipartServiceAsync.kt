// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.vault

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.vault.multipart.MultipartAbortParams
import dev.casedev.models.vault.multipart.MultipartCompleteParams
import dev.casedev.models.vault.multipart.MultipartGetPartUrlsParams
import dev.casedev.models.vault.multipart.MultipartGetPartUrlsResponse
import dev.casedev.models.vault.multipart.MultipartInitParams
import dev.casedev.models.vault.multipart.MultipartInitResponse
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

    /** Abort a multipart upload and discard uploaded parts. */
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

    /** Complete a multipart upload by providing the list of part numbers and ETags. */
    fun complete(id: String, params: MultipartCompleteParams): CompletableFuture<Void?> =
        complete(id, params, RequestOptions.none())

    /** @see complete */
    fun complete(
        id: String,
        params: MultipartCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = complete(params.toBuilder().id(id).build(), requestOptions)

    /** @see complete */
    fun complete(params: MultipartCompleteParams): CompletableFuture<Void?> =
        complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: MultipartCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Generate presigned URLs for individual multipart upload parts. */
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
     * Initiate a multipart upload for large files (>5GB). Returns an uploadId and object metadata.
     * Use part URLs endpoint to upload parts and complete endpoint to finalize.
     */
    fun init(id: String, params: MultipartInitParams): CompletableFuture<MultipartInitResponse> =
        init(id, params, RequestOptions.none())

    /** @see init */
    fun init(
        id: String,
        params: MultipartInitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MultipartInitResponse> =
        init(params.toBuilder().id(id).build(), requestOptions)

    /** @see init */
    fun init(params: MultipartInitParams): CompletableFuture<MultipartInitResponse> =
        init(params, RequestOptions.none())

    /** @see init */
    fun init(
        params: MultipartInitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MultipartInitResponse>

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
         * Returns a raw HTTP response for `post /vault/{id}/multipart/complete`, but is otherwise
         * the same as [MultipartServiceAsync.complete].
         */
        fun complete(id: String, params: MultipartCompleteParams): CompletableFuture<HttpResponse> =
            complete(id, params, RequestOptions.none())

        /** @see complete */
        fun complete(
            id: String,
            params: MultipartCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            complete(params.toBuilder().id(id).build(), requestOptions)

        /** @see complete */
        fun complete(params: MultipartCompleteParams): CompletableFuture<HttpResponse> =
            complete(params, RequestOptions.none())

        /** @see complete */
        fun complete(
            params: MultipartCompleteParams,
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

        /**
         * Returns a raw HTTP response for `post /vault/{id}/multipart/init`, but is otherwise the
         * same as [MultipartServiceAsync.init].
         */
        fun init(
            id: String,
            params: MultipartInitParams,
        ): CompletableFuture<HttpResponseFor<MultipartInitResponse>> =
            init(id, params, RequestOptions.none())

        /** @see init */
        fun init(
            id: String,
            params: MultipartInitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MultipartInitResponse>> =
            init(params.toBuilder().id(id).build(), requestOptions)

        /** @see init */
        fun init(
            params: MultipartInitParams
        ): CompletableFuture<HttpResponseFor<MultipartInitResponse>> =
            init(params, RequestOptions.none())

        /** @see init */
        fun init(
            params: MultipartInitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MultipartInitResponse>>
    }
}
