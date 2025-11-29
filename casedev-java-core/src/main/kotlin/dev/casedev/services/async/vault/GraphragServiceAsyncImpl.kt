// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.vault

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.checkRequired
import dev.casedev.core.handlers.emptyHandler
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.json
import dev.casedev.core.http.parseable
import dev.casedev.core.prepareAsync
import dev.casedev.models.vault.graphrag.GraphragGetStatsParams
import dev.casedev.models.vault.graphrag.GraphragInitParams
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
    ): CompletableFuture<Void?> =
        // get /vault/{id}/graphrag/stats
        withRawResponse().getStats(params, requestOptions).thenAccept {}

    override fun init(
        params: GraphragInitParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /vault/{id}/graphrag/init
        withRawResponse().init(params, requestOptions).thenAccept {}

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

        private val getStatsHandler: Handler<Void?> = emptyHandler()

        override fun getStats(
            params: GraphragGetStatsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                        response.use { getStatsHandler.handle(it) }
                    }
                }
        }

        private val initHandler: Handler<Void?> = emptyHandler()

        override fun init(
            params: GraphragInitParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                        response.use { initHandler.handle(it) }
                    }
                }
        }
    }
}
