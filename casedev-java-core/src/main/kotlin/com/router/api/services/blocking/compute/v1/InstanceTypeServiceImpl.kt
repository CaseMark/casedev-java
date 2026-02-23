// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.compute.v1

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.handlers.errorBodyHandler
import com.router.api.core.handlers.errorHandler
import com.router.api.core.handlers.jsonHandler
import com.router.api.core.http.HttpMethod
import com.router.api.core.http.HttpRequest
import com.router.api.core.http.HttpResponse
import com.router.api.core.http.HttpResponse.Handler
import com.router.api.core.http.HttpResponseFor
import com.router.api.core.http.parseable
import com.router.api.core.prepare
import com.router.api.models.compute.v1.instancetypes.InstanceTypeListParams
import com.router.api.models.compute.v1.instancetypes.InstanceTypeListResponse
import java.util.function.Consumer

class InstanceTypeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InstanceTypeService {

    private val withRawResponse: InstanceTypeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InstanceTypeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstanceTypeService =
        InstanceTypeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: InstanceTypeListParams,
        requestOptions: RequestOptions,
    ): InstanceTypeListResponse =
        // get /compute/v1/instance-types
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstanceTypeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstanceTypeService.WithRawResponse =
            InstanceTypeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<InstanceTypeListResponse> =
            jsonHandler<InstanceTypeListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InstanceTypeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstanceTypeListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "instance-types")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
