// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.matters.v1

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
import dev.case.api.models.matters.v1.workitems.WorkItemCreateParams
import dev.case.api.models.matters.v1.workitems.WorkItemDecideParams
import dev.case.api.models.matters.v1.workitems.WorkItemListExecutionsParams
import dev.case.api.models.matters.v1.workitems.WorkItemListParams
import dev.case.api.models.matters.v1.workitems.WorkItemRetrieveParams
import dev.case.api.models.matters.v1.workitems.WorkItemUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Matter-native legal workspaces and orchestration primitives */
class WorkItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkItemService {

    private val withRawResponse: WorkItemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WorkItemService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkItemService =
        WorkItemServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: WorkItemCreateParams, requestOptions: RequestOptions) {
        // post /matters/v1/{id}/work-items
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(params: WorkItemRetrieveParams, requestOptions: RequestOptions) {
        // get /matters/v1/{id}/work-items/{workItemId}
        withRawResponse().retrieve(params, requestOptions)
    }

    override fun update(params: WorkItemUpdateParams, requestOptions: RequestOptions) {
        // patch /matters/v1/{id}/work-items/{workItemId}
        withRawResponse().update(params, requestOptions)
    }

    override fun list(params: WorkItemListParams, requestOptions: RequestOptions) {
        // get /matters/v1/{id}/work-items
        withRawResponse().list(params, requestOptions)
    }

    override fun decide(params: WorkItemDecideParams, requestOptions: RequestOptions) {
        // post /matters/v1/{id}/work-items/{workItemId}/decision
        withRawResponse().decide(params, requestOptions)
    }

    override fun listExecutions(
        params: WorkItemListExecutionsParams,
        requestOptions: RequestOptions,
    ) {
        // get /matters/v1/{id}/work-items/{workItemId}/executions
        withRawResponse().listExecutions(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkItemService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkItemService.WithRawResponse =
            WorkItemServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: WorkItemCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matters", "v1", params._pathParam(0), "work-items")
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
            params: WorkItemRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workItemId", params.workItemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "matters",
                        "v1",
                        params._pathParam(0),
                        "work-items",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { retrieveHandler.handle(it) }
            }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: WorkItemUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workItemId", params.workItemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "matters",
                        "v1",
                        params._pathParam(0),
                        "work-items",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }

        private val listHandler: Handler<Void?> = emptyHandler()

        override fun list(
            params: WorkItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("matters", "v1", params._pathParam(0), "work-items")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listHandler.handle(it) }
            }
        }

        private val decideHandler: Handler<Void?> = emptyHandler()

        override fun decide(
            params: WorkItemDecideParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workItemId", params.workItemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "matters",
                        "v1",
                        params._pathParam(0),
                        "work-items",
                        params._pathParam(1),
                        "decision",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { decideHandler.handle(it) }
            }
        }

        private val listExecutionsHandler: Handler<Void?> = emptyHandler()

        override fun listExecutions(
            params: WorkItemListExecutionsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("workItemId", params.workItemId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "matters",
                        "v1",
                        params._pathParam(0),
                        "work-items",
                        params._pathParam(1),
                        "executions",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { listExecutionsHandler.handle(it) }
            }
        }
    }
}
