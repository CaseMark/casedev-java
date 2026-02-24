// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.async.voice

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.handlers.errorBodyHandler
import dev.case.api.core.handlers.errorHandler
import dev.case.api.core.handlers.jsonHandler
import dev.case.api.core.http.HttpMethod
import dev.case.api.core.http.HttpRequest
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler
import dev.case.api.core.http.HttpResponseFor
import dev.case.api.core.http.parseable
import dev.case.api.core.prepareAsync
import dev.case.api.models.voice.streaming.StreamingGetUrlParams
import dev.case.api.models.voice.streaming.StreamingGetUrlResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class StreamingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StreamingServiceAsync {

    private val withRawResponse: StreamingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StreamingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StreamingServiceAsync =
        StreamingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getUrl(
        params: StreamingGetUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StreamingGetUrlResponse> =
        // get /voice/streaming/url
        withRawResponse().getUrl(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StreamingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StreamingServiceAsync.WithRawResponse =
            StreamingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getUrlHandler: Handler<StreamingGetUrlResponse> =
            jsonHandler<StreamingGetUrlResponse>(clientOptions.jsonMapper)

        override fun getUrl(
            params: StreamingGetUrlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StreamingGetUrlResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice", "streaming", "url")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
