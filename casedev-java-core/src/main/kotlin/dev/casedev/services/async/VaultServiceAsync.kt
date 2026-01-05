// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.vault.VaultCreateParams
import dev.casedev.models.vault.VaultCreateResponse
import dev.casedev.models.vault.VaultIngestParams
import dev.casedev.models.vault.VaultIngestResponse
import dev.casedev.models.vault.VaultListParams
import dev.casedev.models.vault.VaultListResponse
import dev.casedev.models.vault.VaultRetrieveParams
import dev.casedev.models.vault.VaultSearchParams
import dev.casedev.models.vault.VaultSearchResponse
import dev.casedev.models.vault.VaultUploadParams
import dev.casedev.models.vault.VaultUploadResponse
import dev.casedev.services.async.vault.GraphragServiceAsync
import dev.casedev.services.async.vault.ObjectServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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

    fun graphrag(): GraphragServiceAsync

    fun objects(): ObjectServiceAsync

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
    fun retrieve(id: String): CompletableFuture<Void?> = retrieve(id, VaultRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VaultRetrieveParams = VaultRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VaultRetrieveParams = VaultRetrieveParams.none(),
    ): CompletableFuture<Void?> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VaultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see retrieve */
    fun retrieve(params: VaultRetrieveParams): CompletableFuture<Void?> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        retrieve(id, VaultRetrieveParams.none(), requestOptions)

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
     * Triggers OCR ingestion workflow for a vault object to extract text, generate chunks, and
     * create embeddings. Processing happens asynchronously. GraphRAG indexing must be triggered
     * separately via POST /vault/:id/graphrag/:objectId. Returns immediately with workflow tracking
     * information.
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
     * Generate a presigned URL for uploading files directly to a vault's S3 storage. This endpoint
     * creates a temporary upload URL that allows secure file uploads without exposing credentials.
     * Files can be automatically indexed for semantic search or stored for manual processing.
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

        fun graphrag(): GraphragServiceAsync.WithRawResponse

        fun objects(): ObjectServiceAsync.WithRawResponse

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
        fun retrieve(id: String): CompletableFuture<HttpResponse> =
            retrieve(id, VaultRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: VaultRetrieveParams = VaultRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: VaultRetrieveParams = VaultRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: VaultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see retrieve */
        fun retrieve(params: VaultRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            retrieve(id, VaultRetrieveParams.none(), requestOptions)

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
