// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.compute.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.handlers.errorBodyHandler
import dev.case.api.core.handlers.errorHandler
import dev.case.api.core.handlers.jsonHandler
import dev.case.api.core.http.HttpMethod
import dev.case.api.core.http.HttpRequest
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.parseable
import dev.case.api.core.prepareAsync
import dev.case.api.models.compute.v1.instancetypes.InstanceTypeListParams
import dev.case.api.models.compute.v1.instancetypes.InstanceTypeListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Serverless GPU and CPU infrastructure */
class InstanceTypeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InstanceTypeServiceAsync {

    private val withRawResponse: InstanceTypeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InstanceTypeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstanceTypeServiceAsync =
        InstanceTypeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: InstanceTypeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstanceTypeListResponse> =
        // get /compute/v1/instance-types
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstanceTypeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstanceTypeServiceAsync.WithRawResponse =
            InstanceTypeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<InstanceTypeListResponse> =
            jsonHandler<InstanceTypeListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InstanceTypeListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstanceTypeListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "instance-types")
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
    }
}
