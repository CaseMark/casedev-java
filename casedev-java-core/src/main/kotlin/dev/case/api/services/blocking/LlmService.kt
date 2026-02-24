// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.models.llm.LlmGetConfigParams
import dev.case.api.models.llm.LlmGetConfigResponse
import dev.case.api.services.blocking.llm.V1Service
import java.util.function.Consumer

interface LlmService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlmService

    fun v1(): V1Service

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
    fun getConfig(): LlmGetConfigResponse = getConfig(LlmGetConfigParams.none())

    /** @see getConfig */
    fun getConfig(
        params: LlmGetConfigParams = LlmGetConfigParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LlmGetConfigResponse

    /** @see getConfig */
    fun getConfig(params: LlmGetConfigParams = LlmGetConfigParams.none()): LlmGetConfigResponse =
        getConfig(params, RequestOptions.none())

    /** @see getConfig */
    fun getConfig(requestOptions: RequestOptions): LlmGetConfigResponse =
        getConfig(LlmGetConfigParams.none(), requestOptions)

    /** A view of [LlmService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LlmService.WithRawResponse

        fun v1(): V1Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /llm/config`, but is otherwise the same as
         * [LlmService.getConfig].
         */
        @MustBeClosed
        fun getConfig(): HttpResponseFor<LlmGetConfigResponse> =
            getConfig(LlmGetConfigParams.none())

        /** @see getConfig */
        @MustBeClosed
        fun getConfig(
            params: LlmGetConfigParams = LlmGetConfigParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LlmGetConfigResponse>

        /** @see getConfig */
        @MustBeClosed
        fun getConfig(
            params: LlmGetConfigParams = LlmGetConfigParams.none()
        ): HttpResponseFor<LlmGetConfigResponse> = getConfig(params, RequestOptions.none())

        /** @see getConfig */
        @MustBeClosed
        fun getConfig(requestOptions: RequestOptions): HttpResponseFor<LlmGetConfigResponse> =
            getConfig(LlmGetConfigParams.none(), requestOptions)
    }
}
