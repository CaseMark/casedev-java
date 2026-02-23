// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.agent.v1

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
import com.router.api.core.prepareAsync
import com.router.api.models.agent.v1.agents.AgentCreateParams
import com.router.api.models.agent.v1.agents.AgentCreateResponse
import com.router.api.models.agent.v1.agents.AgentDeleteParams
import com.router.api.models.agent.v1.agents.AgentDeleteResponse
import com.router.api.models.agent.v1.agents.AgentListParams
import com.router.api.models.agent.v1.agents.AgentListResponse
import com.router.api.models.agent.v1.agents.AgentRetrieveParams
import com.router.api.models.agent.v1.agents.AgentRetrieveResponse
import com.router.api.models.agent.v1.agents.AgentUpdateParams
import com.router.api.models.agent.v1.agents.AgentUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AgentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AgentServiceAsync {

    private val withRawResponse: AgentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AgentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AgentServiceAsync =
        AgentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentCreateResponse> =
        // post /agent/v1/agents
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentRetrieveResponse> =
        // get /agent/v1/agents/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentUpdateResponse> =
        // patch /agent/v1/agents/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AgentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentListResponse> =
        // get /agent/v1/agents
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AgentDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AgentDeleteResponse> =
        // delete /agent/v1/agents/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AgentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AgentServiceAsync.WithRawResponse =
            AgentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<AgentCreateResponse> =
            jsonHandler<AgentCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v1", "agents")
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

        private val retrieveHandler: Handler<AgentRetrieveResponse> =
            jsonHandler<AgentRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v1", "agents", params._pathParam(0))
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

        private val updateHandler: Handler<AgentUpdateResponse> =
            jsonHandler<AgentUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentUpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v1", "agents", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<AgentListResponse> =
            jsonHandler<AgentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AgentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v1", "agents")
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

        private val deleteHandler: Handler<AgentDeleteResponse> =
            jsonHandler<AgentDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AgentDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v1", "agents", params._pathParam(0))
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
    }
}
