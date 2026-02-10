// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.vault

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.checkRequired
import dev.casedev.core.handlers.emptyHandler
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.handlers.jsonHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.HttpResponseFor
import dev.casedev.core.http.json
import dev.casedev.core.http.parseable
import dev.casedev.core.prepare
import dev.casedev.models.vault.multipart.MultipartAbortParams
import dev.casedev.models.vault.multipart.MultipartGetPartUrlsParams
import dev.casedev.models.vault.multipart.MultipartGetPartUrlsResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MultipartServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MultipartService {

    private val withRawResponse: MultipartService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MultipartService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultipartService =
        MultipartServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun abort(params: MultipartAbortParams, requestOptions: RequestOptions) {
        // post /vault/{id}/multipart/abort
        withRawResponse().abort(params, requestOptions)
    }

    override fun getPartUrls(
        params: MultipartGetPartUrlsParams,
        requestOptions: RequestOptions,
    ): MultipartGetPartUrlsResponse =
        // post /vault/{id}/multipart/part-urls
        withRawResponse().getPartUrls(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MultipartService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultipartService.WithRawResponse =
            MultipartServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val abortHandler: Handler<Void?> = emptyHandler()

        override fun abort(
            params: MultipartAbortParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0), "multipart", "abort")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { abortHandler.handle(it) }
            }
        }

        private val getPartUrlsHandler: Handler<MultipartGetPartUrlsResponse> =
            jsonHandler<MultipartGetPartUrlsResponse>(clientOptions.jsonMapper)

        override fun getPartUrls(
            params: MultipartGetPartUrlsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MultipartGetPartUrlsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("vault", params._pathParam(0), "multipart", "part-urls")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getPartUrlsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
