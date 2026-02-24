// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.vault

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.checkRequired
import dev.case.api.core.handlers.emptyHandler
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
import dev.case.api.models.vault.multipart.MultipartAbortParams
import dev.case.api.models.vault.multipart.MultipartGetPartUrlsParams
import dev.case.api.models.vault.multipart.MultipartGetPartUrlsResponse
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
