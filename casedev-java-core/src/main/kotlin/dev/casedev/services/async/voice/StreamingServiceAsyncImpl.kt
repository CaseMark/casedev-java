// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.voice

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
import dev.casedev.core.prepareAsync
import dev.casedev.models.voice.streaming.StreamingGetUrlParams
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
    ): CompletableFuture<Void?> =
        // get /voice/streaming/url
        withRawResponse().getUrl(params, requestOptions).thenAccept {}

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

        private val getUrlHandler: Handler<Void?> = emptyHandler()

        override fun getUrl(
            params: StreamingGetUrlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                        response.use { getUrlHandler.handle(it) }
                    }
                }
        }
    }
}
