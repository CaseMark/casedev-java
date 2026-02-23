// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.blocking.privilege

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
import com.router.api.core.http.json
import com.router.api.core.http.parseable
import com.router.api.core.prepare
import com.router.api.models.privilege.v1.V1DetectParams
import com.router.api.models.privilege.v1.V1DetectResponse
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun detect(params: V1DetectParams, requestOptions: RequestOptions): V1DetectResponse =
        // post /privilege/v1/detect
        withRawResponse().detect(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val detectHandler: Handler<V1DetectResponse> =
            jsonHandler<V1DetectResponse>(clientOptions.jsonMapper)

        override fun detect(
            params: V1DetectParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1DetectResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("privilege", "v1", "detect")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { detectHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
