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
import dev.case.api.core.http.json
import dev.case.api.core.http.parseable
import dev.case.api.core.prepareAsync
import dev.case.api.models.voice.boostlist.BoostListExtractParams
import dev.case.api.models.voice.boostlist.BoostListExtractResponse
import dev.case.api.models.voice.boostlist.BoostListGenerateParams
import dev.case.api.models.voice.boostlist.BoostListGenerateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Audio transcription and text-to-speech */
class BoostListServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BoostListServiceAsync {

    private val withRawResponse: BoostListServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BoostListServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BoostListServiceAsync =
        BoostListServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun extract(
        params: BoostListExtractParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BoostListExtractResponse> =
        // post /voice/boost-list/extract
        withRawResponse().extract(params, requestOptions).thenApply { it.parse() }

    override fun generate(
        params: BoostListGenerateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BoostListGenerateResponse> =
        // post /voice/boost-list/generate
        withRawResponse().generate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BoostListServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BoostListServiceAsync.WithRawResponse =
            BoostListServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val extractHandler: Handler<BoostListExtractResponse> =
            jsonHandler<BoostListExtractResponse>(clientOptions.jsonMapper)

        override fun extract(
            params: BoostListExtractParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoostListExtractResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice", "boost-list", "extract")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { extractHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val generateHandler: Handler<BoostListGenerateResponse> =
            jsonHandler<BoostListGenerateResponse>(clientOptions.jsonMapper)

        override fun generate(
            params: BoostListGenerateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BoostListGenerateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice", "boost-list", "generate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { generateHandler.handle(it) }
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
