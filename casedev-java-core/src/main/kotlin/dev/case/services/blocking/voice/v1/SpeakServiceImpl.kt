// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.voice.v1

import dev.case.core.ClientOptions
import dev.case.core.RequestOptions
import dev.case.core.handlers.errorBodyHandler
import dev.case.core.handlers.errorHandler
import dev.case.core.http.HttpMethod
import dev.case.core.http.HttpRequest
import dev.case.core.http.HttpResponse
import dev.case.core.http.HttpResponse.Handler
import dev.case.core.http.json
import dev.case.core.prepare
import dev.case.models.voice.v1.speak.SpeakCreateParams
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
                    .putHeader("Accept", "audio/mpeg")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
