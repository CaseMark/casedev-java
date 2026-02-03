// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.blocking.legal

import dev.casedev.core.ClientOptions
import dev.casedev.core.RequestOptions
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
import dev.casedev.models.legal.v1.V1FindParams
import dev.casedev.models.legal.v1.V1FindResponse
import dev.casedev.models.legal.v1.V1GetCitationsFromUrlParams
import dev.casedev.models.legal.v1.V1GetCitationsFromUrlResponse
import dev.casedev.models.legal.v1.V1GetCitationsParams
import dev.casedev.models.legal.v1.V1GetCitationsResponse
import dev.casedev.models.legal.v1.V1GetFullTextParams
import dev.casedev.models.legal.v1.V1GetFullTextResponse
import dev.casedev.models.legal.v1.V1ListJurisdictionsParams
import dev.casedev.models.legal.v1.V1ListJurisdictionsResponse
import dev.casedev.models.legal.v1.V1ResearchParams
import dev.casedev.models.legal.v1.V1ResearchResponse
import dev.casedev.models.legal.v1.V1SimilarParams
import dev.casedev.models.legal.v1.V1SimilarResponse
import dev.casedev.models.legal.v1.V1VerifyParams
import dev.casedev.models.legal.v1.V1VerifyResponse
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun find(params: V1FindParams, requestOptions: RequestOptions): V1FindResponse =
        // post /legal/v1/find
        withRawResponse().find(params, requestOptions).parse()

    override fun getCitations(
        params: V1GetCitationsParams,
        requestOptions: RequestOptions,
    ): V1GetCitationsResponse =
        // post /legal/v1/citations
        withRawResponse().getCitations(params, requestOptions).parse()

    override fun getCitationsFromUrl(
        params: V1GetCitationsFromUrlParams,
        requestOptions: RequestOptions,
    ): V1GetCitationsFromUrlResponse =
        // post /legal/v1/citations-from-url
        withRawResponse().getCitationsFromUrl(params, requestOptions).parse()

    override fun getFullText(
        params: V1GetFullTextParams,
        requestOptions: RequestOptions,
    ): V1GetFullTextResponse =
        // post /legal/v1/full-text
        withRawResponse().getFullText(params, requestOptions).parse()

    override fun listJurisdictions(
        params: V1ListJurisdictionsParams,
        requestOptions: RequestOptions,
    ): V1ListJurisdictionsResponse =
        // post /legal/v1/jurisdictions
        withRawResponse().listJurisdictions(params, requestOptions).parse()

    override fun research(
        params: V1ResearchParams,
        requestOptions: RequestOptions,
    ): V1ResearchResponse =
        // post /legal/v1/research
        withRawResponse().research(params, requestOptions).parse()

    override fun similar(
        params: V1SimilarParams,
        requestOptions: RequestOptions,
    ): V1SimilarResponse =
        // post /legal/v1/similar
        withRawResponse().similar(params, requestOptions).parse()

    override fun verify(params: V1VerifyParams, requestOptions: RequestOptions): V1VerifyResponse =
        // post /legal/v1/verify
        withRawResponse().verify(params, requestOptions).parse()

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

        private val findHandler: Handler<V1FindResponse> =
            jsonHandler<V1FindResponse>(clientOptions.jsonMapper)

        override fun find(
            params: V1FindParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1FindResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "find")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { findHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getCitationsHandler: Handler<V1GetCitationsResponse> =
            jsonHandler<V1GetCitationsResponse>(clientOptions.jsonMapper)

        override fun getCitations(
            params: V1GetCitationsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1GetCitationsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "citations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getCitationsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getCitationsFromUrlHandler: Handler<V1GetCitationsFromUrlResponse> =
            jsonHandler<V1GetCitationsFromUrlResponse>(clientOptions.jsonMapper)

        override fun getCitationsFromUrl(
            params: V1GetCitationsFromUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1GetCitationsFromUrlResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "citations-from-url")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getCitationsFromUrlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getFullTextHandler: Handler<V1GetFullTextResponse> =
            jsonHandler<V1GetFullTextResponse>(clientOptions.jsonMapper)

        override fun getFullText(
            params: V1GetFullTextParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1GetFullTextResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "full-text")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getFullTextHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listJurisdictionsHandler: Handler<V1ListJurisdictionsResponse> =
            jsonHandler<V1ListJurisdictionsResponse>(clientOptions.jsonMapper)

        override fun listJurisdictions(
            params: V1ListJurisdictionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1ListJurisdictionsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "jurisdictions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listJurisdictionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val researchHandler: Handler<V1ResearchResponse> =
            jsonHandler<V1ResearchResponse>(clientOptions.jsonMapper)

        override fun research(
            params: V1ResearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1ResearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "research")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { researchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val similarHandler: Handler<V1SimilarResponse> =
            jsonHandler<V1SimilarResponse>(clientOptions.jsonMapper)

        override fun similar(
            params: V1SimilarParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1SimilarResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "similar")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { similarHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val verifyHandler: Handler<V1VerifyResponse> =
            jsonHandler<V1VerifyResponse>(clientOptions.jsonMapper)

        override fun verify(
            params: V1VerifyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V1VerifyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "verify")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { verifyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
