// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.llm

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.llm.v1.V1CreateEmbeddingParams
import dev.case.api.models.llm.v1.V1CreateEmbeddingResponse
import dev.case.api.models.llm.v1.V1ListModelsParams
import dev.case.api.models.llm.v1.V1ListModelsResponse
import dev.case.api.services.blocking.llm.v1.ChatService
import java.util.function.Consumer

interface V1Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service

    fun chat(): ChatService

    /**
     * Create vector embeddings from text using OpenAI-compatible models. Perfect for semantic
     * search, document similarity, and building RAG systems for legal documents.
     */
    fun createEmbedding(params: V1CreateEmbeddingParams): V1CreateEmbeddingResponse =
        createEmbedding(params, RequestOptions.none())

    /** @see createEmbedding */
    fun createEmbedding(
        params: V1CreateEmbeddingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1CreateEmbeddingResponse

    /**
     * Retrieve a list of all available language models from 40+ providers including OpenAI,
     * Anthropic, Google, and Case.dev's specialized legal models. Returns OpenAI-compatible model
     * metadata with pricing information.
     *
     * This endpoint is compatible with OpenAI's models API format, making it easy to integrate with
     * existing applications.
     */
    fun listModels(): V1ListModelsResponse = listModels(V1ListModelsParams.none())

    /** @see listModels */
    fun listModels(
        params: V1ListModelsParams = V1ListModelsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ListModelsResponse

    /** @see listModels */
    fun listModels(params: V1ListModelsParams = V1ListModelsParams.none()): V1ListModelsResponse =
        listModels(params, RequestOptions.none())

    /** @see listModels */
    fun listModels(requestOptions: RequestOptions): V1ListModelsResponse =
        listModels(V1ListModelsParams.none(), requestOptions)

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        fun chat(): ChatService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /llm/v1/embeddings`, but is otherwise the same as
         * [V1Service.createEmbedding].
         */
        @MustBeClosed
        fun createEmbedding(
            params: V1CreateEmbeddingParams
        ): HttpResponseFor<V1CreateEmbeddingResponse> =
            createEmbedding(params, RequestOptions.none())

        /** @see createEmbedding */
        @MustBeClosed
        fun createEmbedding(
            params: V1CreateEmbeddingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1CreateEmbeddingResponse>

        /**
         * Returns a raw HTTP response for `get /llm/v1/models`, but is otherwise the same as
         * [V1Service.listModels].
         */
        @MustBeClosed
        fun listModels(): HttpResponseFor<V1ListModelsResponse> =
            listModels(V1ListModelsParams.none())

        /** @see listModels */
        @MustBeClosed
        fun listModels(
            params: V1ListModelsParams = V1ListModelsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V1ListModelsResponse>

        /** @see listModels */
        @MustBeClosed
        fun listModels(
            params: V1ListModelsParams = V1ListModelsParams.none()
        ): HttpResponseFor<V1ListModelsResponse> = listModels(params, RequestOptions.none())

        /** @see listModels */
        @MustBeClosed
        fun listModels(requestOptions: RequestOptions): HttpResponseFor<V1ListModelsResponse> =
            listModels(V1ListModelsParams.none(), requestOptions)
    }
}
