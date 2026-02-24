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
import dev.case.api.core.http.parseable
import dev.case.api.core.prepare
import dev.case.api.models.applications.v1.workflows.WorkflowGetStatusParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WorkflowServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkflowService {

    private val withRawResponse: WorkflowService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WorkflowService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkflowService =
        WorkflowServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getStatus(params: WorkflowGetStatusParams, requestOptions: RequestOptions) {
        // get /applications/v1/workflows/{id}/status
        withRawResponse().getStatus(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkflowService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkflowService.WithRawResponse =
            WorkflowServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getStatusHandler: Handler<Void?> = emptyHandler()

        override fun getStatus(
            params: WorkflowGetStatusParams,
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
                        "workflows",
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
    }
}
