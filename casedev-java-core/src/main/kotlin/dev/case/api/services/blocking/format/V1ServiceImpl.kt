// File generated from our OpenAPI spec by Stainless.

package dev.case.api.services.blocking.format

import dev.case.api.core.ClientOptions
import dev.case.api.core.RequestOptions
import dev.case.api.core.handlers.errorBodyHandler
import dev.case.api.core.handlers.errorHandler
import dev.case.api.core.http.HttpMethod
import dev.case.api.core.http.HttpRequest
import dev.case.api.core.http.HttpResponse
import dev.case.api.core.http.HttpResponse.Handler
import dev.case.api.core.http.json
import dev.case.api.core.prepare
import dev.case.api.models.format.v1.V1CreateDocumentParams
import dev.case.api.services.blocking.format.v1.TemplateService
import dev.case.api.services.blocking.format.v1.TemplateServiceImpl
import java.util.function.Consumer

/** Document formatting and template rendering (MD/JSON to PDF/DOCX) */
class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val templates: TemplateService by lazy { TemplateServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Document formatting and template rendering (MD/JSON to PDF/DOCX) */
    override fun templates(): TemplateService = templates

    override fun createDocument(
        params: V1CreateDocumentParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /format/v1/document
        withRawResponse().createDocument(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val templates: TemplateService.WithRawResponse by lazy {
            TemplateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Document formatting and template rendering (MD/JSON to PDF/DOCX) */
        override fun templates(): TemplateService.WithRawResponse = templates

        override fun createDocument(
            params: V1CreateDocumentParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("format", "v1", "document")
                    .putHeader("Accept", "application/pdf")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
