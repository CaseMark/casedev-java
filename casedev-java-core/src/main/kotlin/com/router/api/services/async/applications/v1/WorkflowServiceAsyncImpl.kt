// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.applications.v1

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.checkRequired
import com.router.api.core.handlers.emptyHandler
import com.router.api.core.handlers.errorBodyHandler
import com.router.api.core.handlers.errorHandler
import com.router.api.core.http.HttpMethod
import com.router.api.core.http.HttpRequest
import com.router.api.core.http.HttpResponse
import com.router.api.core.http.HttpResponse.Handler
import com.router.api.core.http.parseable
import com.router.api.core.prepareAsync
import com.router.api.models.applications.v1.workflows.WorkflowGetStatusParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WorkflowServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WorkflowServiceAsync {

    private val withRawResponse: WorkflowServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WorkflowServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WorkflowServiceAsync =
        WorkflowServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getStatus(
        params: WorkflowGetStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /applications/v1/workflows/{id}/status
        withRawResponse().getStatus(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WorkflowServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WorkflowServiceAsync.WithRawResponse =
            WorkflowServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getStatusHandler: Handler<Void?> = emptyHandler()

        override fun getStatus(
            params: WorkflowGetStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { getStatusHandler.handle(it) }
                    }
                }
        }
    }
}
