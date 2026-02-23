// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.vault

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.checkRequired
import com.router.api.core.handlers.errorBodyHandler
import com.router.api.core.handlers.errorHandler
import com.router.api.core.handlers.jsonHandler
import com.router.api.core.http.HttpMethod
import com.router.api.core.http.HttpRequest
import com.router.api.core.http.HttpResponse
import com.router.api.core.http.HttpResponse.Handler
import com.router.api.core.http.HttpResponseFor
import com.router.api.core.http.json
import com.router.api.core.http.parseable
import com.router.api.core.prepare
import com.router.api.models.vault.graphrag.GraphragGetStatsParams
import com.router.api.models.vault.graphrag.GraphragGetStatsResponse
import com.router.api.models.vault.graphrag.GraphragInitParams
import com.router.api.models.vault.graphrag.GraphragInitResponse
import com.router.api.models.vault.graphrag.GraphragProcessObjectParams
import com.router.api.models.vault.graphrag.GraphragProcessObjectResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class GraphragServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GraphragService {

    private val withRawResponse: GraphragService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GraphragService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GraphragService =
        GraphragServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getStats(
        params: GraphragGetStatsParams,
        requestOptions: RequestOptions,
    ): GraphragGetStatsResponse =
        // get /vault/{id}/graphrag/stats
        withRawResponse().getStats(params, requestOptions).parse()

    override fun init(
        params: GraphragInitParams,
        requestOptions: RequestOptions,
    ): GraphragInitResponse =
        // post /vault/{id}/graphrag/init
        withRawResponse().init(params, requestOptions).parse()

    override fun processObject(
        params: GraphragProcessObjectParams,
        requestOptions: RequestOptions,
    ): GraphragProcessObjectResponse =
        // post /vault/{id}/graphrag/{objectId}
        withRawResponse().processObject(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GraphragService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GraphragService.WithRawResponse =
            GraphragServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getStatsHandler: Handler<GraphragGetStatsResponse> =
            jsonHandler<GraphragGetStatsResponse>(clientOptions.jsonMapper)

        override fun getStats(
            params: GraphragGetStatsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GraphragGetStatsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0), "graphrag", "stats")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getStatsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val initHandler: Handler<GraphragInitResponse> =
            jsonHandler<GraphragInitResponse>(clientOptions.jsonMapper)

        override fun init(
            params: GraphragInitParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GraphragInitResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { initHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val processObjectHandler: Handler<GraphragProcessObjectResponse> =
            jsonHandler<GraphragProcessObjectResponse>(clientOptions.jsonMapper)

        override fun processObject(
            params: GraphragProcessObjectParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<GraphragProcessObjectResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
