// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.vault

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.vault.objects.ObjectCreatePresignedUrlParams
import dev.casedev.models.vault.objects.ObjectCreatePresignedUrlResponse
import dev.casedev.models.vault.objects.ObjectDownloadParams
import dev.casedev.models.vault.objects.ObjectGetTextParams
import dev.casedev.models.vault.objects.ObjectGetTextResponse
import dev.casedev.models.vault.objects.ObjectListParams
import dev.casedev.models.vault.objects.ObjectListResponse
import dev.casedev.models.vault.objects.ObjectRetrieveParams
import dev.casedev.models.vault.objects.ObjectRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ObjectServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectServiceAsync

    /**
     * Retrieves metadata for a specific document in a vault and generates a temporary download URL.
     * The download URL expires after 1 hour for security. This endpoint also updates the file size
     * if it wasn't previously calculated.
     */
    fun retrieve(
        objectId: String,
        params: ObjectRetrieveParams,
    ): CompletableFuture<ObjectRetrieveResponse> = retrieve(objectId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        objectId: String,
        params: ObjectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectRetrieveResponse> =
        retrieve(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ObjectRetrieveParams): CompletableFuture<ObjectRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ObjectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectRetrieveResponse>

    /**
     * Retrieve all objects stored in a specific vault, including document metadata, ingestion
     * status, and processing statistics.
     */
    fun list(id: String): CompletableFuture<ObjectListResponse> = list(id, ObjectListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: ObjectListParams = ObjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectListResponse> =
        list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(
        id: String,
        params: ObjectListParams = ObjectListParams.none(),
    ): CompletableFuture<ObjectListResponse> = list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ObjectListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectListResponse>

    /** @see list */
    fun list(params: ObjectListParams): CompletableFuture<ObjectListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): CompletableFuture<ObjectListResponse> =
        list(id, ObjectListParams.none(), requestOptions)

    /**
     * Generate presigned URLs for direct S3 operations (GET, PUT, DELETE, HEAD) on vault objects.
     * This allows secure, time-limited access to files without proxying through the API. Essential
     * for large document uploads/downloads in legal workflows.
     */
    fun createPresignedUrl(
        objectId: String,
        params: ObjectCreatePresignedUrlParams,
    ): CompletableFuture<ObjectCreatePresignedUrlResponse> =
        createPresignedUrl(objectId, params, RequestOptions.none())

    /** @see createPresignedUrl */
    fun createPresignedUrl(
        objectId: String,
        params: ObjectCreatePresignedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectCreatePresignedUrlResponse> =
        createPresignedUrl(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see createPresignedUrl */
    fun createPresignedUrl(
        params: ObjectCreatePresignedUrlParams
    ): CompletableFuture<ObjectCreatePresignedUrlResponse> =
        createPresignedUrl(params, RequestOptions.none())

    /** @see createPresignedUrl */
    fun createPresignedUrl(
        params: ObjectCreatePresignedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectCreatePresignedUrlResponse>

    /**
     * Downloads a file from a vault. Returns the actual file content as a binary stream with
     * appropriate headers for file download. Useful for retrieving contracts, depositions, case
     * files, and other legal documents stored in your vault.
     */
    fun download(objectId: String, params: ObjectDownloadParams): CompletableFuture<String> =
        download(objectId, params, RequestOptions.none())

    /** @see download */
    fun download(
        objectId: String,
        params: ObjectDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String> =
        download(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see download */
    fun download(params: ObjectDownloadParams): CompletableFuture<String> =
        download(params, RequestOptions.none())

    /** @see download */
    fun download(
        params: ObjectDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Retrieves the full extracted text content from a processed vault object. Returns the
     * concatenated text from all chunks, useful for document review, analysis, or export. The
     * object must have completed processing before text can be retrieved.
     */
    fun getText(
        objectId: String,
        params: ObjectGetTextParams,
    ): CompletableFuture<ObjectGetTextResponse> = getText(objectId, params, RequestOptions.none())

    /** @see getText */
    fun getText(
        objectId: String,
        params: ObjectGetTextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectGetTextResponse> =
        getText(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getText */
    fun getText(params: ObjectGetTextParams): CompletableFuture<ObjectGetTextResponse> =
        getText(params, RequestOptions.none())

    /** @see getText */
    fun getText(
        params: ObjectGetTextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectGetTextResponse>

    /**
     * A view of [ObjectServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObjectServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /vault/{id}/objects/{objectId}`, but is otherwise
         * the same as [ObjectServiceAsync.retrieve].
         */
        fun retrieve(
            objectId: String,
            params: ObjectRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ObjectRetrieveResponse>> =
            retrieve(objectId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            objectId: String,
            params: ObjectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectRetrieveResponse>> =
            retrieve(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: ObjectRetrieveParams
        ): CompletableFuture<HttpResponseFor<ObjectRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ObjectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /vault/{id}/objects`, but is otherwise the same as
         * [ObjectServiceAsync.list].
         */
        fun list(id: String): CompletableFuture<HttpResponseFor<ObjectListResponse>> =
            list(id, ObjectListParams.none())

        /** @see list */
        fun list(
            id: String,
            params: ObjectListParams = ObjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectListResponse>> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        fun list(
            id: String,
            params: ObjectListParams = ObjectListParams.none(),
        ): CompletableFuture<HttpResponseFor<ObjectListResponse>> =
            list(id, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ObjectListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectListResponse>>

        /** @see list */
        fun list(params: ObjectListParams): CompletableFuture<HttpResponseFor<ObjectListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectListResponse>> =
            list(id, ObjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /vault/{id}/objects/{objectId}/presigned-url`, but
         * is otherwise the same as [ObjectServiceAsync.createPresignedUrl].
         */
        fun createPresignedUrl(
            objectId: String,
            params: ObjectCreatePresignedUrlParams,
        ): CompletableFuture<HttpResponseFor<ObjectCreatePresignedUrlResponse>> =
            createPresignedUrl(objectId, params, RequestOptions.none())

        /** @see createPresignedUrl */
        fun createPresignedUrl(
            objectId: String,
            params: ObjectCreatePresignedUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectCreatePresignedUrlResponse>> =
            createPresignedUrl(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see createPresignedUrl */
        fun createPresignedUrl(
            params: ObjectCreatePresignedUrlParams
        ): CompletableFuture<HttpResponseFor<ObjectCreatePresignedUrlResponse>> =
            createPresignedUrl(params, RequestOptions.none())

        /** @see createPresignedUrl */
        fun createPresignedUrl(
            params: ObjectCreatePresignedUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectCreatePresignedUrlResponse>>

        /**
         * Returns a raw HTTP response for `get /vault/{id}/objects/{objectId}/download`, but is
         * otherwise the same as [ObjectServiceAsync.download].
         */
        fun download(
            objectId: String,
            params: ObjectDownloadParams,
        ): CompletableFuture<HttpResponseFor<String>> =
            download(objectId, params, RequestOptions.none())

        /** @see download */
        fun download(
            objectId: String,
            params: ObjectDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>> =
            download(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see download */
        fun download(params: ObjectDownloadParams): CompletableFuture<HttpResponseFor<String>> =
            download(params, RequestOptions.none())

        /** @see download */
        fun download(
            params: ObjectDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `get /vault/{id}/objects/{objectId}/text`, but is
         * otherwise the same as [ObjectServiceAsync.getText].
         */
        fun getText(
            objectId: String,
            params: ObjectGetTextParams,
        ): CompletableFuture<HttpResponseFor<ObjectGetTextResponse>> =
            getText(objectId, params, RequestOptions.none())

        /** @see getText */
        fun getText(
            objectId: String,
            params: ObjectGetTextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectGetTextResponse>> =
            getText(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getText */
        fun getText(
            params: ObjectGetTextParams
        ): CompletableFuture<HttpResponseFor<ObjectGetTextResponse>> =
            getText(params, RequestOptions.none())

        /** @see getText */
        fun getText(
            params: ObjectGetTextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectGetTextResponse>>
    }
}
