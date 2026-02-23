// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.vault

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponseFor
import com.router.api.models.vault.graphrag.GraphragGetStatsParams
import com.router.api.models.vault.graphrag.GraphragGetStatsResponse
import com.router.api.models.vault.graphrag.GraphragInitParams
import com.router.api.models.vault.graphrag.GraphragInitResponse
import com.router.api.models.vault.graphrag.GraphragProcessObjectParams
import com.router.api.models.vault.graphrag.GraphragProcessObjectResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GraphragServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GraphragServiceAsync

    /**
     * Retrieve GraphRAG (Graph Retrieval-Augmented Generation) statistics for a specific vault.
     * This includes metrics about the knowledge graph structure, entity relationships, and
     * processing status that enable advanced semantic search and AI-powered document analysis.
     */
    fun getStats(id: String): CompletableFuture<GraphragGetStatsResponse> =
        getStats(id, GraphragGetStatsParams.none())

    /** @see getStats */
    fun getStats(
        id: String,
        params: GraphragGetStatsParams = GraphragGetStatsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GraphragGetStatsResponse> =
        getStats(params.toBuilder().id(id).build(), requestOptions)

    /** @see getStats */
    fun getStats(
        id: String,
        params: GraphragGetStatsParams = GraphragGetStatsParams.none(),
    ): CompletableFuture<GraphragGetStatsResponse> = getStats(id, params, RequestOptions.none())

    /** @see getStats */
    fun getStats(
        params: GraphragGetStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GraphragGetStatsResponse>

    /** @see getStats */
    fun getStats(params: GraphragGetStatsParams): CompletableFuture<GraphragGetStatsResponse> =
        getStats(params, RequestOptions.none())

    /** @see getStats */
    fun getStats(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<GraphragGetStatsResponse> =
        getStats(id, GraphragGetStatsParams.none(), requestOptions)

    /**
     * Initialize a GraphRAG workspace for a vault to enable advanced knowledge graph and
     * retrieval-augmented generation capabilities. This creates the necessary infrastructure for
     * semantic document analysis and graph-based querying within the vault.
     */
    fun init(id: String): CompletableFuture<GraphragInitResponse> =
        init(id, GraphragInitParams.none())

    /** @see init */
    fun init(
        id: String,
        params: GraphragInitParams = GraphragInitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GraphragInitResponse> =
        init(params.toBuilder().id(id).build(), requestOptions)

    /** @see init */
    fun init(
        id: String,
        params: GraphragInitParams = GraphragInitParams.none(),
    ): CompletableFuture<GraphragInitResponse> = init(id, params, RequestOptions.none())

    /** @see init */
    fun init(
        params: GraphragInitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GraphragInitResponse>

    /** @see init */
    fun init(params: GraphragInitParams): CompletableFuture<GraphragInitResponse> =
        init(params, RequestOptions.none())

    /** @see init */
    fun init(id: String, requestOptions: RequestOptions): CompletableFuture<GraphragInitResponse> =
        init(id, GraphragInitParams.none(), requestOptions)

    /**
     * Manually trigger GraphRAG indexing for a vault object. The object must already be ingested
     * (completed status). This extracts entities, relationships, and communities from the document
     * for advanced knowledge graph queries.
     */
    fun processObject(
        objectId: String,
        params: GraphragProcessObjectParams,
    ): CompletableFuture<GraphragProcessObjectResponse> =
        processObject(objectId, params, RequestOptions.none())

    /** @see processObject */
    fun processObject(
        objectId: String,
        params: GraphragProcessObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GraphragProcessObjectResponse> =
        processObject(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see processObject */
    fun processObject(
        params: GraphragProcessObjectParams
    ): CompletableFuture<GraphragProcessObjectResponse> =
        processObject(params, RequestOptions.none())

    /** @see processObject */
    fun processObject(
        params: GraphragProcessObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GraphragProcessObjectResponse>

    /**
     * A view of [GraphragServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GraphragServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /vault/{id}/graphrag/stats`, but is otherwise the
         * same as [GraphragServiceAsync.getStats].
         */
        fun getStats(id: String): CompletableFuture<HttpResponseFor<GraphragGetStatsResponse>> =
            getStats(id, GraphragGetStatsParams.none())

        /** @see getStats */
        fun getStats(
            id: String,
            params: GraphragGetStatsParams = GraphragGetStatsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GraphragGetStatsResponse>> =
            getStats(params.toBuilder().id(id).build(), requestOptions)

        /** @see getStats */
        fun getStats(
            id: String,
            params: GraphragGetStatsParams = GraphragGetStatsParams.none(),
        ): CompletableFuture<HttpResponseFor<GraphragGetStatsResponse>> =
            getStats(id, params, RequestOptions.none())

        /** @see getStats */
        fun getStats(
            params: GraphragGetStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GraphragGetStatsResponse>>

        /** @see getStats */
        fun getStats(
            params: GraphragGetStatsParams
        ): CompletableFuture<HttpResponseFor<GraphragGetStatsResponse>> =
            getStats(params, RequestOptions.none())

        /** @see getStats */
        fun getStats(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GraphragGetStatsResponse>> =
            getStats(id, GraphragGetStatsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /vault/{id}/graphrag/init`, but is otherwise the
         * same as [GraphragServiceAsync.init].
         */
        fun init(id: String): CompletableFuture<HttpResponseFor<GraphragInitResponse>> =
            init(id, GraphragInitParams.none())

        /** @see init */
        fun init(
            id: String,
            params: GraphragInitParams = GraphragInitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GraphragInitResponse>> =
            init(params.toBuilder().id(id).build(), requestOptions)

        /** @see init */
        fun init(
            id: String,
            params: GraphragInitParams = GraphragInitParams.none(),
        ): CompletableFuture<HttpResponseFor<GraphragInitResponse>> =
            init(id, params, RequestOptions.none())

        /** @see init */
        fun init(
            params: GraphragInitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GraphragInitResponse>>

        /** @see init */
        fun init(
            params: GraphragInitParams
        ): CompletableFuture<HttpResponseFor<GraphragInitResponse>> =
            init(params, RequestOptions.none())

        /** @see init */
        fun init(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GraphragInitResponse>> =
            init(id, GraphragInitParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /vault/{id}/graphrag/{objectId}`, but is otherwise
         * the same as [GraphragServiceAsync.processObject].
         */
        fun processObject(
            objectId: String,
            params: GraphragProcessObjectParams,
        ): CompletableFuture<HttpResponseFor<GraphragProcessObjectResponse>> =
            processObject(objectId, params, RequestOptions.none())

        /** @see processObject */
        fun processObject(
            objectId: String,
            params: GraphragProcessObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GraphragProcessObjectResponse>> =
            processObject(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see processObject */
        fun processObject(
            params: GraphragProcessObjectParams
        ): CompletableFuture<HttpResponseFor<GraphragProcessObjectResponse>> =
            processObject(params, RequestOptions.none())

        /** @see processObject */
        fun processObject(
            params: GraphragProcessObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GraphragProcessObjectResponse>>
    }
}
