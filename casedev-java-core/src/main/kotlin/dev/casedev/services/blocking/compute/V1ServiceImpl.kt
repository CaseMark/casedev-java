// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.compute

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.handlers.emptyHandler
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.handlers.jsonHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.core.http.json
import dev.casedev.core.http.parseable
import dev.casedev.core.prepare
import dev.casedev.models.compute.v1.V1DeployParams
import dev.casedev.models.compute.v1.V1DeployResponse
import dev.casedev.models.compute.v1.V1GetPricingParams
import dev.casedev.models.compute.v1.V1GetUsageParams
import dev.casedev.services.blocking.compute.v1.EnvironmentService
import dev.casedev.services.blocking.compute.v1.EnvironmentServiceImpl
import dev.casedev.services.blocking.compute.v1.FunctionService
import dev.casedev.services.blocking.compute.v1.FunctionServiceImpl
import dev.casedev.services.blocking.compute.v1.InvokeService
import dev.casedev.services.blocking.compute.v1.InvokeServiceImpl
import dev.casedev.services.blocking.compute.v1.RunService
import dev.casedev.services.blocking.compute.v1.RunServiceImpl
import dev.casedev.services.blocking.compute.v1.SecretService
import dev.casedev.services.blocking.compute.v1.SecretServiceImpl
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val environments: EnvironmentService by lazy { EnvironmentServiceImpl(clientOptions) }

    private val functions: FunctionService by lazy { FunctionServiceImpl(clientOptions) }

    private val invoke: InvokeService by lazy { InvokeServiceImpl(clientOptions) }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    private val secrets: SecretService by lazy { SecretServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun environments(): EnvironmentService = environments

    override fun functions(): FunctionService = functions

    override fun invoke(): InvokeService = invoke

    override fun runs(): RunService = runs

    override fun secrets(): SecretService = secrets

    override fun deploy(params: V1DeployParams, requestOptions: RequestOptions): V1DeployResponse =
        // post /compute/v1/deploy
        withRawResponse().deploy(params, requestOptions).parse()

    override fun getPricing(params: V1GetPricingParams, requestOptions: RequestOptions) {
        // get /compute/v1/pricing
        withRawResponse().getPricing(params, requestOptions)
    }

    override fun getUsage(params: V1GetUsageParams, requestOptions: RequestOptions) {
        // get /compute/v1/usage
        withRawResponse().getUsage(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val environments: EnvironmentService.WithRawResponse by lazy {
            EnvironmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val functions: FunctionService.WithRawResponse by lazy {
            FunctionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val invoke: InvokeService.WithRawResponse by lazy {
            InvokeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunService.WithRawResponse by lazy {
            RunServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val secrets: SecretService.WithRawResponse by lazy {
            SecretServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun environments(): EnvironmentService.WithRawResponse = environments

        override fun functions(): FunctionService.WithRawResponse = functions

        override fun invoke(): InvokeService.WithRawResponse = invoke

        override fun runs(): RunService.WithRawResponse = runs

        override fun secrets(): SecretService.WithRawResponse = secrets

        private val deployHandler: Handler<V1DeployResponse> =
            jsonHandler<V1DeployResponse>(clientOptions.jsonMapper)

        override fun deploy(
            params: V1DeployParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1DeployResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "deploy")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deployHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getPricingHandler: Handler<Void?> = emptyHandler()

        override fun getPricing(
            params: V1GetPricingParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "pricing")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getPricingHandler.handle(it) }
            }
        }

        private val getUsageHandler: Handler<Void?> = emptyHandler()

        override fun getUsage(
            params: V1GetUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "usage")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { getUsageHandler.handle(it) }
            }
        }
    }
}
