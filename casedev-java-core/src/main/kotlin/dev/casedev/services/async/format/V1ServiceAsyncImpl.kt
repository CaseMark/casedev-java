// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.format

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
import dev.casedev.core.handlers.errorBodyHandler
import dev.casedev.core.handlers.errorHandler
import dev.casedev.core.http.HttpMethod
import dev.casedev.core.http.HttpRequest
import dev.casedev.core.http.HttpResponse
import dev.casedev.core.http.HttpResponse.Handler
import dev.casedev.core.http.json
import dev.casedev.core.prepareAsync
import dev.casedev.models.format.v1.V1CreateDocumentParams
import dev.casedev.services.async.format.v1.TemplateServiceAsync
import dev.casedev.services.async.format.v1.TemplateServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class V1ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V1ServiceAsync {

    private val withRawResponse: V1ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val templates: TemplateServiceAsync by lazy { TemplateServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V1ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1ServiceAsync =
        V1ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun templates(): TemplateServiceAsync = templates

    override fun createDocument(
        params: V1CreateDocumentParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /format/v1/document
        withRawResponse().createDocument(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val templates: TemplateServiceAsync.WithRawResponse by lazy {
            TemplateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1ServiceAsync.WithRawResponse =
            V1ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun templates(): TemplateServiceAsync.WithRawResponse = templates

        override fun createDocument(
            params: V1CreateDocumentParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("format", "v1", "document")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }
    }
}
