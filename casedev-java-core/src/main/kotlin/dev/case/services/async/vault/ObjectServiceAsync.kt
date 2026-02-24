// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async.vault

import dev.case.core.ClientOptions
import dev.case.core.RequestOptions
import dev.case.core.http.HttpResponse
import dev.case.core.http.HttpResponseFor
import dev.case.models.vault.objects.ObjectCreatePresignedUrlParams
import dev.case.models.vault.objects.ObjectCreatePresignedUrlResponse
import dev.case.models.vault.objects.ObjectDeleteParams
import dev.case.models.vault.objects.ObjectDeleteResponse
import dev.case.models.vault.objects.ObjectDownloadParams
import dev.case.models.vault.objects.ObjectGetOcrWordsParams
import dev.case.models.vault.objects.ObjectGetOcrWordsResponse
import dev.case.models.vault.objects.ObjectGetSummarizeJobParams
import dev.case.models.vault.objects.ObjectGetSummarizeJobResponse
import dev.case.models.vault.objects.ObjectGetTextParams
import dev.case.models.vault.objects.ObjectGetTextResponse
import dev.case.models.vault.objects.ObjectListParams
import dev.case.models.vault.objects.ObjectListResponse
import dev.case.models.vault.objects.ObjectRetrieveParams
import dev.case.models.vault.objects.ObjectRetrieveResponse
import dev.case.models.vault.objects.ObjectUpdateParams
import dev.case.models.vault.objects.ObjectUpdateResponse
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
     * Update a document's filename, path, or metadata. Use this to rename files or organize them
     * into virtual folders. The path is stored in metadata.path and can be used to build folder
     * hierarchies in your application.
     */
    fun update(
        objectId: String,
        params: ObjectUpdateParams,
    ): CompletableFuture<ObjectUpdateResponse> = update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: ObjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectUpdateResponse> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: ObjectUpdateParams): CompletableFuture<ObjectUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ObjectUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectUpdateResponse>

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
     * Permanently deletes a document from the vault including all associated vectors, chunks, graph
     * data, and the original file. This operation cannot be undone.
     */
    fun delete(
        objectId: String,
        params: ObjectDeleteParams,
    ): CompletableFuture<ObjectDeleteResponse> = delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: ObjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectDeleteResponse> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ObjectDeleteParams): CompletableFuture<ObjectDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ObjectDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectDeleteResponse>

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
    fun download(objectId: String, params: ObjectDownloadParams): CompletableFuture<HttpResponse> =
        download(objectId, params, RequestOptions.none())

    /** @see download */
    fun download(
        objectId: String,
        params: ObjectDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        download(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see download */
    fun download(params: ObjectDownloadParams): CompletableFuture<HttpResponse> =
        download(params, RequestOptions.none())

    /** @see download */
    fun download(
        params: ObjectDownloadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /**
     * Retrieves word-level OCR bounding box data for a processed PDF document. Each word includes
     * its text, normalized bounding box coordinates (0-1 range), confidence score, and global word
     * index. Use this data to highlight specific text ranges in a PDF viewer based on word indices
     * from search results.
     */
    fun getOcrWords(
        objectId: String,
        params: ObjectGetOcrWordsParams,
    ): CompletableFuture<ObjectGetOcrWordsResponse> =
        getOcrWords(objectId, params, RequestOptions.none())

    /** @see getOcrWords */
    fun getOcrWords(
        objectId: String,
        params: ObjectGetOcrWordsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectGetOcrWordsResponse> =
        getOcrWords(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getOcrWords */
    fun getOcrWords(params: ObjectGetOcrWordsParams): CompletableFuture<ObjectGetOcrWordsResponse> =
        getOcrWords(params, RequestOptions.none())

    /** @see getOcrWords */
    fun getOcrWords(
        params: ObjectGetOcrWordsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectGetOcrWordsResponse>

    /** Get the status of a CaseMark summary workflow job. */
    fun getSummarizeJob(
        jobId: String,
        params: ObjectGetSummarizeJobParams,
    ): CompletableFuture<ObjectGetSummarizeJobResponse> =
        getSummarizeJob(jobId, params, RequestOptions.none())

    /** @see getSummarizeJob */
    fun getSummarizeJob(
        jobId: String,
        params: ObjectGetSummarizeJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectGetSummarizeJobResponse> =
        getSummarizeJob(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see getSummarizeJob */
    fun getSummarizeJob(
        params: ObjectGetSummarizeJobParams
    ): CompletableFuture<ObjectGetSummarizeJobResponse> =
        getSummarizeJob(params, RequestOptions.none())

    /** @see getSummarizeJob */
    fun getSummarizeJob(
        params: ObjectGetSummarizeJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectGetSummarizeJobResponse>

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
         * Returns a raw HTTP response for `patch /vault/{id}/objects/{objectId}`, but is otherwise
         * the same as [ObjectServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: ObjectUpdateParams,
        ): CompletableFuture<HttpResponseFor<ObjectUpdateResponse>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: ObjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectUpdateResponse>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(
            params: ObjectUpdateParams
        ): CompletableFuture<HttpResponseFor<ObjectUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ObjectUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectUpdateResponse>>

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
         * Returns a raw HTTP response for `delete /vault/{id}/objects/{objectId}`, but is otherwise
         * the same as [ObjectServiceAsync.delete].
         */
        fun delete(
            objectId: String,
            params: ObjectDeleteParams,
        ): CompletableFuture<HttpResponseFor<ObjectDeleteResponse>> =
            delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: ObjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectDeleteResponse>> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: ObjectDeleteParams
        ): CompletableFuture<HttpResponseFor<ObjectDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ObjectDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectDeleteResponse>>

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
        ): CompletableFuture<HttpResponse> = download(objectId, params, RequestOptions.none())

        /** @see download */
        fun download(
            objectId: String,
            params: ObjectDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            download(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see download */
        fun download(params: ObjectDownloadParams): CompletableFuture<HttpResponse> =
            download(params, RequestOptions.none())

        /** @see download */
        fun download(
            params: ObjectDownloadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /vault/{id}/objects/{objectId}/ocr-words`, but is
         * otherwise the same as [ObjectServiceAsync.getOcrWords].
         */
        fun getOcrWords(
            objectId: String,
            params: ObjectGetOcrWordsParams,
        ): CompletableFuture<HttpResponseFor<ObjectGetOcrWordsResponse>> =
            getOcrWords(objectId, params, RequestOptions.none())

        /** @see getOcrWords */
        fun getOcrWords(
            objectId: String,
            params: ObjectGetOcrWordsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectGetOcrWordsResponse>> =
            getOcrWords(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getOcrWords */
        fun getOcrWords(
            params: ObjectGetOcrWordsParams
        ): CompletableFuture<HttpResponseFor<ObjectGetOcrWordsResponse>> =
            getOcrWords(params, RequestOptions.none())

        /** @see getOcrWords */
        fun getOcrWords(
            params: ObjectGetOcrWordsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectGetOcrWordsResponse>>

        /**
         * Returns a raw HTTP response for `get /vault/{id}/objects/{objectId}/summarize/{jobId}`,
         * but is otherwise the same as [ObjectServiceAsync.getSummarizeJob].
         */
        fun getSummarizeJob(
            jobId: String,
            params: ObjectGetSummarizeJobParams,
        ): CompletableFuture<HttpResponseFor<ObjectGetSummarizeJobResponse>> =
            getSummarizeJob(jobId, params, RequestOptions.none())

        /** @see getSummarizeJob */
        fun getSummarizeJob(
            jobId: String,
            params: ObjectGetSummarizeJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectGetSummarizeJobResponse>> =
            getSummarizeJob(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see getSummarizeJob */
        fun getSummarizeJob(
            params: ObjectGetSummarizeJobParams
        ): CompletableFuture<HttpResponseFor<ObjectGetSummarizeJobResponse>> =
            getSummarizeJob(params, RequestOptions.none())

        /** @see getSummarizeJob */
        fun getSummarizeJob(
            params: ObjectGetSummarizeJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectGetSummarizeJobResponse>>

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
