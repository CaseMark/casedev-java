// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.voice.v1

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.json
import dev.casedev.core.prepare
import dev.casedev.models.voice.v1.speak.SpeakCreateParams
import dev.casedev.models.voice.v1.speak.SpeakStreamParams
import java.util.function.Consumer

class SpeakServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SpeakService {

    private val withRawResponse: SpeakService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpeakService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpeakService =
        SpeakServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: SpeakCreateParams, requestOptions: RequestOptions): HttpResponse =
        // post /voice/v1/speak
        withRawResponse().create(params, requestOptions)

    override fun stream(params: SpeakStreamParams, requestOptions: RequestOptions): HttpResponse =
        // post /voice/v1/speak/stream
        withRawResponse().stream(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpeakService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpeakService.WithRawResponse =
            SpeakServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun create(
            params: SpeakCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice", "v1", "speak")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun stream(
            params: SpeakStreamParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice", "v1", "speak", "stream")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
