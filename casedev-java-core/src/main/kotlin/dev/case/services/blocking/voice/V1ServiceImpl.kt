// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.voice

import dev.case.core.ClientOptions
import dev.case.core.RequestOptions
import dev.case.core.handlers.errorBodyHandler
import dev.case.core.handlers.errorHandler
import dev.case.core.handlers.jsonHandler
import dev.case.core.http.HttpMethod
import dev.case.core.http.HttpRequest
import dev.case.core.http.HttpResponse
import dev.case.core.http.HttpResponse.Handler
import dev.case.core.http.HttpResponseFor
import dev.case.core.http.parseable
import dev.case.core.prepare
import dev.case.models.voice.v1.V1ListVoicesParams
import dev.case.models.voice.v1.V1ListVoicesResponse
import dev.case.services.blocking.voice.v1.SpeakService
import dev.case.services.blocking.voice.v1.SpeakServiceImpl
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val speak: SpeakService by lazy { SpeakServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun speak(): SpeakService = speak

    override fun listVoices(
        params: V1ListVoicesParams,
        requestOptions: RequestOptions,
    ): V1ListVoicesResponse =
        // get /voice/v1/voices
        withRawResponse().listVoices(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val speak: SpeakService.WithRawResponse by lazy {
            SpeakServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun speak(): SpeakService.WithRawResponse = speak

        private val listVoicesHandler: Handler<V1ListVoicesResponse> =
            jsonHandler<V1ListVoicesResponse>(clientOptions.jsonMapper)

        override fun listVoices(
            params: V1ListVoicesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1ListVoicesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice", "v1", "voices")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listVoicesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
