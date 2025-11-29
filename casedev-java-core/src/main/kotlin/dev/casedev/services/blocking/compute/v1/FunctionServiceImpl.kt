// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.compute.v1

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
import dev.casedev.core.http.parseable
import dev.casedev.core.prepare
import dev.casedev.models.compute.v1.functions.FunctionGetLogsParams
import dev.casedev.models.compute.v1.functions.FunctionListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FunctionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FunctionService {

    private val withRawResponse: FunctionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FunctionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FunctionService =
        FunctionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(params: FunctionListParams, requestOptions: RequestOptions) {
        // get /compute/v1/functions
        withRawResponse().list(params, requestOptions)
    }

    override fun getLogs(params: FunctionGetLogsParams, requestOptions: RequestOptions) {
        // get /compute/v1/functions/{id}/logs
        withRawResponse().getLogs(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FunctionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FunctionService.WithRawResponse =
            FunctionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<Void?> = emptyHandler()

        override fun list(
            params: FunctionListParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "functions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listHandler.handle(it) }
            }
        }

        private val getLogsHandler: Handler<Void?> = emptyHandler()

        override fun getLogs(
            params: FunctionGetLogsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "functions", params._pathParam(0), "logs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getLogsHandler.handle(it) }
            }
        }
    }
}
