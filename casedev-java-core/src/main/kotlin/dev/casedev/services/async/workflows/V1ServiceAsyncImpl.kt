// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.workflows

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.checkRequired
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.handlers.jsonHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.core.http.json
import dev.casedev.core.http.parseable
import dev.casedev.core.prepareAsync
import dev.casedev.models.workflows.v1.V1CreateParams
import dev.casedev.models.workflows.v1.V1CreateResponse
import dev.casedev.models.workflows.v1.V1DeleteParams
import dev.casedev.models.workflows.v1.V1DeleteResponse
import dev.casedev.models.workflows.v1.V1DeployParams
import dev.casedev.models.workflows.v1.V1DeployResponse
import dev.casedev.models.workflows.v1.V1ExecuteParams
import dev.casedev.models.workflows.v1.V1ExecuteResponse
import dev.casedev.models.workflows.v1.V1ListExecutionsParams
import dev.casedev.models.workflows.v1.V1ListExecutionsResponse
import dev.casedev.models.workflows.v1.V1ListParams
import dev.casedev.models.workflows.v1.V1ListResponse
import dev.casedev.models.workflows.v1.V1RetrieveExecutionParams
import dev.casedev.models.workflows.v1.V1RetrieveExecutionResponse
import dev.casedev.models.workflows.v1.V1RetrieveParams
import dev.casedev.models.workflows.v1.V1RetrieveResponse
import dev.casedev.models.workflows.v1.V1UndeployParams
import dev.casedev.models.workflows.v1.V1UndeployResponse
import dev.casedev.models.workflows.v1.V1UpdateParams
import dev.casedev.models.workflows.v1.V1UpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

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
        // post /workflows/v1
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: V1RetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1RetrieveResponse> =
        // get /workflows/v1/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: V1UpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1UpdateResponse> =
        // patch /workflows/v1/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: V1ListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1ListResponse> =
        // get /workflows/v1
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: V1DeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1DeleteResponse> =
        // delete /workflows/v1/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun deploy(
        params: V1DeployParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1DeployResponse> =
        // post /workflows/v1/{id}/deploy
        withRawResponse().deploy(params, requestOptions).thenApply { it.parse() }

    override fun execute(
        params: V1ExecuteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1ExecuteResponse> =
        // post /workflows/v1/{id}/execute
        withRawResponse().execute(params, requestOptions).thenApply { it.parse() }

    override fun listExecutions(
        params: V1ListExecutionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1ListExecutionsResponse> =
        // get /workflows/v1/{id}/executions
        withRawResponse().listExecutions(params, requestOptions).thenApply { it.parse() }

    override fun retrieveExecution(
        params: V1RetrieveExecutionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1RetrieveExecutionResponse> =
        // get /workflows/v1/executions/{id}
        withRawResponse().retrieveExecution(params, requestOptions).thenApply { it.parse() }

    override fun undeploy(
        params: V1UndeployParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1UndeployResponse> =
        // delete /workflows/v1/{id}/deploy
        withRawResponse().undeploy(params, requestOptions).thenApply { it.parse() }

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
                    .addPathSegments("workflows", "v1")
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
                    .addPathSegments("workflows", "v1", params._pathParam(0))
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

        private val updateHandler: Handler<V1UpdateResponse> =
            jsonHandler<V1UpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: V1UpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1UpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("workflows", "v1", params._pathParam(0))
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
                    .addPathSegments("workflows", "v1")
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
                    .addPathSegments("workflows", "v1", params._pathParam(0))
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

        private val deployHandler: Handler<V1DeployResponse> =
            jsonHandler<V1DeployResponse>(clientOptions.jsonMapper)

        override fun deploy(
            params: V1DeployParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1DeployResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("workflows", "v1", params._pathParam(0), "deploy")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deployHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val executeHandler: Handler<V1ExecuteResponse> =
            jsonHandler<V1ExecuteResponse>(clientOptions.jsonMapper)

        override fun execute(
            params: V1ExecuteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1ExecuteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("workflows", "v1", params._pathParam(0), "execute")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { executeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listExecutionsHandler: Handler<V1ListExecutionsResponse> =
            jsonHandler<V1ListExecutionsResponse>(clientOptions.jsonMapper)

        override fun listExecutions(
            params: V1ListExecutionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1ListExecutionsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("workflows", "v1", params._pathParam(0), "executions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listExecutionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveExecutionHandler: Handler<V1RetrieveExecutionResponse> =
            jsonHandler<V1RetrieveExecutionResponse>(clientOptions.jsonMapper)

        override fun retrieveExecution(
            params: V1RetrieveExecutionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1RetrieveExecutionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("workflows", "v1", "executions", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveExecutionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val undeployHandler: Handler<V1UndeployResponse> =
            jsonHandler<V1UndeployResponse>(clientOptions.jsonMapper)

        override fun undeploy(
            params: V1UndeployParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1UndeployResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("workflows", "v1", params._pathParam(0), "deploy")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { undeployHandler.handle(it) }
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
