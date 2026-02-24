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
import dev.case.models.voice.streaming.StreamingGetUrlParams
import dev.case.models.voice.streaming.StreamingGetUrlResponse
import java.util.function.Consumer

class StreamingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StreamingService {

    private val withRawResponse: StreamingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StreamingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamingService =
        StreamingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getUrl(
        params: StreamingGetUrlParams,
        requestOptions: RequestOptions,
    ): StreamingGetUrlResponse =
        // get /voice/streaming/url
        withRawResponse().getUrl(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StreamingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StreamingService.WithRawResponse =
            StreamingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getUrlHandler: Handler<StreamingGetUrlResponse> =
            jsonHandler<StreamingGetUrlResponse>(clientOptions.jsonMapper)

        override fun getUrl(
            params: StreamingGetUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StreamingGetUrlResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice", "streaming", "url")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getUrlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
