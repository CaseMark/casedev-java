// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.llm

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponse
import dev.casedev.models.llm.v1.V1CreateEmbeddingParams
import dev.casedev.models.llm.v1.V1ListModelsParams
import dev.casedev.services.async.llm.v1.ChatServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V1ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync

    fun chat(): ChatServiceAsync

    /**
     * Create vector embeddings from text using OpenAI-compatible models. Perfect for semantic
     * search, document similarity, and building RAG systems for legal documents.
     */
    fun createEmbedding(params: V1CreateEmbeddingParams): CompletableFuture<Void?> =
        createEmbedding(params, RequestOptions.none())

    /** @see createEmbedding */
    fun createEmbedding(
        params: V1CreateEmbeddingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Retrieve a list of all available language models from 40+ providers including OpenAI,
     * Anthropic, Google, and Case.dev's specialized legal models. Returns OpenAI-compatible model
     * metadata with pricing information.
     *
     * This endpoint is compatible with OpenAI's models API format, making it easy to integrate with
     * existing applications.
     */
    fun listModels(): CompletableFuture<Void?> = listModels(V1ListModelsParams.none())

    /** @see listModels */
    fun listModels(
        params: V1ListModelsParams = V1ListModelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see listModels */
    fun listModels(
        params: V1ListModelsParams = V1ListModelsParams.none()
    ): CompletableFuture<Void?> = listModels(params, RequestOptions.none())

    /** @see listModels */
    fun listModels(requestOptions: RequestOptions): CompletableFuture<Void?> =
        listModels(V1ListModelsParams.none(), requestOptions)

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        fun chat(): ChatServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /llm/v1/embeddings`, but is otherwise the same as
         * [V1ServiceAsync.createEmbedding].
         */
        fun createEmbedding(params: V1CreateEmbeddingParams): CompletableFuture<HttpResponse> =
            createEmbedding(params, RequestOptions.none())

        /** @see createEmbedding */
        fun createEmbedding(
            params: V1CreateEmbeddingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /llm/v1/models`, but is otherwise the same as
         * [V1ServiceAsync.listModels].
         */
        fun listModels(): CompletableFuture<HttpResponse> = listModels(V1ListModelsParams.none())

        /** @see listModels */
        fun listModels(
            params: V1ListModelsParams = V1ListModelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listModels */
        fun listModels(
            params: V1ListModelsParams = V1ListModelsParams.none()
        ): CompletableFuture<HttpResponse> = listModels(params, RequestOptions.none())

        /** @see listModels */
        fun listModels(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            listModels(V1ListModelsParams.none(), requestOptions)
    }
}
