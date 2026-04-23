// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async

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
import dev.case.api.services.async.vault.EventServiceAsync
import dev.case.api.services.async.vault.GraphragServiceAsync
import dev.case.api.services.async.vault.GroupServiceAsync
import dev.case.api.services.async.vault.MemoryServiceAsync
import dev.case.api.services.async.vault.MultipartServiceAsync
import dev.case.api.services.async.vault.ObjectServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Secure document storage with semantic search and GraphRAG */
interface VaultServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VaultServiceAsync

    fun events(): EventServiceAsync

    /** Secure document storage with semantic search and GraphRAG */
    fun graphrag(): GraphragServiceAsync

    /** Secure document storage with semantic search and GraphRAG */
    fun groups(): GroupServiceAsync

    /** Secure document storage with semantic search and GraphRAG */
    fun multipart(): MultipartServiceAsync

    /** Secure document storage with semantic search and GraphRAG */
    fun objects(): ObjectServiceAsync

    /** Secure document storage with semantic search and GraphRAG */
    fun memory(): MemoryServiceAsync

    /**
     * Creates a new secure vault with dedicated S3 storage and vector search capabilities. Each
     * vault provides isolated document storage with semantic search, OCR processing, and optional
     * GraphRAG knowledge graph features for legal document analysis and discovery.
     */
    fun create(params: VaultCreateParams): CompletableFuture<VaultCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: VaultCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultCreateResponse>

    /**
     * Retrieve detailed information about a specific vault, including storage configuration,
     * chunking strategy, and usage statistics. Returns vault metadata, bucket information, and
     * vector storage details.
     */
    fun retrieve(id: String): CompletableFuture<VaultRetrieveResponse> =
        retrieve(id, VaultRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VaultRetrieveParams = VaultRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VaultRetrieveParams = VaultRetrieveParams.none(),
    ): CompletableFuture<VaultRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VaultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: VaultRetrieveParams): CompletableFuture<VaultRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VaultRetrieveResponse> =
        retrieve(id, VaultRetrieveParams.none(), requestOptions)

    /**
     * Update vault settings including name, description, and enableGraph. Changing enableGraph only
     * affects future document uploads - existing documents retain their current graph/non-graph
     * state.
     */
    fun update(id: String): CompletableFuture<VaultUpdateResponse> =
        update(id, VaultUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: VaultUpdateParams = VaultUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: VaultUpdateParams = VaultUpdateParams.none(),
    ): CompletableFuture<VaultUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: VaultUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultUpdateResponse>

    /** @see update */
    fun update(params: VaultUpdateParams): CompletableFuture<VaultUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<VaultUpdateResponse> =
        update(id, VaultUpdateParams.none(), requestOptions)

    /**
     * List all vaults for the authenticated organization. Returns vault metadata including name,
     * description, storage configuration, and usage statistics.
     */
    fun list(): CompletableFuture<VaultListResponse> = list(VaultListParams.none())

    /** @see list */
    fun list(
        params: VaultListParams = VaultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultListResponse>

    /** @see list */
    fun list(
        params: VaultListParams = VaultListParams.none()
    ): CompletableFuture<VaultListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<VaultListResponse> =
        list(VaultListParams.none(), requestOptions)

    /**
     * Permanently deletes a vault and all its contents including documents, vectors, graph data,
     * and S3 buckets. This operation cannot be undone. For large vaults, use the async=true query
     * parameter to queue deletion in the background.
     */
    fun delete(id: String): CompletableFuture<VaultDeleteResponse> =
        delete(id, VaultDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: VaultDeleteParams = VaultDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: VaultDeleteParams = VaultDeleteParams.none(),
    ): CompletableFuture<VaultDeleteResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: VaultDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultDeleteResponse>

    /** @see delete */
    fun delete(params: VaultDeleteParams): CompletableFuture<VaultDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<VaultDeleteResponse> =
        delete(id, VaultDeleteParams.none(), requestOptions)

    /**
     * Confirm whether a direct-to-S3 vault upload succeeded or failed. This endpoint emits
     * vault.upload.completed or vault.upload.failed events and is idempotent for repeated
     * confirmations.
     */
    fun confirmUpload(
        objectId: String,
        params: VaultConfirmUploadParams,
    ): CompletableFuture<VaultConfirmUploadResponse> =
        confirmUpload(objectId, params, RequestOptions.none())

    /** @see confirmUpload */
    fun confirmUpload(
        objectId: String,
        params: VaultConfirmUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultConfirmUploadResponse> =
        confirmUpload(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see confirmUpload */
    fun confirmUpload(
        params: VaultConfirmUploadParams
    ): CompletableFuture<VaultConfirmUploadResponse> = confirmUpload(params, RequestOptions.none())

    /** @see confirmUpload */
    fun confirmUpload(
        params: VaultConfirmUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultConfirmUploadResponse>

    /**
     * Triggers ingestion workflow for a vault object to extract text, generate chunks, and create
     * embeddings. For supported file types (PDF, DOCX, PPTX, TXT, RTF, XML, HTML, Markdown,
     * CSV/TSV, JSON/YAML/TOML, common source code files, ZIP, audio, video), processing happens
     * asynchronously. ZIP archives are unpacked recursively up to 5 levels, and each extracted file
     * is created as an independent vault object and ingested via the normal pipeline. For
     * unsupported types (images, etc.), the file is marked as completed immediately without text
     * extraction. GraphRAG indexing must be triggered separately via POST
     * /vault/:id/graphrag/:objectId.
     */
    fun ingest(
        objectId: String,
        params: VaultIngestParams,
    ): CompletableFuture<VaultIngestResponse> = ingest(objectId, params, RequestOptions.none())

    /** @see ingest */
    fun ingest(
        objectId: String,
        params: VaultIngestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultIngestResponse> =
        ingest(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see ingest */
    fun ingest(params: VaultIngestParams): CompletableFuture<VaultIngestResponse> =
        ingest(params, RequestOptions.none())

    /** @see ingest */
    fun ingest(
        params: VaultIngestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultIngestResponse>

    /**
     * Search across vault documents using multiple methods including hybrid vector + graph search,
     * GraphRAG global search, entity-based search, and fast similarity search. Returns relevant
     * documents and contextual answers based on the search method.
     */
    fun search(id: String, params: VaultSearchParams): CompletableFuture<VaultSearchResponse> =
        search(id, params, RequestOptions.none())

    /** @see search */
    fun search(
        id: String,
        params: VaultSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultSearchResponse> =
        search(params.toBuilder().id(id).build(), requestOptions)

    /** @see search */
    fun search(params: VaultSearchParams): CompletableFuture<VaultSearchResponse> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: VaultSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultSearchResponse>

    /**
     * Generate a presigned URL for uploading files directly to a vault's S3 storage. After
     * uploading to S3, confirm the upload result via POST /vault/:vaultId/upload/:objectId/confirm
     * before triggering ingestion.
     */
    fun upload(id: String, params: VaultUploadParams): CompletableFuture<VaultUploadResponse> =
        upload(id, params, RequestOptions.none())

    /** @see upload */
    fun upload(
        id: String,
        params: VaultUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultUploadResponse> =
        upload(params.toBuilder().id(id).build(), requestOptions)

    /** @see upload */
    fun upload(params: VaultUploadParams): CompletableFuture<VaultUploadResponse> =
        upload(params, RequestOptions.none())

    /** @see upload */
    fun upload(
        params: VaultUploadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VaultUploadResponse>

    /** A view of [VaultServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VaultServiceAsync.WithRawResponse

        fun events(): EventServiceAsync.WithRawResponse

        /** Secure document storage with semantic search and GraphRAG */
        fun graphrag(): GraphragServiceAsync.WithRawResponse

        /** Secure document storage with semantic search and GraphRAG */
        fun groups(): GroupServiceAsync.WithRawResponse

        /** Secure document storage with semantic search and GraphRAG */
        fun multipart(): MultipartServiceAsync.WithRawResponse

        /** Secure document storage with semantic search and GraphRAG */
        fun objects(): ObjectServiceAsync.WithRawResponse

        /** Secure document storage with semantic search and GraphRAG */
        fun memory(): MemoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /vault`, but is otherwise the same as
         * [VaultServiceAsync.create].
         */
        fun create(
            params: VaultCreateParams
        ): CompletableFuture<HttpResponseFor<VaultCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: VaultCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /vault/{id}`, but is otherwise the same as
         * [VaultServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<VaultRetrieveResponse>> =
            retrieve(id, VaultRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: VaultRetrieveParams = VaultRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: VaultRetrieveParams = VaultRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<VaultRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VaultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: VaultRetrieveParams
        ): CompletableFuture<HttpResponseFor<VaultRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VaultRetrieveResponse>> =
            retrieve(id, VaultRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /vault/{id}`, but is otherwise the same as
         * [VaultServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<VaultUpdateResponse>> =
            update(id, VaultUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: VaultUpdateParams = VaultUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: VaultUpdateParams = VaultUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<VaultUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: VaultUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultUpdateResponse>>

        /** @see update */
        fun update(
            params: VaultUpdateParams
        ): CompletableFuture<HttpResponseFor<VaultUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VaultUpdateResponse>> =
            update(id, VaultUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /vault`, but is otherwise the same as
         * [VaultServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<VaultListResponse>> =
            list(VaultListParams.none())

        /** @see list */
        fun list(
            params: VaultListParams = VaultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultListResponse>>

        /** @see list */
        fun list(
            params: VaultListParams = VaultListParams.none()
        ): CompletableFuture<HttpResponseFor<VaultListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VaultListResponse>> =
            list(VaultListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /vault/{id}`, but is otherwise the same as
         * [VaultServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<VaultDeleteResponse>> =
            delete(id, VaultDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: VaultDeleteParams = VaultDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: VaultDeleteParams = VaultDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<VaultDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: VaultDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultDeleteResponse>>

        /** @see delete */
        fun delete(
            params: VaultDeleteParams
        ): CompletableFuture<HttpResponseFor<VaultDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VaultDeleteResponse>> =
            delete(id, VaultDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /vault/{id}/upload/{objectId}/confirm`, but is
         * otherwise the same as [VaultServiceAsync.confirmUpload].
         */
        fun confirmUpload(
            objectId: String,
            params: VaultConfirmUploadParams,
        ): CompletableFuture<HttpResponseFor<VaultConfirmUploadResponse>> =
            confirmUpload(objectId, params, RequestOptions.none())

        /** @see confirmUpload */
        fun confirmUpload(
            objectId: String,
            params: VaultConfirmUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultConfirmUploadResponse>> =
            confirmUpload(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see confirmUpload */
        fun confirmUpload(
            params: VaultConfirmUploadParams
        ): CompletableFuture<HttpResponseFor<VaultConfirmUploadResponse>> =
            confirmUpload(params, RequestOptions.none())

        /** @see confirmUpload */
        fun confirmUpload(
            params: VaultConfirmUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultConfirmUploadResponse>>

        /**
         * Returns a raw HTTP response for `post /vault/{id}/ingest/{objectId}`, but is otherwise
         * the same as [VaultServiceAsync.ingest].
         */
        fun ingest(
            objectId: String,
            params: VaultIngestParams,
        ): CompletableFuture<HttpResponseFor<VaultIngestResponse>> =
            ingest(objectId, params, RequestOptions.none())

        /** @see ingest */
        fun ingest(
            objectId: String,
            params: VaultIngestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultIngestResponse>> =
            ingest(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see ingest */
        fun ingest(
            params: VaultIngestParams
        ): CompletableFuture<HttpResponseFor<VaultIngestResponse>> =
            ingest(params, RequestOptions.none())

        /** @see ingest */
        fun ingest(
            params: VaultIngestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultIngestResponse>>

        /**
         * Returns a raw HTTP response for `post /vault/{id}/search`, but is otherwise the same as
         * [VaultServiceAsync.search].
         */
        fun search(
            id: String,
            params: VaultSearchParams,
        ): CompletableFuture<HttpResponseFor<VaultSearchResponse>> =
            search(id, params, RequestOptions.none())

        /** @see search */
        fun search(
            id: String,
            params: VaultSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultSearchResponse>> =
            search(params.toBuilder().id(id).build(), requestOptions)

        /** @see search */
        fun search(
            params: VaultSearchParams
        ): CompletableFuture<HttpResponseFor<VaultSearchResponse>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: VaultSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultSearchResponse>>

        /**
         * Returns a raw HTTP response for `post /vault/{id}/upload`, but is otherwise the same as
         * [VaultServiceAsync.upload].
         */
        fun upload(
            id: String,
            params: VaultUploadParams,
        ): CompletableFuture<HttpResponseFor<VaultUploadResponse>> =
            upload(id, params, RequestOptions.none())

        /** @see upload */
        fun upload(
            id: String,
            params: VaultUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultUploadResponse>> =
            upload(params.toBuilder().id(id).build(), requestOptions)

        /** @see upload */
        fun upload(
            params: VaultUploadParams
        ): CompletableFuture<HttpResponseFor<VaultUploadResponse>> =
            upload(params, RequestOptions.none())

        /** @see upload */
        fun upload(
            params: VaultUploadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VaultUploadResponse>>
    }
}
