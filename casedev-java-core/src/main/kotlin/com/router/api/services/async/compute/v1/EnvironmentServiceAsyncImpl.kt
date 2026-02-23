// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.compute.v1

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.checkRequired
import com.router.api.core.handlers.errorBodyHandler
import com.router.api.core.handlers.errorHandler
import com.router.api.core.handlers.jsonHandler
import com.router.api.core.http.HttpMethod
import com.router.api.core.http.HttpRequest
import com.router.api.core.http.HttpResponse
import com.router.api.core.http.HttpResponse.Handler
import com.router.api.core.http.HttpResponseFor
import com.router.api.core.http.json
import com.router.api.core.http.parseable
import com.router.api.core.prepareAsync
import com.router.api.models.compute.v1.environments.EnvironmentCreateParams
import com.router.api.models.compute.v1.environments.EnvironmentCreateResponse
import com.router.api.models.compute.v1.environments.EnvironmentDeleteParams
import com.router.api.models.compute.v1.environments.EnvironmentDeleteResponse
import com.router.api.models.compute.v1.environments.EnvironmentListParams
import com.router.api.models.compute.v1.environments.EnvironmentListResponse
import com.router.api.models.compute.v1.environments.EnvironmentRetrieveParams
import com.router.api.models.compute.v1.environments.EnvironmentRetrieveResponse
import com.router.api.models.compute.v1.environments.EnvironmentSetDefaultParams
import com.router.api.models.compute.v1.environments.EnvironmentSetDefaultResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class EnvironmentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EnvironmentServiceAsync {

    private val withRawResponse: EnvironmentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EnvironmentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnvironmentServiceAsync =
        EnvironmentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: EnvironmentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvironmentCreateResponse> =
        // post /compute/v1/environments
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: EnvironmentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvironmentRetrieveResponse> =
        // get /compute/v1/environments/{name}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: EnvironmentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvironmentListResponse> =
        // get /compute/v1/environments
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: EnvironmentDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvironmentDeleteResponse> =
        // delete /compute/v1/environments/{name}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun setDefault(
        params: EnvironmentSetDefaultParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnvironmentSetDefaultResponse> =
        // post /compute/v1/environments/{name}/default
        withRawResponse().setDefault(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EnvironmentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EnvironmentServiceAsync.WithRawResponse =
            EnvironmentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<EnvironmentCreateResponse> =
            jsonHandler<EnvironmentCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: EnvironmentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnvironmentCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "environments")
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

        private val retrieveHandler: Handler<EnvironmentRetrieveResponse> =
            jsonHandler<EnvironmentRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EnvironmentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnvironmentRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "environments", params._pathParam(0))
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

        private val listHandler: Handler<EnvironmentListResponse> =
            jsonHandler<EnvironmentListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: EnvironmentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnvironmentListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "environments")
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

        private val deleteHandler: Handler<EnvironmentDeleteResponse> =
            jsonHandler<EnvironmentDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: EnvironmentDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnvironmentDeleteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "environments", params._pathParam(0))
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

        private val setDefaultHandler: Handler<EnvironmentSetDefaultResponse> =
            jsonHandler<EnvironmentSetDefaultResponse>(clientOptions.jsonMapper)

        override fun setDefault(
            params: EnvironmentSetDefaultParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnvironmentSetDefaultResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("name", params.name().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "compute",
                        "v1",
                        "environments",
                        params._pathParam(0),
                        "default",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { setDefaultHandler.handle(it) }
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
