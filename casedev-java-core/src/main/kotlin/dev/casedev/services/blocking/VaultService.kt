// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.vault.VaultCreateParams
import dev.casedev.models.vault.VaultCreateResponse
import dev.casedev.models.vault.VaultIngestParams
import dev.casedev.models.vault.VaultIngestResponse
import dev.casedev.models.vault.VaultRetrieveParams
import dev.casedev.models.vault.VaultSearchParams
import dev.casedev.models.vault.VaultSearchResponse
import dev.casedev.models.vault.VaultUploadParams
import dev.casedev.models.vault.VaultUploadResponse
import dev.casedev.services.blocking.vault.GraphragService
import dev.casedev.services.blocking.vault.ObjectService
import java.util.function.Consumer

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

    fun graphrag(): GraphragService

    fun objects(): ObjectService

    /**
     * Creates a new secure vault with dedicated S3 storage and vector search capabilities. Each
     * vault provides isolated document storage with semantic search, OCR processing, and optional
     * knowledge graph features for legal document analysis and discovery.
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
    fun retrieve(id: String) = retrieve(id, VaultRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VaultRetrieveParams = VaultRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: VaultRetrieveParams = VaultRetrieveParams.none()) =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VaultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(params: VaultRetrieveParams) = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, VaultRetrieveParams.none(), requestOptions)

    /**
     * Triggers OCR ingestion workflow for a vault object to extract text, generate chunks, and
     * create embeddings. Processing happens asynchronously with GraphRAG support if enabled on the
     * vault. Returns immediately with workflow tracking information.
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
     * Generate a presigned URL for uploading files directly to a vault's S3 storage. This endpoint
     * creates a temporary upload URL that allows secure file uploads without exposing credentials.
     * Files can be automatically indexed for semantic search or stored for manual processing.
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

        fun graphrag(): GraphragService.WithRawResponse

        fun objects(): ObjectService.WithRawResponse

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
        fun retrieve(id: String): HttpResponse = retrieve(id, VaultRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VaultRetrieveParams = VaultRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VaultRetrieveParams = VaultRetrieveParams.none(),
        ): HttpResponse = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VaultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: VaultRetrieveParams): HttpResponse =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, VaultRetrieveParams.none(), requestOptions)

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
