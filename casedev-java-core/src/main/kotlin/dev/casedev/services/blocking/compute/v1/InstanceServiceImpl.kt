// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.compute.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.checkRequired
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
import dev.casedev.models.compute.v1.instances.InstanceCreateParams
import dev.casedev.models.compute.v1.instances.InstanceCreateResponse
import dev.casedev.models.compute.v1.instances.InstanceDeleteParams
import dev.casedev.models.compute.v1.instances.InstanceDeleteResponse
import dev.casedev.models.compute.v1.instances.InstanceListParams
import dev.casedev.models.compute.v1.instances.InstanceListResponse
import dev.casedev.models.compute.v1.instances.InstanceRetrieveParams
import dev.casedev.models.compute.v1.instances.InstanceRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InstanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InstanceService {

    private val withRawResponse: InstanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InstanceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstanceService =
        InstanceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: InstanceCreateParams,
        requestOptions: RequestOptions,
    ): InstanceCreateResponse =
        // post /compute/v1/instances
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: InstanceRetrieveParams,
        requestOptions: RequestOptions,
    ): InstanceRetrieveResponse =
        // get /compute/v1/instances/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: InstanceListParams,
        requestOptions: RequestOptions,
    ): InstanceListResponse =
        // get /compute/v1/instances
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: InstanceDeleteParams,
        requestOptions: RequestOptions,
    ): InstanceDeleteResponse =
        // delete /compute/v1/instances/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstanceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstanceService.WithRawResponse =
            InstanceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<InstanceCreateResponse> =
            jsonHandler<InstanceCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: InstanceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstanceCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "instances")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<InstanceRetrieveResponse> =
            jsonHandler<InstanceRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: InstanceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstanceRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "instances", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<InstanceListResponse> =
            jsonHandler<InstanceListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: InstanceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstanceListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("compute", "v1", "instances")
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

        private val deleteHandler: Handler<InstanceDeleteResponse> =
            jsonHandler<InstanceDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: InstanceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstanceDeleteResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
