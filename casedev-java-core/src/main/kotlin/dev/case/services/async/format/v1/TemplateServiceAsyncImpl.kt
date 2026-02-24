// File generated from our OpenAPI spec by Stainless.

package dev.case.services.async.format.v1

import dev.case.core.ClientOptions
import dev.case.core.RequestOptions
import dev.case.core.checkRequired
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
import dev.case.core.prepareAsync
import dev.case.models.format.v1.templates.TemplateCreateParams
import dev.case.models.format.v1.templates.TemplateCreateResponse
import dev.case.models.format.v1.templates.TemplateListParams
import dev.case.models.format.v1.templates.TemplateListResponse
import dev.case.models.format.v1.templates.TemplateRetrieveParams
import dev.case.models.format.v1.templates.TemplateRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TemplateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TemplateServiceAsync {

    private val withRawResponse: TemplateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TemplateServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TemplateServiceAsync =
        TemplateServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TemplateCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TemplateCreateResponse> =
        // post /format/v1/templates
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: TemplateRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TemplateRetrieveResponse> =
        // get /format/v1/templates/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TemplateListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TemplateListResponse> =
        // get /format/v1/templates
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TemplateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TemplateServiceAsync.WithRawResponse =
            TemplateServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<TemplateCreateResponse> =
            jsonHandler<TemplateCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: TemplateCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TemplateCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("format", "v1", "templates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<TemplateRetrieveResponse> =
            jsonHandler<TemplateRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TemplateRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TemplateRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("format", "v1", "templates", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<TemplateListResponse> =
            jsonHandler<TemplateListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TemplateListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TemplateListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("format", "v1", "templates")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
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
