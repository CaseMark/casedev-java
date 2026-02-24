// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.applications.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.checkRequired
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
import dev.case.api.models.applications.v1.deployments.DeploymentCancelParams
import dev.case.api.models.applications.v1.deployments.DeploymentCreateFromFilesParams
import dev.case.api.models.applications.v1.deployments.DeploymentCreateParams
import dev.case.api.models.applications.v1.deployments.DeploymentGetLogsParams
import dev.case.api.models.applications.v1.deployments.DeploymentGetStatusParams
import dev.case.api.models.applications.v1.deployments.DeploymentListParams
import dev.case.api.models.applications.v1.deployments.DeploymentRetrieveParams
import dev.case.api.models.applications.v1.deployments.DeploymentStreamParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DeploymentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DeploymentService {

    private val withRawResponse: DeploymentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DeploymentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DeploymentService =
        DeploymentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: DeploymentCreateParams, requestOptions: RequestOptions) {
        // post /applications/v1/deployments
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: DeploymentRetrieveParams, requestOptions: RequestOptions) {
        // get /applications/v1/deployments/{id}
        withRawResponse().retrieve(params, requestOptions)
    }

    override fun list(params: DeploymentListParams, requestOptions: RequestOptions) {
        // get /applications/v1/deployments
        withRawResponse().list(params, requestOptions)
    }

    override fun cancel(params: DeploymentCancelParams, requestOptions: RequestOptions) {
        // post /applications/v1/deployments/{id}/cancel
        withRawResponse().cancel(params, requestOptions)
    }

    override fun createFromFiles(
        params: DeploymentCreateFromFilesParams,
        requestOptions: RequestOptions,
    ) {
        // post /applications/v1/deployments/from-files
        withRawResponse().createFromFiles(params, requestOptions)
    }

    override fun getLogs(params: DeploymentGetLogsParams, requestOptions: RequestOptions) {
        // get /applications/v1/deployments/{id}/logs
        withRawResponse().getLogs(params, requestOptions)
    }

    override fun getStatus(params: DeploymentGetStatusParams, requestOptions: RequestOptions) {
        // get /applications/v1/deployments/{id}/status
        withRawResponse().getStatus(params, requestOptions)
    }

    override fun stream(params: DeploymentStreamParams, requestOptions: RequestOptions) {
        // get /applications/v1/deployments/{id}/stream
        withRawResponse().stream(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeploymentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DeploymentService.WithRawResponse =
            DeploymentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: DeploymentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "deployments")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<Void?> = emptyHandler()

        override fun retrieve(
            params: DeploymentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "deployments", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { retrieveHandler.handle(it) }
            }
        }

        private val listHandler: Handler<Void?> = emptyHandler()

        override fun list(
            params: DeploymentListParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "deployments")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listHandler.handle(it) }
            }
        }

        private val cancelHandler: Handler<Void?> = emptyHandler()

        override fun cancel(
            params: DeploymentCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "applications",
                        "v1",
                        "deployments",
                        params._pathParam(0),
                        "cancel",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { cancelHandler.handle(it) }
            }
        }

        private val createFromFilesHandler: Handler<Void?> = emptyHandler()

        override fun createFromFiles(
            params: DeploymentCreateFromFilesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("applications", "v1", "deployments", "from-files")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createFromFilesHandler.handle(it) }
            }
        }

        private val getLogsHandler: Handler<Void?> = emptyHandler()

        override fun getLogs(
            params: DeploymentGetLogsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "applications",
                        "v1",
                        "deployments",
                        params._pathParam(0),
                        "logs",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getLogsHandler.handle(it) }
            }
        }

        private val getStatusHandler: Handler<Void?> = emptyHandler()

        override fun getStatus(
            params: DeploymentGetStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "applications",
                        "v1",
                        "deployments",
                        params._pathParam(0),
                        "status",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getStatusHandler.handle(it) }
            }
        }

        private val streamHandler: Handler<Void?> = emptyHandler()

        override fun stream(
            params: DeploymentStreamParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "applications",
                        "v1",
                        "deployments",
                        params._pathParam(0),
                        "stream",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { streamHandler.handle(it) }
            }
        }
    }
}
