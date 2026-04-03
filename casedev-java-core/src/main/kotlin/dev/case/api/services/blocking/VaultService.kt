// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.vault.VaultConfirmUploadParams
import dev.case.api.models.vault.VaultConfirmUploadResponse
import dev.case.api.models.vault.VaultCreateParams
import dev.case.api.models.vault.VaultCreateResponse
import dev.case.api.models.vault.VaultDeleteParams
import dev.case.api.models.vault.VaultDeleteResponse
import dev.case.api.models.vault.VaultIngestParams
import dev.case.api.models.vault.VaultIngestResponse
import dev.case.api.models.vault.VaultListParams
import dev.case.api.models.vault.VaultListResponse
import dev.case.api.models.vault.VaultRetrieveParams
import dev.case.api.models.vault.VaultRetrieveResponse
import dev.case.api.models.vault.VaultSearchParams
import dev.case.api.models.vault.VaultSearchResponse
import dev.case.api.models.vault.VaultUpdateParams
import dev.case.api.models.vault.VaultUpdateResponse
import dev.case.api.models.vault.VaultUploadParams
import dev.case.api.models.vault.VaultUploadResponse
import dev.case.api.services.blocking.vault.EventService
import dev.case.api.services.blocking.vault.GraphragService
import dev.case.api.services.blocking.vault.GroupService
import dev.case.api.services.blocking.vault.MemoryService
import dev.case.api.services.blocking.vault.MultipartService
import dev.case.api.services.blocking.vault.ObjectService
import java.util.function.Consumer

