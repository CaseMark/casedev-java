// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.llm

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.http.HttpResponseFor
import com.router.api.models.llm.v1.V1CreateEmbeddingParams
import com.router.api.models.llm.v1.V1CreateEmbeddingResponse
import com.router.api.models.llm.v1.V1ListModelsParams
import com.router.api.models.llm.v1.V1ListModelsResponse
import com.router.api.services.async.llm.v1.ChatServiceAsync
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
    fun createEmbedding(
        params: V1CreateEmbeddingParams
    ): CompletableFuture<V1CreateEmbeddingResponse> = createEmbedding(params, RequestOptions.none())

    /** @see createEmbedding */
    fun createEmbedding(
        params: V1CreateEmbeddingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CreateEmbeddingResponse>

    /**
     * Retrieve a list of all available language models from 40+ providers including OpenAI,
     * Anthropic, Google, and Case.dev's specialized legal models. Returns OpenAI-compatible model
     * metadata with pricing information.
     *
     * This endpoint is compatible with OpenAI's models API format, making it easy to integrate with
     * existing applications.
     */
    fun listModels(): CompletableFuture<V1ListModelsResponse> =
        listModels(V1ListModelsParams.none())

    /** @see listModels */
    fun listModels(
        params: V1ListModelsParams = V1ListModelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1ListModelsResponse>

    /** @see listModels */
    fun listModels(
        params: V1ListModelsParams = V1ListModelsParams.none()
    ): CompletableFuture<V1ListModelsResponse> = listModels(params, RequestOptions.none())

    /** @see listModels */
    fun listModels(requestOptions: RequestOptions): CompletableFuture<V1ListModelsResponse> =
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
        fun createEmbedding(
            params: V1CreateEmbeddingParams
        ): CompletableFuture<HttpResponseFor<V1CreateEmbeddingResponse>> =
            createEmbedding(params, RequestOptions.none())

        /** @see createEmbedding */
        fun createEmbedding(
            params: V1CreateEmbeddingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1CreateEmbeddingResponse>>

        /**
         * Returns a raw HTTP response for `get /llm/v1/models`, but is otherwise the same as
         * [V1ServiceAsync.listModels].
         */
        fun listModels(): CompletableFuture<HttpResponseFor<V1ListModelsResponse>> =
            listModels(V1ListModelsParams.none())

        /** @see listModels */
        fun listModels(
            params: V1ListModelsParams = V1ListModelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V1ListModelsResponse>>

        /** @see listModels */
        fun listModels(
            params: V1ListModelsParams = V1ListModelsParams.none()
        ): CompletableFuture<HttpResponseFor<V1ListModelsResponse>> =
            listModels(params, RequestOptions.none())

        /** @see listModels */
        fun listModels(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<V1ListModelsResponse>> =
            listModels(V1ListModelsParams.none(), requestOptions)
    }
}
