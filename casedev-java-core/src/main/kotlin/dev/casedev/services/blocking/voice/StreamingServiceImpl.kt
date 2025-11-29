// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.voice

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.handlers.emptyHandler
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.parseable
import dev.casedev.core.prepare
import dev.casedev.models.voice.streaming.StreamingGetUrlParams
import java.util.function.Consumer

class StreamingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StreamingService {

    private val withRawResponse: StreamingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StreamingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamingService =
        StreamingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getUrl(params: StreamingGetUrlParams, requestOptions: RequestOptions) {
        // get /voice/streaming/url
        withRawResponse().getUrl(params, requestOptions)
    }

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

        private val getUrlHandler: Handler<Void?> = emptyHandler()

        override fun getUrl(
            params: StreamingGetUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                response.use { getUrlHandler.handle(it) }
            }
        }
    }
}
