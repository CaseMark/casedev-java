// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.vault

import com.google.errorprone.annotations.MustBeClosed
import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponseFor
import com.router.api.models.vault.graphrag.GraphragGetStatsParams
import com.router.api.models.vault.graphrag.GraphragGetStatsResponse
import com.router.api.models.vault.graphrag.GraphragInitParams
import com.router.api.models.vault.graphrag.GraphragInitResponse
import com.router.api.models.vault.graphrag.GraphragProcessObjectParams
import com.router.api.models.vault.graphrag.GraphragProcessObjectResponse
import java.util.function.Consumer

interface GraphragService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GraphragService

    /**
     * Retrieve GraphRAG (Graph Retrieval-Augmented Generation) statistics for a specific vault.
     * This includes metrics about the knowledge graph structure, entity relationships, and
     * processing status that enable advanced semantic search and AI-powered document analysis.
     */
    fun getStats(id: String): GraphragGetStatsResponse = getStats(id, GraphragGetStatsParams.none())

    /** @see getStats */
    fun getStats(
        id: String,
        params: GraphragGetStatsParams = GraphragGetStatsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GraphragGetStatsResponse = getStats(params.toBuilder().id(id).build(), requestOptions)

    /** @see getStats */
    fun getStats(
        id: String,
        params: GraphragGetStatsParams = GraphragGetStatsParams.none(),
    ): GraphragGetStatsResponse = getStats(id, params, RequestOptions.none())

    /** @see getStats */
    fun getStats(
        params: GraphragGetStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GraphragGetStatsResponse

    /** @see getStats */
    fun getStats(params: GraphragGetStatsParams): GraphragGetStatsResponse =
        getStats(params, RequestOptions.none())

    /** @see getStats */
    fun getStats(id: String, requestOptions: RequestOptions): GraphragGetStatsResponse =
        getStats(id, GraphragGetStatsParams.none(), requestOptions)

    /**
     * Initialize a GraphRAG workspace for a vault to enable advanced knowledge graph and
     * retrieval-augmented generation capabilities. This creates the necessary infrastructure for
     * semantic document analysis and graph-based querying within the vault.
     */
    fun init(id: String): GraphragInitResponse = init(id, GraphragInitParams.none())

    /** @see init */
    fun init(
        id: String,
        params: GraphragInitParams = GraphragInitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GraphragInitResponse = init(params.toBuilder().id(id).build(), requestOptions)

    /** @see init */
    fun init(
        id: String,
        params: GraphragInitParams = GraphragInitParams.none(),
    ): GraphragInitResponse = init(id, params, RequestOptions.none())

    /** @see init */
    fun init(
        params: GraphragInitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GraphragInitResponse

    /** @see init */
    fun init(params: GraphragInitParams): GraphragInitResponse = init(params, RequestOptions.none())

    /** @see init */
    fun init(id: String, requestOptions: RequestOptions): GraphragInitResponse =
        init(id, GraphragInitParams.none(), requestOptions)

    /**
     * Manually trigger GraphRAG indexing for a vault object. The object must already be ingested
     * (completed status). This extracts entities, relationships, and communities from the document
     * for advanced knowledge graph queries.
     */
    fun processObject(
        objectId: String,
        params: GraphragProcessObjectParams,
    ): GraphragProcessObjectResponse = processObject(objectId, params, RequestOptions.none())

    /** @see processObject */
    fun processObject(
        objectId: String,
        params: GraphragProcessObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GraphragProcessObjectResponse =
        processObject(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see processObject */
    fun processObject(params: GraphragProcessObjectParams): GraphragProcessObjectResponse =
        processObject(params, RequestOptions.none())

    /** @see processObject */
    fun processObject(
        params: GraphragProcessObjectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GraphragProcessObjectResponse

    /** A view of [GraphragService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GraphragService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /vault/{id}/graphrag/stats`, but is otherwise the
         * same as [GraphragService.getStats].
         */
        @MustBeClosed
        fun getStats(id: String): HttpResponseFor<GraphragGetStatsResponse> =
            getStats(id, GraphragGetStatsParams.none())

        /** @see getStats */
        @MustBeClosed
        fun getStats(
            id: String,
            params: GraphragGetStatsParams = GraphragGetStatsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GraphragGetStatsResponse> =
            getStats(params.toBuilder().id(id).build(), requestOptions)

        /** @see getStats */
        @MustBeClosed
        fun getStats(
            id: String,
            params: GraphragGetStatsParams = GraphragGetStatsParams.none(),
        ): HttpResponseFor<GraphragGetStatsResponse> = getStats(id, params, RequestOptions.none())

        /** @see getStats */
        @MustBeClosed
        fun getStats(
            params: GraphragGetStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GraphragGetStatsResponse>

        /** @see getStats */
        @MustBeClosed
        fun getStats(params: GraphragGetStatsParams): HttpResponseFor<GraphragGetStatsResponse> =
            getStats(params, RequestOptions.none())

        /** @see getStats */
        @MustBeClosed
        fun getStats(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GraphragGetStatsResponse> =
            getStats(id, GraphragGetStatsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /vault/{id}/graphrag/init`, but is otherwise the
         * same as [GraphragService.init].
         */
        @MustBeClosed
        fun init(id: String): HttpResponseFor<GraphragInitResponse> =
            init(id, GraphragInitParams.none())

        /** @see init */
        @MustBeClosed
        fun init(
            id: String,
            params: GraphragInitParams = GraphragInitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GraphragInitResponse> =
            init(params.toBuilder().id(id).build(), requestOptions)

        /** @see init */
        @MustBeClosed
        fun init(
            id: String,
            params: GraphragInitParams = GraphragInitParams.none(),
        ): HttpResponseFor<GraphragInitResponse> = init(id, params, RequestOptions.none())

        /** @see init */
        @MustBeClosed
        fun init(
            params: GraphragInitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GraphragInitResponse>

        /** @see init */
        @MustBeClosed
        fun init(params: GraphragInitParams): HttpResponseFor<GraphragInitResponse> =
            init(params, RequestOptions.none())

        /** @see init */
        @MustBeClosed
        fun init(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GraphragInitResponse> =
            init(id, GraphragInitParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /vault/{id}/graphrag/{objectId}`, but is otherwise
         * the same as [GraphragService.processObject].
         */
        @MustBeClosed
        fun processObject(
            objectId: String,
            params: GraphragProcessObjectParams,
        ): HttpResponseFor<GraphragProcessObjectResponse> =
            processObject(objectId, params, RequestOptions.none())

        /** @see processObject */
        @MustBeClosed
        fun processObject(
            objectId: String,
            params: GraphragProcessObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GraphragProcessObjectResponse> =
            processObject(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see processObject */
        @MustBeClosed
        fun processObject(
            params: GraphragProcessObjectParams
        ): HttpResponseFor<GraphragProcessObjectResponse> =
            processObject(params, RequestOptions.none())

        /** @see processObject */
        @MustBeClosed
        fun processObject(
            params: GraphragProcessObjectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GraphragProcessObjectResponse>
    }
}
