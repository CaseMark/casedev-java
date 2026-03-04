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
import dev.case.api.models.voice.v1.V1ListVoicesParams
import dev.case.api.models.voice.v1.V1ListVoicesResponse
import dev.case.api.services.async.voice.v1.SpeakServiceAsync
import dev.case.api.services.async.voice.v1.SpeakServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Audio transcription and text-to-speech */
class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val speak: SpeakServiceAsync by lazy { SpeakServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Audio transcription and text-to-speech */
    override fun speak(): SpeakServiceAsync = speak

    override fun listVoices(
        params: V1ListVoicesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1ListVoicesResponse> =
        // get /voice/v1/voices
        withRawResponse().listVoices(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val speak: SpeakServiceAsync.WithRawResponse by lazy {
            SpeakServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Audio transcription and text-to-speech */
        override fun speak(): SpeakServiceAsync.WithRawResponse = speak

        private val listVoicesHandler: Handler<V1ListVoicesResponse> =
            jsonHandler<V1ListVoicesResponse>(clientOptions.jsonMapper)

        override fun listVoices(
            params: V1ListVoicesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1ListVoicesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice", "v1", "voices")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
