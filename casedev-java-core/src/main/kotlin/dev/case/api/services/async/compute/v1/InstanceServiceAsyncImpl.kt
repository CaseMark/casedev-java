// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.compute.v1

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.checkRequired
import dev.case.api.core.handlers.errorBodyHandler
import dev.case.api.core.handlers.errorHandler
import dev.case.api.core.handlers.jsonHandler
import dev.case.api.core.http.HttpMethod
import dev.case.api.core.http.HttpRequest
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.json
import dev.case.api.core.http.parseable
import dev.case.api.core.prepareAsync
import dev.case.api.models.compute.v1.instances.InstanceCreateParams
import dev.case.api.models.compute.v1.instances.InstanceCreateResponse
import dev.case.api.models.compute.v1.instances.InstanceDeleteParams
import dev.case.api.models.compute.v1.instances.InstanceDeleteResponse
import dev.case.api.models.compute.v1.instances.InstanceListParams
import dev.case.api.models.compute.v1.instances.InstanceListResponse
import dev.case.api.models.compute.v1.instances.InstanceRetrieveParams
import dev.case.api.models.compute.v1.instances.InstanceRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InstanceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InstanceServiceAsync {

    private val withRawResponse: InstanceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InstanceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstanceServiceAsync =
        InstanceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: InstanceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstanceCreateResponse> =
        // post /compute/v1/instances
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: InstanceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstanceRetrieveResponse> =
        // get /compute/v1/instances/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: InstanceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstanceListResponse> =
        // get /compute/v1/instances
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: InstanceDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstanceDeleteResponse> =
        // delete /compute/v1/instances/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstanceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstanceServiceAsync.WithRawResponse =
            InstanceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<InstanceCreateResponse> =
            jsonHandler<InstanceCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: InstanceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstanceCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "instances")
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

        private val retrieveHandler: Handler<InstanceRetrieveResponse> =
            jsonHandler<InstanceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InstanceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstanceRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "instances", params._pathParam(0))
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

        private val listHandler: Handler<InstanceListResponse> =
            jsonHandler<InstanceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InstanceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstanceListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "instances")
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

        private val deleteHandler: Handler<InstanceDeleteResponse> =
            jsonHandler<InstanceDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: InstanceDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstanceDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "instances", params._pathParam(0))
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
