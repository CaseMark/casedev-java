// File generated from our OpenAPI spec by Stainless.

package dev.case.services.blocking.voice

import dev.case.core.ClientOptions
import dev.case.core.RequestOptions
import dev.case.core.checkRequired
import dev.case.core.handlers.emptyHandler
import dev.case.core.handlers.errorBodyHandler
import dev.case.core.handlers.errorHandler
import dev.case.core.handlers.jsonHandler
import dev.case.core.http.HttpMethod
import dev.case.core.http.HttpRequest
import dev.case.core.http.HttpResponse
import dev.case.core.http.HttpResponse.Handler
import dev.case.core.http.HttpResponseFor
import dev.case.core.http.json
import dev.case.core.http.parseable
import dev.case.core.prepare
import dev.case.models.voice.transcription.TranscriptionCreateParams
import dev.case.models.voice.transcription.TranscriptionCreateResponse
import dev.case.models.voice.transcription.TranscriptionDeleteParams
import dev.case.models.voice.transcription.TranscriptionRetrieveParams
import dev.case.models.voice.transcription.TranscriptionRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TranscriptionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TranscriptionService {

    private val withRawResponse: TranscriptionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TranscriptionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TranscriptionService =
        TranscriptionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TranscriptionCreateParams,
        requestOptions: RequestOptions,
    ): TranscriptionCreateResponse =
        // post /voice/transcription
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: TranscriptionRetrieveParams,
        requestOptions: RequestOptions,
    ): TranscriptionRetrieveResponse =
        // get /voice/transcription/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun delete(params: TranscriptionDeleteParams, requestOptions: RequestOptions) {
        // delete /voice/transcription/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TranscriptionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TranscriptionService.WithRawResponse =
            TranscriptionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TranscriptionCreateResponse> =
            jsonHandler<TranscriptionCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TranscriptionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TranscriptionCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice", "transcription")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<TranscriptionRetrieveResponse> =
            jsonHandler<TranscriptionRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TranscriptionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TranscriptionRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice", "transcription", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TranscriptionDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("voice", "transcription", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
