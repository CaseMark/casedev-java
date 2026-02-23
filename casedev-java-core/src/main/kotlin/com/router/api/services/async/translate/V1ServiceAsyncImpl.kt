// File generated from our OpenAPI spec by Stainless.

package com.router.api.services.async.translate

import com.router.api.core.ClientOptions
import com.router.api.core.RequestOptions
import com.router.api.core.handlers.errorBodyHandler
import com.router.api.core.handlers.errorHandler
import com.router.api.core.handlers.jsonHandler
import com.router.api.core.http.HttpMethod
import com.router.api.core.http.HttpRequest
import com.router.api.core.http.HttpResponse
import com.router.api.core.http.HttpResponse.Handler
import com.router.api.core.http.HttpResponseFor
import com.router.api.core.http.json
import com.router.api.core.http.parseable
import com.router.api.core.prepareAsync
import com.router.api.models.translate.v1.V1DetectParams
import com.router.api.models.translate.v1.V1DetectResponse
import com.router.api.models.translate.v1.V1ListLanguagesParams
import com.router.api.models.translate.v1.V1ListLanguagesResponse
import com.router.api.models.translate.v1.V1TranslateParams
import com.router.api.models.translate.v1.V1TranslateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun detect(
        params: V1DetectParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1DetectResponse> =
        // post /translate/v1/detect
        withRawResponse().detect(params, requestOptions).thenApply { it.parse() }

    override fun listLanguages(
        params: V1ListLanguagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1ListLanguagesResponse> =
        // get /translate/v1/languages
        withRawResponse().listLanguages(params, requestOptions).thenApply { it.parse() }

    override fun translate(
        params: V1TranslateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1TranslateResponse> =
        // post /translate/v1/translate
        withRawResponse().translate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val detectHandler: Handler<V1DetectResponse> =
            jsonHandler<V1DetectResponse>(clientOptions.jsonMapper)

        override fun detect(
            params: V1DetectParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1DetectResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("translate", "v1", "detect")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { detectHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listLanguagesHandler: Handler<V1ListLanguagesResponse> =
            jsonHandler<V1ListLanguagesResponse>(clientOptions.jsonMapper)

        override fun listLanguages(
            params: V1ListLanguagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1ListLanguagesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("translate", "v1", "languages")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listLanguagesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val translateHandler: Handler<V1TranslateResponse> =
            jsonHandler<V1TranslateResponse>(clientOptions.jsonMapper)

        override fun translate(
            params: V1TranslateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1TranslateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("translate", "v1", "translate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { translateHandler.handle(it) }
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
