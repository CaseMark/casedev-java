// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.vault

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.vault.objects.ObjectCreatePresignedUrlParams
import dev.case.api.models.vault.objects.ObjectCreatePresignedUrlResponse
import dev.case.api.models.vault.objects.ObjectDeleteParams
import dev.case.api.models.vault.objects.ObjectDeleteResponse
import dev.case.api.models.vault.objects.ObjectDownloadParams
import dev.case.api.models.vault.objects.ObjectGetOcrWordsParams
import dev.case.api.models.vault.objects.ObjectGetOcrWordsResponse
import dev.case.api.models.vault.objects.ObjectGetSummarizeJobParams
import dev.case.api.models.vault.objects.ObjectGetSummarizeJobResponse
import dev.case.api.models.vault.objects.ObjectGetTextParams
import dev.case.api.models.vault.objects.ObjectGetTextResponse
import dev.case.api.models.vault.objects.ObjectListParams
import dev.case.api.models.vault.objects.ObjectListResponse
import dev.case.api.models.vault.objects.ObjectRetrieveParams
import dev.case.api.models.vault.objects.ObjectRetrieveResponse
import dev.case.api.models.vault.objects.ObjectUpdateParams
import dev.case.api.models.vault.objects.ObjectUpdateResponse
import java.util.function.Consumer

