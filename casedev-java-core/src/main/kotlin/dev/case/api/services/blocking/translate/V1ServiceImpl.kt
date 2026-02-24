// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.translate

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
import dev.case.api.core.prepare
import dev.case.api.models.translate.v1.V1DetectParams
import dev.case.api.models.translate.v1.V1DetectResponse
import dev.case.api.models.translate.v1.V1ListLanguagesParams
import dev.case.api.models.translate.v1.V1ListLanguagesResponse
import dev.case.api.models.translate.v1.V1TranslateParams
import dev.case.api.models.translate.v1.V1TranslateResponse
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun detect(params: V1DetectParams, requestOptions: RequestOptions): V1DetectResponse =
        // post /translate/v1/detect
        withRawResponse().detect(params, requestOptions).parse()

    override fun listLanguages(
        params: V1ListLanguagesParams,
        requestOptions: RequestOptions,
    ): V1ListLanguagesResponse =
        // get /translate/v1/languages
        withRawResponse().listLanguages(params, requestOptions).parse()

    override fun translate(
        params: V1TranslateParams,
        requestOptions: RequestOptions,
    ): V1TranslateResponse =
        // post /translate/v1/translate
        withRawResponse().translate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val detectHandler: Handler<V1DetectResponse> =
            jsonHandler<V1DetectResponse>(clientOptions.jsonMapper)

        override fun detect(
            params: V1DetectParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1DetectResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("translate", "v1", "detect")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { detectHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listLanguagesHandler: Handler<V1ListLanguagesResponse> =
            jsonHandler<V1ListLanguagesResponse>(clientOptions.jsonMapper)

        override fun listLanguages(
            params: V1ListLanguagesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1ListLanguagesResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("translate", "v1", "languages")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listLanguagesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val translateHandler: Handler<V1TranslateResponse> =
            jsonHandler<V1TranslateResponse>(clientOptions.jsonMapper)

        override fun translate(
            params: V1TranslateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1TranslateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("translate", "v1", "translate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
