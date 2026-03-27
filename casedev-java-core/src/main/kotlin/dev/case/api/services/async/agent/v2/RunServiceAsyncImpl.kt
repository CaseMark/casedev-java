// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.agent.v2

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.checkRequired
import dev.case.api.core.handlers.errorBodyHandler
import dev.case.api.core.handlers.errorHandler
import dev.case.api.core.handlers.jsonHandler
import dev.case.api.core.handlers.mapJson
import dev.case.api.core.handlers.sseHandler
import dev.case.api.core.http.AsyncStreamResponse
import dev.case.api.core.http.HttpMethod
import dev.case.api.core.http.HttpRequest
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.StreamResponse
import dev.case.api.core.http.json
import dev.case.api.core.http.parseable
import dev.case.api.core.http.toAsync
import dev.case.api.core.prepareAsync
import dev.case.api.models.agent.v2.run.RunCreateParams
import dev.case.api.models.agent.v2.run.RunCreateResponse
import dev.case.api.models.agent.v2.run.RunEventsParams
import dev.case.api.models.agent.v2.run.RunExecParams
import dev.case.api.models.agent.v2.run.RunExecResponse
import dev.case.api.models.agent.v2.run.RunGetDetailsParams
import dev.case.api.models.agent.v2.run.RunGetDetailsResponse
import dev.case.api.models.agent.v2.run.RunGetStatusParams
import dev.case.api.models.agent.v2.run.RunGetStatusResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
class RunServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RunServiceAsync {

    private val withRawResponse: RunServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RunServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunServiceAsync =
        RunServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunCreateResponse> =
        // post /agent/v2/run
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun eventsStreaming(
        params: RunEventsParams,
        requestOptions: RequestOptions,
    ): AsyncStreamResponse<String> =
        // get /agent/v2/run/{id}/events
        withRawResponse()
            .eventsStreaming(params, requestOptions)
            .thenApply { it.parse() }
            .toAsync(clientOptions.streamHandlerExecutor)

    override fun exec(
        params: RunExecParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunExecResponse> =
        // post /agent/v2/run/{id}/exec
        withRawResponse().exec(params, requestOptions).thenApply { it.parse() }

    override fun getDetails(
        params: RunGetDetailsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunGetDetailsResponse> =
        // get /agent/v2/run/{id}/details
        withRawResponse().getDetails(params, requestOptions).thenApply { it.parse() }

    override fun getStatus(
        params: RunGetStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<RunGetStatusResponse> =
        // get /agent/v2/run/{id}/status
        withRawResponse().getStatus(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunServiceAsync.WithRawResponse =
            RunServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RunCreateResponse> =
            jsonHandler<RunCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v2", "run")
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

        private val eventsStreamingHandler: Handler<StreamResponse<String>> =
            sseHandler(clientOptions.jsonMapper).mapJson<String>()

        override fun eventsStreaming(
            params: RunEventsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamResponse<String>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v2", "run", params._pathParam(0), "events")
                    .putHeader("Accept", "text/event-stream")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.let { eventsStreamingHandler.handle(it) }
                    }
                }
        }

        private val execHandler: Handler<RunExecResponse> =
            jsonHandler<RunExecResponse>(clientOptions.jsonMapper)

        override fun exec(
            params: RunExecParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunExecResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v2", "run", params._pathParam(0), "exec")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { execHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getDetailsHandler: Handler<RunGetDetailsResponse> =
            jsonHandler<RunGetDetailsResponse>(clientOptions.jsonMapper)

        override fun getDetails(
            params: RunGetDetailsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunGetDetailsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v2", "run", params._pathParam(0), "details")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getDetailsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getStatusHandler: Handler<RunGetStatusResponse> =
            jsonHandler<RunGetStatusResponse>(clientOptions.jsonMapper)

        override fun getStatus(
            params: RunGetStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<RunGetStatusResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v2", "run", params._pathParam(0), "status")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getStatusHandler.handle(it) }
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