/** Secure document storage with semantic search and GraphRAG */
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
    fun retrieve(objectId: String, params: ObjectRetrieveParams): ObjectRetrieveResponse =
        retrieve(objectId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        objectId: String,
        params: ObjectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectRetrieveResponse =
        retrieve(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ObjectRetrieveParams): ObjectRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ObjectRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectRetrieveResponse

    /**
     * Update a document's filename, path, or metadata. Use this to rename files or organize them
     * into virtual folders. The path is stored in metadata.path and can be used to build folder
     * hierarchies in your application.
     */
    fun update(objectId: String, params: ObjectUpdateParams): ObjectUpdateResponse =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: ObjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectUpdateResponse = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: ObjectUpdateParams): ObjectUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ObjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectUpdateResponse

    /**
     * Retrieve all objects stored in a specific vault, including document metadata, ingestion
     * status, and processing statistics.
     */
    fun list(id: String): ObjectListResponse = list(id, ObjectListParams.none())

    /** @see list */
    fun list(
        id: String,
        params: ObjectListParams = ObjectListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectListResponse = list(params.toBuilder().id(id).build(), requestOptions)

    /** @see list */
    fun list(id: String, params: ObjectListParams = ObjectListParams.none()): ObjectListResponse =
        list(id, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ObjectListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectListResponse

    /** @see list */
    fun list(params: ObjectListParams): ObjectListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(id: String, requestOptions: RequestOptions): ObjectListResponse =
        list(id, ObjectListParams.none(), requestOptions)

    /**
     * Permanently deletes a document from the vault including all associated vectors, chunks, graph
     * data, and the original file. This operation cannot be undone.
     */
    fun delete(objectId: String, params: ObjectDeleteParams): ObjectDeleteResponse =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: ObjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectDeleteResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ObjectDeleteParams): ObjectDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ObjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectDeleteResponse

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
     * Retrieves word-level OCR bounding box data for a processed PDF document. Each word includes
     * its text, normalized bounding box coordinates (0-1 range), confidence score, and global word
     * index. Use this data to highlight specific text ranges in a PDF viewer based on word indices
     * from search results.
     */
    fun getOcrWords(objectId: String, params: ObjectGetOcrWordsParams): ObjectGetOcrWordsResponse =
        getOcrWords(objectId, params, RequestOptions.none())

    /** @see getOcrWords */
    fun getOcrWords(
        objectId: String,
        params: ObjectGetOcrWordsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGetOcrWordsResponse =
        getOcrWords(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getOcrWords */
    fun getOcrWords(params: ObjectGetOcrWordsParams): ObjectGetOcrWordsResponse =
        getOcrWords(params, RequestOptions.none())

    /** @see getOcrWords */
    fun getOcrWords(
        params: ObjectGetOcrWordsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGetOcrWordsResponse

    /** Get the status of a CaseMark summary workflow job. */
    fun getSummarizeJob(
        jobId: String,
        params: ObjectGetSummarizeJobParams,
    ): ObjectGetSummarizeJobResponse = getSummarizeJob(jobId, params, RequestOptions.none())

    /** @see getSummarizeJob */
    fun getSummarizeJob(
        jobId: String,
        params: ObjectGetSummarizeJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGetSummarizeJobResponse =
        getSummarizeJob(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see getSummarizeJob */
    fun getSummarizeJob(params: ObjectGetSummarizeJobParams): ObjectGetSummarizeJobResponse =
        getSummarizeJob(params, RequestOptions.none())

    /** @see getSummarizeJob */
    fun getSummarizeJob(
        params: ObjectGetSummarizeJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGetSummarizeJobResponse

    /**
     * Retrieves the full extracted text content from a processed vault object. Returns the
     * concatenated text from all chunks, useful for document review, analysis, or export. The
     * object must have completed processing before text can be retrieved.
     */
    fun getText(objectId: String, params: ObjectGetTextParams): ObjectGetTextResponse =
        getText(objectId, params, RequestOptions.none())

    /** @see getText */
    fun getText(
        objectId: String,
        params: ObjectGetTextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGetTextResponse =
        getText(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getText */
    fun getText(params: ObjectGetTextParams): ObjectGetTextResponse =
        getText(params, RequestOptions.none())

    /** @see getText */
    fun getText(
        params: ObjectGetTextParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ObjectGetTextResponse

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
        fun retrieve(
            objectId: String,
            params: ObjectRetrieveParams,
        ): HttpResponseFor<ObjectRetrieveResponse> =
            retrieve(objectId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            objectId: String,
            params: ObjectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectRetrieveResponse> =
            retrieve(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ObjectRetrieveParams): HttpResponseFor<ObjectRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ObjectRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectRetrieveResponse>

        /**
         * Returns a raw HTTP response for `patch /vault/{id}/objects/{objectId}`, but is otherwise
         * the same as [ObjectService.update].
         */
        @MustBeClosed
        fun update(
            objectId: String,
            params: ObjectUpdateParams,
        ): HttpResponseFor<ObjectUpdateResponse> = update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: ObjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectUpdateResponse> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ObjectUpdateParams): HttpResponseFor<ObjectUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ObjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /vault/{id}/objects`, but is otherwise the same as
         * [ObjectService.list].
         */
        @MustBeClosed
        fun list(id: String): HttpResponseFor<ObjectListResponse> =
            list(id, ObjectListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: ObjectListParams = ObjectListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectListResponse> =
            list(params.toBuilder().id(id).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            id: String,
            params: ObjectListParams = ObjectListParams.none(),
        ): HttpResponseFor<ObjectListResponse> = list(id, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ObjectListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: ObjectListParams): HttpResponseFor<ObjectListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(id: String, requestOptions: RequestOptions): HttpResponseFor<ObjectListResponse> =
            list(id, ObjectListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /vault/{id}/objects/{objectId}`, but is otherwise
         * the same as [ObjectService.delete].
         */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: ObjectDeleteParams,
        ): HttpResponseFor<ObjectDeleteResponse> = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: ObjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectDeleteResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ObjectDeleteParams): HttpResponseFor<ObjectDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ObjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectDeleteResponse>

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
         * Returns a raw HTTP response for `get /vault/{id}/objects/{objectId}/ocr-words`, but is
         * otherwise the same as [ObjectService.getOcrWords].
         */
        @MustBeClosed
        fun getOcrWords(
            objectId: String,
            params: ObjectGetOcrWordsParams,
        ): HttpResponseFor<ObjectGetOcrWordsResponse> =
            getOcrWords(objectId, params, RequestOptions.none())

        /** @see getOcrWords */
        @MustBeClosed
        fun getOcrWords(
            objectId: String,
            params: ObjectGetOcrWordsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGetOcrWordsResponse> =
            getOcrWords(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getOcrWords */
        @MustBeClosed
        fun getOcrWords(
            params: ObjectGetOcrWordsParams
        ): HttpResponseFor<ObjectGetOcrWordsResponse> = getOcrWords(params, RequestOptions.none())

        /** @see getOcrWords */
        @MustBeClosed
        fun getOcrWords(
            params: ObjectGetOcrWordsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGetOcrWordsResponse>

        /**
         * Returns a raw HTTP response for `get /vault/{id}/objects/{objectId}/summarize/{jobId}`,
         * but is otherwise the same as [ObjectService.getSummarizeJob].
         */
        @MustBeClosed
        fun getSummarizeJob(
            jobId: String,
            params: ObjectGetSummarizeJobParams,
        ): HttpResponseFor<ObjectGetSummarizeJobResponse> =
            getSummarizeJob(jobId, params, RequestOptions.none())

        /** @see getSummarizeJob */
        @MustBeClosed
        fun getSummarizeJob(
            jobId: String,
            params: ObjectGetSummarizeJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGetSummarizeJobResponse> =
            getSummarizeJob(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see getSummarizeJob */
        @MustBeClosed
        fun getSummarizeJob(
            params: ObjectGetSummarizeJobParams
        ): HttpResponseFor<ObjectGetSummarizeJobResponse> =
            getSummarizeJob(params, RequestOptions.none())

        /** @see getSummarizeJob */
        @MustBeClosed
        fun getSummarizeJob(
            params: ObjectGetSummarizeJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGetSummarizeJobResponse>

        /**
         * Returns a raw HTTP response for `get /vault/{id}/objects/{objectId}/text`, but is
         * otherwise the same as [ObjectService.getText].
         */
        @MustBeClosed
        fun getText(
            objectId: String,
            params: ObjectGetTextParams,
        ): HttpResponseFor<ObjectGetTextResponse> = getText(objectId, params, RequestOptions.none())

        /** @see getText */
        @MustBeClosed
        fun getText(
            objectId: String,
            params: ObjectGetTextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGetTextResponse> =
            getText(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getText */
        @MustBeClosed
        fun getText(params: ObjectGetTextParams): HttpResponseFor<ObjectGetTextResponse> =
            getText(params, RequestOptions.none())

        /** @see getText */
        @MustBeClosed
        fun getText(
            params: ObjectGetTextParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ObjectGetTextResponse>
    }
}
