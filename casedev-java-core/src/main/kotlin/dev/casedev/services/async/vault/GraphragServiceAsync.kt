// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.vault

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.vault.graphrag.GraphragGetStatsParams
import dev.casedev.models.vault.graphrag.GraphragInitParams
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
    fun getStats(id: String): CompletableFuture<Void?> = getStats(id, GraphragGetStatsParams.none())

    /** @see getStats */
    fun getStats(
        id: String,
        params: GraphragGetStatsParams = GraphragGetStatsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = getStats(params.toBuilder().id(id).build(), requestOptions)

    /** @see getStats */
    fun getStats(
        id: String,
        params: GraphragGetStatsParams = GraphragGetStatsParams.none(),
    ): CompletableFuture<Void?> = getStats(id, params, RequestOptions.none())

    /** @see getStats */
    fun getStats(
        params: GraphragGetStatsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see getStats */
    fun getStats(params: GraphragGetStatsParams): CompletableFuture<Void?> =
        getStats(params, RequestOptions.none())

    /** @see getStats */
    fun getStats(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        getStats(id, GraphragGetStatsParams.none(), requestOptions)

    /**
     * Initialize a GraphRAG workspace for a vault to enable advanced knowledge graph and
     * retrieval-augmented generation capabilities. This creates the necessary infrastructure for
     * semantic document analysis and graph-based querying within the vault.
     */
    fun init(id: String): CompletableFuture<Void?> = init(id, GraphragInitParams.none())

    /** @see init */
    fun init(
        id: String,
        params: GraphragInitParams = GraphragInitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = init(params.toBuilder().id(id).build(), requestOptions)

    /** @see init */
    fun init(
        id: String,
        params: GraphragInitParams = GraphragInitParams.none(),
    ): CompletableFuture<Void?> = init(id, params, RequestOptions.none())

    /** @see init */
    fun init(
        params: GraphragInitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see init */
    fun init(params: GraphragInitParams): CompletableFuture<Void?> =
        init(params, RequestOptions.none())

    /** @see init */
    fun init(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        init(id, GraphragInitParams.none(), requestOptions)

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
        fun getStats(id: String): CompletableFuture<HttpResponse> =
            getStats(id, GraphragGetStatsParams.none())

        /** @see getStats */
        fun getStats(
            id: String,
            params: GraphragGetStatsParams = GraphragGetStatsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getStats(params.toBuilder().id(id).build(), requestOptions)

        /** @see getStats */
        fun getStats(
            id: String,
            params: GraphragGetStatsParams = GraphragGetStatsParams.none(),
        ): CompletableFuture<HttpResponse> = getStats(id, params, RequestOptions.none())

        /** @see getStats */
        fun getStats(
            params: GraphragGetStatsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getStats */
        fun getStats(params: GraphragGetStatsParams): CompletableFuture<HttpResponse> =
            getStats(params, RequestOptions.none())

        /** @see getStats */
        fun getStats(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getStats(id, GraphragGetStatsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /vault/{id}/graphrag/init`, but is otherwise the
         * same as [GraphragServiceAsync.init].
         */
        fun init(id: String): CompletableFuture<HttpResponse> = init(id, GraphragInitParams.none())

        /** @see init */
        fun init(
            id: String,
            params: GraphragInitParams = GraphragInitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> = init(params.toBuilder().id(id).build(), requestOptions)

        /** @see init */
        fun init(
            id: String,
            params: GraphragInitParams = GraphragInitParams.none(),
        ): CompletableFuture<HttpResponse> = init(id, params, RequestOptions.none())

        /** @see init */
        fun init(
            params: GraphragInitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see init */
        fun init(params: GraphragInitParams): CompletableFuture<HttpResponse> =
            init(params, RequestOptions.none())

        /** @see init */
        fun init(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            init(id, GraphragInitParams.none(), requestOptions)
    }
}
