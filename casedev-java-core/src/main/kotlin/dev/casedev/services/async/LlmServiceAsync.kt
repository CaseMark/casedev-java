// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.models.llm.LlmGetConfigParams
import dev.casedev.models.llm.LlmGetConfigResponse
import dev.casedev.services.async.llm.V1ServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LlmServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlmServiceAsync

    fun v1(): V1ServiceAsync

    /**
     * Retrieves the AI Gateway configuration including all available language models and their
     * specifications. This endpoint returns model information compatible with the Vercel AI SDK
     * Gateway format, making it easy to integrate with existing AI applications.
     *
     * Use this endpoint to:
     * - Discover available language models
     * - Get model specifications and pricing
     * - Configure AI SDK clients
     * - Build model selection interfaces
     */
    fun getConfig(): CompletableFuture<LlmGetConfigResponse> = getConfig(LlmGetConfigParams.none())

    /** @see getConfig */
    fun getConfig(
        params: LlmGetConfigParams = LlmGetConfigParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LlmGetConfigResponse>

    /** @see getConfig */
    fun getConfig(
        params: LlmGetConfigParams = LlmGetConfigParams.none()
    ): CompletableFuture<LlmGetConfigResponse> = getConfig(params, RequestOptions.none())

    /** @see getConfig */
    fun getConfig(requestOptions: RequestOptions): CompletableFuture<LlmGetConfigResponse> =
        getConfig(LlmGetConfigParams.none(), requestOptions)

    /** A view of [LlmServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlmServiceAsync.WithRawResponse

        fun v1(): V1ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /llm/config`, but is otherwise the same as
         * [LlmServiceAsync.getConfig].
         */
        fun getConfig(): CompletableFuture<HttpResponseFor<LlmGetConfigResponse>> =
            getConfig(LlmGetConfigParams.none())

        /** @see getConfig */
        fun getConfig(
            params: LlmGetConfigParams = LlmGetConfigParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LlmGetConfigResponse>>

        /** @see getConfig */
        fun getConfig(
            params: LlmGetConfigParams = LlmGetConfigParams.none()
        ): CompletableFuture<HttpResponseFor<LlmGetConfigResponse>> =
            getConfig(params, RequestOptions.none())

        /** @see getConfig */
        fun getConfig(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LlmGetConfigResponse>> =
            getConfig(LlmGetConfigParams.none(), requestOptions)
    }
}
