// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.vault

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.vault.multipart.MultipartAbortParams
import dev.casedev.models.vault.multipart.MultipartGetPartUrlsParams
import dev.casedev.models.vault.multipart.MultipartGetPartUrlsResponse
import java.util.function.Consumer

interface MultipartService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultipartService

    /** Abort a multipart upload and discard uploaded parts (live). */
    fun abort(id: String, params: MultipartAbortParams) = abort(id, params, RequestOptions.none())

    /** @see abort */
    fun abort(
        id: String,
        params: MultipartAbortParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = abort(params.toBuilder().id(id).build(), requestOptions)

    /** @see abort */
    fun abort(params: MultipartAbortParams) = abort(params, RequestOptions.none())

    /** @see abort */
    fun abort(params: MultipartAbortParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Generate presigned URLs for individual multipart upload parts (live). */
    fun getPartUrls(id: String, params: MultipartGetPartUrlsParams): MultipartGetPartUrlsResponse =
        getPartUrls(id, params, RequestOptions.none())

    /** @see getPartUrls */
    fun getPartUrls(
        id: String,
        params: MultipartGetPartUrlsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MultipartGetPartUrlsResponse = getPartUrls(params.toBuilder().id(id).build(), requestOptions)

    /** @see getPartUrls */
    fun getPartUrls(params: MultipartGetPartUrlsParams): MultipartGetPartUrlsResponse =
        getPartUrls(params, RequestOptions.none())

    /** @see getPartUrls */
    fun getPartUrls(
        params: MultipartGetPartUrlsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MultipartGetPartUrlsResponse

    /** A view of [MultipartService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultipartService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /vault/{id}/multipart/abort`, but is otherwise the
         * same as [MultipartService.abort].
         */
        @MustBeClosed
        fun abort(id: String, params: MultipartAbortParams): HttpResponse =
            abort(id, params, RequestOptions.none())

        /** @see abort */
        @MustBeClosed
        fun abort(
            id: String,
            params: MultipartAbortParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = abort(params.toBuilder().id(id).build(), requestOptions)

        /** @see abort */
        @MustBeClosed
        fun abort(params: MultipartAbortParams): HttpResponse = abort(params, RequestOptions.none())

        /** @see abort */
        @MustBeClosed
        fun abort(
            params: MultipartAbortParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /vault/{id}/multipart/part-urls`, but is otherwise
         * the same as [MultipartService.getPartUrls].
         */
        @MustBeClosed
        fun getPartUrls(
            id: String,
            params: MultipartGetPartUrlsParams,
        ): HttpResponseFor<MultipartGetPartUrlsResponse> =
            getPartUrls(id, params, RequestOptions.none())

        /** @see getPartUrls */
        @MustBeClosed
        fun getPartUrls(
            id: String,
            params: MultipartGetPartUrlsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MultipartGetPartUrlsResponse> =
            getPartUrls(params.toBuilder().id(id).build(), requestOptions)

        /** @see getPartUrls */
        @MustBeClosed
        fun getPartUrls(
            params: MultipartGetPartUrlsParams
        ): HttpResponseFor<MultipartGetPartUrlsResponse> =
            getPartUrls(params, RequestOptions.none())

        /** @see getPartUrls */
        @MustBeClosed
        fun getPartUrls(
            params: MultipartGetPartUrlsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MultipartGetPartUrlsResponse>
    }
}
