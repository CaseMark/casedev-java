// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.operator

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.operator.v1.V1CreateChatCompletionParams
import dev.case.api.models.operator.v1.V1CreateParams
import dev.case.api.models.operator.v1.V1CreateResponseParams
import dev.case.api.models.operator.v1.V1GetStatusParams
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

    /** Provision a new operator instance for the organization. */
    fun create(params: V1CreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: V1CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Proxy a chat completion request to the organization's operator instance. */
    fun createChatCompletion(): CompletableFuture<Void?> =
        createChatCompletion(V1CreateChatCompletionParams.none())

    /** @see createChatCompletion */
    fun createChatCompletion(
        params: V1CreateChatCompletionParams = V1CreateChatCompletionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see createChatCompletion */
    fun createChatCompletion(
        params: V1CreateChatCompletionParams = V1CreateChatCompletionParams.none()
    ): CompletableFuture<Void?> = createChatCompletion(params, RequestOptions.none())

    /** @see createChatCompletion */
    fun createChatCompletion(requestOptions: RequestOptions): CompletableFuture<Void?> =
        createChatCompletion(V1CreateChatCompletionParams.none(), requestOptions)

    /** Proxy a response request to the organization's operator instance. */
    fun createResponse(): CompletableFuture<Void?> = createResponse(V1CreateResponseParams.none())

    /** @see createResponse */
    fun createResponse(
        params: V1CreateResponseParams = V1CreateResponseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see createResponse */
    fun createResponse(
        params: V1CreateResponseParams = V1CreateResponseParams.none()
    ): CompletableFuture<Void?> = createResponse(params, RequestOptions.none())

    /** @see createResponse */
    fun createResponse(requestOptions: RequestOptions): CompletableFuture<Void?> =
        createResponse(V1CreateResponseParams.none(), requestOptions)

    /** Get the status of the organization's operator instance. */
    fun getStatus(): CompletableFuture<Void?> = getStatus(V1GetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        params: V1GetStatusParams = V1GetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see getStatus */
    fun getStatus(params: V1GetStatusParams = V1GetStatusParams.none()): CompletableFuture<Void?> =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(requestOptions: RequestOptions): CompletableFuture<Void?> =
        getStatus(V1GetStatusParams.none(), requestOptions)

    /** A view of [V1ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /operator/v1/create`, but is otherwise the same as
         * [V1ServiceAsync.create].
         */
        fun create(params: V1CreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: V1CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /operator/v1/chat/completions`, but is otherwise
         * the same as [V1ServiceAsync.createChatCompletion].
         */
        fun createChatCompletion(): CompletableFuture<HttpResponse> =
            createChatCompletion(V1CreateChatCompletionParams.none())

        /** @see createChatCompletion */
        fun createChatCompletion(
            params: V1CreateChatCompletionParams = V1CreateChatCompletionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see createChatCompletion */
        fun createChatCompletion(
            params: V1CreateChatCompletionParams = V1CreateChatCompletionParams.none()
        ): CompletableFuture<HttpResponse> = createChatCompletion(params, RequestOptions.none())

        /** @see createChatCompletion */
        fun createChatCompletion(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            createChatCompletion(V1CreateChatCompletionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /operator/v1/responses`, but is otherwise the same
         * as [V1ServiceAsync.createResponse].
         */
        fun createResponse(): CompletableFuture<HttpResponse> =
            createResponse(V1CreateResponseParams.none())

        /** @see createResponse */
        fun createResponse(
            params: V1CreateResponseParams = V1CreateResponseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see createResponse */
        fun createResponse(
            params: V1CreateResponseParams = V1CreateResponseParams.none()
        ): CompletableFuture<HttpResponse> = createResponse(params, RequestOptions.none())

        /** @see createResponse */
        fun createResponse(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            createResponse(V1CreateResponseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /operator/v1/status`, but is otherwise the same as
         * [V1ServiceAsync.getStatus].
         */
        fun getStatus(): CompletableFuture<HttpResponse> = getStatus(V1GetStatusParams.none())

        /** @see getStatus */
        fun getStatus(
            params: V1GetStatusParams = V1GetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getStatus */
        fun getStatus(
            params: V1GetStatusParams = V1GetStatusParams.none()
        ): CompletableFuture<HttpResponse> = getStatus(params, RequestOptions.none())

        /** @see getStatus */
        fun getStatus(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            getStatus(V1GetStatusParams.none(), requestOptions)
    }
}
