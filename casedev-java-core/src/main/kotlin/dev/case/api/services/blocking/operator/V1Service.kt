// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.operator

import com.google.errorprone.annotations.MustBeClosed
import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.http.HttpResponse
import dev.case.api.models.operator.v1.V1CreateChatCompletionParams
import dev.case.api.models.operator.v1.V1CreateParams
import dev.case.api.models.operator.v1.V1CreateResponseParams
import dev.case.api.models.operator.v1.V1GetStatusParams
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

    /** Provision a new operator instance for the organization. */
    fun create(params: V1CreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: V1CreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** Proxy a chat completion request to the organization's operator instance. */
    fun createChatCompletion() = createChatCompletion(V1CreateChatCompletionParams.none())

    /** @see createChatCompletion */
    fun createChatCompletion(
        params: V1CreateChatCompletionParams = V1CreateChatCompletionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see createChatCompletion */
    fun createChatCompletion(
        params: V1CreateChatCompletionParams = V1CreateChatCompletionParams.none()
    ) = createChatCompletion(params, RequestOptions.none())

    /** @see createChatCompletion */
    fun createChatCompletion(requestOptions: RequestOptions) =
        createChatCompletion(V1CreateChatCompletionParams.none(), requestOptions)

    /** Proxy a response request to the organization's operator instance. */
    fun createResponse() = createResponse(V1CreateResponseParams.none())

    /** @see createResponse */
    fun createResponse(
        params: V1CreateResponseParams = V1CreateResponseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see createResponse */
    fun createResponse(params: V1CreateResponseParams = V1CreateResponseParams.none()) =
        createResponse(params, RequestOptions.none())

    /** @see createResponse */
    fun createResponse(requestOptions: RequestOptions) =
        createResponse(V1CreateResponseParams.none(), requestOptions)

    /** Get the status of the organization's operator instance. */
    fun getStatus() = getStatus(V1GetStatusParams.none())

    /** @see getStatus */
    fun getStatus(
        params: V1GetStatusParams = V1GetStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see getStatus */
    fun getStatus(params: V1GetStatusParams = V1GetStatusParams.none()) =
        getStatus(params, RequestOptions.none())

    /** @see getStatus */
    fun getStatus(requestOptions: RequestOptions) =
        getStatus(V1GetStatusParams.none(), requestOptions)

    /** A view of [V1Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /operator/v1/create`, but is otherwise the same as
         * [V1Service.create].
         */
        @MustBeClosed
        fun create(params: V1CreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: V1CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /operator/v1/chat/completions`, but is otherwise
         * the same as [V1Service.createChatCompletion].
         */
        @MustBeClosed
        fun createChatCompletion(): HttpResponse =
            createChatCompletion(V1CreateChatCompletionParams.none())

        /** @see createChatCompletion */
        @MustBeClosed
        fun createChatCompletion(
            params: V1CreateChatCompletionParams = V1CreateChatCompletionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createChatCompletion */
        @MustBeClosed
        fun createChatCompletion(
            params: V1CreateChatCompletionParams = V1CreateChatCompletionParams.none()
        ): HttpResponse = createChatCompletion(params, RequestOptions.none())

        /** @see createChatCompletion */
        @MustBeClosed
        fun createChatCompletion(requestOptions: RequestOptions): HttpResponse =
            createChatCompletion(V1CreateChatCompletionParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /operator/v1/responses`, but is otherwise the same
         * as [V1Service.createResponse].
         */
        @MustBeClosed
        fun createResponse(): HttpResponse = createResponse(V1CreateResponseParams.none())

        /** @see createResponse */
        @MustBeClosed
        fun createResponse(
            params: V1CreateResponseParams = V1CreateResponseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createResponse */
        @MustBeClosed
        fun createResponse(
            params: V1CreateResponseParams = V1CreateResponseParams.none()
        ): HttpResponse = createResponse(params, RequestOptions.none())

        /** @see createResponse */
        @MustBeClosed
        fun createResponse(requestOptions: RequestOptions): HttpResponse =
            createResponse(V1CreateResponseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /operator/v1/status`, but is otherwise the same as
         * [V1Service.getStatus].
         */
        @MustBeClosed fun getStatus(): HttpResponse = getStatus(V1GetStatusParams.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(
            params: V1GetStatusParams = V1GetStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(params: V1GetStatusParams = V1GetStatusParams.none()): HttpResponse =
            getStatus(params, RequestOptions.none())

        /** @see getStatus */
        @MustBeClosed
        fun getStatus(requestOptions: RequestOptions): HttpResponse =
            getStatus(V1GetStatusParams.none(), requestOptions)
    }
}
