// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.agent.v2

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.checkRequired
import dev.case.api.core.handlers.errorBodyHandler
import dev.case.api.core.handlers.errorHandler
import dev.case.api.core.handlers.jsonHandler
import dev.case.api.core.handlers.mapJson
import dev.case.api.core.handlers.sseHandler
import dev.case.api.core.http.HttpMethod
import dev.case.api.core.http.HttpRequest
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.StreamResponse
import dev.case.api.core.http.json
import dev.case.api.core.http.parseable
import dev.case.api.core.prepare
import dev.case.api.models.agent.v2.run.RunCreateParams
import dev.case.api.models.agent.v2.run.RunCreateResponse
import dev.case.api.models.agent.v2.run.RunEventsParams
import dev.case.api.models.agent.v2.run.RunExecParams
import dev.case.api.models.agent.v2.run.RunExecResponse
import dev.case.api.models.agent.v2.run.RunGetDetailsParams
import dev.case.api.models.agent.v2.run.RunGetDetailsResponse
import dev.case.api.models.agent.v2.run.RunGetStatusParams
import dev.case.api.models.agent.v2.run.RunGetStatusResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * Create, manage, and execute AI agents with tool access, sandbox environments, and async run
 * workflows
 */
class RunServiceImpl internal constructor(private val clientOptions: ClientOptions) : RunService {

    private val withRawResponse: RunService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RunService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService =
        RunServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: RunCreateParams,
        requestOptions: RequestOptions,
    ): RunCreateResponse =
        // post /agent/v2/run
        withRawResponse().create(params, requestOptions).parse()

    override fun eventsStreaming(
        params: RunEventsParams,
        requestOptions: RequestOptions,
    ): StreamResponse<String> =
        // get /agent/v2/run/{id}/events
        withRawResponse().eventsStreaming(params, requestOptions).parse()

    override fun exec(params: RunExecParams, requestOptions: RequestOptions): RunExecResponse =
        // post /agent/v2/run/{id}/exec
        withRawResponse().exec(params, requestOptions).parse()

    override fun getDetails(
        params: RunGetDetailsParams,
        requestOptions: RequestOptions,
    ): RunGetDetailsResponse =
        // get /agent/v2/run/{id}/details
        withRawResponse().getDetails(params, requestOptions).parse()

    override fun getStatus(
        params: RunGetStatusParams,
        requestOptions: RequestOptions,
    ): RunGetStatusResponse =
        // get /agent/v2/run/{id}/status
        withRawResponse().getStatus(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RunService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RunService.WithRawResponse =
            RunServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<RunCreateResponse> =
            jsonHandler<RunCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: RunCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v2", "run")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val eventsStreamingHandler: Handler<StreamResponse<String>> =
            sseHandler(clientOptions.jsonMapper).mapJson<String>()

        override fun eventsStreaming(
            params: RunEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamResponse<String>> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.let { eventsStreamingHandler.handle(it) }
            }
        }

        private val execHandler: Handler<RunExecResponse> =
            jsonHandler<RunExecResponse>(clientOptions.jsonMapper)

        override fun exec(
            params: RunExecParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunExecResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { execHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getDetailsHandler: Handler<RunGetDetailsResponse> =
            jsonHandler<RunGetDetailsResponse>(clientOptions.jsonMapper)

        override fun getDetails(
            params: RunGetDetailsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunGetDetailsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v2", "run", params._pathParam(0), "details")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getDetailsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getStatusHandler: Handler<RunGetStatusResponse> =
            jsonHandler<RunGetStatusResponse>(clientOptions.jsonMapper)

        override fun getStatus(
            params: RunGetStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunGetStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("agent", "v2", "run", params._pathParam(0), "status")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