/** Secure document storage with semantic search and GraphRAG */
interface VaultService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VaultService

    fun events(): EventService

    /** Secure document storage with semantic search and GraphRAG */
    fun graphrag(): GraphragService

    /** Secure document storage with semantic search and GraphRAG */
    fun groups(): GroupService

    /** Secure document storage with semantic search and GraphRAG */
    fun multipart(): MultipartService

    /** Secure document storage with semantic search and GraphRAG */
    fun objects(): ObjectService

    /** Secure document storage with semantic search and GraphRAG */
    fun memory(): MemoryService

    /**
     * Creates a new secure vault with dedicated S3 storage and vector search capabilities. Each
     * vault provides isolated document storage with semantic search, OCR processing, and optional
     * GraphRAG knowledge graph features for legal document analysis and discovery.
     */
    fun create(params: VaultCreateParams): VaultCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VaultCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultCreateResponse

    /**
     * Retrieve detailed information about a specific vault, including storage configuration,
     * chunking strategy, and usage statistics. Returns vault metadata, bucket information, and
     * vector storage details.
     */
    fun retrieve(id: String): VaultRetrieveResponse = retrieve(id, VaultRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VaultRetrieveParams = VaultRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VaultRetrieveParams = VaultRetrieveParams.none(),
    ): VaultRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VaultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: VaultRetrieveParams): VaultRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): VaultRetrieveResponse =
        retrieve(id, VaultRetrieveParams.none(), requestOptions)

    /**
     * Update vault settings including name, description, and enableGraph. Changing enableGraph only
     * affects future document uploads - existing documents retain their current graph/non-graph
     * state.
     */
    fun update(id: String): VaultUpdateResponse = update(id, VaultUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: VaultUpdateParams = VaultUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: VaultUpdateParams = VaultUpdateParams.none(),
    ): VaultUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VaultUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultUpdateResponse

    /** @see update */
    fun update(params: VaultUpdateParams): VaultUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): VaultUpdateResponse =
        update(id, VaultUpdateParams.none(), requestOptions)

    /**
     * List all vaults for the authenticated organization. Returns vault metadata including name,
     * description, storage configuration, and usage statistics.
     */
    fun list(): VaultListResponse = list(VaultListParams.none())

    /** @see list */
    fun list(
        params: VaultListParams = VaultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultListResponse

    /** @see list */
    fun list(params: VaultListParams = VaultListParams.none()): VaultListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): VaultListResponse =
        list(VaultListParams.none(), requestOptions)

    /**
     * Permanently deletes a vault and all its contents including documents, vectors, graph data,
     * and S3 buckets. This operation cannot be undone. For large vaults, use the async=true query
     * parameter to queue deletion in the background.
     */
    fun delete(id: String): VaultDeleteResponse = delete(id, VaultDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: VaultDeleteParams = VaultDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultDeleteResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: VaultDeleteParams = VaultDeleteParams.none(),
    ): VaultDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VaultDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultDeleteResponse

    /** @see delete */
    fun delete(params: VaultDeleteParams): VaultDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): VaultDeleteResponse =
        delete(id, VaultDeleteParams.none(), requestOptions)

    /**
     * Confirm whether a direct-to-S3 vault upload succeeded or failed. This endpoint emits
     * vault.upload.completed or vault.upload.failed events and is idempotent for repeated
     * confirmations.
     */
    fun confirmUpload(
        objectId: String,
        params: VaultConfirmUploadParams,
    ): VaultConfirmUploadResponse = confirmUpload(objectId, params, RequestOptions.none())

    /** @see confirmUpload */
    fun confirmUpload(
        objectId: String,
        params: VaultConfirmUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultConfirmUploadResponse =
        confirmUpload(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see confirmUpload */
    fun confirmUpload(params: VaultConfirmUploadParams): VaultConfirmUploadResponse =
        confirmUpload(params, RequestOptions.none())

    /** @see confirmUpload */
    fun confirmUpload(
        params: VaultConfirmUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultConfirmUploadResponse

    /**
     * Triggers ingestion workflow for a vault object to extract text, generate chunks, and create
     * embeddings. For supported file types (PDF, DOCX, PPTX, TXT, RTF, XML, ZIP, audio, video),
     * processing happens asynchronously. ZIP archives are unpacked recursively up to 5 levels, and
     * each extracted file is created as an independent vault object and ingested via the normal
     * pipeline. For unsupported types (images, etc.), the file is marked as completed immediately
     * without text extraction. GraphRAG indexing must be triggered separately via POST
     * /vault/:id/graphrag/:objectId.
     */
    fun ingest(objectId: String, params: VaultIngestParams): VaultIngestResponse =
        ingest(objectId, params, RequestOptions.none())

    /** @see ingest */
    fun ingest(
        objectId: String,
        params: VaultIngestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultIngestResponse = ingest(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see ingest */
    fun ingest(params: VaultIngestParams): VaultIngestResponse =
        ingest(params, RequestOptions.none())

    /** @see ingest */
    fun ingest(
        params: VaultIngestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultIngestResponse

    /**
     * Search across vault documents using multiple methods including hybrid vector + graph search,
     * GraphRAG global search, entity-based search, and fast similarity search. Returns relevant
     * documents and contextual answers based on the search method.
     */
    fun search(id: String, params: VaultSearchParams): VaultSearchResponse =
        search(id, params, RequestOptions.none())

    /** @see search */
    fun search(
        id: String,
        params: VaultSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultSearchResponse = search(params.toBuilder().id(id).build(), requestOptions)

    /** @see search */
    fun search(params: VaultSearchParams): VaultSearchResponse =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: VaultSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultSearchResponse

    /**
     * Generate a presigned URL for uploading files directly to a vault's S3 storage. After
     * uploading to S3, confirm the upload result via POST /vault/:vaultId/upload/:objectId/confirm
     * before triggering ingestion.
     */
    fun upload(id: String, params: VaultUploadParams): VaultUploadResponse =
        upload(id, params, RequestOptions.none())

    /** @see upload */
    fun upload(
        id: String,
        params: VaultUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultUploadResponse = upload(params.toBuilder().id(id).build(), requestOptions)

    /** @see upload */
    fun upload(params: VaultUploadParams): VaultUploadResponse =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: VaultUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaultUploadResponse

    /** A view of [VaultService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VaultService.WithRawResponse

        fun events(): EventService.WithRawResponse

        /** Secure document storage with semantic search and GraphRAG */
        fun graphrag(): GraphragService.WithRawResponse

        /** Secure document storage with semantic search and GraphRAG */
        fun groups(): GroupService.WithRawResponse

        /** Secure document storage with semantic search and GraphRAG */
        fun multipart(): MultipartService.WithRawResponse

        /** Secure document storage with semantic search and GraphRAG */
        fun objects(): ObjectService.WithRawResponse

        /** Secure document storage with semantic search and GraphRAG */
        fun memory(): MemoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /vault`, but is otherwise the same as
         * [VaultService.create].
         */
        @MustBeClosed
        fun create(params: VaultCreateParams): HttpResponseFor<VaultCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: VaultCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultCreateResponse>

        /**
         * Returns a raw HTTP response for `get /vault/{id}`, but is otherwise the same as
         * [VaultService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<VaultRetrieveResponse> =
            retrieve(id, VaultRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VaultRetrieveParams = VaultRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VaultRetrieveParams = VaultRetrieveParams.none(),
        ): HttpResponseFor<VaultRetrieveResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VaultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: VaultRetrieveParams): HttpResponseFor<VaultRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VaultRetrieveResponse> =
            retrieve(id, VaultRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /vault/{id}`, but is otherwise the same as
         * [VaultService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<VaultUpdateResponse> =
            update(id, VaultUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: VaultUpdateParams = VaultUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: VaultUpdateParams = VaultUpdateParams.none(),
        ): HttpResponseFor<VaultUpdateResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: VaultUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: VaultUpdateParams): HttpResponseFor<VaultUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VaultUpdateResponse> =
            update(id, VaultUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /vault`, but is otherwise the same as
         * [VaultService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<VaultListResponse> = list(VaultListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VaultListParams = VaultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: VaultListParams = VaultListParams.none()
        ): HttpResponseFor<VaultListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VaultListResponse> =
            list(VaultListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /vault/{id}`, but is otherwise the same as
         * [VaultService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<VaultDeleteResponse> =
            delete(id, VaultDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: VaultDeleteParams = VaultDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: VaultDeleteParams = VaultDeleteParams.none(),
        ): HttpResponseFor<VaultDeleteResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: VaultDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: VaultDeleteParams): HttpResponseFor<VaultDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VaultDeleteResponse> =
            delete(id, VaultDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /vault/{id}/upload/{objectId}/confirm`, but is
         * otherwise the same as [VaultService.confirmUpload].
         */
        @MustBeClosed
        fun confirmUpload(
            objectId: String,
            params: VaultConfirmUploadParams,
        ): HttpResponseFor<VaultConfirmUploadResponse> =
            confirmUpload(objectId, params, RequestOptions.none())

        /** @see confirmUpload */
        @MustBeClosed
        fun confirmUpload(
            objectId: String,
            params: VaultConfirmUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultConfirmUploadResponse> =
            confirmUpload(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see confirmUpload */
        @MustBeClosed
        fun confirmUpload(
            params: VaultConfirmUploadParams
        ): HttpResponseFor<VaultConfirmUploadResponse> =
            confirmUpload(params, RequestOptions.none())

        /** @see confirmUpload */
        @MustBeClosed
        fun confirmUpload(
            params: VaultConfirmUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultConfirmUploadResponse>

        /**
         * Returns a raw HTTP response for `post /vault/{id}/ingest/{objectId}`, but is otherwise
         * the same as [VaultService.ingest].
         */
        @MustBeClosed
        fun ingest(
            objectId: String,
            params: VaultIngestParams,
        ): HttpResponseFor<VaultIngestResponse> = ingest(objectId, params, RequestOptions.none())

        /** @see ingest */
        @MustBeClosed
        fun ingest(
            objectId: String,
            params: VaultIngestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultIngestResponse> =
            ingest(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see ingest */
        @MustBeClosed
        fun ingest(params: VaultIngestParams): HttpResponseFor<VaultIngestResponse> =
            ingest(params, RequestOptions.none())

        /** @see ingest */
        @MustBeClosed
        fun ingest(
            params: VaultIngestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultIngestResponse>

        /**
         * Returns a raw HTTP response for `post /vault/{id}/search`, but is otherwise the same as
         * [VaultService.search].
         */
        @MustBeClosed
        fun search(id: String, params: VaultSearchParams): HttpResponseFor<VaultSearchResponse> =
            search(id, params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            id: String,
            params: VaultSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultSearchResponse> =
            search(params.toBuilder().id(id).build(), requestOptions)

        /** @see search */
        @MustBeClosed
        fun search(params: VaultSearchParams): HttpResponseFor<VaultSearchResponse> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: VaultSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultSearchResponse>

        /**
         * Returns a raw HTTP response for `post /vault/{id}/upload`, but is otherwise the same as
         * [VaultService.upload].
         */
        @MustBeClosed
        fun upload(id: String, params: VaultUploadParams): HttpResponseFor<VaultUploadResponse> =
            upload(id, params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            id: String,
            params: VaultUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultUploadResponse> =
            upload(params.toBuilder().id(id).build(), requestOptions)

        /** @see upload */
        @MustBeClosed
        fun upload(params: VaultUploadParams): HttpResponseFor<VaultUploadResponse> =
            upload(params, RequestOptions.none())

        /** @see upload */
        @MustBeClosed
        fun upload(
            params: VaultUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaultUploadResponse>
    }
}
