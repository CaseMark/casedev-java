// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.memory

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.checkRequired
import dev.case.api.core.handlers.errorBodyHandler
import dev.case.api.core.handlers.errorHandler
import dev.case.api.core.handlers.jsonHandler
import dev.case.api.core.http.HttpMethod
import dev.case.api.core.http.HttpRequest
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.json
import dev.case.api.core.http.parseable
import dev.case.api.core.prepareAsync
import dev.case.api.models.memory.v1.V1CreateParams
import dev.case.api.models.memory.v1.V1CreateResponse
import dev.case.api.models.memory.v1.V1DeleteAllParams
import dev.case.api.models.memory.v1.V1DeleteAllResponse
import dev.case.api.models.memory.v1.V1DeleteParams
import dev.case.api.models.memory.v1.V1DeleteResponse
import dev.case.api.models.memory.v1.V1ListParams
import dev.case.api.models.memory.v1.V1ListResponse
import dev.case.api.models.memory.v1.V1RetrieveParams
import dev.case.api.models.memory.v1.V1RetrieveResponse
import dev.case.api.models.memory.v1.V1SearchParams
import dev.case.api.models.memory.v1.V1SearchResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Persistent memory for AI agents with semantic search and 12 generic indexed tag fields */
class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: V1CreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1CreateResponse> =
        // post /memory/v1
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: V1RetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1RetrieveResponse> =
        // get /memory/v1/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: V1ListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1ListResponse> =
        // get /memory/v1
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: V1DeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1DeleteResponse> =
        // delete /memory/v1/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun deleteAll(
        params: V1DeleteAllParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1DeleteAllResponse> =
        // delete /memory/v1
        withRawResponse().deleteAll(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: V1SearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1SearchResponse> =
        // post /memory/v1/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<V1CreateResponse> =
            jsonHandler<V1CreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: V1CreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1CreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("memory", "v1")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<V1RetrieveResponse> =
            jsonHandler<V1RetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: V1RetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1RetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("memory", "v1", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<V1ListResponse> =
            jsonHandler<V1ListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: V1ListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1ListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("memory", "v1")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<V1DeleteResponse> =
            jsonHandler<V1DeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: V1DeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1DeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("memory", "v1", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteAllHandler: Handler<V1DeleteAllResponse> =
            jsonHandler<V1DeleteAllResponse>(clientOptions.jsonMapper)

        override fun deleteAll(
            params: V1DeleteAllParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1DeleteAllResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("memory", "v1")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteAllHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val searchHandler: Handler<V1SearchResponse> =
            jsonHandler<V1SearchResponse>(clientOptions.jsonMapper)

        override fun search(
            params: V1SearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1SearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("memory", "v1", "search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
