// File generated from our OpenAPI spec by Stainless.

package dev.casedev.services.async.legal

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
import dev.casedev.core.prepareAsync
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
import dev.casedev.models.legal.v1.V1PatentSearchParams
import dev.casedev.models.legal.v1.V1PatentSearchResponse
import dev.casedev.models.legal.v1.V1ResearchParams
import dev.casedev.models.legal.v1.V1ResearchResponse
import dev.casedev.models.legal.v1.V1SimilarParams
import dev.casedev.models.legal.v1.V1SimilarResponse
import dev.casedev.models.legal.v1.V1VerifyParams
import dev.casedev.models.legal.v1.V1VerifyResponse
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

    override fun find(
        params: V1FindParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1FindResponse> =
        // post /legal/v1/find
        withRawResponse().find(params, requestOptions).thenApply { it.parse() }

    override fun getCitations(
        params: V1GetCitationsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1GetCitationsResponse> =
        // post /legal/v1/citations
        withRawResponse().getCitations(params, requestOptions).thenApply { it.parse() }

    override fun getCitationsFromUrl(
        params: V1GetCitationsFromUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1GetCitationsFromUrlResponse> =
        // post /legal/v1/citations-from-url
        withRawResponse().getCitationsFromUrl(params, requestOptions).thenApply { it.parse() }

    override fun getFullText(
        params: V1GetFullTextParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1GetFullTextResponse> =
        // post /legal/v1/full-text
        withRawResponse().getFullText(params, requestOptions).thenApply { it.parse() }

    override fun listJurisdictions(
        params: V1ListJurisdictionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1ListJurisdictionsResponse> =
        // post /legal/v1/jurisdictions
        withRawResponse().listJurisdictions(params, requestOptions).thenApply { it.parse() }

    override fun patentSearch(
        params: V1PatentSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1PatentSearchResponse> =
        // post /legal/v1/patent-search
        withRawResponse().patentSearch(params, requestOptions).thenApply { it.parse() }

    override fun research(
        params: V1ResearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1ResearchResponse> =
        // post /legal/v1/research
        withRawResponse().research(params, requestOptions).thenApply { it.parse() }

    override fun similar(
        params: V1SimilarParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1SimilarResponse> =
        // post /legal/v1/similar
        withRawResponse().similar(params, requestOptions).thenApply { it.parse() }

    override fun verify(
        params: V1VerifyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1VerifyResponse> =
        // post /legal/v1/verify
        withRawResponse().verify(params, requestOptions).thenApply { it.parse() }

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

        private val findHandler: Handler<V1FindResponse> =
            jsonHandler<V1FindResponse>(clientOptions.jsonMapper)

        override fun find(
            params: V1FindParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1FindResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "find")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { findHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getCitationsHandler: Handler<V1GetCitationsResponse> =
            jsonHandler<V1GetCitationsResponse>(clientOptions.jsonMapper)

        override fun getCitations(
            params: V1GetCitationsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1GetCitationsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "citations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getCitationsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getCitationsFromUrlHandler: Handler<V1GetCitationsFromUrlResponse> =
            jsonHandler<V1GetCitationsFromUrlResponse>(clientOptions.jsonMapper)

        override fun getCitationsFromUrl(
            params: V1GetCitationsFromUrlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1GetCitationsFromUrlResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "citations-from-url")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getCitationsFromUrlHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getFullTextHandler: Handler<V1GetFullTextResponse> =
            jsonHandler<V1GetFullTextResponse>(clientOptions.jsonMapper)

        override fun getFullText(
            params: V1GetFullTextParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1GetFullTextResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "full-text")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getFullTextHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listJurisdictionsHandler: Handler<V1ListJurisdictionsResponse> =
            jsonHandler<V1ListJurisdictionsResponse>(clientOptions.jsonMapper)

        override fun listJurisdictions(
            params: V1ListJurisdictionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1ListJurisdictionsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "jurisdictions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listJurisdictionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val patentSearchHandler: Handler<V1PatentSearchResponse> =
            jsonHandler<V1PatentSearchResponse>(clientOptions.jsonMapper)

        override fun patentSearch(
            params: V1PatentSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1PatentSearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "patent-search")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { patentSearchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val researchHandler: Handler<V1ResearchResponse> =
            jsonHandler<V1ResearchResponse>(clientOptions.jsonMapper)

        override fun research(
            params: V1ResearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1ResearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "research")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { researchHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val similarHandler: Handler<V1SimilarResponse> =
            jsonHandler<V1SimilarResponse>(clientOptions.jsonMapper)

        override fun similar(
            params: V1SimilarParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1SimilarResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "similar")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { similarHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val verifyHandler: Handler<V1VerifyResponse> =
            jsonHandler<V1VerifyResponse>(clientOptions.jsonMapper)

        override fun verify(
            params: V1VerifyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V1VerifyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("legal", "v1", "verify")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
