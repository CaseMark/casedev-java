// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.compute

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.handlers.emptyHandler
import com.router.api.core.handlers.errorBodyHandler
import com.router.api.core.handlers.errorHandler
import com.router.api.core.handlers.jsonHandler
import com.router.api.core.http.HttpMethod
import com.router.api.core.http.HttpRequest
import com.router.api.core.http.HttpResponse
import com.router.api.core.http.HttpResponse.Handler
import com.router.api.core.http.HttpResponseFor
import com.router.api.core.http.parseable
import com.router.api.core.prepareAsync
import com.router.api.models.compute.v1.V1GetPricingParams
import com.router.api.models.compute.v1.V1GetUsageParams
import com.router.api.models.compute.v1.V1GetUsageResponse
import com.router.api.services.async.compute.v1.EnvironmentServiceAsync
import com.router.api.services.async.compute.v1.EnvironmentServiceAsyncImpl
import com.router.api.services.async.compute.v1.InstanceServiceAsync
import com.router.api.services.async.compute.v1.InstanceServiceAsyncImpl
import com.router.api.services.async.compute.v1.InstanceTypeServiceAsync
import com.router.api.services.async.compute.v1.InstanceTypeServiceAsyncImpl
import com.router.api.services.async.compute.v1.SecretServiceAsync
import com.router.api.services.async.compute.v1.SecretServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val environments: EnvironmentServiceAsync by lazy {
        EnvironmentServiceAsyncImpl(clientOptions)
    }

    private val instanceTypes: InstanceTypeServiceAsync by lazy {
        InstanceTypeServiceAsyncImpl(clientOptions)
    }

    private val instances: InstanceServiceAsync by lazy { InstanceServiceAsyncImpl(clientOptions) }

    private val secrets: SecretServiceAsync by lazy { SecretServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun environments(): EnvironmentServiceAsync = environments

    override fun instanceTypes(): InstanceTypeServiceAsync = instanceTypes

    override fun instances(): InstanceServiceAsync = instances

    override fun secrets(): SecretServiceAsync = secrets

    override fun getPricing(
        params: V1GetPricingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /compute/v1/pricing
        withRawResponse().getPricing(params, requestOptions).thenAccept {}

    override fun getUsage(
        params: V1GetUsageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1GetUsageResponse> =
        // get /compute/v1/usage
        withRawResponse().getUsage(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val environments: EnvironmentServiceAsync.WithRawResponse by lazy {
            EnvironmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val instanceTypes: InstanceTypeServiceAsync.WithRawResponse by lazy {
            InstanceTypeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val instances: InstanceServiceAsync.WithRawResponse by lazy {
            InstanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val secrets: SecretServiceAsync.WithRawResponse by lazy {
            SecretServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun environments(): EnvironmentServiceAsync.WithRawResponse = environments

        override fun instanceTypes(): InstanceTypeServiceAsync.WithRawResponse = instanceTypes

        override fun instances(): InstanceServiceAsync.WithRawResponse = instances

        override fun secrets(): SecretServiceAsync.WithRawResponse = secrets

        private val getPricingHandler: Handler<Void?> = emptyHandler()

        override fun getPricing(
            params: V1GetPricingParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "pricing")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { getPricingHandler.handle(it) }
                    }
                }
        }

        private val getUsageHandler: Handler<V1GetUsageResponse> =
            jsonHandler<V1GetUsageResponse>(clientOptions.jsonMapper)

        override fun getUsage(
            params: V1GetUsageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1GetUsageResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "usage")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getUsageHandler.handle(it) }
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
