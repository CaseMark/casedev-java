// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.ocr

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
import dev.case.api.core.prepare
import dev.case.api.models.ocr.v1.V1DownloadParams
import dev.case.api.models.ocr.v1.V1ProcessParams
import dev.case.api.models.ocr.v1.V1ProcessResponse
import dev.case.api.models.ocr.v1.V1RetrieveParams
import dev.case.api.models.ocr.v1.V1RetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: V1RetrieveParams,
        requestOptions: RequestOptions,
    ): V1RetrieveResponse =
        // get /ocr/v1/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun download(params: V1DownloadParams, requestOptions: RequestOptions): HttpResponse =
        // get /ocr/v1/{id}/download/{type}
        withRawResponse().download(params, requestOptions)

    override fun process(
        params: V1ProcessParams,
        requestOptions: RequestOptions,
    ): V1ProcessResponse =
        // post /ocr/v1/process
        withRawResponse().process(params, requestOptions).parse()

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

        private val retrieveHandler: Handler<V1RetrieveResponse> =
            jsonHandler<V1RetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: V1RetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1RetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ocr", "v1", params._pathParam(0))
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

        override fun download(
            params: V1DownloadParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("type", params.type().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "ocr",
                        "v1",
                        params._pathParam(0),
                        "download",
                        params._pathParam(1),
                    )
                    .putHeader("Accept", "application/octet-stream")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val processHandler: Handler<V1ProcessResponse> =
            jsonHandler<V1ProcessResponse>(clientOptions.jsonMapper)

        override fun process(
            params: V1ProcessParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1ProcessResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ocr", "v1", "process")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { processHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
