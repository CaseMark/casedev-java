// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.operator

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.handlers.emptyHandler
import dev.case.api.core.handlers.errorBodyHandler
import dev.case.api.core.handlers.errorHandler
import dev.case.api.core.http.HttpMethod
import dev.case.api.core.http.HttpRequest
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler
import dev.case.api.core.http.json
import dev.case.api.core.http.parseable
import dev.case.api.core.prepare
import dev.case.api.models.operator.v1.V1CreateChatCompletionParams
import dev.case.api.models.operator.v1.V1CreateParams
import dev.case.api.models.operator.v1.V1CreateResponseParams
import dev.case.api.models.operator.v1.V1GetStatusParams
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: V1CreateParams, requestOptions: RequestOptions) {
        // post /operator/v1/create
        withRawResponse().create(params, requestOptions)
    }

    override fun createChatCompletion(
        params: V1CreateChatCompletionParams,
        requestOptions: RequestOptions,
    ) {
        // post /operator/v1/chat/completions
        withRawResponse().createChatCompletion(params, requestOptions)
    }

    override fun createResponse(params: V1CreateResponseParams, requestOptions: RequestOptions) {
        // post /operator/v1/responses
        withRawResponse().createResponse(params, requestOptions)
    }

    override fun getStatus(params: V1GetStatusParams, requestOptions: RequestOptions) {
        // get /operator/v1/status
        withRawResponse().getStatus(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(params: V1CreateParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("operator", "v1", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val createChatCompletionHandler: Handler<Void?> = emptyHandler()

        override fun createChatCompletion(
            params: V1CreateChatCompletionParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("operator", "v1", "chat", "completions")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createChatCompletionHandler.handle(it) }
            }
        }

        private val createResponseHandler: Handler<Void?> = emptyHandler()

        override fun createResponse(
            params: V1CreateResponseParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("operator", "v1", "responses")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createResponseHandler.handle(it) }
            }
        }

        private val getStatusHandler: Handler<Void?> = emptyHandler()

        override fun getStatus(
            params: V1GetStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("operator", "v1", "status")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getStatusHandler.handle(it) }
            }
        }
    }
}
