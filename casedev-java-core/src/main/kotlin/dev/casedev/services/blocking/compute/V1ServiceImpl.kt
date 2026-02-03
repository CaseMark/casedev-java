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
import dev.casedev.core.http.parseable
import dev.casedev.core.prepare
import dev.casedev.models.compute.v1.V1GetPricingParams
import dev.casedev.models.compute.v1.V1GetUsageParams
import dev.casedev.models.compute.v1.V1GetUsageResponse
import dev.casedev.services.blocking.compute.v1.EnvironmentService
import dev.casedev.services.blocking.compute.v1.EnvironmentServiceImpl
import dev.casedev.services.blocking.compute.v1.InstanceService
import dev.casedev.services.blocking.compute.v1.InstanceServiceImpl
import dev.casedev.services.blocking.compute.v1.InstanceTypeService
import dev.casedev.services.blocking.compute.v1.InstanceTypeServiceImpl
import dev.casedev.services.blocking.compute.v1.SecretService
import dev.casedev.services.blocking.compute.v1.SecretServiceImpl
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val environments: EnvironmentService by lazy { EnvironmentServiceImpl(clientOptions) }

    private val instanceTypes: InstanceTypeService by lazy {
        InstanceTypeServiceImpl(clientOptions)
    }

    private val instances: InstanceService by lazy { InstanceServiceImpl(clientOptions) }

    private val secrets: SecretService by lazy { SecretServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun environments(): EnvironmentService = environments

    override fun instanceTypes(): InstanceTypeService = instanceTypes

    override fun instances(): InstanceService = instances

    override fun secrets(): SecretService = secrets

    override fun getPricing(params: V1GetPricingParams, requestOptions: RequestOptions) {
        // get /compute/v1/pricing
        withRawResponse().getPricing(params, requestOptions)
    }

    override fun getUsage(
        params: V1GetUsageParams,
        requestOptions: RequestOptions,
    ): V1GetUsageResponse =
        // get /compute/v1/usage
        withRawResponse().getUsage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val environments: EnvironmentService.WithRawResponse by lazy {
            EnvironmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val instanceTypes: InstanceTypeService.WithRawResponse by lazy {
            InstanceTypeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val instances: InstanceService.WithRawResponse by lazy {
            InstanceServiceImpl.WithRawResponseImpl(clientOptions)
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

        override fun instanceTypes(): InstanceTypeService.WithRawResponse = instanceTypes

        override fun instances(): InstanceService.WithRawResponse = instances

        override fun secrets(): SecretService.WithRawResponse = secrets

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

        private val getUsageHandler: Handler<V1GetUsageResponse> =
            jsonHandler<V1GetUsageResponse>(clientOptions.jsonMapper)

        override fun getUsage(
            params: V1GetUsageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1GetUsageResponse> {
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
