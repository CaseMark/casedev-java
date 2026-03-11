// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.voice

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
import dev.case.api.models.voice.boostlist.BoostListExtractParams
import dev.case.api.models.voice.boostlist.BoostListExtractResponse
import dev.case.api.models.voice.boostlist.BoostListGenerateParams
import dev.case.api.models.voice.boostlist.BoostListGenerateResponse
import java.util.function.Consumer

/** Audio transcription and text-to-speech */
class BoostListServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BoostListService {

    private val withRawResponse: BoostListService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BoostListService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BoostListService =
        BoostListServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun extract(
        params: BoostListExtractParams,
        requestOptions: RequestOptions,
    ): BoostListExtractResponse =
        // post /voice/boost-list/extract
        withRawResponse().extract(params, requestOptions).parse()

    override fun generate(
        params: BoostListGenerateParams,
        requestOptions: RequestOptions,
    ): BoostListGenerateResponse =
        // post /voice/boost-list/generate
        withRawResponse().generate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BoostListService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BoostListService.WithRawResponse =
            BoostListServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val extractHandler: Handler<BoostListExtractResponse> =
            jsonHandler<BoostListExtractResponse>(clientOptions.jsonMapper)

        override fun extract(
            params: BoostListExtractParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BoostListExtractResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice", "boost-list", "extract")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { extractHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val generateHandler: Handler<BoostListGenerateResponse> =
            jsonHandler<BoostListGenerateResponse>(clientOptions.jsonMapper)

        override fun generate(
            params: BoostListGenerateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BoostListGenerateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice", "boost-list", "generate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
