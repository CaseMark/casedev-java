// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async.vault

import dev.case.core.ClientOptions
import dev.case.core.RequestOptions
import dev.case.core.checkRequired
import dev.case.core.handlers.errorBodyHandler
import dev.case.core.handlers.errorHandler
import dev.case.core.handlers.jsonHandler
import dev.case.core.http.HttpMethod
import dev.case.core.http.HttpRequest
import dev.case.core.http.HttpResponse
import dev.case.core.http.HttpResponse.Handler
import dev.case.core.http.HttpResponseFor
import dev.case.core.http.json
import dev.case.core.http.parseable
import dev.case.core.prepareAsync
import dev.case.models.vault.graphrag.GraphragGetStatsParams
import dev.case.models.vault.graphrag.GraphragGetStatsResponse
import dev.case.models.vault.graphrag.GraphragInitParams
import dev.case.models.vault.graphrag.GraphragInitResponse
import dev.case.models.vault.graphrag.GraphragProcessObjectParams
import dev.case.models.vault.graphrag.GraphragProcessObjectResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GraphragServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GraphragServiceAsync {

    private val withRawResponse: GraphragServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GraphragServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GraphragServiceAsync =
        GraphragServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getStats(
        params: GraphragGetStatsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GraphragGetStatsResponse> =
        // get /vault/{id}/graphrag/stats
        withRawResponse().getStats(params, requestOptions).thenApply { it.parse() }

    override fun init(
        params: GraphragInitParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GraphragInitResponse> =
        // post /vault/{id}/graphrag/init
        withRawResponse().init(params, requestOptions).thenApply { it.parse() }

    override fun processObject(
        params: GraphragProcessObjectParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<GraphragProcessObjectResponse> =
        // post /vault/{id}/graphrag/{objectId}
        withRawResponse().processObject(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GraphragServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GraphragServiceAsync.WithRawResponse =
            GraphragServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getStatsHandler: Handler<GraphragGetStatsResponse> =
            jsonHandler<GraphragGetStatsResponse>(clientOptions.jsonMapper)

        override fun getStats(
            params: GraphragGetStatsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GraphragGetStatsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0), "graphrag", "stats")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getStatsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val initHandler: Handler<GraphragInitResponse> =
            jsonHandler<GraphragInitResponse>(clientOptions.jsonMapper)

        override fun init(
            params: GraphragInitParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GraphragInitResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0), "graphrag", "init")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { initHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val processObjectHandler: Handler<GraphragProcessObjectResponse> =
            jsonHandler<GraphragProcessObjectResponse>(clientOptions.jsonMapper)

        override fun processObject(
            params: GraphragProcessObjectParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<GraphragProcessObjectResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "vault",
                        params._pathParam(0),
                        "graphrag",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { processObjectHandler.handle(it) }
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
