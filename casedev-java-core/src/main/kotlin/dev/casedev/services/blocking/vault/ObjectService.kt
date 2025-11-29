// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.vault

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.vault.objects.ObjectCreatePresignedUrlParams
import dev.casedev.models.vault.objects.ObjectCreatePresignedUrlResponse
import dev.casedev.models.vault.objects.ObjectDownloadParams
import dev.casedev.models.vault.objects.ObjectGetTextParams
import dev.casedev.models.vault.objects.ObjectListParams
import dev.casedev.models.vault.objects.ObjectRetrieveParams
import java.util.function.Consumer

interface ObjectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectService

    /**
     * Retrieves metadata for a specific document in a vault and generates a temporary download URL.
     * The download URL expires after 1 hour for security. This endpoint also updates the file size
     * if it wasn't previously calculated.
     */
    fun retrieve(objectId: String, params: ObjectRetrieveParams) =
        retrieve(objectId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        objectId: String,
        params: ObjectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ObjectRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ObjectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Retrieve all objects stored in a specific vault, including document metadata, ingestion
     * status, and processing statistics.
     */
    fun list(id: String) = list(id, ObjectListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: ObjectListParams = ObjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: ObjectListParams = ObjectListParams.none()) =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(params: ObjectListParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see list */
    fun list(params: ObjectListParams) = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions) =
        list(id, ObjectListParams.none(), requestOptions)

    /**
     * Generate presigned URLs for direct S3 operations (GET, PUT, DELETE, HEAD) on vault objects.
     * This allows secure, time-limited access to files without proxying through the API. Essential
     * for large document uploads/downloads in legal workflows.
     */
    fun createPresignedUrl(
        objectId: String,
        params: ObjectCreatePresignedUrlParams,
    ): ObjectCreatePresignedUrlResponse =
        createPresignedUrl(objectId, params, RequestOptions.none())

    /** @see createPresignedUrl */
    fun createPresignedUrl(
        objectId: String,
        params: ObjectCreatePresignedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectCreatePresignedUrlResponse =
        createPresignedUrl(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see createPresignedUrl */
    fun createPresignedUrl(
        params: ObjectCreatePresignedUrlParams
    ): ObjectCreatePresignedUrlResponse = createPresignedUrl(params, RequestOptions.none())

    /** @see createPresignedUrl */
    fun createPresignedUrl(
        params: ObjectCreatePresignedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectCreatePresignedUrlResponse

    /**
     * Downloads a file from a vault. Returns the actual file content as a binary stream with
     * appropriate headers for file download. Useful for retrieving contracts, depositions, case
     * files, and other legal documents stored in your vault.
     */
    fun download(objectId: String, params: ObjectDownloadParams) =
        download(objectId, params, RequestOptions.none())

    /** @see download */
    fun download(
        objectId: String,
        params: ObjectDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = download(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see download */
    fun download(params: ObjectDownloadParams) = download(params, RequestOptions.none())

    /** @see download */
    fun download(
        params: ObjectDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Retrieves the full extracted text content from a processed vault object. Returns the
     * concatenated text from all chunks, useful for document review, analysis, or export. The
     * object must have completed processing before text can be retrieved.
     */
    fun getText(objectId: String, params: ObjectGetTextParams) =
        getText(objectId, params, RequestOptions.none())

    /** @see getText */
    fun getText(
        objectId: String,
        params: ObjectGetTextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = getText(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getText */
    fun getText(params: ObjectGetTextParams) = getText(params, RequestOptions.none())

    /** @see getText */
    fun getText(params: ObjectGetTextParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [ObjectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /vault/{id}/objects/{objectId}`, but is otherwise
         * the same as [ObjectService.retrieve].
         */
        @MustBeClosed
        fun retrieve(objectId: String, params: ObjectRetrieveParams): HttpResponse =
            retrieve(objectId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            objectId: String,
            params: ObjectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ObjectRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ObjectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /vault/{id}/objects`, but is otherwise the same as
         * [ObjectService.list].
         */
        @MustBeClosed fun list(id: String): HttpResponse = list(id, ObjectListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: ObjectListParams = ObjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(id: String, params: ObjectListParams = ObjectListParams.none()): HttpResponse =
            list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ObjectListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: ObjectListParams): HttpResponse = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponse =
            list(id, ObjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /vault/{id}/objects/{objectId}/presigned-url`, but
         * is otherwise the same as [ObjectService.createPresignedUrl].
         */
        @MustBeClosed
        fun createPresignedUrl(
            objectId: String,
            params: ObjectCreatePresignedUrlParams,
        ): HttpResponseFor<ObjectCreatePresignedUrlResponse> =
            createPresignedUrl(objectId, params, RequestOptions.none())

        /** @see createPresignedUrl */
        @MustBeClosed
        fun createPresignedUrl(
            objectId: String,
            params: ObjectCreatePresignedUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectCreatePresignedUrlResponse> =
            createPresignedUrl(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see createPresignedUrl */
        @MustBeClosed
        fun createPresignedUrl(
            params: ObjectCreatePresignedUrlParams
        ): HttpResponseFor<ObjectCreatePresignedUrlResponse> =
            createPresignedUrl(params, RequestOptions.none())

        /** @see createPresignedUrl */
        @MustBeClosed
        fun createPresignedUrl(
            params: ObjectCreatePresignedUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectCreatePresignedUrlResponse>

        /**
         * Returns a raw HTTP response for `get /vault/{id}/objects/{objectId}/download`, but is
         * otherwise the same as [ObjectService.download].
         */
        @MustBeClosed
        fun download(objectId: String, params: ObjectDownloadParams): HttpResponse =
            download(objectId, params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(
            objectId: String,
            params: ObjectDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = download(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see download */
        @MustBeClosed
        fun download(params: ObjectDownloadParams): HttpResponse =
            download(params, RequestOptions.none())

        /** @see download */
        @MustBeClosed
        fun download(
            params: ObjectDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /vault/{id}/objects/{objectId}/text`, but is
         * otherwise the same as [ObjectService.getText].
         */
        @MustBeClosed
        fun getText(objectId: String, params: ObjectGetTextParams): HttpResponse =
            getText(objectId, params, RequestOptions.none())

        /** @see getText */
        @MustBeClosed
        fun getText(
            objectId: String,
            params: ObjectGetTextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = getText(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getText */
        @MustBeClosed
        fun getText(params: ObjectGetTextParams): HttpResponse =
            getText(params, RequestOptions.none())

        /** @see getText */
        @MustBeClosed
        fun getText(
            params: ObjectGetTextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
