// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.convert

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
import dev.casedev.models.convert.v1.V1DownloadParams
import dev.casedev.models.convert.v1.V1ProcessParams
import dev.casedev.models.convert.v1.V1ProcessResponse
import dev.casedev.models.convert.v1.V1WebhookParams
import dev.casedev.models.convert.v1.V1WebhookResponse
import dev.casedev.services.blocking.convert.v1.JobService
import dev.casedev.services.blocking.convert.v1.JobServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun jobs(): JobService = jobs

    override fun download(params: V1DownloadParams, requestOptions: RequestOptions): HttpResponse =
        // get /convert/v1/download/{id}
        withRawResponse().download(params, requestOptions)

    override fun process(
        params: V1ProcessParams,
        requestOptions: RequestOptions,
    ): V1ProcessResponse =
        // post /convert/v1/process
        withRawResponse().process(params, requestOptions).parse()

    override fun webhook(
        params: V1WebhookParams,
        requestOptions: RequestOptions,
    ): V1WebhookResponse =
        // post /convert/v1/webhook
        withRawResponse().webhook(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val jobs: JobService.WithRawResponse by lazy {
            JobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun jobs(): JobService.WithRawResponse = jobs

        override fun download(
            params: V1DownloadParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("convert", "v1", "download", params._pathParam(0))
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
                    .addPathSegments("convert", "v1", "process")
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

        private val webhookHandler: Handler<V1WebhookResponse> =
            jsonHandler<V1WebhookResponse>(clientOptions.jsonMapper)

        override fun webhook(
            params: V1WebhookParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1WebhookResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("convert", "v1", "webhook")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { webhookHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
