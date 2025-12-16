// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.compute

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.handlers.emptyHandler
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.parseable
import dev.casedev.core.prepareAsync
import dev.casedev.models.compute.v1.V1GetPricingParams
import dev.casedev.models.compute.v1.V1GetUsageParams
import dev.casedev.services.async.compute.v1.EnvironmentServiceAsync
import dev.casedev.services.async.compute.v1.EnvironmentServiceAsyncImpl
import dev.casedev.services.async.compute.v1.FunctionServiceAsync
import dev.casedev.services.async.compute.v1.FunctionServiceAsyncImpl
import dev.casedev.services.async.compute.v1.InvokeServiceAsync
import dev.casedev.services.async.compute.v1.InvokeServiceAsyncImpl
import dev.casedev.services.async.compute.v1.RunServiceAsync
import dev.casedev.services.async.compute.v1.RunServiceAsyncImpl
import dev.casedev.services.async.compute.v1.SecretServiceAsync
import dev.casedev.services.async.compute.v1.SecretServiceAsyncImpl
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

    private val functions: FunctionServiceAsync by lazy { FunctionServiceAsyncImpl(clientOptions) }

    private val invoke: InvokeServiceAsync by lazy { InvokeServiceAsyncImpl(clientOptions) }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    private val secrets: SecretServiceAsync by lazy { SecretServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun environments(): EnvironmentServiceAsync = environments

    override fun functions(): FunctionServiceAsync = functions

    override fun invoke(): InvokeServiceAsync = invoke

    override fun runs(): RunServiceAsync = runs

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
    ): CompletableFuture<Void?> =
        // get /compute/v1/usage
        withRawResponse().getUsage(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val environments: EnvironmentServiceAsync.WithRawResponse by lazy {
            EnvironmentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val functions: FunctionServiceAsync.WithRawResponse by lazy {
            FunctionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoke: InvokeServiceAsync.WithRawResponse by lazy {
            InvokeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        override fun functions(): FunctionServiceAsync.WithRawResponse = functions

        override fun invoke(): InvokeServiceAsync.WithRawResponse = invoke

        override fun runs(): RunServiceAsync.WithRawResponse = runs

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

        private val getUsageHandler: Handler<Void?> = emptyHandler()

        override fun getUsage(
            params: V1GetUsageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                        response.use { getUsageHandler.handle(it) }
                    }
                }
        }
    }
}
